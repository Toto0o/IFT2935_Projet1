package db;

import entities.offers.Offer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfferService {

    private final DataBase db;
    private String query;

    public OfferService(DataBase db) {
        this.db = db;
    }

    public List<Offer> get() {
        query = ""; // TODO
        ResultSet rs;
        List<Offer> offers = new ArrayList<>();
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statement

            rs = stmt.executeQuery();

            while (rs.next()) {
                Offer currentOffer = new Offer(
                        rs.getInt("id"),
                        rs.getInt("price"),
                        rs.getString("message"),
                        rs.getInt("productId"),
                        rs.getInt("buyerId")
                );
                offers.add(currentOffer);
            }
        } catch (SQLException e) {
            // TODO
        }
        return offers;
    }

    public Offer findById(int id) {
        query = ""; // TODO
        ResultSet rs;
        Offer offer = null;
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statement

            rs = stmt.executeQuery();

            offer = new Offer(
                    rs.getInt("id"),
                    rs.getInt("price"),
                    rs.getString("message"),
                    rs.getInt("productId"),
                    rs.getInt("buyerId")
            );
        } catch (SQLException e) {
            // TODO
        }

        return offer;
    }

    public void update(int id, int price) throws SQLException {
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
