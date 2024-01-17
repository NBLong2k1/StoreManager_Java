/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.CustomerManage;

import DAO.AccountDAO;
import DAO.CustomerCartDAO;
import DAO.OrdersDAO;
import Model.Customer;
import Model.Orders;
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

/**
 *
 * @author notur
 */
public class CustomerManager extends HttpServlet {

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
            out.println("<title>Servlet CustomerManager</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CustomerManager at " + request.getContextPath() + "</h1>");
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
        String orderStatus=request.getParameter("orderStatus");
        CustomerCartDAO cartDao=new CustomerCartDAO();
        AccountDAO cusDao = new AccountDAO();
        OrdersDAO orderDao= new OrdersDAO();
        List<customerCart> listCart=new ArrayList<>();
         List<Orders> listOrders=new ArrayList<>();
        
        String cusUsername =request.getParameter("cusUsername");
        System.out.println("username is "+cusUsername);
        Customer customer = new Customer();
        if (orderStatus!=null) {
              try {
            
            customer=cusDao.getCustomerByUsername(cusUsername);
                  System.out.println(customer);
                  if (Integer.parseInt(orderStatus)==0) {
                       listOrders=orderDao.getAllStatusOrder(0,customer.getCustomer_id());
                  }else{
                       listOrders=orderDao.getAllStatusOrder(2,customer.getCustomer_id());
                  }
           
           
                  System.out.println(listOrders);
        } catch (Exception ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        session.setAttribute("listOrderss", listOrders);
       
        response.sendRedirect("Views/Account/checkCustomerOrderListProcess.jsp");
        
        }
        else{
              try {
            
            customer=cusDao.getCustomerByUsername(cusUsername);
           listCart=cartDao.findCartByCusIDWithProductName(customer.getCustomer_id());
           listOrders=orderDao.getAllStatusOrder(2,customer.getCustomer_id());
        } catch (Exception ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        session.setAttribute("listOrders", listOrders);
        session.setAttribute("listCart", listCart);
   
        response.sendRedirect("Views/Account/CustomerManager.jsp");
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
