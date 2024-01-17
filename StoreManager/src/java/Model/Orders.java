/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author notur
 */
public class Orders {
//nhung ten
    
    //
    private int order_id;
    private int customer_id;
    private int order_status;
    private int delivery_way;
    public String order_time;
    private double total_price;
    public String note;
    public int code;
    public Orders() {
    }

    
    
    public Orders(int customer_id, int order_status, int delivery_way,  double total_price, String note,int code) {
        this.customer_id = customer_id;
        this.order_status = order_status;
        this.delivery_way = delivery_way;
        this.total_price = total_price;
        this.note = note;
        this.code=code;
    }

    
    public Orders(int order_id, int customer_id, int order_status, int delivery_way, String order_time, double total_price, String note,int code) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.order_status = order_status;
        this.delivery_way = delivery_way;
        this.order_time = order_time;
        this.total_price = total_price;
        this.note = note;
        this.code=code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public int getDelivery_way() {
        return delivery_way;
    }

    public void setDelivery_way(int delivery_way) {
        this.delivery_way = delivery_way;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    @Override
    public String toString() {
        return "Orders{" + "order_id=" + order_id + ", customer_id=" + customer_id + ", order_status=" + order_status + ", delivery_way=" + delivery_way + ", order_time=" + order_time + ", total_price=" + total_price + ", note=" + note + ", code=" + code + '}';
    }

    
   
    
}
