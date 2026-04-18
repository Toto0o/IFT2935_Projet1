package controllers;

import db.DbService;
import entities.GraphicBuilder;
import entities.products.Product;
import entities.users.User;
import scenes.Login;
import session.UserSession;
import status.LoginStatus;
import status.RegisterStatus;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntityController {

    private DbService dbService;
    private GraphicBuilder graphicBuilder;

    public EntityController(DbService dbService) {
        this.dbService = dbService;
        graphicBuilder = new GraphicBuilder();
    }

    public void logout() {}

    public List<Product> getAllProducts() {
        List<Product> products = null;
        try {
            products = dbService.getAllProducts();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public List<Product> getProductsByAnnouncerId(int announcerId) {
        List<Product> products = null;
        try {
            products = dbService.getProductsByAnnouncerId(announcerId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public LoginStatus login(String email, String password) {
        User user;
        try {
            user = dbService.findUserByUsername(email);
            UserSession.getInstance().login(user);
            System.out.println("Controller : " + user.getemail() + " " + user.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            return LoginStatus.USERNAME_NOT_FOUND;
        }
        if (!user.getPassword().equals(password)) {
            return LoginStatus.PASSWORD_ERROR;
        }

        return LoginStatus.SUCCESS;
    }

    public RegisterStatus register(String email, String password, String lname, String fname, boolean type_expert) {
       try {
           int id = dbService.addUser(email, password, lname, fname, type_expert);
           User user = new User(id,email,password,lname,fname,type_expert);
           UserSession.getInstance().login(user);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
        return RegisterStatus.REGISTERED;
    }

    public void addProduct(Product product) {
        try {
            dbService.addNewProduct(product);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public GraphicBuilder getGraphicBuilder() {
        return graphicBuilder;
    }
}
