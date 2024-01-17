/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.ProductDAO;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notur
 */
public class ProductSearchController extends HttpServlet {

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
            out.println("<title>Servlet ProductSearchController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductSearchController at " + request.getContextPath() + "</h1>");
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
        String cate= request.getParameter("cate");
        HttpSession sessionList = request.getSession();
        ProductDAO d = new ProductDAO();
        List<Product> productList= new ArrayList<>();
        
        try {
             int type=Integer.parseInt(cate);
            productList=d.findProductByType(type);
        } catch (Exception ex) {
            Logger.getLogger(ProductSearchController.class.getName()).log(Level.SEVERE, null, ex);
        }
        sessionList.setAttribute("productList", productList);
       
        if (cate.equals("1")) {
            sessionList.setAttribute("searchValue","Birthday Cake");
        }
         if (cate.equals("2")) {
            sessionList.setAttribute("searchValue","Wedding Cake");
        }
          if (cate.equals("3")) {
            sessionList.setAttribute("searchValue","Custom Cake");
        }
              
        
         
        response.sendRedirect("Views/HomeIndex/displaySearchProduct.jsp");
        
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
        String searchString = request.getParameter("searchString");
        ProductDAO d = new ProductDAO();
        List<Product> productList= new ArrayList<>();
        try {
            productList=d.findProductByNameOrType(searchString);
        } catch (Exception ex) {
            Logger.getLogger(ProductSearchController.class.getName()).log(Level.SEVERE, null, ex);
        }
        sessionList.setAttribute("productList", productList);
          sessionList.setAttribute("searchValue", searchString);
        response.sendRedirect("Views/HomeIndex/displaySearchProduct.jsp");
        
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
