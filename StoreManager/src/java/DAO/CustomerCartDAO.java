/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.customerCart;
import SQLCommand.SQLCommand;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author notur
 */
public class CustomerCartDAO {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet results = null;

    
      public boolean UpdateCustomerCart(customerCart customerCart) throws Exception {
        boolean check = false;

        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareCall(SQLCommand.UpdateCustomerCart);

            preparedStatement.setInt(1, customerCart.getQuantity());
            preparedStatement.setDouble(2, customerCart.getPrice());
            preparedStatement.setInt(3, customerCart.getCustomer_id());
            preparedStatement.setInt(4, customerCart.getProductId());

            preparedStatement.execute();

            check = true;

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return check;

    }
    
    
        public boolean DeleteCustomerCart(int customerID,int productID ) throws Exception {
        boolean check = false;

        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareCall(SQLCommand.deleteCustomerCart);

        
            preparedStatement.setInt(1, customerID);
            preparedStatement.setInt(2, productID);

            preparedStatement.execute();

            check = true;

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return check;

    }
    public boolean addCustomerCart(customerCart customerCart) throws Exception {
        boolean check = false;

        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareCall(SQLCommand.addCustomerCart);

            preparedStatement.setInt(1, customerCart.getCustomer_id());
            preparedStatement.setInt(2, customerCart.getProductId());
            preparedStatement.setInt(3, customerCart.getQuantity());
             preparedStatement.setDouble(4, customerCart.getPrice());

            preparedStatement.execute();

            check = true;

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return check;

    }

     public List<customerCart> findCartByCusIDWithProductName(int cusId) throws Exception {
        List<customerCart> listCart = new ArrayList<>();
        customerCart customerCart = null;
        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareStatement("select p.product_name,c.Quantity,c.price\n" +
"	from Products p join customerCart c on p.product_id =c.productId \n" +
"	where c.customer_id='"+cusId+"'");
            
            results = preparedStatement.executeQuery();
            while (results.next()) {
                customerCart = new customerCart();
                customerCart.setProduct_name(results.getString("product_name"));
                customerCart.setQuantity(results.getInt("Quantity"));
                customerCart.setPrice(results.getDouble("price"));
             

                listCart.add(customerCart);

            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listCart;
    }
    
    
    
    public List<customerCart> findCartByCusID(int cusId) throws Exception {
        List<customerCart> listCart = new ArrayList<>();
        customerCart customerCart = null;
        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareStatement("select *from customerCart where customer_id= '"+cusId+"' ");
            
            results = preparedStatement.executeQuery();
            while (results.next()) {
                customerCart = new customerCart();
                customerCart.setCart_id(results.getInt("cart_id"));
                customerCart.setCustomer_id(results.getInt("customer_id"));
                customerCart.setProductId(results.getInt("productId"));
                customerCart.setQuantity(results.getInt("Quantity"));
                customerCart.setPrice(results.getInt("price"));

                listCart.add(customerCart);

            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listCart;
    }
    
    
    public customerCart findCartByCusIDAndProductID(int cusId,int productID) throws Exception {
      
        customerCart customerCart = null;
        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareStatement("select *from customerCart where customer_id='"+cusId+"' and productId='"+productID+"'");
            
            results = preparedStatement.executeQuery();
            while (results.next()) {
                customerCart = new customerCart();
                customerCart.setCart_id(results.getInt("cart_id"));
                customerCart.setCustomer_id(results.getInt("customer_id"));
                customerCart.setProductId(results.getInt("productId"));
                customerCart.setQuantity(results.getInt("Quantity"));
                customerCart.setPrice(results.getInt("price"));

               

            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return customerCart;
    }

    public static void main(String[] args) throws Exception {
         CustomerCartDAO dao = new CustomerCartDAO();
       for(customerCart x: dao.findCartByCusIDWithProductName(19)){
           System.out.println(x);
       }
    }
}
