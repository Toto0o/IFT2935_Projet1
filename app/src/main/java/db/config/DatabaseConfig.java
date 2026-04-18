package db.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatabaseConfig {

    private static final Properties prop = new Properties();

    static {
        try (InputStream input = DatabaseConfig.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input != null) {
                //
            }
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getDbUrl() {
        return prop.getProperty("db.url");
    }
    public static String getDbUser() {
        return prop.getProperty("db.username");
    }
    public static String getDbPassword() {
        return prop.getProperty("db.password");
    }
}
