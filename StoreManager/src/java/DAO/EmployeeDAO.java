/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBContext;
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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notur
 */
public class EmployeeDAO {
     private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet results = null;
	

	 
	
	
	public boolean addEmployee(Employee employee) throws Exception {
		boolean check = false;
		 
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.RegisterEmployee);

		
	
			preparedStatement.setString(1, employee.getEmail());
			preparedStatement.setString(2, employee.getUsername());
			preparedStatement.setString(3, employee.getPassword());
			preparedStatement.setInt(4,employee.getStore_id());
                        preparedStatement.setString(5, employee.getEmployee_name());
			//preparedStatement.setString(6, employee.getStarted_date());
			preparedStatement.setInt(6, employee.getRole());
			preparedStatement.setInt(7,employee.status);
		
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
	
        
        public boolean updateEmployee(Employee employee, int EmployeeId) throws Exception {
		boolean check = false;
		
	try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.UpdateEmployee);
                        preparedStatement.setString(1, employee.getEmail());
			preparedStatement.setString(2, employee.getUsername());
			preparedStatement.setString(3, employee.getPassword());
			preparedStatement.setInt(4,employee.getStore_id());
                        preparedStatement.setString(5, employee.getEmployee_name());
			preparedStatement.setString(6, employee.getPhone());
			preparedStatement.setString(7,employee.getPersonal_id());
                        preparedStatement.setString(8,employee.getDob());
                        preparedStatement.setString(9,employee.getStarted_date());
                        preparedStatement.setInt(10,employee.getRole());
                        preparedStatement.setInt(11,employee.getStatus());
                        preparedStatement.setInt(12,EmployeeId);
		
