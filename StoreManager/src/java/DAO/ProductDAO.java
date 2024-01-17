/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.Category;
import Model.Employee;
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
public class ProductDAO {
       private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet results = null;
        
        
        public List<Product> getAllProductWorking() throws Exception {
		List<Product> listProduct = new ArrayList<>();
		Product product = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllProductWorking);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				product = new Product();
 
			 
				product.setProduct_id(Integer.parseInt(results.getString("product_id")));    
				product.setProduct_name(results.getString("product_name"));   
				product.setProduct_type(Integer.parseInt(results.getString("product_type")));    
				product.setDescription(results.getString("description")); 
				product.setProduct_img(results.getString("img")); 
				product.setPrice( Double.parseDouble(results.getString("price")));
                                product.setStatus(results.getInt("status"));
				
				listProduct.add(product);
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
		return listProduct;
	}
        
        
        
        public List<Product> getAllProduct() throws Exception {
		List<Product> listProduct = new ArrayList<>();
		Product product = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllProduct);
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				product = new Product();
 
			 
				product.setProduct_id(Integer.parseInt(results.getString("product_id")));    
				product.setProduct_name(results.getString("product_name"));   
				product.setProduct_type(Integer.parseInt(results.getString("product_type")));    
				product.setDescription(results.getString("description")); 
				product.setProduct_img(results.getString("img")); 
				product.setPrice( Double.parseDouble(results.getString("price")));
                                product.setStatus(results.getInt("status"));
				
				listProduct.add(product);
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
		return listProduct;
	}
        
        
        
         public List<Product> getProductByType(int i) throws Exception {
		List<Product> listProduct = new ArrayList<>();
		Product product = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getProductByType);
			preparedStatement.setInt(1,i);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				product = new Product();
 
			 
				product.setProduct_id(Integer.parseInt(results.getString("product_id")));    
				product.setProduct_name(results.getString("product_name"));   
				product.setProduct_type(Integer.parseInt(results.getString("product_type")));    
				product.setDescription(results.getString("description")); 
				product.setProduct_img(results.getString("img")); 
				product.setPrice( Double.parseDouble(results.getString("price")));
				
				listProduct.add(product);
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
		return listProduct;
	}
         
         
         public boolean addProduct(Product Product) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.addProduct);

			preparedStatement.setString(1, Product.getProduct_name());
			preparedStatement.setInt(2, Product.getProduct_type());
			preparedStatement.setString(3, Product.getDescription());
			preparedStatement.setString(4,Product.getProduct_img());
                        preparedStatement.setDouble(5, Product.getPrice());
			
		
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
         
         
         public Product getProductByID(int id) throws Exception {
		
		Product product = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getProductByID);
			preparedStatement.setInt(1,id);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				product = new Product();
 
			 
				product.setProduct_id(Integer.parseInt(results.getString("product_id")));    
				product.setProduct_name(results.getString("product_name"));   
				product.setProduct_type(Integer.parseInt(results.getString("product_type")));    
				product.setDescription(results.getString("description")); 
				product.setProduct_img(results.getString("img")); 
				product.setPrice( Double.parseDouble(results.getString("price")));
                                product.setStatus(results.getInt("status"));
				
				
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
		return product;
	}
         
         	public boolean updateProduct(Product Product, int id) throws Exception {
		boolean check = false;
		 
		
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.updateProduct);

		
	
			preparedStatement.setString(1, Product.getProduct_name());
			preparedStatement.setInt(2, Product.getProduct_type());
			preparedStatement.setString(3, Product.getDescription());
			preparedStatement.setString(4, Product.getProduct_img());
			preparedStatement.setDouble(5,Product.getPrice());
                        preparedStatement.setInt(6,Product.getStatus());
			preparedStatement.setInt(7, id);
			
	 
		
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
         
         
          public List<Product> findProductByType(int type) throws Exception {
		List<Product> listProduct = new ArrayList<>();
		Product product = null;
		try { 
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement("select c.product_id,c.product_name,c.product_type,c.description,c.img,c.price,c.status\n" +
"                       from Products c join Categories b on c.product_type=b.category_type\n" +
"                       where  b.category_type= '"+type+"'");
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				product = new Product();
 
			 
				product.setProduct_id(Integer.parseInt(results.getString("product_id")));    
				product.setProduct_name(results.getString("product_name"));   
				product.setProduct_type(Integer.parseInt(results.getString("product_type")));    
				product.setDescription(results.getString("description")); 
				product.setProduct_img(results.getString("img")); 
				product.setPrice( Double.parseDouble(results.getString("price")));
				
				listProduct.add(product);
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
		return listProduct;
	}
                
                public List<Product> findProductByNameOrType(String name) throws Exception {
		List<Product> listProduct = new ArrayList<>();
		Product product = null;
		try { 
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement("select c.product_id,c.product_name,c.product_type,c.description,c.img,c.price,c.status\n" +
"                       from Products c join Categories b on c.product_type=b.category_type\n" +
"                       where b.category_name like '%"+name+"%' or c.product_name like '%"+name+"%'");
			
			results = preparedStatement.executeQuery();
			while (results.next()) {
				product = new Product();
 
			 
				product.setProduct_id(Integer.parseInt(results.getString("product_id")));    
				product.setProduct_name(results.getString("product_name"));   
				product.setProduct_type(Integer.parseInt(results.getString("product_type")));    
				product.setDescription(results.getString("description")); 
				product.setProduct_img(results.getString("img")); 
				product.setPrice( Double.parseDouble(results.getString("price")));
				
				listProduct.add(product);
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
		return listProduct;
	}
       
                
                
                
                
             
                
                 public boolean deleteProduct(int id) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.deleteProduct);

			
			preparedStatement.setInt(1,id );
			
			
		
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
       ProductDAO d = new ProductDAO();
            System.out.println(d.getProductByID(2));
    }
}
