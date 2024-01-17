/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author notur
 */
public class OrdersGuest {
      private int order_id;
    private int guest_id;
    private int order_status;
    private int delivery_way;
    public String order_time;
    public String note;
    private double total_price;

    public OrdersGuest() {
    }

    public OrdersGuest(int guest_id, int order_status, int delivery_way, String order_time, String note, double total_price) {
        this.guest_id = guest_id;
        this.order_status = order_status;
        this.delivery_way = delivery_way;
        this.order_time = order_time;
        this.note = note;
        this.total_price = total_price;
    }

    
    public OrdersGuest(int order_id, int guest_id, int order_status, int delivery_way, String order_time, String note, double total_price) {
        this.order_id = order_id;
        this.guest_id = guest_id;
        this.order_status = order_status;
        this.delivery_way = delivery_way;
        this.order_time = order_time;
        this.note = note;
        this.total_price = total_price;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(int guest_id) {
        this.guest_id = guest_id;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    @Override
    public String toString() {
        return "OrdersGuest{" + "order_id=" + order_id + ", guest_id=" + guest_id + ", order_status=" + order_status + ", delivery_way=" + delivery_way + ", order_time=" + order_time + ", note=" + note + ", total_price=" + total_price + '}';
    }

   
    

 

}
