package controllers;

import entities.offers.MakeOffer;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import scenes.*;

import java.util.Objects;

public class SceneController {

    private Stage stage;
    private Scene mainScene;
    private AppScene appScene;

    public SceneController(Stage stage, Controller controller) {
        this.stage = stage;
        BorderPane dummy = new BorderPane();
        mainScene = new Scene(dummy);
        mainScene.getStylesheets().add(
                Objects.requireNonNull(getClass().getResource("/style.css")).toExternalForm()
        );
        stage.setScene(mainScene);
        changeScene(SceneName.LOGIN, controller);
    }

    public void changeScene(SceneName scene, Controller controller) {

        appScene = null;

        switch (scene) {
            case LOGIN -> appScene = new Login(controller);
            case REGISTER -> appScene = new Register(controller);
            case BUY_PRODUCTS -> appScene = new BuyProducts(controller);
            case MY_PRODUCTS -> appScene = new MyProducts(controller);
            case MY_ACCOUNT -> appScene = new MyAccount(controller);
            case STATS -> appScene = new Stats(controller);
            case MY_OFFERS -> appScene = new MyOffers(controller);
        }

        assert appScene != null;
        mainScene.setRoot(appScene.getSceneRoot());
        stage.setMaximized(true);
    }

    public void makeOffer(int id, Controller controller) {
        MakeOffer makeOffer = new MakeOffer(id, controller);
        makeOffer.start();
    }

    public void exit() {
        stage.close();
        //platform = null;
    }

    // DEBUG
    public AppScene getAppScene() {
        return appScene;
    }
}
