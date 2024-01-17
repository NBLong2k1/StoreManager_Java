/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author notur
 */
public class Employee {

    public int employee_id;
    public String email;
    public int store_id;
    public String employee_name;
    public String username;
    public String password;
    public String phone;
    public String personal_id;
    public String dob;
    public String started_date;
    public int role;
    public int status;

    public Employee() {
    }

    
    
    
    public Employee(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Employee(String username, String email,   String password) {
             this.username = username;
        this.email = email;
    
        this.password = password;
    }

    public Employee(int employee_id,String email, int store_id, String employee_name, String username, String password, String phone, String personal_id, String dob, String started_date, int role, int status) {
        this.employee_id = employee_id;
        this.email = email;
        this.store_id = store_id;
        this.employee_name = employee_name;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.personal_id = personal_id;
        this.dob = dob;
        this.started_date = started_date;
        this.role = role;
        this.status = status;
    }

    
    public Employee(String email,   String employee_name, String username, String password,int store_id, int role, int status) {
        this.email = email;
        this.store_id = store_id;
        this.employee_name = employee_name;
        this.username = username;
        this.password = password;
   
        this.role = role;
        this.status = status;
    }

  

    
    
    public Employee(String email, int store_id, String employee_name, String username, String password, String phone, String personal_id, String dob, String started_date, int role, int status) {
        this.email = email;
        this.store_id = store_id;
        this.employee_name = employee_name;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.personal_id = personal_id;
        this.dob = dob;
        this.started_date = started_date;
        this.role = role;
        this.status = status;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(String personal_id) {
        this.personal_id = personal_id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStarted_date() {
        return started_date;
    }

    public void setStarted_date(String started_date) {
        this.started_date = started_date;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" + "employee_id=" + employee_id + ", email=" + email + ", store_id=" + store_id + ", employee_name=" + employee_name + ", username=" + username + ", password=" + password + ", phone=" + phone + ", personal_id=" + personal_id + ", dob=" + dob + ", started_date=" + started_date + ", role=" + role + ", status=" + status + '}';
    }


} 
