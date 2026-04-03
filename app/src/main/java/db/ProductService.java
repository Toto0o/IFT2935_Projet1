package db;

import entities.Product;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductService {

    private final DataBase db;
    private String query;

    public ProductService(DataBase db) {
        this.db = db;
    }

    public List<Product> get() throws SQLException {
        query = ""; // TODO
        ResultSet rs;
        List<Product> products = new ArrayList<Product>();
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statement

            rs = stmt.executeQuery();

            while (rs.next()) {
                Product currentProduct = new Product(
                        rs.getInt("id"),
                        rs.getString("titre"),
                        rs.getString("description"),
                        rs.getString("etat"),
                        rs.getString("categorie"),
                        rs.getInt("ownerId")
                );
                products.add(currentProduct);
            }
        } catch (SQLException e) {
            // TODO
        }
        return products;
    }

    public Product findById(int id) throws SQLException {
        query = ""; // TODO
        ResultSet rs;
        Product product = null;
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statement

            rs = stmt.executeQuery();

            product = new Product(
                    rs.getInt("id"),
                    rs.getString("titre"),
                    rs.getString("description"),
                    rs.getString("etat"),
                    rs.getString("categorie"),
                    rs.getInt("ownerId")
            );
        } catch (SQLException e) {
            // TODO
        }
        return product;
    }

    public void update(int id, String titre, String description, String etat, String categorie) throws SQLException {
        query = ""; // TODO

        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statement

            stmt.executeQuery();
        } catch (SQLException e) {
            // TODO
        }
    }

    public void delete(int id) throws SQLException {
        query = ""; // TODO

        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statement

            stmt.executeQuery();
        } catch (SQLException e) {
            // TODO
        }
    }
}
