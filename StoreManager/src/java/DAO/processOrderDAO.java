/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.guestOderDetailsInformation;
import Model.processOrder;
import SQLCommand.SQLCommand;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author notur
 */
public class processOrderDAO {
    private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet results = null;
        
        
        public List<guestOderDetailsInformation> getDetailsOrder(int guestId) throws Exception {
		List<guestOderDetailsInformation> listprocessOrder = new ArrayList<>();
		guestOderDetailsInformation processOrder = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getDetailsOrderGuest);
			preparedStatement.setInt(1, guestId);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				processOrder = new guestOderDetailsInformation();
 
			 
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
        
        public List<processOrder> getAllSuccessOrder() throws Exception {
		List<processOrder> listprocessOrder = new ArrayList<>();
		processOrder processOrder = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllSuccessOrder);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				processOrder = new processOrder();
 
			 
				processOrder.setGuest_id(Integer.parseInt(results.getString("guest_id")));    
				processOrder.setGuest_name(results.getString("guest_name"));   
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
          public List<processOrder> getAllSuccessOrderBySearch(String search) throws Exception {
               String isInteger = "^[0-9]+$";
  int id=0;
         if(Pattern.matches(isInteger, search)==true){
             id=Integer.parseInt(search);
         }
		List<processOrder> listprocessOrder = new ArrayList<>();
		processOrder processOrder = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement("select *, FORMAT (b.order_time, 'dd/MM/yyyy') as order_date \n" +
"from Guest a join OrdersGuest b \n" +
"on a.guest_id=b.guest_id where order_id="+id+" and  order_status >=2 or \n" +
"a.phone= '"+search+"' and order_status >=2 or  \n" +
"(guest_name like '%"+search+"%'  or email like '%"+search+"%') and  order_status >=2");
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				processOrder = new processOrder();
 
			 
				processOrder.setGuest_id(Integer.parseInt(results.getString("guest_id")));    
				processOrder.setGuest_name(results.getString("guest_name"));   
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
        
        public List<processOrder> getAllprocessOrder() throws Exception {
		List<processOrder> listprocessOrder = new ArrayList<>();
		processOrder processOrder = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllProcessOrder);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				processOrder = new processOrder();
 
			 
				processOrder.setGuest_id(Integer.parseInt(results.getString("guest_id")));    
				processOrder.setGuest_name(results.getString("guest_name"));   
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
        
        
         public List<processOrder> getAllprocessOrderByNameOrIdOrEmail(String search) throws Exception {
              String isInteger = "^[0-9]+$";
  int id=0;
         if(Pattern.matches(isInteger, search)==true){
             id=Integer.parseInt(search);
         }
		List<processOrder> listprocessOrder = new ArrayList<>();
		processOrder processOrder = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement("select *, FORMAT (b.order_time, 'dd/MM/yyyy') as order_date \n" +
"from Guest a join OrdersGuest b \n" +
"on a.guest_id=b.guest_id where order_id="+id+" and  order_status <=1 or \n" +
"a.phone='"+search+"' and order_status <=1 or \n" +
"(guest_name like '%"+search+"%'  or email like '%"+search+"%') and  order_status <=1");
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				processOrder = new processOrder();
 
			 
				processOrder.setGuest_id(Integer.parseInt(results.getString("guest_id")));    
				processOrder.setGuest_name(results.getString("guest_name"));   
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
        
        public static void main(String[] args) {
        processOrderDAO dao = new processOrderDAO();
        try {
            System.out.println(dao.getAllprocessOrderByNameOrIdOrEmail("124214"));
        } catch (Exception ex) {
            Logger.getLogger(processOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
