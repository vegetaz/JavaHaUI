/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;
import java.sql.SQLException;
import java.io.IOException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Vegetaz
 */
public class GetConnection {

    private Connection conn;
    private String user;
    private String password;
    private String url;
    private String driver;

    public GetConnection() {
        Properties prop = new Properties();
        try {
            try (FileInputStream fis = new FileInputStream("database.properties")) {
                prop.load(fis);
            }
            user = prop.getProperty("jdbc.user");
            password = prop.getProperty("jdbc.password");
            url = prop.getProperty("jdbc.url");
            driver = prop.getProperty("jdbc.driver");
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Kết nối thành công!", "Thông báo", 1);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Kết nối không thành công!", "Thông báo", 2);
        }
    }

    public void CloseConnection() {
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Đóng kết nối thành công!", "Thông báo", 3);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đóng kết nối thất bại!", "Thông báo", 4);
        }
    }
}
