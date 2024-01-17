/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.AccountDAO;
import DAO.EmployeeDAO;
import DAO.ProductDAO;
import Model.Customer;
import Model.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author notur
 */
public class LoginServlet extends HttpServlet {
static int loginStatus=0;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
           HttpSession session = request.getSession();
           session.invalidate();
         
           
        response.sendRedirect(request.getContextPath() + "/Views/HomeIndex/HomePage.jsp");
      
          
     
    }

    /**  request.getRequestDispatcher("Views/Account/Login.jsp").forward(request, response);
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String customerLogin = request.getParameter("CustomerLogin");
        String employeeLogin = request.getParameter("EmployeeLogin");
        
		String username = request.getParameter("username");
		String password = request.getParameter("password");
                String name = null;
	        int status=0;
                int role=2;
		if (customerLogin != null) {
			AccountDAO dao = new AccountDAO();

			Customer customer = new Customer(username, password);

			try {
				if (dao.checkMember(username, password) == true) {
					
					List<Customer> list = new ArrayList<>();
					list = dao.selectCustomer(username);
					for (Customer c : list) {
						name = c.getUsername();
 
                                                status=c.getStatus();
					}
					HttpSession session = request.getSession();

					
 
					session.setAttribute("username", name);
                                        session.setAttribute("status", status);
				

				 response.sendRedirect("ProductPageController");
				} else {
					request.setAttribute("error_message", "username or password is not correct !");
					request.getRequestDispatcher("Views/Account/Login.jsp").forward(request, response);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (employeeLogin != null) {
			EmployeeDAO empDao = new EmployeeDAO();
                        AccountDAO cusDao = new AccountDAO();
			Employee employee = new Employee(username, password);

			try {
				if (empDao.checkEmployee(username, password) == true) {
					
					List<Employee> list = new ArrayList<>();
					list = empDao.selectEmployee(username);
					for (Employee c : list) {
						name = c.getUsername();
 
                                                role=c.getRole();
					}
					HttpSession session = request.getSession();

					

					session.setAttribute("username", name);
                                        session.setAttribute("role", role);
				

                                        if (role==0) {
                                            ProductDAO proDao= new ProductDAO();
                                            
                                              response.sendRedirect("EmployeeController");
                                       // request.getRequestDispatcher("Views/Account/EmployeeManager.jsp").forward(request, response);
				
                                    }else if (role==1) {
                                        
                                         
                                          
                                        response.sendRedirect("AdminController");
                                       // request.getRequestDispatcher("Views/Account/Admin.jsp").forward(request, response);
				
                                    }
{
                                            
                                        }
				 } else {
					request.setAttribute("error_message", "username or password is not correct !");
					request.getRequestDispatcher("Views/Account/LoginEmployee.jsp").forward(request, response);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

        
        
        
        

    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
