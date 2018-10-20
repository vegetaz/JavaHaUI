/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DAOProduct {

    DBConnection dbConn;
    Connection conn;

    public DAOProduct(DBConnection dbConn) {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }

    public int addProduct(Product pro) {
        int n = 0;
        String sql = "insert into Product(pid,pname,quantity,price,description,status) \n"
                + "  values('" + pro.getId() + "','" + pro.getPname() + "',"
                + pro.getQuantity() + "," + pro.getPrice() + ",'"
                + pro.getDescription() + "'," + pro.getStatus() + ")";
        //System.out.println(sql);
        try {
            //statement: run sql
            Statement state = conn.createStatement();
            //run sql
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public int addProductByPrepare(Product pro) {
        int n = 0;
        String sql = "insert into Product(pid,pname,quantity,price,description,status) \n"
                + "  values(?,?,?,?,?,?)";
        //System.out.println(sql);
        try {
            //PreparedStatement: create SQl with parameter
            PreparedStatement preState = conn.prepareStatement(sql);
            //set parameter
//            preState.setXXX(index of ?,value);
//            XXX: data of field in table
//            index start 1
//            value: value of object (pro)
            preState.setString(1, pro.getId());
            preState.setString(2, pro.getPname());
            preState.setInt(3, pro.getQuantity());
            preState.setDouble(4, pro.getPrice());
            preState.setString(5, pro.getDescription());
            preState.setInt(6, pro.getStatus());
            //run
            n = preState.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public int updateProduct(Product pro) {
        int n = 0;
        String sql = "update Product set pname=?,"
                + "quantity=?,price=?,"
                + "description=?, status=? where pid=?";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1, pro.getPname());
            pre.setInt(2, pro.getQuantity());
            pre.setDouble(3, pro.getPrice());
            pre.setString(4, pro.getDescription());
            pre.setInt(5, pro.getStatus());
            pre.setString(6, pro.getId());
            n = pre.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public int removeProduct(String pid) {
        int n = 0;
        String sql = "delete from Product where pid='" + pid + "'";
        try {
//            note: khi xóa thì cần chú ý ràng buộc khóa ngoại:
//            giá trị khóa chính đã tồn tại trên khóa ngoại thì không
//                    xóa được khóa chính
//            VD:một sản phẩm đã từng bán thì pid sẽ có trên
//                    hóa đơn --> không xóa được sản phẩm
//            --> đổi status của sản phẩm thay vì xóa
//            nếu bắt buộc phải xóa:
//            xóa bên nhiều trước (hóa đơn) và giải pháp thường
//            là dùng trigger
            Statement state = conn.createStatement();
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public void display(String sql) {
        ResultSet rs;
        //String sql="select * from Product";
        Statement state;
        try {
            // state = conn.createStatement();
            state = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = state.executeQuery(sql);
            while (rs.next()) {
//                rs.getXXX(index|fieldName)
//                XXX: dataType of fieldName
//                        index: start 1
//                        fieldName: name of column
                String pid = rs.getString(1);
                String id = rs.getString("pid");
                // System.out.println(pid+"\t"+id);
                String name = rs.getString("pname");
                int quantity = rs.getInt(3);
                double price = rs.getDouble(4);
                String description = rs.getString(5);
                int status = rs.getInt("status");
                //create object
                Product pro = new Product(id, name, quantity, price, description, status);
                System.out.println(pro);

            }
            while (rs.previous()) {
                String pid = rs.getString(1);
                String id = rs.getString("pid");
                // System.out.println(pid+"\t"+id);
                String name = rs.getString("pname");
                int quantity = rs.getInt(3);
                double price = rs.getDouble(4);
                String description = rs.getString(5);
                int status = rs.getInt("status");
                //create object
                Product pro = new Product(id, name, quantity, price, description, status);
                System.out.println(pro);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet getData(String sql) {
        ResultSet rs = null;
        try {
            Statement state = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = state.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    public static void main(String[] args) {
        DBConnection dbcon = new DBConnection();
        DAOProduct dao = new DAOProduct(dbcon);
        int n = dao.addProduct(
                new Product("p07", "LG", 2, 300, "LG Mobile", 1));
        if (n > 0) {
            System.out.println("inserted");
        }
//        int n = dao.addProductByPrepare(
//                new Product("p08", "Nokia", 2, 300, "Nokia Mobile", 1));
//        if (n > 0) {
//            System.out.println("inserted");
//        }
//        int m = dao.updateProduct(
//                new Product("p08", "Sony", 3, 400, "Sony Z5", 1));
//        if (m > 0) {
//            System.out.println("updated");
//        }
//        int x = dao.removeProduct("p08");
//        if (x > 0) {
//            System.out.println("removed");
//        }
//        dao.display("select * from Product");
//        dao.display("select pname from Product");
    }
}
