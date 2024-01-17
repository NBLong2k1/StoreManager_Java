/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.AccountDAO;
import DAO.OrderGuestDAO;
import DAO.OrdersDAO;
import DAO.ProductDAO;
import DAO.processOrderDAO;
import Model.Customer;
import Model.Product;
import Model.processOrder;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notur
 */
public class EmployeeController extends HttpServlet {
 static int page = 0;
    static int number = 0;
     List<processOrder> listprocessOrder = new ArrayList<>();
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
        
        HttpSession sessionList = request.getSession();
        processOrderDAO processDao= new processOrderDAO();
        
        Double earningDailyCustomer=0.0;
        Double earningGuestDaily=0.0;
        Double SumearningDaily=0.0;
        
        OrdersDAO orDao = new OrdersDAO();
        OrderGuestDAO orGuestDao = new OrderGuestDAO();
        
     try {
         earningDailyCustomer=orDao.getTotalDaily();
         earningGuestDaily=orGuestDao.getTotalDaily();
         SumearningDaily=earningDailyCustomer+earningGuestDaily;
     } catch (Exception ex) {
         Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, ex);
     }
                  
        
        
            String username=request.getParameter("username");
            if (username!=null) {
            sessionList.setAttribute("username", username);
        }
            String pageNumber =request.getParameter("myBTN");
             if (pageNumber==null) {
				pageNumber="1";
			}
             
             if (sessionList.getAttribute("flagAdd")==null) {
             try {
                 listprocessOrder = processDao.getAllprocessOrder();
                 //get all employee (not admin)
             if (listprocessOrder.size() % 5 == 0) {
					page = listprocessOrder.size() / 5;

				} else {
					page = listprocessOrder.size() / 5 + 1;

				}
             
              ArrayList<processOrder> get5Record = new ArrayList<>();
                 
                if (pageNumber!=null) {
                if (Integer.parseInt(pageNumber) >= 1 && Integer.parseInt(pageNumber) <= page) {

						number = Integer.parseInt(pageNumber);
		}

            }
            int totalEmployee = listprocessOrder.size();
            if (!listprocessOrder.isEmpty()) {
					
				 
				for (int j = number * 5 - 5; j < number * 5; j++) {

					if (j < totalEmployee) {

						get5Record.add(listprocessOrder.get(j));

					}
				 
				}
                             
     
        
                                
                                sessionList.setAttribute("earningDailyCustomer", earningDailyCustomer);
                                sessionList.setAttribute("earningGuestDaily", earningGuestDaily);
                                sessionList.setAttribute("SumearningDaily", SumearningDaily);
                                
				sessionList.setAttribute("pageNumber", page);
				sessionList.setAttribute("currentPage", number);
                                sessionList.setAttribute("listprocessOrder", get5Record);
				sessionList.setAttribute("setStatus", 0);
				
				
				 request.getRequestDispatcher("Views/Account/EmployeeManager.jsp").forward(request, response);
	           }
             else {
					page=0;
					number=0;
					get5Record.clear();
                                         sessionList.setAttribute("earningDailyCustomer", earningDailyCustomer);
                                sessionList.setAttribute("earningGuestDaily", earningGuestDaily);
                                sessionList.setAttribute("SumearningDaily", SumearningDaily);
                                        
					sessionList.setAttribute("pageNumber", page);
					sessionList.setAttribute("currentPage", number);
					sessionList.setAttribute("listprocessOrder", get5Record);
					request.getRequestDispatcher("Views/Account/EmployeeManager.jsp").forward(request, response);
				}
            
            
                 
             } catch (Exception ex) {
                 Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, ex);
             }
                  
            }
             
      		
     
    }

    /**
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
     
        String submitAddProduct =request.getParameter("submitAddProduct");
        if (submitAddProduct!=null) {
        String productName =request.getParameter("productName");
        String productDescription =request.getParameter("productDescription");
        String productPrice =request.getParameter("productPrice");
        String productImage =request.getParameter("productImage");
        String productType =request.getParameter("productType");
        
         
        
            try {
                
                
                ProductDAO proDao= new ProductDAO();
        Product product= new Product(productName, Integer.parseInt(productType), productDescription, productImage, Double.parseDouble(productPrice));
        
                if (proDao.addProduct(product)) {
                    
                    
                
                    request.getRequestDispatcher("/Views/Account/EmployeeManager.jsp").forward(request, response);
                }
                 
                
                
            } catch (Exception ex) {
                Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, ex);
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
