package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    private Connection con;

    public DataBase(String DB_URL, String USER, String PASS) throws SQLException {
        try {
            this.con = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            // TODO
        }
    }

    public void close() throws SQLException {
        try {
            this.con.close();
        } catch (Exception e) {
            // TODO
        }
    }

    public void prepareStatement(String sql) throws SQLException {
        if (con != null) {
            // TODO
        }
        if (sql != null) {
            // TODO
        }
        try {
            Statement stmt = this.con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            // TODO
        }
    }
}
