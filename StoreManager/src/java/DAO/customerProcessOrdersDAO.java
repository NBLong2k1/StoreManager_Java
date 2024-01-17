/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.customerOderDetailsInformation;
import Model.customerProcessOrders;
import SQLCommand.SQLCommand;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author notur
 */
public class customerProcessOrdersDAO {
    private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet results = null;
        
        
        
          public List<customerOderDetailsInformation> getDetailsOrderStatus(int guestId) throws Exception {
		List<customerOderDetailsInformation> listprocessOrder = new ArrayList<>();
		customerOderDetailsInformation processOrder = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getDetailsOrderCustomerStatus);
			preparedStatement.setInt(1, guestId);
                       
			results = preparedStatement.executeQuery();
			while (results.next()) {
				processOrder = new customerOderDetailsInformation();
 
			 
				processOrder.setOrder_id(results.getInt("order_id"));    
				processOrder.setProduct_name(results.getString("product_name"));   
				processOrder.setNote(results.getString("note"));   
				processOrder.setQuantity(results.getInt("quantity")); 
				processOrder.setAmount_price(results.getDouble("amount_price")); 
                                processOrder.setTotal(results.getDouble("Total")); 
                             
				
				
				
				listprocessOrder.add(processOrder);
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
		return listprocessOrder;
	}
        public List<customerOderDetailsInformation> getDetailsOrder(int guestId) throws Exception {
		List<customerOderDetailsInformation> listprocessOrder = new ArrayList<>();
		customerOderDetailsInformation processOrder = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getDetailsOrderCustomer);
			preparedStatement.setInt(1, guestId);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				processOrder = new customerOderDetailsInformation();
 
			 
				processOrder.setOrder_id(results.getInt("order_id"));    
				processOrder.setProduct_name(results.getString("product_name"));   
				processOrder.setNote(results.getString("note"));   
				processOrder.setQuantity(results.getInt("quantity")); 
				processOrder.setAmount_price(results.getDouble("amount_price")); 
                                processOrder.setTotal(results.getDouble("Total")); 
                             
				
				
				
				listprocessOrder.add(processOrder);
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
		return listprocessOrder;
	}
        
  
        
   public List<customerProcessOrders> getAllSuccessOrder() throws Exception {
		List<customerProcessOrders> listprocessOrder = new ArrayList<>();
		customerProcessOrders processOrder = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllCustomerSuccessOrder);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				processOrder = new customerProcessOrders();
 
			 
				processOrder.setCustomer_id(Integer.parseInt(results.getString("customer_id")));    
				processOrder.setCustomer_name(results.getString("customer_name"));   
				processOrder.setEmail(results.getString("email"));   
				processOrder.setPhone(results.getString("phone")); 
				processOrder.setAddress(results.getString("address")); 
                                processOrder.setStatus(Integer.parseInt(results.getString("status")));    
				processOrder.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				processOrder.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				processOrder.setDelivery_way(Integer.parseInt(results.getString("delivery_way")));    
				processOrder.setOrder_time(results.getString("order_time")); 
                                processOrder.setNote(results.getString("note"));   
				processOrder.setTotal_price(results.getDouble("total_price")); 
				processOrder.setOrder_date(results.getString("order_date")); 
				
				
				listprocessOrder.add(processOrder);
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
		return listprocessOrder;
	}
    public List<customerProcessOrders> getAllSuccessOrderByID(String search) throws Exception {
       String isInteger = "^[0-9]+$";
  int id=0;
         if(Pattern.matches(isInteger, search)==true){
             id=Integer.parseInt(search);
         }
        List<customerProcessOrders> listprocessOrder = new ArrayList<>();
		customerProcessOrders processOrder = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement("select *, FORMAT (b.order_time, 'dd/MM/yyyy') as order_date\n" +
"from Customers a join Orders b \n" +
"on a.customer_id=b.customer_id where order_id="+id+" and  order_status >=2 or \n" +
"(customer_name like '%"+search+"%'  or email like '%"+search+"%') and  order_status >=2");
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				processOrder = new customerProcessOrders();
 
			 
				processOrder.setCustomer_id(Integer.parseInt(results.getString("customer_id")));    
				processOrder.setCustomer_name(results.getString("customer_name"));   
				processOrder.setEmail(results.getString("email"));   
				processOrder.setPhone(results.getString("phone")); 
				processOrder.setAddress(results.getString("address")); 
                                processOrder.setStatus(Integer.parseInt(results.getString("status")));    
				processOrder.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				processOrder.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				processOrder.setDelivery_way(Integer.parseInt(results.getString("delivery_way")));    
				processOrder.setOrder_time(results.getString("order_time")); 
                                processOrder.setNote(results.getString("note"));   
				processOrder.setTotal_price(results.getDouble("total_price")); 
				processOrder.setOrder_date(results.getString("order_date")); 
				
				
				listprocessOrder.add(processOrder);
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
		return listprocessOrder;
	}
        
   
   
    public List<customerProcessOrders> getAllprocessOrder() throws Exception {
		List<customerProcessOrders> listprocessOrder = new ArrayList<>();
		customerProcessOrders processOrder = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllCustomerProcessOrder);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				processOrder = new customerProcessOrders();
 
			 
				processOrder.setCustomer_id(Integer.parseInt(results.getString("customer_id")));    
				processOrder.setCustomer_name(results.getString("customer_name"));   
				processOrder.setEmail(results.getString("email"));   
				processOrder.setPhone(results.getString("phone")); 
				processOrder.setAddress(results.getString("address")); 
                                processOrder.setStatus(Integer.parseInt(results.getString("status")));    
				processOrder.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				processOrder.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				processOrder.setDelivery_way(Integer.parseInt(results.getString("delivery_way")));    
				processOrder.setOrder_time(results.getString("order_time")); 
                                processOrder.setNote(results.getString("note"));   
				processOrder.setTotal_price(results.getDouble("total_price")); 
				processOrder.setOrder_date(results.getString("order_date")); 
				
				
				listprocessOrder.add(processOrder);
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
		return listprocessOrder;
	}
        
    
    
     public List<customerProcessOrders> getAllprocessOrderByID(String search) throws Exception {
         String isInteger = "^[0-9]+$";
  int id=0;
         if(Pattern.matches(isInteger, search)==true){
             id=Integer.parseInt(search);
         }
		List<customerProcessOrders> listprocessOrder = new ArrayList<>();
		customerProcessOrders processOrder = null;
		try {
			connection = new DBContext().getConnection();
//			preparedStatement = connection.prepareStatement("select *, FORMAT (b.order_time, 'dd/MM/yyyy') as order_date\n" +
//"from Customers a join Orders b on a.customer_id=b.customer_id where order_status <=1\n" +
//"and (email like '%"+search+"%' or order_id="+id+")");
preparedStatement = connection.prepareStatement("select *, FORMAT (b.order_time, 'dd/MM/yyyy') as order_date\n" +
"from Customers a join Orders b on a.customer_id=b.customer_id where ((order_id="+id+") or  \n" +
" (email like '%"+search+"%' or customer_name like '%"+search+"%'   )) and order_status <=1");
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				processOrder = new customerProcessOrders();
 
			 
				processOrder.setCustomer_id(Integer.parseInt(results.getString("customer_id")));    
				processOrder.setCustomer_name(results.getString("customer_name"));   
				processOrder.setEmail(results.getString("email"));   
				processOrder.setPhone(results.getString("phone")); 
				processOrder.setAddress(results.getString("address")); 
                                processOrder.setStatus(Integer.parseInt(results.getString("status")));    
				processOrder.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				processOrder.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				processOrder.setDelivery_way(Integer.parseInt(results.getString("delivery_way")));    
				processOrder.setOrder_time(results.getString("order_time")); 
                                processOrder.setNote(results.getString("note"));   
				processOrder.setTotal_price(results.getDouble("total_price")); 
				processOrder.setOrder_date(results.getString("order_date")); 
				
				
				listprocessOrder.add(processOrder);
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
		return listprocessOrder;
	}
     public static void main(String[] args) throws Exception {
        customerProcessOrdersDAO d= new customerProcessOrdersDAO();
         for (customerProcessOrders g : d.getAllSuccessOrderByID("9")) {
             System.out.println(g);
         }
  
    }
    
}
