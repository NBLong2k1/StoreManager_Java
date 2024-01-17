/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.Store;
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
public class StoreDAO {
        private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet results = null;
        
        
         public boolean addStore(Store Store) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.addStore);

			preparedStatement.setString(1, Store.getStore_name());
			preparedStatement.setString(2, Store.getStore_address());
			preparedStatement.setString(3, Store.getCity());
			preparedStatement.setString(4,Store.getPhone());
                 
			
		
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
          public boolean updateStore(Store Store,int storeID) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.updateStore);

			preparedStatement.setString(1, Store.getStore_name());
			preparedStatement.setString(2, Store.getStore_address());
			preparedStatement.setString(3, Store.getCity());
			preparedStatement.setString(4,Store.getPhone());
                        preparedStatement.setInt(5,storeID);
                 
			
		
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
        
        
        public List<Store> getAllStore() throws Exception {
		List<Store> listStore = new ArrayList<>();
		Store Store = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllStore);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Store = new Store();
 
			 
				Store.setStore_id(Integer.parseInt(results.getString("store_id")));    
				Store.setStore_name(results.getString("store_name"));   
				Store.setStore_address(results.getString("store_address"));   
				Store.setCity(results.getString("city")); 
				Store.setPhone(results.getString("phone")); 
				
				
				listStore.add(Store);
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
		return listStore;
	}
        
         public List<Store> FindStoreByNameOrAddress(String name) throws Exception {
		List<Store> listStore = new ArrayList<>();
		Store Store = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement("select *from Stores where store_name like '%"+name+"%' or city like '%"+name+"%'");
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Store = new Store();
 
			 
				Store.setStore_id(Integer.parseInt(results.getString("store_id")));    
				Store.setStore_name(results.getString("store_name"));   
				Store.setStore_address(results.getString("store_address"));   
				Store.setCity(results.getString("city")); 
				Store.setPhone(results.getString("phone")); 
				
				
				listStore.add(Store);
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
		return listStore;
	}
        
         
          public Store findStoreByID(int id) throws Exception {
		
		Store Store = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.findStoreByID);
			preparedStatement.setInt(1, id);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Store = new Store();
 
			 
				Store.setStore_id(Integer.parseInt(results.getString("store_id")));    
				Store.setStore_name(results.getString("store_name"));   
				Store.setStore_address(results.getString("store_address"));   
				Store.setCity(results.getString("city")); 
				Store.setPhone(results.getString("phone")); 
				
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
		return Store;
	}
        
        public static void main(String[] args) {
            try {
                StoreDAO dao= new StoreDAO();
                System.out.println(dao.findStoreByID(1));
            } catch (Exception e) {
            }
    }
}
