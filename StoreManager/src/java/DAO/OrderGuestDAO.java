/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.OrdersGuest;
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
public class OrderGuestDAO {
        private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet results = null;
        
        
        
         public List<OrdersGuest> getAllOrderByDate(String date) throws Exception {
		List<OrdersGuest> listOrdersGuest = new ArrayList<>();
		OrdersGuest OrdersGuest = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getOrderGuestByDate);
			  preparedStatement.setString(1, date);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				OrdersGuest = new OrdersGuest();
 
			 
				OrdersGuest.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				OrdersGuest.setGuest_id(Integer.parseInt(results.getString("guest_id")));   
				OrdersGuest.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				OrdersGuest.setDelivery_way(Integer.parseInt(results.getString("delivery_way"))); 
				OrdersGuest.setOrder_time(results.getString("order_time")); 
				OrdersGuest.setTotal_price(Double.parseDouble(results.getString("total_price")));
				OrdersGuest.setNote(results.getString("note"));
				listOrdersGuest.add(OrdersGuest);
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
        
        
        
        
        
        
           public boolean deleteOrdersGuest(int orderID) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.deleteOrderDetails);
                        preparedStatement.setInt(1,orderID);
			
			
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
        
        public boolean updateStatusOrdersGuest(int status,int orderID) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.updateOrderStatus);
                        preparedStatement.setInt(1,status);
			preparedStatement.setInt(2,orderID);
			
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
        
        
        
        
                  public List<OrdersGuest> getAllOrderGuest() throws Exception {
		List<OrdersGuest> listOrdersGuest = new ArrayList<>();
		OrdersGuest Orders = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllordersGuest);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Orders = new OrdersGuest();
 
			 
				Orders.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				Orders.setGuest_id(Integer.parseInt(results.getString("guest_id")));   
				Orders.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				Orders.setDelivery_way(Integer.parseInt(results.getString("delivery_way"))); 
				Orders.setOrder_time(results.getString("order_time")); 
                                Orders.setNote(results.getString("note")); 
				Orders.setTotal_price(Double.parseDouble(results.getString("total_price")));
				
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
                  
                   public List<OrdersGuest> getAllSuccessOrderGuest() throws Exception {
		List<OrdersGuest> listOrdersGuest = new ArrayList<>();
		OrdersGuest Orders = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllSuccessordersGuest);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Orders = new OrdersGuest();
 
			 
				Orders.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				Orders.setGuest_id(Integer.parseInt(results.getString("guest_id")));   
				Orders.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				Orders.setDelivery_way(Integer.parseInt(results.getString("delivery_way"))); 
				Orders.setOrder_time(results.getString("order_time")); 
                                Orders.setNote(results.getString("note")); 
				Orders.setTotal_price(Double.parseDouble(results.getString("total_price")));
				
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
                   public OrdersGuest getOrderGuestByGuestID(int id) throws Exception {
		
		OrdersGuest Orders = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getOrdersGuestByID);
			preparedStatement.setInt(1, id);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Orders = new OrdersGuest();
 
			 
				Orders.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				Orders.setGuest_id(Integer.parseInt(results.getString("guest_id")));   
				Orders.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				Orders.setDelivery_way(Integer.parseInt(results.getString("delivery_way"))); 
				Orders.setOrder_time(results.getString("order_time")); 
                                Orders.setNote(results.getString("note")); 
				Orders.setTotal_price(Double.parseDouble(results.getString("total_price")));
				
				
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
                  
                    public boolean addOrdersGuest(OrdersGuest OrdersGuest) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.addOrderGuest);

			preparedStatement.setInt(1, OrdersGuest.getGuest_id());
			preparedStatement.setInt(2, 0);
			preparedStatement.setInt(3, OrdersGuest.getDelivery_way());
		
                        preparedStatement.setString(4, OrdersGuest.getNote());
                        preparedStatement.setDouble(5, OrdersGuest.getTotal_price());
			
		
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

                    
                    
                    public Double getTotalMonth() throws Exception {
		Double totalMonth=0.0;
		
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getGuestTotalInMonth);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				
                            totalMonth=results.getDouble("total");
			 
				
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
		return totalMonth;
	}
        
        
         public Double getTotalDaily() throws Exception {
		Double totalDaily=0.0;
		
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getGuestTotalDaily);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				
                            totalDaily=results.getDouble("total");
			 
				
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
		return totalDaily;
	}
                    
                    
                    
        public static void main(String[] args) throws Exception {
            OrderGuestDAO dao = new OrderGuestDAO();
            System.out.println(dao.getTotalDaily());
    }
}
