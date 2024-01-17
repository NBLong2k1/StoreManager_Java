/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.CustomerManage;

import Controller.HomeController.processOrderDetailsController;
import DAO.OrdersDAO;
import DAO.customerProcessOrdersDAO;
import Model.customerOderDetailsInformation;
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
public class CustomerprocessOrderDetailsController extends HttpServlet {

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
            out.println("<title>Servlet CustomerprocessOrderDetailsController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CustomerprocessOrderDetailsController at " + request.getContextPath() + "</h1>");
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
        HttpSession sessionList = request.getSession();
         int guest_id=0;
         try {
               guest_id=Integer.parseInt(request.getParameter("guest_id"));
        } catch (Exception e) {
        }
        
      customerProcessOrdersDAO dao = new customerProcessOrdersDAO();
     
       List<customerOderDetailsInformation>listprocessOrder=new ArrayList<>();
        try {
             listprocessOrder = dao.getDetailsOrder(guest_id);
             
             
        } catch (Exception ex) {
            Logger.getLogger(processOrderDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
       sessionList.setAttribute("listprocessOrder", listprocessOrder);
       response.sendRedirect("Views/Product/customerProcessOrderDetails.jsp");
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
       String orderId=request.getParameter("orderID");
       HttpSession sessionList = request.getSession();
        String confirmOrder=request.getParameter("confirmOrder");
        String acceptOrder=request.getParameter("acceptOrder");
        String failOrder=request.getParameter("failOrder");
           try {
               int id=Integer.parseInt(orderId);
        OrdersDAO dao = new OrdersDAO();
        if (acceptOrder!=null) {
          
                if (dao.updateStatusOrders(1, id)==true) {
                     sessionList.setAttribute("flagAdd", null);
                    response.sendRedirect("orderCustomerController");
                }
            
        }else if(confirmOrder!=null){
             if (dao.updateStatusOrders(2, id)==true) {
                  sessionList.setAttribute("flagAdd", null);
                    response.sendRedirect("orderCustomerController");
                }
        }
        else if(failOrder!=null){
             if (dao.updateStatusOrders(3, id)==true) {
                  sessionList.setAttribute("flagAdd", null);
                    response.sendRedirect("orderCustomerController");
                }
        }
         } catch (Exception ex) {
                Logger.getLogger(processOrderDetailsController.class.getName()).log(Level.SEVERE, null, ex);
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
