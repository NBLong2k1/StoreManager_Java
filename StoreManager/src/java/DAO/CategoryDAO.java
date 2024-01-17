/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.Category;
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
public class CategoryDAO {
        private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet results = null;
        
          public boolean addCategory(Category Category) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.addCategory);

			preparedStatement.setString(1, Category.getCategory_name());
			preparedStatement.setInt(2, Category.getCategory_type());
			
                 
			
		
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
          
           public boolean updateCategory(Category Category,int id) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.updateCategory);

			preparedStatement.setString(1, Category.getCategory_name());
			preparedStatement.setInt(2, Category.getCategory_type());
                        preparedStatement.setInt(3, id);
			
                 
			
		
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
          
             public boolean deleteCategory(int id) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.deleteCategory);

			
                        preparedStatement.setInt(1, id);
			
                 
			
		
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
          
          
          
          
             public List<Category> getAllCategory() throws Exception {
		List<Category> listCategory = new ArrayList<>();
		Category Category = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllCategory);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Category = new Category();
                                Category.setCategory_id(Integer.parseInt(results.getString("category_id")));
			        Category.setCategory_name(results.getString("category_name"));   
				Category.setCategory_type(Integer.parseInt(results.getString("category_type")));    
				 
				 
				
				
				listCategory.add(Category);
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
		return listCategory;
	}
             
              public Category findCategoryByID(int id ) throws Exception {
		
		Category Category = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllCategoryByID);
			preparedStatement.setInt(1, id);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				Category = new Category();
                                Category.setCategory_id(Integer.parseInt(results.getString("category_id")));
			        Category.setCategory_name(results.getString("category_name"));   
				Category.setCategory_type(Integer.parseInt(results.getString("category_type")));    
				 
				 
				
				
				
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
		return Category;
	}
             
             public static void main(String[] args) throws Exception {
        CategoryDAO dao = new CategoryDAO();
                 System.out.println(dao.findCategoryByID(5).getCategory_name());
                 
              
    }
}
