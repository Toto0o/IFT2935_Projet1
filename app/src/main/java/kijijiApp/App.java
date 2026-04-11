package kijijiApp;

import controllers.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    private Controller controller;

    public static void main(String[] args) {
        App.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            controller = new Controller(primaryStage);
            primaryStage.setTitle("Kijiji");
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // debug
    public Controller getController() {
        return controller;
    }
}
