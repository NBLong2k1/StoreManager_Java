/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.StoreDAO;
import Model.Store;
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
public class StoreController extends HttpServlet {

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
            out.println("<title>Servlet StoreController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StoreController at " + request.getContextPath() + "</h1>");
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
        StoreDAO dao = new StoreDAO();
        List<Store> listStore = new ArrayList<>();
         
        try {
            listStore=dao.getAllStore();
            session.setAttribute("listStore", listStore);
            
            
        } catch (Exception ex) {
            Logger.getLogger(StoreController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        response.sendRedirect("Views/Product/ShowStoreList.jsp");
         
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
        
       
       
        StoreDAO dao = new StoreDAO();
        if (request.getParameter("submitAddStore")!=null) {
       String store_name = request.getParameter("StoreName");
       String store_address = request.getParameter("StoreAddress");
       String city = request.getParameter("StoreCity");
       String phone = request.getParameter("StorePhone");
       Store store= new Store(store_name,store_address,city,phone);
        try {
            if (dao.addStore(store)==true) {
                doGet(request, response);
            }
        } catch (Exception ex) {
            Logger.getLogger(StoreController.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if (request.getParameter("submitSearch")!=null) {
            String searchString=request.getParameter("searchString");
             HttpSession session = request.getSession();
      
        List<Store> listStore = new ArrayList<>();
            try {
                listStore =dao.FindStoreByNameOrAddress(searchString);
                session.setAttribute("listStore", listStore);
                 response.sendRedirect("Views/Product/ShowStoreList.jsp");
            } catch (Exception ex) {
                Logger.getLogger(StoreController.class.getName()).log(Level.SEVERE, null, ex);
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
