/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author notur
 */
public class Guest_Order_details {

    int order_detail_id;
    int order_id;
    int productId;
    int quantity;
    double amount_price;

    public Guest_Order_details() {
    }

    public Guest_Order_details(int order_id, int productId, int quantity, double amount_price) {
        this.order_id = order_id;
        this.productId = productId;
        this.quantity = quantity;
        this.amount_price = amount_price;
    }

    public int getOrder_detail_id() {
        return order_detail_id;
    }

    public void setOrder_detail_id(int order_detail_id) {
        this.order_detail_id = order_detail_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount_price() {
        return amount_price;
    }

    public void setAmount_price(double amount_price) {
        this.amount_price = amount_price;
    }

  

    

    

    @Override
    public String toString() {
        return "Guest_Order_details{" + "order_detail_id=" + order_detail_id + ", order_id=" + order_id + ", productId=" + productId + ", quantity=" + quantity + ", amount_price=" + amount_price + '}';
    }

    
    
    
}
