package jdbcconnectiondemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author veget
 */
public class GetConnection {
    private String user;
    private String password;
    private String url;
    private String driver;
    private Connection conn;
//    public void openConnection() {
    public GetConnection() {
        Properties prop = new Properties();
        try {
            try (FileInputStream fis = new FileInputStream("database.properties")) {
                prop.load(fis);
            }
//            FileInputStream fis = new FileInputStream("database.properties");
//            prop.load(fis);
//            fis.close();
            user = prop.getProperty("jdbc.user");
            password = prop.getProperty("jdbc.password");
            url = prop.getProperty("jdbc.url");
            driver = prop.getProperty("jdbc.driver");
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected!");
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            ex.printStackTrace();
        }
    }
    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
