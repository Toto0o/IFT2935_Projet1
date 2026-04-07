package db;

import entities.users.User;
import entities.users.UserType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private final DataBase db;
    private String query;

    public UserService(DataBase db) {
        this.db = db;
    }

    public List<User> get() throws SQLException {
        query = ""; // TODO
        ResultSet rs;
        List<User> users = new ArrayList<>();
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                User currentUser = new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        UserType.getUserType(rs.getString("type"))
                );
                users.add(currentUser);
            }
        } catch (SQLException e) {
            // TODO
        }
        return users;
    }

    public User findById(int id) throws SQLException {
        query = ""; // TODO
        ResultSet rs;
        User user = null;
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : ajouter le binding des arguments

            rs = stmt.executeQuery();
            user = new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    UserType.getUserType(rs.getString("type"))
            );
        } catch (SQLException e) {
            // TODO
        }
        return user;
    }

    public User findByUsername(String username) throws SQLException {
        query = ""; // TODO
        ResultSet rs;
        User user = null;
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : ajouter le binding des arguments

            rs = stmt.executeQuery();
            user = new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    UserType.getUserType(rs.getString("type"))
            );
        } catch (SQLException e) {
            // TODO
        }
        return user;
    }

    public void update(int id, String username, String password) throws SQLException{
        query = ""; // TODO
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : ajouter le binding des arguments

            stmt.executeQuery();
        } catch (SQLException e) {
            // TODO
        }
    }

    public void delete(int id) throws SQLException{
        query = ""; // TODO
        try {
            PreparedStatement stmt = db.getCon().prepareStatement(query);

            // TODO : ajouter le binding des arguments

            stmt.executeQuery();
        } catch (SQLException e) {
            // TODO
        }
    }
}
