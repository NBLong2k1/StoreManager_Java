/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author notur
 */
public class Guest {
    private int guest_id;
    private String guest_name;
    private String email;
    public String phone;
    public String address;
    private int status;
    public int guestCode;
    public Guest() {
    }

    public Guest(String guest_name, String email, String phone, String address, int status, int guestCode) {
        this.guest_name = guest_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.guestCode = guestCode;
    }

    
    public Guest(String guest_name, String email, String phone, String address, int status) {
        this.guest_name = guest_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public Guest(int guest_id, String guest_name, String email, String phone, String address, int status) {
        this.guest_id = guest_id;
        this.guest_name = guest_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public int getGuestCode() {
        return guestCode;
    }

    public void setGuestCode(int guestCode) {
        this.guestCode = guestCode;
    }

    public int getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(int guest_id) {
        this.guest_id = guest_id;
    }

    public String getGuest_name() {
        return guest_name;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name;
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

    @Override
    public String toString() {
        return "Guest{" + "guest_id=" + guest_id + ", guest_name=" + guest_name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", status=" + status + ", guestCode=" + guestCode + '}';
    }

   
    
}
