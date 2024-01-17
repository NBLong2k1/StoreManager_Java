/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.Orders;
import Model.Product;
import SQLCommand.SQLCommand;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notur
 */
public class OrdersDAO {
       private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet results = null;
        
        
        
         public boolean updateStatusOrders(int status,int orderID) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.updateOrderStatusForCustomer);
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
        
        
         public List<Orders> getAllStatusOrder(int status,int cusID) throws Exception {
		List<Orders> list= new ArrayList<>();
		Orders Orders = null;
		try {
			connection = new DBContext().getConnection();
                        if (status==0) {
                        preparedStatement = connection.prepareStatement("select *from Orders where order_status= 0 or order_status= 1 and customer_id=?");
			
                        preparedStatement.setInt(1, cusID);
                    }else{
                            preparedStatement = connection.prepareStatement("select *from Orders where order_status>=? and customer_id=?");
			 preparedStatement.setInt(1, status);
                        preparedStatement.setInt(2, cusID);
                        }
			
                        
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Orders = new Orders();
 
			 
				Orders.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				Orders.setCustomer_id(Integer.parseInt(results.getString("customer_id")));   
				Orders.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				Orders.setDelivery_way(Integer.parseInt(results.getString("delivery_way"))); 
				Orders.setOrder_time(results.getString("order_time")); 
				Orders.setTotal_price(Double.parseDouble(results.getString("total_price")));
                                Orders.setNote(results.getString("note"));
				list.add(Orders);
				
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
		return list;
	}
        
        
        
         public boolean addOrders(Orders Orders,int code) throws Exception {
        boolean check = false;

        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareCall(SQLCommand.addOrders);

            preparedStatement.setInt(1, Orders.getCustomer_id());
            preparedStatement.setInt(2, Orders.getOrder_status());
            preparedStatement.setInt(3, Orders.getDelivery_way());
            preparedStatement.setDouble(4, Orders.getTotal_price());
            preparedStatement.setString(5, Orders.getNote());
            preparedStatement.setInt(6, code);

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
        
         public List<Orders> getAllSuccessOrder() throws Exception {
		List<Orders> listOrders = new ArrayList<>();
		Orders Orders = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllSuccessorders);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Orders = new Orders();
 
			 
				Orders.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				Orders.setCustomer_id(Integer.parseInt(results.getString("customer_id")));   
				Orders.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				Orders.setDelivery_way(Integer.parseInt(results.getString("delivery_way"))); 
				Orders.setOrder_time(results.getString("order_time")); 
				Orders.setTotal_price(Double.parseDouble(results.getString("total_price")));
                                Orders.setNote(results.getString("note"));
				
				listOrders.add(Orders);
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
		return listOrders;
	}
         
          public List<Orders> getAllOrder() throws Exception {
		List<Orders> listOrders = new ArrayList<>();
		Orders Orders = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllorders);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Orders = new Orders();
 
			 
				Orders.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				Orders.setCustomer_id(Integer.parseInt(results.getString("customer_id")));   
				Orders.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				Orders.setDelivery_way(Integer.parseInt(results.getString("delivery_way"))); 
				Orders.setOrder_time(results.getString("order_time")); 
				Orders.setTotal_price(Double.parseDouble(results.getString("total_price")));
                                Orders.setNote(results.getString("note"));
				
				listOrders.add(Orders);
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
		return listOrders;
	}
          
          public Orders getOrderByCode(int code) throws Exception {
		
		Orders Orders = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getOrdersByCode);
			preparedStatement.setInt(1, code);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Orders = new Orders();
 
			 
				Orders.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				Orders.setCustomer_id(Integer.parseInt(results.getString("customer_id")));   
				Orders.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				Orders.setDelivery_way(Integer.parseInt(results.getString("delivery_way"))); 
				Orders.setOrder_time(results.getString("order_time")); 
				Orders.setTotal_price(Double.parseDouble(results.getString("total_price")));
                                Orders.setNote(results.getString("note"));
				
				
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
        
          
           public List<Orders> getAllOrderByDate(String date) throws Exception {
		List<Orders> listOrders = new ArrayList<>();
		Orders Orders = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getOrderByDate);
			  preparedStatement.setString(1, date);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Orders = new Orders();
 
			 
				Orders.setOrder_id(Integer.parseInt(results.getString("order_id")));    
				Orders.setCustomer_id(Integer.parseInt(results.getString("customer_id")));   
				Orders.setOrder_status(Integer.parseInt(results.getString("order_status")));    
				Orders.setDelivery_way(Integer.parseInt(results.getString("delivery_way"))); 
				Orders.setOrder_time(results.getString("order_time")); 
				Orders.setTotal_price(Double.parseDouble(results.getString("total_price")));
				Orders.setNote(results.getString("note"));
				listOrders.add(Orders);
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
		return listOrders;
	}
          
          
           
            public Double getAllTotalEachMonth(String month) throws Exception {
		Double totalMonth=0.0;
		
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement("SELECT SUM(price_sum) as total_price FROM (\n" +
"    SELECT SUM(total_price) as price_sum FROM orders where FORMAT (order_time, 'MM')  = FORMAT (GETDATE(), '"+month+"') and  order_status=2\n" +
"    UNION ALL\n" +
"    SELECT SUM(total_price) as price_sum FROM OrdersGuest where FORMAT (order_time, 'MM')  = FORMAT (GETDATE(), '"+month+"') and  order_status=2\n" +
") as total");
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				
                            totalMonth=results.getDouble("total_price");
			 
				
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
        
           
           
           
        public Double getTotalMonth() throws Exception {
		Double totalMonth=0.0;
		
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getTotalInMonth);
			
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
			preparedStatement = connection.prepareStatement(SQLCommand.getTotalDaily);
			
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
        public static void main(String[] args) {
        OrdersDAO dao = new OrdersDAO();
      String month="";
      List<Double>totalEachMonth=new ArrayList<>();
           try {
               System.out.println(dao.getTotalDaily());
           } catch (Exception ex) {
               Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
        
}
