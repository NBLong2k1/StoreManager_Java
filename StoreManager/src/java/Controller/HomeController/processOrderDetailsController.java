/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.HomeController;

import DAO.OrderGuestDAO;
import DAO.processOrderDAO;
import Model.guestOderDetailsInformation;
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
public class processOrderDetailsController extends HttpServlet {

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
            out.println("<title>Servlet processOrderDetailsController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet processOrderDetailsController at " + request.getContextPath() + "</h1>");
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
        
      processOrderDAO dao = new processOrderDAO();
     
       List<guestOderDetailsInformation>listprocessOrder=new ArrayList<>();
        try {
             listprocessOrder = dao.getDetailsOrder(guest_id);
             
             
        } catch (Exception ex) {
            Logger.getLogger(processOrderDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
       sessionList.setAttribute("listprocessOrder", listprocessOrder);
       response.sendRedirect("Views/Product/processOrderDetails.jsp");
      
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
         HttpSession sessionList = request.getSession();
        String orderId=request.getParameter("orderID");
      
        String confirmOrder=request.getParameter("confirmOrder");
        String acceptOrder=request.getParameter("acceptOrder");
         String failOrder=request.getParameter("failOrder");
           try {
               int id=Integer.parseInt(orderId);
        OrderGuestDAO dao = new OrderGuestDAO();
        if (acceptOrder!=null) {
           
                if (dao.updateStatusOrdersGuest(1, id)==true) {
                    sessionList.setAttribute("flagAddGuest", null);
                    response.sendRedirect("orderController");
                }
            
        }else if(confirmOrder!=null){
             if (dao.updateStatusOrdersGuest(2, id)==true) {
                   sessionList.setAttribute("flagAddGuest", null);
                    response.sendRedirect("orderController");
                }
        }
        else if(failOrder!=null){
             if (dao.updateStatusOrdersGuest(3, id)==true) {
                   sessionList.setAttribute("flagAddGuest", null);
                    response.sendRedirect("orderController");
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
