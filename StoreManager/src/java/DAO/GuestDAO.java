/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.Guest;
import Model.Guest_Order_details;
import Model.OrdersGuest;
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
public class GuestDAO {
      private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet results = null;
        
        
        
        
        public Guest findGuestByGuestCode(int guestCode) throws Exception {
		
		Guest Guest = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getGuestByEmail);
			preparedStatement.setInt(1, guestCode);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Guest = new Guest();
 
			 
				Guest.setGuest_id(Integer.parseInt(results.getString("guest_id")));    
				Guest.setGuest_name(results.getString("guest_name"));   
				Guest.setEmail(results.getString("email"));    
				Guest.setPhone(results.getString("phone")); 
				Guest.setAddress(results.getString("address")); 
				Guest.setStatus(Integer.parseInt(results.getString("status")));
				
				
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
		return Guest;
	}
        
        
        
        
        
        public Guest findGuestByEmail(String email,String phone) throws Exception {
		
		Guest Guest = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getGuestByEmail);
			preparedStatement.setString(1, email);
                        preparedStatement.setString(2, phone);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Guest = new Guest();
 
			 
				Guest.setGuest_id(Integer.parseInt(results.getString("guest_id")));    
				Guest.setGuest_name(results.getString("guest_name"));   
				Guest.setEmail(results.getString("email"));    
				Guest.setPhone(results.getString("phone")); 
				Guest.setAddress(results.getString("address")); 
				Guest.setStatus(Integer.parseInt(results.getString("status")));
				
				
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
		return Guest;
	}
        
        
         public List<Guest> getAllGuest() throws Exception {
		List<Guest> listGuest = new ArrayList<>();
		Guest Guest = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllGuest);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Guest = new Guest();
 
			 
				Guest.setGuest_id(Integer.parseInt(results.getString("guest_id")));    
				Guest.setGuest_name(results.getString("guest_name"));   
				Guest.setEmail(results.getString("email"));    
				Guest.setPhone(results.getString("phone")); 
				Guest.setAddress(results.getString("address")); 
				Guest.setStatus(Integer.parseInt(results.getString("status")));
				
				listGuest.add(Guest);
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
		return listGuest;
	}
         
           public boolean addGuest(Guest Guest) throws Exception {
		boolean check = false;
	
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.addGuest);

			preparedStatement.setString(1, Guest.getGuest_name());
			preparedStatement.setString(2, Guest.getEmail());
			preparedStatement.setString(3, Guest.getPhone());
			preparedStatement.setString(4,Guest.getAddress());
                        preparedStatement.setInt(5, 1);
                        preparedStatement.setInt(6, Guest.getGuestCode());
			
		
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
           public static void main(String[] args) throws Exception {
        GuestDAO d =new GuestDAO();
               System.out.println(d.findGuestByGuestCode(1));
    }
            
}
