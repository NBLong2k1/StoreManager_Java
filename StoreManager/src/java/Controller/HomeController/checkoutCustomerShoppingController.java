/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.HomeController;

import Controller.ShowCustomerCart;
import DAO.AccountDAO;
import DAO.CustomerCartDAO;
import DAO.Order_details_DAO;
import DAO.OrdersDAO;
import DAO.ProductDAO;
import Model.Order_details;
import Model.Orders;
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
public class checkoutCustomerShoppingController extends HttpServlet {

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
            out.println("<title>Servlet checkoutCustomerShoppingController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet checkoutCustomerShoppingController at " + request.getContextPath() + "</h1>");
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
      String getCustomerUsername=request.getParameter("getCustomerUsername");
      String totalPrice= request.getParameter("totalPrice");
      AccountDAO cusDao = new AccountDAO();
        CustomerCartDAO cartDao = new CustomerCartDAO();
        ProductDAO dao = new ProductDAO();
        OrdersDAO orderDao = new OrdersDAO();
        Order_details_DAO OrderDetailsDao= new Order_details_DAO();
        List<customerCart> listCustomerCart = new ArrayList<>();

        int cusId = 0;
        double price=0;
         Order_details Order_details;
        try {
            price=Double.parseDouble(totalPrice);
            cusId = cusDao.getCustomerByUsername(getCustomerUsername).getCustomer_id();
            listCustomerCart = cartDao.findCartByCusID(cusId);
            
            int code=1;
             Orders orders=new Orders(cusId, 0, 1, price,"nnn",code);
              
               while(orderDao.getOrderByCode(code)!=null){
                   code++;
               }
               
               
            if (orderDao.addOrders(orders,code)==true) {
                int orderID=orderDao.getOrderByCode(code).getOrder_id();
                System.out.println("add orders success orderid is : "+orderID);
                
              
                for(customerCart x: listCustomerCart){
                            
                             //create new guest order details /////////////////////////////////////////
                                 Order_details=new Order_details(orderID, x.getQuantity(),x.getPrice(), x.getProductId());
                        // add loop here
                          if (OrderDetailsDao.addOrdersDetails(Order_details)==true) {
                               System.out.println("add xong het");
                               
                              //delete customer cart
                             cartDao.DeleteCustomerCart(cusId, Order_details.getProductId());
                          } 
                         }
               
            }
            
            

        } catch (Exception ex) {
            Logger.getLogger(ShowCustomerCart.class.getName()).log(Level.SEVERE, null, ex);
        }
        session.setAttribute("username", getCustomerUsername);
        response.sendRedirect("Views/HomeIndex/CheckoutSuccess.jsp");
        
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
