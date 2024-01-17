/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.AccountDAO;
import Model.Customer;
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
public class ListCustomer extends HttpServlet {
 static int page = 0;
 static int number = 0;
    List<Customer> cusList = new ArrayList<>();

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
            out.println("<title>Servlet ListCustomer</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListCustomer at " + request.getContextPath() + "</h1>");
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

      
           AccountDAO empDao = new AccountDAO();
      
        HttpSession sessionList = request.getSession();
        String pageNumber =request.getParameter("myBTN");
        if (pageNumber==null) {
				pageNumber="1";
			}

        try {
            if (sessionList.getAttribute("flagAddCustomer")==null) {
                  cusList = empDao.getAllCustomer();
                  
            }
         
            //get all employee (not admin)
             if (cusList.size() % 5 == 0) {
					page = cusList.size() / 5;

				} else {
					page = cusList.size() / 5 + 1;

				}

            ArrayList<Customer> get5Record = new ArrayList<>();
            
            if (pageNumber!=null) {
                if (Integer.parseInt(pageNumber) >= 1 && Integer.parseInt(pageNumber) <= page) {

						number = Integer.parseInt(pageNumber);
		}

            }
            int totalCustomer = cusList.size();
            
            if (!cusList.isEmpty()) {
					
				 
				for (int j = number * 5 - 5; j < number * 5; j++) {

					if (j < totalCustomer) {

						get5Record.add(cusList.get(j));

					}
				 
				}
				sessionList.setAttribute("pageNumberCustomer", page);
				sessionList.setAttribute("currentPageCustomer", number);
                                sessionList.setAttribute("cusList", get5Record);
				sessionList.setAttribute("setStatus", 0);
				
				
				 request.getRequestDispatcher("Views/Account/CustomerList.jsp").forward(request, response);
				}
            else {
					page=0;
					number=0;
					get5Record.clear();
					sessionList.setAttribute("pageNumberCustomer", page);
					sessionList.setAttribute("currentPageCustomer", number);
					sessionList.setAttribute("cusList", get5Record);
					request.getRequestDispatcher("Views/Account/CustomerList.jsp").forward(request, response);
				}


            
            
            
            
            
            

        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
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
       String submitSearch = request.getParameter("submitSearch");
      HttpSession sessionList = request.getSession();
      
        if (submitSearch != null) {

            String customerName = request.getParameter("searchCustomer");
       
           AccountDAO cusDao = new AccountDAO();
            try {
                  cusList = cusDao.findCustomer(customerName);
                  sessionList.setAttribute("flagAddCustomer", 0);
                  doGet(request, response);
            } catch (Exception e) {
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
