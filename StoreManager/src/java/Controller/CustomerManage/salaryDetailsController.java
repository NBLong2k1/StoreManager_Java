/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.CustomerManage;

import DAO.GuestOrderDetailsDAO;
import DAO.Order_details_DAO;
import Model.Guest_Order_details;
import Model.Order_details;
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
public class salaryDetailsController extends HttpServlet {

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
            out.println("<title>Servlet salaryDetailsController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet salaryDetailsController at " + request.getContextPath() + "</h1>");
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
        String orderGuestId =request.getParameter("orderGuestId");
        String orderId= request.getParameter("orderId");
        HttpSession session = request.getSession();
        if (orderId !=null) {
                 Order_details_DAO detailDao = new Order_details_DAO();
                 List<Order_details> listOrdDetails = new ArrayList<>();
            try {
                listOrdDetails=detailDao.getAllOrder_detailsByOrdID(Integer.parseInt(orderId));
            } catch (Exception ex) {
                Logger.getLogger(salaryDetailsController.class.getName()).log(Level.SEVERE, null, ex);
            }
            session.setAttribute("listDetails", listOrdDetails);
          response.sendRedirect("Views/Account/salaryDetails.jsp");
            
        }else if(orderGuestId!=null){
            GuestOrderDetailsDAO guestDetailsDao= new GuestOrderDetailsDAO();
             List<Guest_Order_details> listOrdDetails = new ArrayList<>();
            try {
                listOrdDetails=guestDetailsDao.findOrderGuestDetailsByOrderID(Integer.parseInt(orderGuestId));
            } catch (Exception ex) {
                Logger.getLogger(salaryDetailsController.class.getName()).log(Level.SEVERE, null, ex);
            }
            session.setAttribute("listDetails", listOrdDetails);
          response.sendRedirect("Views/Account/salaryDetails.jsp");
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
