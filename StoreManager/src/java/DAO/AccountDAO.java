/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
import Model.Customer;
import Model.Employee;
import SQLCommand.SQLCommand;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author notur
 */
public class AccountDAO {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet results = null;

    
    
     public boolean updateCustomerPassword(int cusId, String pass) throws Exception {
        boolean check = false;

        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareCall(SQLCommand.updateCustomerPassword);

            preparedStatement.setString(1, pass);
            preparedStatement.setInt(2, cusId);
       

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
    
    
    
    public boolean addMember(Customer customer) throws Exception {
        boolean check = false;

        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareCall(SQLCommand.RegisterCustomer);

            preparedStatement.setString(1, customer.getUsername());
            preparedStatement.setString(2, customer.getPassword());
            preparedStatement.setString(3, customer.getEmail());
            preparedStatement.setInt(4, 1);

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

    public boolean checkAccountExistWhenForgot(String Email, String username) throws Exception {
        boolean check = false;
        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareCall(SQLCommand.checkAccountExistWhenForgot);

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, Email);

            results = preparedStatement.executeQuery();

            while (results.next()) {
                check = true;
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
        return check;

    }
    
    
    
    public boolean checkAccountExist(String Email, String username) throws Exception {
        boolean check = false;
        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareCall(SQLCommand.checkAccountExist);

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, Email);

            results = preparedStatement.executeQuery();

            while (results.next()) {
                check = true;
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
        return check;

    }

    public boolean updateCustomer(Customer customer, int id) throws Exception {
        boolean check = false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Create a java.util.Date object
        java.util.Date utilDate = sdf.parse(customer.getDob());

        // Convert java.util.Date to java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareCall(SQLCommand.updateCustomer);

            preparedStatement.setString(1, customer.getCustomer_name());
            preparedStatement.setString(2, customer.getUsername());
            preparedStatement.setString(3, customer.getPassword());
            preparedStatement.setString(4, customer.getEmail());
            preparedStatement.setString(5, customer.getPhone());
            preparedStatement.setDate(6, sqlDate);
            preparedStatement.setInt(7, customer.getStatus());
            preparedStatement.setInt(8, id);

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

    //For Customer
    public boolean checkMember(String username, String pass_word) throws Exception {
        boolean check = false;
        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareCall(SQLCommand.checkAccount);

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, pass_word);

            results = preparedStatement.executeQuery();

            while (results.next()) {
                check = true;
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
        return check;

    }

    public List<Customer> selectCustomer(String username) throws Exception {
        List<Customer> listCustomer = new ArrayList<>();
        Customer customer = null;
        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareStatement(SQLCommand.getAccountByUsername);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, username);
            results = preparedStatement.executeQuery();
            while (results.next()) {
                customer = new Customer();

                customer.setCustomer_id(Integer.parseInt(results.getString("customer_id")));
                customer.setCustomer_name(results.getString("customer_name"));
                customer.setUsername(results.getString("username"));
                customer.setPassword(results.getString("password"));
                customer.setEmail(results.getString("email"));
                customer.setPhone(results.getString("phone"));
                customer.setDob(results.getString("dob"));
                customer.setStatus(results.getInt("status"));

                listCustomer.add(customer);
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
        return listCustomer;
    }

    public List<Customer> getAllCustomer() throws Exception {
        List<Customer> listCustomer = new ArrayList<>();
        Customer customer = null;
        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareStatement(SQLCommand.getAllCustomer);
            

            results = preparedStatement.executeQuery();
            while (results.next()) {
                customer = new Customer();

                customer.setCustomer_id(Integer.parseInt(results.getString("customer_id")));
                customer.setCustomer_name(results.getString("customer_name"));
                customer.setUsername(results.getString("username"));
                customer.setPassword(results.getString("password"));
                customer.setEmail(results.getString("email"));
                customer.setPhone(results.getString("phone"));
                customer.setDob(results.getString("dob"));
                customer.setStatus(results.getInt("status"));

                listCustomer.add(customer);
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
        return listCustomer;
    }

    public Customer getCustomerByID(int id) throws Exception {

        Customer customer = null;
        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareStatement(SQLCommand.getCustomerByID);
            preparedStatement.setInt(1, id);

            results = preparedStatement.executeQuery();
            while (results.next()) {
                customer = new Customer();

                customer.setCustomer_id(Integer.parseInt(results.getString("customer_id")));
                customer.setCustomer_name(results.getString("customer_name"));
                customer.setUsername(results.getString("username"));
                customer.setPassword(results.getString("password"));
                customer.setEmail(results.getString("email"));
                customer.setPhone(results.getString("phone"));
                customer.setDob(results.getString("dob"));
                customer.setStatus(results.getInt("status"));

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
        return customer;
    }
 public Customer getCustomerByUsername( String username) throws Exception {

        Customer customer = null;
        try {
            connection = new DBContext().getConnection();
            preparedStatement = connection.prepareStatement("select *from customers where username=?");
            preparedStatement.setString(1, username);

            results = preparedStatement.executeQuery();
            while (results.next()) {
                customer = new Customer();

                customer.setCustomer_id(Integer.parseInt(results.getString("customer_id")));
                customer.setCustomer_name(results.getString("customer_name"));
                customer.setUsername(results.getString("username"));
                customer.setPassword(results.getString("password"));
                customer.setEmail(results.getString("email"));
                customer.setPhone(results.getString("phone"));
                customer.setDob(results.getString("dob"));
                customer.setStatus(results.getInt("status"));
                customer.setAddress(results.getString("address"));

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
        return customer;
    }
 
  public List<Customer> findCustomer(String name) throws Exception {
		List<Customer> listCustomer = new ArrayList<>();
		Customer customer = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement("select * from Customers where (username  like '%"+name+"%' or email like '%"+name+"%') ");
			

			results = preparedStatement.executeQuery();
			while (results.next()) {
				customer = new Customer();
 
			 
				customer.setCustomer_id(Integer.parseInt(results.getString("customer_id")));    
				customer.setEmail(results.getString("email"));   
				customer.setDob(results.getString("dob"));    
				customer.setCustomer_name(results.getString("customer_name")); 
				customer.setUsername(results.getString("username")); 
				customer.setPassword(results.getString("password"));
				customer.setPhone(results.getString("phone"));  
				customer.setStatus(results.getInt("status"));
                                
				
				listCustomer.add(customer);
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
		return listCustomer;
	}
 
    public static void main(String[] args) throws Exception {
     
      AccountDAO dao = new AccountDAO();
        System.out.println(dao.updateCustomerPassword(1, "nenene"));

         
    }
}
