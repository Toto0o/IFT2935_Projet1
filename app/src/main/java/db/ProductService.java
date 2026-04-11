package db;

import entities.products.Product;
import entities.products.ProductCategory;
import entities.products.ProductState;
import entities.products.ProductStatus;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
                        ProductState.getProductState(rs.getString("state")),
                        ProductCategory.getProductCategory(rs.getString("categorie")),
                        ProductStatus.getProductStatus(rs.getString("status")),
                        rs.getInt("annoucerId")
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
                    ProductState.getProductState(rs.getString("state")),
                    ProductCategory.getProductCategory(rs.getString("categorie")),
                    ProductStatus.getProductStatus(rs.getString("status")),
                    rs.getInt("annoucerId")
            );
        } catch (SQLException e) {
            // TODO
        }
        return product;
    }

    public List<Product> findByAnnoucerId(int annoucerId)  throws SQLException {
        query = ""; // TODO
        ResultSet rs;
        List<Product> products = new ArrayList<>();

        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statement

            rs = stmt.executeQuery();
            while (rs.next()) {
                Product currentProduct = new Product(
                        rs.getInt("id"),
                        rs.getString("titre"),
                        rs.getString("description"),
                        ProductState.getProductState(rs.getString("state")),
                        ProductCategory.getProductCategory(rs.getString("categorie")),
                        ProductStatus.getProductStatus(rs.getString("status")),
                        rs.getInt("annoucerId")
                );
                products.add(currentProduct);
            }

        } catch (SQLException e) {
            // TODO
        }
        return products;
    }

    public Product findByPrice(double price) throws SQLException {
        query = ""; // TODO
        ResultSet rs;
        Product product = null;

        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statements

            rs = stmt.executeQuery();

            product = new Product(
                    rs.getInt("id"),
                    rs.getString("titre"),
                    rs.getString("description"),
                    ProductState.getProductState(rs.getString("state")),
                    ProductCategory.getProductCategory(rs.getString("categorie")),
                    ProductStatus.getProductStatus(rs.getString("status")),
                    rs.getInt("annoucerId")
            );
        } catch (SQLException e) {
            // TODO
        }
        return product;
    }

    public List<Product> findByPrices(double start, double end) {
        query = ""; // TODO
        ResultSet rs;
        List<Product> products = new ArrayList<>();

        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statement

            rs = stmt.executeQuery();
             while (rs.next()) {
                 Product currentProduct = new Product(
                         rs.getInt("id"),
                         rs.getString("titre"),
                         rs.getString("description"),
                         ProductState.getProductState(rs.getString("state")),
                         ProductCategory.getProductCategory(rs.getString("categorie")),
                         ProductStatus.getProductStatus(rs.getString("status")),
                         rs.getInt("annoucerId")
                 );
                 products.add(currentProduct);
             }

        } catch (SQLException e) {
            // TODO
        }
        return products;
    }

    public Product findByCategorie(ProductCategory category) {
        String categorie = category.toString();

        query = ""; // TODO
        ResultSet rs;
        Product product = null;

        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statements

            rs = stmt.executeQuery();

            product = new Product(
                    rs.getInt("id"),
                    rs.getString("titre"),
                    rs.getString("description"),
                    ProductState.getProductState(rs.getString("state")),
                    ProductCategory.getProductCategory(rs.getString("categorie")),
                    ProductStatus.getProductStatus(rs.getString("status")),
                    rs.getInt("annoucerId")
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
