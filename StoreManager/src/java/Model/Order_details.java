/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author notur
 */
public class Order_details {
    private int order_detail_id;
    private int order_id;
    private int quantity;
    private double amount_price;
    public int productId;

    public Order_details() {
    }

    public Order_details(int order_detail_id, int order_id, int quantity, double amount_price, int productId) {
        this.order_detail_id = order_detail_id;
        this.order_id = order_id;
        this.quantity = quantity;
        this.amount_price = amount_price;
        this.productId = productId;
    }

    public Order_details(int order_id, int quantity, double amount_price, int productId) {
        this.order_id = order_id;
        this.quantity = quantity;
        this.amount_price = amount_price;
        this.productId = productId;
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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Order_details{" + "order_detail_id=" + order_detail_id + ", order_id=" + order_id + ", quantity=" + quantity + ", amount_price=" + amount_price + ", productId=" + productId + '}';
    }
   
}
