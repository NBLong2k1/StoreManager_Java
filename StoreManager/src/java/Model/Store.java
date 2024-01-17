/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author notur
 */
public class Store {
    private int store_id;
    private String store_name;
    private String store_address;
    private String city;
    private String phone; 

    public Store() {
    }

    public Store(String store_name, String store_address, String city, String phone) {
        this.store_name = store_name;
        this.store_address = store_address;
        this.city = city;
        this.phone = phone;
    }

    public Store(int store_id, String store_name, String store_address, String city, String phone) {
        this.store_id = store_id;
        this.store_name = store_name;
        this.store_address = store_address;
        this.city = city;
        this.phone = phone;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_address() {
        return store_address;
    }

    public void setStore_address(String store_address) {
        this.store_address = store_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Store{" + "store_id=" + store_id + ", store_name=" + store_name + ", store_address=" + store_address + ", city=" + city + ", phone=" + phone + '}';
    }
  
}
