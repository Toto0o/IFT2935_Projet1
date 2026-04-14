package scenes;

import controllers.Controller;

import controllers.SceneController;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public abstract class AppScene {

    protected BorderPane root;
    protected Scene scene;
    protected Controller controller;

    public AppScene(Controller controller) {
        this.controller = controller;
        root = new BorderPane();
        setScene();
    }

    public Parent getSceneRoot() {
        return root;
    }

    public abstract void setScene();
}
