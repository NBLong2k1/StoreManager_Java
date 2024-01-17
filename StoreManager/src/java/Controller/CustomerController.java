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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notur
 */
public class CustomerController extends HttpServlet {

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
            out.println("<title>Servlet CustomerController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CustomerController at " + request.getContextPath() + "</h1>");
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
        String CusId = request.getParameter("CusId");
        if (CusId != null) {
            try {
                int id = Integer.parseInt(CusId);
                AccountDAO cusDAO = new AccountDAO();
                Customer cus = cusDAO.getCustomerByID(id);
                
                request.setAttribute("cus", cus);
                request.getRequestDispatcher("/Views/Account/EditCustomer.jsp").forward(request, response);
            } catch (Exception e) {
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
        String submitEditCustomer = request.getParameter("submitEditCustomer");

        if (submitEditCustomer != null) {
          

            String customerEmail = request.getParameter("customerEmail");
            String customerID= request.getParameter("customerID");
            String customerName= request.getParameter("customerName");
            String customerUsrname= request.getParameter("customerUsrname");
            String customerPassword= request.getParameter("customerPassword");
            String customerPhone= request.getParameter("customerPhone");
            String customerDob= request.getParameter("customerDob");
            String customerStatus= request.getParameter("customerStatus");
            String customerAddress= request.getParameter("customerStatus");
              int status =0;
            if (customerStatus!=null) {
                status=1;
            }

           
            
            AccountDAO customerDao= new AccountDAO();
            Customer customer = new Customer(Integer.parseInt(customerID),customerName, customerUsrname, customerPassword, customerEmail, customerPhone, customerDob, status,customerAddress);
           
            try {
                if (customerDao.checkAccountExist("", customerUsrname)==true && !customerDao.getCustomerByID(Integer.parseInt(customerID)).getUsername().equals(customerUsrname)) {
                   
                    request.setAttribute("error_message", "Username is already exist !");
                    request.setAttribute("cus", customer);
                    request.getRequestDispatcher("Views/Account/EditCustomer.jsp").forward(request, response);
                    
                     
                }
                else {
 HttpSession sessionList = request.getSession();
                    customerDao.updateCustomer(customer, Integer.parseInt(customerID));
                   sessionList.setAttribute("flagAddCustomer", null);
                    response.sendRedirect("ListCustomer");

                   
                }
            } catch (Exception ex) {
                Logger.getLogger(ProfileController.class.getName()).log(Level.SEVERE, null, ex);
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
