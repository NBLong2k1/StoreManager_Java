/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author notur
 */
public class Customer {

    private int customer_id;
    private String customer_name;
    private String username ;
    private String password;
    private String email;
    private String phone;
    private String dob;
    private int status;
    public String address;

    public Customer() {
    }

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Customer(int customer_id,String customer_name, String username, String password, String email, String phone, String dob, int status,String address) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.status = status;
        this.address=address;
    }
    
    
    

    public Customer(String customer_name, String username, String password, String email, String phone, String dob, int status,String address) {
        this.customer_name = customer_name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.status = status;
        this.address=address;
    }

    public Customer(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" + "customer_id=" + customer_id + ", customer_name=" + customer_name + ", username=" + username + ", password=" + password + ", email=" + email + ", phone=" + phone + ", dob=" + dob + ", status=" + status + ", address=" + address + '}';
    }

    
                
                
   
    public static void main(String[] args) {
     
       
    }
    
}