                        if (preparedStatement.execute()==true) {
                check=true;
            }else{
                            check=false;
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
	
	public boolean checkAccountExist(String Email) throws Exception {
		boolean check = false;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.checkAccountEmployee);

			preparedStatement.setString(1, Email);
			
			

			results= preparedStatement.executeQuery();

			while(results.next()){
                check= true;
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
	
	
	
	
//	public boolean updateAccount(Customer customer,String getDate) throws Exception {
//		boolean check = false;
//		 
//		
//	try {
//			connection = new DBContext().getConnection();
//			preparedStatement = connection.prepareCall(SQLCommand.updateInformationMember);
//
//		
//	
//			preparedStatement.setString(1, Member.getFirst_Name());
//			preparedStatement.setString(2, Member.getLast_Name());
//			preparedStatement.setString(3, Member.getPhone());
//			preparedStatement.setString(4, Member.getDes_Cription());
//			preparedStatement.setString(5,getDate);
//			preparedStatement.setString(6, Member.getEmail());
//			
//	 
//		
//			preparedStatement.execute();
//			
//		check=true;
//
//				
//
//		} finally {
//			try {
//				if (connection != null) {
//					connection.close();
//				}
//				if (preparedStatement != null) {
//					preparedStatement.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return false;
//	
//	}
	
	
	
        //For Employee
	public boolean checkEmployeeIfExist(String email,String username) throws Exception {
		boolean check = false;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.getEmployeeByUsername);

			preparedStatement.setString(1, username);
                        preparedStatement.setString(2, email);
			
			

			results= preparedStatement.executeQuery();

			while(results.next()){
                check= true;
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
        
        
        
	
	
	//For Employee
	public boolean checkEmployee(String username,String pass_word) throws Exception {
		boolean check = false;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareCall(SQLCommand.checkEmployee);

			preparedStatement.setString(1, username);
                        preparedStatement.setString(2, username);
			preparedStatement.setString(3, pass_word);
			

			results= preparedStatement.executeQuery();

			while(results.next()){
                check= true;
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
	
	
	
	
	
	public List<Employee> selectEmployee(String username) throws Exception {
		List<Employee> listEmployee = new ArrayList<>();
		Employee employee = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getEmployeeByUsername);
			preparedStatement.setString(1, username);
                        preparedStatement.setString(2, username);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				employee = new Employee();
 
			 
				employee.setEmployee_id(Integer.parseInt(results.getString("employee_id")));    
				employee.setEmail(results.getString("email"));   
				employee.setStore_id(results.getInt("store_id"));    
				employee.setEmployee_name(results.getString("employee_name")); 
				employee.setUsername(results.getString("username")); 
				employee.setPassword(results.getString("password"));
				employee.setPhone(results.getString("phone"));  
				employee.setPersonal_id(results.getString("personal_id"));
                                employee.setDob(results.getString("dob")); 
				employee.setStarted_date(results.getString("started_date"));
				employee.setRole(results.getInt("role"));  
				employee.setStatus(results.getInt("status"));
				
				listEmployee.add(employee);
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
		return listEmployee;
	}
        
        
        
        public List<Employee> getAllEmployee(int role) throws Exception {
		List<Employee> listEmployee = new ArrayList<>();
		Employee employee = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.getAllEmployee);
			preparedStatement.setInt(1, role);

			results = preparedStatement.executeQuery();
			while (results.next()) {
				employee = new Employee();
 
			 
				employee.setEmployee_id(Integer.parseInt(results.getString("employee_id")));    
				employee.setEmail(results.getString("email"));   
				employee.setStore_id(results.getInt("store_id"));    
				employee.setEmployee_name(results.getString("employee_name")); 
				employee.setUsername(results.getString("username")); 
				employee.setPassword(results.getString("password"));
				employee.setPhone(results.getString("phone"));  
				employee.setPersonal_id(results.getString("personal_id"));
                                employee.setDob(results.getString("dob")); 
				employee.setStarted_date(results.getString("started_date"));
				employee.setRole(results.getInt("role"));  
				employee.setStatus(results.getInt("status"));
				
				listEmployee.add(employee);
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
		return listEmployee;
	}

        
        public List<Employee> findEmployee(String name) throws Exception {
		List<Employee> listEmployee = new ArrayList<>();
		Employee employee = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement("select * from Employees where (employee_name  like '%"+name+"%' or email like '%"+name+"%') and role='0'");
			

			results = preparedStatement.executeQuery();
			while (results.next()) {
				employee = new Employee();
 
			 
				employee.setEmployee_id(Integer.parseInt(results.getString("employee_id")));    
				employee.setEmail(results.getString("email"));   
				employee.setStore_id(results.getInt("store_id"));    
				employee.setEmployee_name(results.getString("employee_name")); 
				employee.setUsername(results.getString("username")); 
				employee.setPassword(results.getString("password"));
				employee.setPhone(results.getString("phone"));  
				employee.setPersonal_id(results.getString("personal_id"));
                                employee.setDob(results.getString("dob")); 
				employee.setStarted_date(results.getString("started_date"));
				employee.setRole(results.getInt("role"));  
				employee.setStatus(results.getInt("status"));
				
				listEmployee.add(employee);
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
		return listEmployee;
	}
        
        
         public Employee findEmployeeById(int Id) throws Exception {
		
		Employee employee = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement("select * from Employees where employee_id= ?");
			preparedStatement.setInt(1, Id);

			results = preparedStatement.executeQuery();
			while (results.next()) {
				employee = new Employee();
 
			 
				employee.setEmployee_id(Integer.parseInt(results.getString("employee_id")));    
				employee.setEmail(results.getString("email"));   
				employee.setStore_id(results.getInt("store_id"));    
				employee.setEmployee_name(results.getString("employee_name")); 
				employee.setUsername(results.getString("username")); 
				employee.setPassword(results.getString("password"));
				employee.setPhone(results.getString("phone"));  
				employee.setPersonal_id(results.getString("personal_id"));
                                employee.setDob(results.getString("dob")); 
				employee.setStarted_date(results.getString("started_date"));
				employee.setRole(results.getInt("role"));  
				employee.setStatus(results.getInt("status"));
				
				
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
		return employee;
	}
         public Employee findEmployeeByName(String username) throws Exception {
		
		Employee employee = null;
		try {
			connection = new DBContext().getConnection();
			preparedStatement = connection.prepareStatement("select * from Employees where username= ?");
			preparedStatement.setString(1, username);

			results = preparedStatement.executeQuery();
			while (results.next()) {
				employee = new Employee();
 
			 
				employee.setEmployee_id(Integer.parseInt(results.getString("employee_id")));    
				employee.setEmail(results.getString("email"));   
				employee.setStore_id(results.getInt("store_id"));    
				employee.setEmployee_name(results.getString("employee_name")); 
				employee.setUsername(results.getString("username")); 
				employee.setPassword(results.getString("password"));
				employee.setPhone(results.getString("phone"));  
				employee.setPersonal_id(results.getString("personal_id"));
                                employee.setDob(results.getString("dob")); 
				employee.setStarted_date(results.getString("started_date"));
				employee.setRole(results.getInt("role"));  
				employee.setStatus(results.getInt("status"));
				
				
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
		return employee;
	}
    public static void main(String[] args)  {
       EmployeeDAO d= new EmployeeDAO();
       Employee employee= new Employee("longmail@gmail.com", 1, "bao long", "longNB2K1", "123", "123456", "12312", "11-12-2001", "11-12-2001", 0, 1);
      
         try {
             System.out.println(d.findEmployee("em"));
         } catch (Exception ex) {
             Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
       
       
      
      
    }
}
