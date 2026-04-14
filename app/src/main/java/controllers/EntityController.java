package controllers;

import db.DbService;
import entities.products.Product;
import entities.users.User;
import scenes.Login;
import status.LoginStatus;
import status.RegisterStatus;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntityController {

    private DbService dbService;

    public EntityController(DbService dbService) {
        this.dbService = dbService;
    }

    public void logout() {}

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<Product>();
        return products;
    }

    public LoginStatus login(String email, String password) {
        User user = null;
        try {
            user = dbService.findUserByUsername(email);
        } catch (SQLException e) {
            return LoginStatus.USERNAME_NOT_FOUND;
        }
        if (!user.getPassword().equals(password)) {
            return LoginStatus.PASSWORD_ERROR;
        }
        return LoginStatus.SUCCESS;
    }

    public RegisterStatus register(String email, String password) {
        return RegisterStatus.REGISTERED;
    }
}
