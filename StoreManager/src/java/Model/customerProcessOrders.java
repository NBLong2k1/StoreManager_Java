/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author notur
 */
public class customerProcessOrders {
    public int customer_id;
    public String customer_name;
    public String email;
    public String phone;
    public String address;
    public int status;
    public int order_id;
    public int order_status;
    public int delivery_way;
    public String order_time;
    public String note;
    public double total_price;
    public String order_date;

    public customerProcessOrders() {
    }

    public customerProcessOrders(int customer_id, String customer_name, String email, String phone, String address, int status, int order_id, int order_status, int delivery_way, String order_time, String note, double total_price, String order_date) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.order_id = order_id;
        this.order_status = order_status;
        this.delivery_way = delivery_way;
        this.order_time = order_time;
        this.note = note;
        this.total_price = total_price;
        this.order_date = order_date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
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

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    @Override
    public String toString() {
        return "customerProcessOrders{" + "customer_id=" + customer_id + ", customer_name=" + customer_name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", status=" + status + ", order_id=" + order_id + ", order_status=" + order_status + ", delivery_way=" + delivery_way + ", order_time=" + order_time + ", note=" + note + ", total_price=" + total_price + ", order_date=" + order_date + '}';
    }
    
    
    
    
}
