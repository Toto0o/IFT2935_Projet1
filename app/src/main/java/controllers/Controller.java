package controllers;

import db.DataBase;
import entities.Estimate;
import entities.Offer;
import entities.Product;
import entities.User;
import scenes.*;
import status.LoginStatus;
import status.RegisterStatus;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.List;

public class Controller {

    private Platform platform;

    private DataBase dataBase;

    private Stage stage;
    private Scene scene;
    private Scene mainScene;
    private AppScene appScene;

    public Controller(Stage stage) {
        this.stage = stage;
        try {
            this.dataBase = new DataBase("", "", "");
        } catch (Exception e) {
            // TODO
        }
        changeScene(SceneName.LOGIN);
    }

    public LoginStatus login(String username, String password) {
        // TODO
        return LoginStatus.SUCCESS;
    }

    public RegisterStatus register(String username, String password) {
        // TODO
        return RegisterStatus.REGISTERED;
    }

    public List<User> getUsers() {
        // TODO
        return null;
    }

    public User findUserByUsername(String username) {
        // TODO
        return null;
    }

    public User findUserById(int id) {
        // TODO
        return null;
    }

    public List<Product> getProducts() {
        // TODO
        return null;
    }

    public Product findProductById(int id) {
        // TODO
        return null;
    }

    public Product findProductByName(String name) {
        // TODO
        return null;
    }

    public List<Product> findProductsByPrice(double price) {
        // TODO
        return null;
    }

    public List<Product> findProductsByPrice(double priceMin, double priceMax) {
        // TODO
        return null;
    }

    public List<Product> findProductsByCategory(String category) {
        // TODO
        return null;
    }


    public List<Estimate> getEstimates() {
        // TODO
        return null;
    }

    public List<Estimate> findEstimatesByProductId(int productId) {
        // TODO
        return null;
    }

    public Estimate findEstimateByProductId(int productId) {
        // TODO
        return null;
    }

    public Offer getOffers() {
        // TODO
        return null;
    }

    public Offer findOfferByProductId(int productId) {
        // TODO
        return null;
    }



    public void changeScene(SceneName scene) {

        appScene = null;

        switch (scene) {
            case LOGIN -> appScene = new Login(this);
            case REGISTER -> appScene = new Register(this);
            case BUY_PRODUCTS -> appScene = new BuyProducts(this);
            case SELL_PRODUCTS -> appScene = new SellProducts(this);
        }

        assert appScene != null;
        mainScene = appScene.getScene();

        stage.setScene(mainScene);
        stage.setMaximized(true);
    }

    public void exit() {
        stage.close();
        platform = null;
    }

    // DEBUG
    public AppScene getAppScene() {
        return appScene;
    }
}
