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
    String user;
    String password;
    String url;
    Connection conn;
//    public void openConnection() {
    public GetConnection() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("database.properties"));
            user = prop.getProperty("user");
            password = prop.getProperty("password");
            url = prop.getProperty("url");
            Class.forName("com.mysql.cj.jdbc.Driver");
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
