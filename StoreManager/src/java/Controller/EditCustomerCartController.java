/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.AccountDAO;
import DAO.CustomerCartDAO;
import DAO.ProductDAO;
import Model.customerCart;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notur
 */
public class EditCustomerCartController extends HttpServlet {

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
            out.println("<title>Servlet EditCustomerCartController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditCustomerCartController at " + request.getContextPath() + "</h1>");
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
        String deleteID = request.getParameter("deleteID");
        String getCustomerUsername = request.getParameter("getCustomerUsername");
        AccountDAO cusDao = new AccountDAO();
        CustomerCartDAO CustomerCartDAO = new CustomerCartDAO();
        
        int productId = 0;
        int cusID = 0;

        try {
            cusID = cusDao.getCustomerByUsername(getCustomerUsername).getCustomer_id();
            productId = Integer.parseInt(deleteID);
              if (CustomerCartDAO.DeleteCustomerCart(cusID,productId) == true) {
                response.sendRedirect("ShowCustomerCart?customerUser=" + getCustomerUsername + "");
            }
        } catch (Exception ex) {
            Logger.getLogger(EditCustomerCartController.class.getName()).log(Level.SEVERE, null, ex);
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
        String proId = request.getParameter("proid");
        String proQuantity = request.getParameter("proQuantity");
        String getCustomerUsername = request.getParameter("getCustomerUsername");
        AccountDAO cusDao = new AccountDAO();
        ProductDAO proDao= new ProductDAO();
        CustomerCartDAO CustomerCartDAO = new CustomerCartDAO();
        customerCart customerCart;
        int cusID = 0;
        int productId = 0;
        int productQuantity = 0;
         double Price=0;
        try {

            cusID = cusDao.getCustomerByUsername(getCustomerUsername).getCustomer_id();
            productId = Integer.parseInt(proId);
            productQuantity = Integer.parseInt(proQuantity);
              Price=proDao.getProductByID(productId).getPrice();
            customerCart = new customerCart(cusID, productId, productQuantity,Price);
            if (CustomerCartDAO.UpdateCustomerCart(customerCart) == true) {
                response.sendRedirect("ShowCustomerCart?customerUser=" + getCustomerUsername + "");
            }

        } catch (Exception ex) {
            Logger.getLogger(cartForCustomer.class.getName()).log(Level.SEVERE, null, ex);
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
