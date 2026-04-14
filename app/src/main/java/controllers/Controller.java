package controllers;


import db.DataBase;
import db.DbService;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Controller {


    private DTOController dtoController;
    private EntityController entityController;
    private SceneController sceneController;

    public Controller(Stage primaryStage) {
        DbService dbService;
        try {
            DataBase db = new DataBase("", "", "");
            dbService = new DbService(db);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        dtoController = new DTOController(dbService);
        sceneController = new SceneController(primaryStage);
        entityController = new EntityController(dbService);
    }

    public DTOController getDtoController() {
        return dtoController;
    }
    public EntityController getEntityController() {
        return entityController;
    }
    public SceneController getSceneController() {
        return sceneController;
    }

}
