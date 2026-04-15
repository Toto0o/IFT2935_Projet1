package scenes;

import controllers.Controller;

import controllers.SceneController;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public abstract class AppScene {

    protected BorderPane root;
    protected Scene scene;
    protected Controller controller;

    protected HBox navBar;

    public AppScene(Controller controller) {
        this.controller = controller;
        root = new BorderPane();

        navBar = new HBox();
        Button logout = new Button("Logout");
        logout.setOnAction(e -> {
            controller.getSceneController().changeScene(SceneName.LOGIN, controller);
        });

        Button myAccount = new Button("My Account");
        myAccount.setOnAction(e -> {
            controller.getSceneController().changeScene(SceneName.MY_ACCOUNT, controller);
        });

        Button buy = new Button("BUY");
        buy.setOnAction(e -> {
            controller.getSceneController().changeScene(SceneName.BUY_PRODUCTS, controller);
        });

        Button sell = new Button("SELL");
        sell.setOnAction(e -> {
            controller.getSceneController().changeScene(SceneName.MY_PRODUCTS, controller);
        });

        Button stats = new Button("STATS");
        stats.setOnAction(e -> {
            controller.getSceneController().changeScene(SceneName.STATS, controller);
        });
        navBar.getChildren().addAll(myAccount, buy, sell, stats, logout);
        navBar.setAlignment(Pos.CENTER_RIGHT);
        navBar.setSpacing(10);
        setScene();
    }

    public Parent getSceneRoot() {
        return root;
    }

    public abstract void setScene();
}
