package scenes;

import controllers.Controller;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public abstract class AppScene {

    protected BorderPane root;
    protected Scene scene;
    protected Controller controller;

    public AppScene(Controller controller) {
        this.controller = controller;
        root = new BorderPane();
        scene = new Scene(root);
        setScene();
    }

    public Scene getScene() {
        return scene;
    }

    public abstract void setScene();
}
