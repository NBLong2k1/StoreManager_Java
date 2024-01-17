/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author MINH
 */
public class Category {
    private int category_id;
    private String category_name;
    private int category_type;

    public Category() {
    }

    public Category(String category_name) {
        this.category_name = category_name;
    }

    public Category(String category_name, int category_type) {
        this.category_name = category_name;
        this.category_type = category_type;
    }

    public Category(int category_id, String category_name, int category_type) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.category_type = category_type;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getCategory_type() {
        return category_type;
    }

    public void setCategory_type(int category_type) {
        this.category_type = category_type;
    }

    @Override
    public String toString() {
        return "Category{" + "category_id=" + category_id + ", category_name=" + category_name + ", category_type=" + category_type + '}';
    }
    
    
}
