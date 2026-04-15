package controllers;


import db.config.Database;
import db.config.DatabaseConfig;
import db.DbService;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Controller {


    private DTOController dtoController;
    private EntityController entityController;
    private SceneController sceneController;

    public Controller(Stage primaryStage) {
        DbService dbService;
        String url = DatabaseConfig.getDbUrl() + "?currentSchema=project";
        String user = DatabaseConfig.getDbUser();
        String password = DatabaseConfig.getDbPassword();

        try {
            Database db = new Database(url, user, password);
            dbService = new DbService(db);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        dtoController = new DTOController(dbService);
        sceneController = new SceneController(primaryStage, this);
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
