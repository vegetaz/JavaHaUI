/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author HP
 */
public class Product {
    private String id;
    private String pname;
    private int quantity;
    private double price;
    private String description;
    private int status;

    public Product() {
    }

    public Product(String id, String pname, int quantity, double price, String description, int status) {
        this.id = id;
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.status = status;
    }

    public Product(String id, String pname, int quantity, double price, String description) {
        this.id = id;
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", pname=" + pname + ", quantity=" + quantity + ", price=" + price + ", description=" + description + ", status=" + status + '}';
    }
    
    

}
