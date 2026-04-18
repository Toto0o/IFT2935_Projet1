package db;

import db.config.Database;
import db.dto.*;
import entities.estimates.Estimate;
import entities.offers.Offer;
import entities.offers.OfferStatus;
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
        query = "SELECT u.email, p.title, o.price, e.estimate " +
                "FROM project.users u " +
                "         JOIN project.offers o ON u.id_user=o.user_id " +
                "         JOIN project.products p ON p.id_product=o.product_id " +
                "         JOIN project.estimations e ON e.product_id=p.id_product;";
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
                "WHERE o.price < e.estimate;";
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
        query = "SELECT p.title, COUNT(o.id_offer) AS count " +
                "FROM products p " +
                "         JOIN offers o ON p.id_product=o.product_id " +
                "GROUP BY p.title;";
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
        query = "SELECT u.email, AVG(o.price) AS average " +
                "FROM users u " +
                "         JOIN offers o ON u.id_user=o.user_id " +
                "GROUP BY u.email;";
        List<BuyerOfferAverage> buyerOfferAverages = new ArrayList<>();
        ResultSet rs;

        PreparedStatement stmt = db.getCon().prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            buyerOfferAverages.add(new BuyerOfferAverage(
                    rs.getString("email"),
                    rs.getDouble("average")
            ));
        }
        return buyerOfferAverages;
    }

    public List<CategoryCount> getCategoryCount() throws SQLException {
        query = "SELECT p.category, COUNT(p.id_product) AS count, AVG(o.price) AS average " +
                "FROM products p " +
                "         JOIN offers o ON p.id_product=o.product_id " +
                "         JOIN users u ON u.id_user=o.user_id " +
                "         JOIN estimations e ON e.product_id=p.id_product " +
                "GROUP BY p.category;";
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
                "         JOIN estimations e ON e.product_id = p.id_product;";
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
                "GROUP BY p.title;";
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
                    rs.getInt("announcer_id"),
                    rs.getDouble("wanted_price")
            ));
        }
        return products;
    }

    public List<Product> getProductsByAnnouncerId(int annoucerId) throws SQLException{
        query = "SELECT * FROM products WHERE announcer_id=?;";
        List<Product> products = new ArrayList<>();
        ResultSet rs;
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        stmt.setInt(1, annoucerId);
        rs = stmt.executeQuery();
        while (rs.next()) {
            products.add(new Product(
                    rs.getInt("id_product"),
                    rs.getString("title"),
                    rs.getString("description"),
                    ProductState.getProductState(rs.getString("state_")),
                    ProductCategory.getProductCategory(rs.getString("category")),
                    ProductStatus.getProductStatus(rs.getString("status")),
                    rs.getInt("announcer_id"),
                    rs.getDouble("wanted_price")
            ));
        }
        return products;
    }

    public int addNewProduct(Product product) throws SQLException {
        query = "INSERT INTO products (title, description, state_, status, category, wanted_price, announcer_id) VALUES (?,?,?,?,?,?,?);";
        int id = -1;
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);
            stmt.setString(1, product.getTitle());
            stmt.setString(2, product.getDescription());
            stmt.setString(3, product.getPs().toString());
            stmt.setString(4, ProductStatus.ACTIVE.toString());
            stmt.setString(5, product.getCategorie().toString());
            stmt.setDouble(6, product.getPrice());
            stmt.setInt(7, product.getAnnouncerId());
            stmt.executeUpdate();

            PreparedStatement stmt2 = db.getCon().prepareStatement("SELECT id_product FROM products WHERE title=?");
            stmt2.setString(1, product.getTitle());
            ResultSet rs = stmt2.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id_product");
            }
            System.out.println(id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;

    }

    public User findUserByUsername(String username) throws SQLException {
        query = "SELECT * FROM users WHERE email = ?;";
        User user = null;
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            user = new User(
                    rs.getInt("id_user"),
                    rs.getString("email"),
                    rs.getString("u_password"),
                    rs.getString("last_name"),
                    rs.getString("first_name"),
                    rs.getBoolean("type_expert")
            );
        }
        System.out.println("DB : " + user.getemail() + " " + user.getPassword());
        return user;
    }

    public int addUser(String email, String password, String lname, String fname, boolean type_expert) throws SQLException {
        query = "INSERT INTO users (email, u_password, last_name, first_name, type_expert) " +
                "VALUES (?, ?, ?, ?, ?);";
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        stmt.setString(1,email);
        stmt.setString(2,password);
        stmt.setString(3,lname);
        stmt.setString(4,fname);
        stmt.setBoolean(5,type_expert);
        stmt.executeUpdate();

        PreparedStatement stmt2 = db.getCon().prepareStatement("SELECT id_user FROM users WHERE email = ?;");
        stmt2.setString(1,email);
        ResultSet rs = stmt2.executeQuery();
        int id = -1;
        while (rs.next()) {
            id = rs.getInt("id_user");
        }
        return id;
    }

    public int addNewEstimate(Estimate estimate) throws SQLException {
        query = "INSERT INTO estimations (estimate, decision, expert_id, product_id) VALUES (?,?,?,?);";
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        stmt.setDouble(1, estimate.getEstimate());
        stmt.setBoolean(2, estimate.getDecision());
        stmt.setInt(3, estimate.getExpertId());
        stmt.setInt(4, estimate.getProductId());
        stmt.executeUpdate();

        query = "SELECT * FROM estimations WHERE product_id=?;";
        stmt = db.getCon().prepareStatement(query);
        stmt.setInt(1, estimate.getProductId());
        ResultSet rs = stmt.executeQuery();
        int id = -1;
        while (rs.next()) {
            id = rs.getInt("est_id");
        }
        return id;
    }

    public int getRandomExpert() throws SQLException {
        query = "SELECT id_user FROM users where type_expert = ? ORDER BY RANDOM() LIMIT 1;";
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        stmt.setBoolean(1, true);
        ResultSet rs = stmt.executeQuery();
        int id = -1;
        while (rs.next()) {
            id = rs.getInt("id_user");
        }
        return id;
    }

    public void addNewOffer(Offer offer) throws SQLException {
        query = "INSERT INTO offers (price, msg, status, user_id) VALUES (?,?,?,?);)";
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        stmt.setDouble(1, offer.getPrice());
        stmt.setString(2, offer.getMessage());
        stmt.setString(3, offer.getStatus().toString());
        stmt.setInt(4, offer.getBuyerId());
    }

    public List<Offer> findOffersByUserId(int userId) throws SQLException {
        query = "SELECT * FROM offers WHERE user_id=?;";
        PreparedStatement stmt = db.getCon().prepareStatement(query);
        stmt.setInt(1, userId);
        ResultSet rs = stmt.executeQuery();
        List<Offer> offers = new ArrayList<>();
        while (rs.next()) {
            Offer offer = new Offer(
                    rs.getInt("id_offer"),
                    rs.getDouble("price"),
                    rs.getString("msg"),
                    rs.getInt("product_id"),
                    rs.getInt("user_id")
            );
            offer.setStatus(OfferStatus.valueOf(rs.getString("status")));
            offers.add(offer);
        }
        return offers;
    }

}
