package db;

import db.config.Database;
import db.dto.*;
import entities.products.Product;
import entities.products.ProductCategory;
import entities.products.ProductState;
import entities.products.ProductStatus;
import entities.users.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbService {

    private Database db;
    private String query;

    public DbService(Database db) {
        this.db = db;
    }

    public List<UserProductsEstimate> getUserProducts() throws SQLException {
        query = "SELECT u.username, p.title, o.price, e.estimate " +
                "FROM project.users u " +
                "         JOIN project.offers o ON u.id_user=o.user_id " +
                "         JOIN project.products p ON p.id=o.product_id " +
                "         JOIN project.estimates e ON e.product_id=p.id_product";
        List<UserProductsEstimate> userProductsEstimates = new ArrayList<>();
        ResultSet rs;

        PreparedStatement stmt = db.getCon().prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            userProductsEstimates.add(new UserProductsEstimate(
                    rs.getString("username"),
                    rs.getString("title"),
                    rs.getDouble("price"),
                    rs.getDouble("estimate")
            ));
        }
        return userProductsEstimates;
    }

    public List<UserProducts> getUserProductsLowPrices() throws SQLException {
        query = "SELECT u.email, p.title, o.price " +
                "FROM users u " +
                "         JOIN offers o ON u.id_user=o.user_id " +
                "         JOIN products p ON p.id_product=o.product_id " +
                "         JOIN estimations e ON e.product_id=p.id_product " +
                "WHERE o.price < e.estimate";
        List<UserProducts> userProducts = new ArrayList<>();
        ResultSet rs;

        PreparedStatement stmt = db.getCon().prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            userProducts.add(new UserProducts(
                    rs.getString("email"),
                    rs.getString("title"),
                    rs.getDouble("price")
            ));
        }
        return userProducts;
    }

    public List<ProductOfferCount> getProductOfferCount() throws SQLException {
        query = "SELECT p.title, COUNT(o.id) " +
                "FROM products p " +
                "         JOIN offers o ON p.id=o.productId " +
                "GROUP BY p.title";
        List<ProductOfferCount> productOfferCounts = new ArrayList<>();
        ResultSet rs;

        PreparedStatement stmt = db.getCon().prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            productOfferCounts.add(new ProductOfferCount(
                    rs.getString("title"),
                    rs.getInt("count")
            ));
        }
        return productOfferCounts;
    }

    public List<BuyerOfferAverage> getBuyerOfferAverage() throws SQLException {
        query = "SELECT u.username, AVG(o.price) " +
                "FROM users u " +
                "         JOIN offers o ON u.id=o.buyerId " +
                "GROUP BY u.username ";
        List<BuyerOfferAverage> buyerOfferAverages = new ArrayList<>();
        ResultSet rs;

        PreparedStatement stmt = db.getCon().prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            buyerOfferAverages.add(new BuyerOfferAverage(
                    rs.getString("username"),
                    rs.getDouble("average")
            ));
        }
        return buyerOfferAverages;
    }

    public List<CategoryCount> getCategoryCount() throws SQLException {
        query = "SELECT p.category, COUNT(p.id), AVG(o.price) " +
                "FROM products p " +
                "         JOIN offers o ON p.id=o.productId " +
                "         JOIN users u ON u.id=o.buyerId " +
                "         JOIN estimates e ON e.productId=p.id " +
                "GROUP BY p.category";
        List<CategoryCount> categoryCounts = new ArrayList<>();
        ResultSet rs;

        PreparedStatement stmt = db.getCon().prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            categoryCounts.add(new CategoryCount(
                    rs.getString("category"),
                    rs.getInt("count"),
                    rs.getDouble("average")
            ));
        }

        return categoryCounts;
    }

    public List<UserProductPriceEstimate> getUserProductPriceEstimate() throws SQLException {
        query = "SELECT u.first_name, p.title, o.price, e.estimate " +
                "FROM users u " +
                "         JOIN offers o ON u.id_user = o.user_id " +
                "         JOIN products p ON p.id_product = o.product_id " +
                "         JOIN estimations e ON e.product_id = p.id_product";
        List<UserProductPriceEstimate> userProductPriceEstimates = new ArrayList<>();
        ResultSet rs;
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            userProductPriceEstimates.add(new UserProductPriceEstimate(
                    rs.getString("first_name"),
                    rs.getString("title"),
                    rs.getDouble("price"),
                    rs.getDouble("estimate")
            ));
        }
        return userProductPriceEstimates;
    }

    public List<ProductEstimateCount> getProductEstimateCount() throws SQLException {
        query = "SELECT p.title, COUNT(e.id_est) AS nb_estimations, AVG(e.estimate) AS moyenne " +
                "FROM products p " +
                "         JOIN estimations e ON p.id_product = e.product_id " +
                "GROUP BY p.title";
        List<ProductEstimateCount> productEstimateCounts = new ArrayList<>();
        ResultSet rs;
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            productEstimateCounts.add(new ProductEstimateCount(
                    rs.getString("title"),
                    rs.getInt("nb_estimations"),
                    rs.getDouble("moyenne")
            ));
        }
        return productEstimateCounts;
    }

    public List<UserProductsEstimate> getAcceptedDecision() throws SQLException {
        query = "SELECT u.first_name, p.title, o.price, e.estimate " +
                "FROM users u " +
                "         JOIN offers o ON u.id_user = o.user_id " +
                "         JOIN products p ON p.id_product = o.product_id " +
                "         JOIN estimations e ON e.product_id = p.id_product " +
                "WHERE e.decision = TRUE";
        List<UserProductsEstimate> userProductsEstimates = new ArrayList<>();
        ResultSet rs;
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            userProductsEstimates.add(new UserProductsEstimate(
                    rs.getString("first_name"),
                    rs.getString("title"),
                    rs.getDouble("price"),
                    rs.getDouble("estimate")
            ));
        }
        return userProductsEstimates;
    }

    public List<Product> getAllProducts() throws SQLException {
        query = "SELECT * FROM products;";
        List<Product> products = new ArrayList<>();
        ResultSet rs;
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            products.add(new Product(
                    rs.getInt("id_product"),
                    rs.getString("title"),
                    rs.getString("description"),
                    ProductState.getProductState(rs.getString("state_")),
                    ProductCategory.getProductCategory(rs.getString("category")),
                    ProductStatus.getProductStatus(rs.getString("status")),
                    rs.getInt("announcer_id")
            ));
        }
        return products;
    }

    public List<Product> getProductsByAnnouncerId(int annoucerId) throws SQLException{
        query = "SELECT * FROM products WHERE id=?";
        List<Product> products = new ArrayList<>();
        ResultSet rs;
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            products.add(new Product(
                    rs.getInt("id_product"),
                    rs.getString("title"),
                    rs.getString("description"),
                    ProductState.getProductState(rs.getString("state_")),
                    ProductCategory.getProductCategory(rs.getString("category")),
                    ProductStatus.getProductStatus(rs.getString("status")),
                    rs.getInt("announcer_id")
            ));
        }
        return products;
    }

    public List<Product> findProductByAnnoucerId(int id) throws SQLException {
        query = "SELECT * FROM products WHERE id_product = ?";
        List<Product> products = new ArrayList<>();
        ResultSet rs;
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();
        while (rs.next()) {
            products.add(new Product(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    ProductState.getProductState(rs.getString("state_")),
                    ProductCategory.getProductCategory(rs.getString("category")),
                    ProductStatus.getProductStatus(rs.getString("status")),
                    rs.getInt("annoucer_id")
            ));
        }
        return products;
    }

    public User findUserByUsername(String username) throws SQLException {
        query = "SELECT * FROM users WHERE username = ?";
        User user = null;
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            user = new User(
                    rs.getInt("id"),
                    rs.getString("email"),
                    rs.getString("u_password"),
                    rs.getString("last_name"),
                    rs.getString("first_name"),
                    rs.getBoolean("type_expert")
            );
        }
        return user;
    }

    public void addUser(String email, String password, String lname, String fname, boolean type_expert) throws SQLException {
        query = "INSERT INTO users (email, password, last_name, first_name, type_expert) " +
                "VALUES (?, ?, ?, ?, ?);";
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        stmt.setString(1,email);
        stmt.setString(2,password);
        stmt.setString(3,lname);
        stmt.setString(4,fname);
        stmt.setBoolean(5,type_expert);
        stmt.executeUpdate();
    }
}
