/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.AccountDAO;
import DAO.CustomerCartDAO;
import DAO.ProductDAO;
import Model.Product;
import Model.customerCart;
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
import javafx.util.Pair;

/**
 *
 * @author notur
 */
public class ShowCustomerCart extends HttpServlet {

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
            out.println("<title>Servlet ShowCustomerCart</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowCustomerCart at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession();
        String customerUser = request.getParameter("customerUser");
        AccountDAO cusDao = new AccountDAO();
        CustomerCartDAO cartDao = new CustomerCartDAO();
        ProductDAO dao = new ProductDAO();

        List<customerCart> listCustomerCart = new ArrayList<>();
        List<Pair<Product, Integer>> productList = new ArrayList<Pair<Product, Integer>>();
        int cusId = 0;

        try {
            cusId = cusDao.getCustomerByUsername(customerUser).getCustomer_id();
            listCustomerCart = cartDao.findCartByCusID(cusId);
            for (customerCart x : listCustomerCart) {
              
                productList.add(new Pair<>(dao.getProductByID(x.getProductId()), x.getQuantity()));
            }

        } catch (Exception ex) {
            Logger.getLogger(ShowCustomerCart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        session.setAttribute("productListCart", productList);
        response.sendRedirect("Views/HomeIndex/ShoppingCart.jsp");
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
        processRequest(request, response);
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
