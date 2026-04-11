package controllers;

import db.*;
import entities.EntitiesBuilder;
import entities.estimates.Estimate;
import entities.offers.Offer;
import entities.products.Product;
import entities.users.User;
import entities.users.UserType;
import javafx.scene.layout.BorderPane;
import scenes.*;
import session.UserSession;
import status.LoginStatus;
import status.RegisterStatus;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public class Controller {

    //private Platform platform;
    private EntitiesBuilder entitiesBuilder;

    private Stage stage;
    private Scene mainScene;
    private AppScene appScene;

    private DataBase db;
    private UserService  userService;
    private OfferService offerService;
    private ProductService productService;
    private EstimateService estimateService;

    public Controller(Stage stage) {
        entitiesBuilder = new EntitiesBuilder(this);
        try {
            this.db = new DataBase("", "", "");
        } catch (Exception e) {
            e.printStackTrace();
            // TODO
        }
        userService = new UserService(db);
        offerService = new OfferService(db);
        productService = new ProductService(db);
        estimateService = new EstimateService(db);

        this.stage = stage;
        BorderPane dummy = new BorderPane();
        mainScene = new Scene(dummy);
        mainScene.getStylesheets().add(
                Objects.requireNonNull(getClass().getResource("/style.css")).toExternalForm()
        );
        stage.setScene(mainScene);
        changeScene(SceneName.LOGIN);
    }

    public LoginStatus login(String username, String password) {
        // TODO : VERIFY CREDENTIALS + GET_USER_ID

        User user = new User(0, username, UserType.ANNOUNCER);
        UserSession.getInstance().login(user);
        if (UserSession.getInstance().isLogin()) return LoginStatus.SUCCESS;
        else return LoginStatus.LOGIN_ERROR;
    }

    public RegisterStatus register(String username, String password) {
        // TODO : REGISTER USER TO DATABASE


        return RegisterStatus.REGISTERED;
    }

    public void logout() {
        UserSession.getInstance().logout();
        changeScene(SceneName.LOGIN);
    }

    public List<User> getUsers() throws SQLException {
        List<User> users = null;
        try {
            users = userService.get();
        } catch (Exception e) {
            // TODO
        }
        return users;
    }

    public User findUserByUsername(String username) {
        User user = null;
        try {
            user = userService.findByUsername(username);
        } catch (SQLException e) {
            // TODO
        }
        return user;
    }

    public User findUserById(int id) {
        User user = null;
        try {
            user = userService.findById(id);
        } catch (SQLException e) {
            // TODO
        }
        return user;
    }

    public List<Product> getProducts() {
        List<Product> products = null;
        try {
            products = productService.get();
        } catch (SQLException e) {
            // TODO
        }
        return products;
    }

    public Product findProductById(int id) {
        Product product = null;
        try {
            product = productService.findById(id);
        } catch (SQLException e) {
            // TODO
        }
        return product;
    }

    public List<Product> findProductByAnnoucerId(int annoucerId) {
        List<Product> products = null;
        try {
            products = productService.findByAnnoucerId(annoucerId);
        } catch (SQLException e) {
            // TODO
        }
        return products;
    }

    public Product findProductByName(String name) {
        // TODO
        return null;
    }

    public List<Product> findProductsByPriceMin(double price) {
        // TODO
        return null;
    }

    public List<Product> findProductsByPriceMax(double price) {
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

    public void updateProduct(int productId, String titre, String description, String etat, String categorie) {
        try {
            productService.update(productId, titre, description, etat, categorie);
        } catch (SQLException e) {
            // TODO
        }
    }

    public void deleteProduct(int id) {
        try {
            productService.delete(id);
        } catch (SQLException e) {
            // TODO
        }
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


    public EntitiesBuilder getEntitiesBuilder() {
        return entitiesBuilder;
    }

    public int getCurrentUserId() {
        return UserSession.getInstance().getUser().getId();
    }


    public void changeScene(SceneName scene) {

        appScene = null;

        switch (scene) {
            case LOGIN -> appScene = new Login(this);
            case REGISTER -> appScene = new Register(this);
            case BUY_PRODUCTS -> appScene = new BuyProducts(this);
            case MY_PRODUCTS -> appScene = new MyProducts(this);
            case MY_ACCOUNT -> appScene = new MyAccount(this);
        }

        assert appScene != null;
        mainScene.setRoot(appScene.getSceneRoot());
        stage.setMaximized(true);
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
