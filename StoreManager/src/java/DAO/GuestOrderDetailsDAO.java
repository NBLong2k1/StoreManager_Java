/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.Guest_Order_details;
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
public class GuestOrderDetailsDAO {

    private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet results = null;
    
       public List<Guest_Order_details> getAllOrderGuestDetails() throws Exception {
		List<Guest_Order_details> listOrdersGuest = new ArrayList<>();
		Guest_Order_details Orders = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllorderGuestDetails);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Orders = new Guest_Order_details();
 
			 
				Orders.setOrder_detail_id(Integer.parseInt(results.getString("order_detail_id")));    
				Orders.setOrder_id(Integer.parseInt(results.getString("order_id")));   
				   
				Orders.setQuantity(Integer.parseInt(results.getString("quantity"))); 
				Orders.setAmount_price( Double.parseDouble(results.getString("amount_price"))); 
                            
				
				listOrdersGuest.add(Orders);
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
		return listOrdersGuest;
	}
                  
                  public List<Guest_Order_details> findOrderGuestDetailsByOrderID(int id) throws Exception {
		List<Guest_Order_details> listOrdDetails = new ArrayList<>();
		Guest_Order_details Orders = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getOrdersDetailsGuestByOrderID);
			preparedStatement.setInt(1, id);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Orders = new Guest_Order_details();
 
			 
				Orders.setOrder_detail_id(Integer.parseInt(results.getString("order_detail_id")));    
				Orders.setOrder_id(Integer.parseInt(results.getString("order_id")));   
			  
				Orders.setQuantity(Integer.parseInt(results.getString("quantity"))); 
				Orders.setAmount_price( Double.parseDouble(results.getString("amount_price"))); 
                                Orders.setProductId(results.getInt("productId")); 
				
				listOrdDetails.add(Orders);
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
		return listOrdDetails;
	}
                   public Guest_Order_details getOrderGuestDetailsByOrderID(int id) throws Exception {
		
		Guest_Order_details Orders = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getOrdersDetailsGuestByOrderID);
			preparedStatement.setInt(1, id);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Orders = new Guest_Order_details();
 
			 
				Orders.setOrder_detail_id(Integer.parseInt(results.getString("order_detail_id")));    
				Orders.setOrder_id(Integer.parseInt(results.getString("order_id")));   
			  
				Orders.setQuantity(Integer.parseInt(results.getString("quantity"))); 
				Orders.setAmount_price( Double.parseDouble(results.getString("amount_price"))); 
                                Orders.setProductId(results.getInt("productId")); 
				
				
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
		return Orders;
	}
                  
                    public boolean addOrdersGuestDetails(Guest_Order_details OrdersGuest) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.addGuestOrderDetails);

			
			preparedStatement.setInt(1, OrdersGuest.getOrder_id());
			 
			preparedStatement.setInt(2,OrdersGuest.getQuantity());
                        preparedStatement.setDouble(3, OrdersGuest.getAmount_price());
                        preparedStatement.setDouble(4, OrdersGuest.getProductId());
			
		
			preparedStatement.execute();
			
		check=true;

				

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
    
}
