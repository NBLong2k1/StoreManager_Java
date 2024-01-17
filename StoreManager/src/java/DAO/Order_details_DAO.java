/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.Order_details;
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
public class Order_details_DAO {
     private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet results = null;
        
        
         public List<Order_details> getAllOrder_detailsByOrdID(int ordID) throws Exception {
		List<Order_details> listOrder_details = new ArrayList<>();
		Order_details Order_details = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllOrder_detailsByOrdID);
			preparedStatement.setInt(1, ordID);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Order_details = new Order_details();
 
			 
				Order_details.setOrder_detail_id(results.getInt("order_detail_id"));    
				Order_details.setOrder_id(results.getInt("order_id"));   
				Order_details.setQuantity(results.getInt("quantity"));    
				Order_details.setAmount_price(results.getInt("amount_price")); 
				Order_details.setProductId(results.getInt("productId")); 
				
				
				listOrder_details.add(Order_details);
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
		return listOrder_details;
	}
        
        
        public boolean addOrdersDetails(Order_details Orders) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.addOrderDetails);

			preparedStatement.setInt(1, Orders.getOrder_id());
			preparedStatement.setInt(2, Orders.getQuantity());
			preparedStatement.setDouble(3, Orders.getAmount_price());
		
                        preparedStatement.setInt(4, Orders.getProductId());
                 
			
		
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
