/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author notur
 */
public class guestOderDetailsInformation {

    public int order_id;
    public String product_name;
    public String note;
    public int quantity;
    public double amount_price;
    public double Total;

    public guestOderDetailsInformation() {
    }

    public guestOderDetailsInformation(int order_id, String product_name, String note, int quantity, double amount_price, double Total) {
        this.order_id = order_id;
        this.product_name = product_name;
        this.note = note;
        this.quantity = quantity;
        this.amount_price = amount_price;
        this.Total = Total;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "guestOderDetailsInformation{" + "order_id=" + order_id + ", product_name=" + product_name + ", note=" + note + ", quantity=" + quantity + ", amount_price=" + amount_price + ", Total=" + Total + '}';
    }
    
    
}
