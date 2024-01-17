/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author win
 */
public class Product {
    private int product_id;
    private String product_name;
    private int product_type;
    private String description;
    private String product_img; 
    private double price;
    private int status;
    public Product() {
    }

    public Product(int product_id, String product_name, int product_type, String description, String product_img, double price, int status) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_type = product_type;
        this.description = description;
        this.product_img = product_img;
        this.price = price;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Product(String product_name, int product_type, String description, String product_img, double price) {
        this.product_name = product_name;
        this.product_type = product_type;
        this.description = description;
        this.product_img = product_img;
        this.price = price;
    }

    
    
    public Product(int product_id, String product_name, int product_type, String description, String product_img, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_type = product_type;
        this.description = description;
        this.product_img = product_img;
        this.price = price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_type() {
        return product_type;
    }

    public void setProduct_type(int product_type) {
        this.product_type = product_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", product_type=" + product_type + ", description=" + description + ", product_img=" + product_img + ", price=" + price + '}';
    }

    
    
}
