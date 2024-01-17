/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author notur
 */
public class customerCart {

    
    // nhung' thuoc tinh
    public String product_name;
    //
    
    
    
    int cart_id;
    int customer_id;
    int productId;
    int Quantity;
    double price;
  

    public customerCart() {
    }

    public customerCart(String product_name, int Quantity, double price) {
        this.product_name = product_name;
        this.Quantity = Quantity;
        this.price = price;
    }

  

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    
    
    public customerCart(int cart_id, int customer_id, int productId, int Quantity, double price) {
        this.cart_id = cart_id;
        this.customer_id = customer_id;
        this.productId = productId;
        this.Quantity = Quantity;
        this.price = price;
    }

    public customerCart(int customer_id, int productId, int Quantity, double price) {
        this.customer_id = customer_id;
        this.productId = productId;
        this.Quantity = Quantity;
        this.price = price;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "customerCart{" + "product_name=" + product_name + ", cart_id=" + cart_id + ", customer_id=" + customer_id + ", productId=" + productId + ", Quantity=" + Quantity + ", price=" + price + '}';
    }

    
   
    
    
}
