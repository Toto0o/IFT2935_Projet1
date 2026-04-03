package db;

import entities.Estimate;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstimateService {

    private final DataBase db;
    private String query;

    public EstimateService(DataBase db) {
        this.db = db;
    }

    public List<Estimate> get() {
        query = ""; // TODO
        ResultSet rs;
        List<Estimate> estimates = new ArrayList<>();
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statement

            rs = stmt.executeQuery();

            while (rs.next()) {
                Estimate currentEstimate = new Estimate(
                        rs.getInt("id"),
                        rs.getInt("expertId"),
                        rs.getInt("estimate"),
                        rs.getInt("productId")
                );
                estimates.add(currentEstimate);
            }

        } catch (SQLException e) {
            // TODO
        }
        return estimates;
    }

    public Estimate findById(int id) {
        query = ""; // TODO
        ResultSet rs;
        Estimate estimate = null;
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statement

            rs = stmt.executeQuery();

            estimate = new Estimate(
                    rs.getInt("id"),
                    rs.getInt("expertId"),
                    rs.getInt("estimate"),
                    rs.getInt("productId")
            );

        } catch (SQLException e) {
            // TODO
        }
        return estimate;
    }

    public void update(int id, int estimate) {
        query = ""; // TODO

        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : bind params to statement

            stmt.executeQuery();

        } catch (SQLException e) {
            // TODO
        }
    }

    public void delete(int id) {
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
