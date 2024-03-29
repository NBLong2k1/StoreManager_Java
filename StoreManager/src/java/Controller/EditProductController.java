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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notur
 */
public class EditProductController extends HttpServlet {

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
            out.println("<title>Servlet EditProductController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditProductController at " + request.getContextPath() + "</h1>");
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
        String productId= request.getParameter("productId");
        ProductDAO dao = new ProductDAO();
         HttpSession session = request.getSession();
         Product product= new Product();
         if (request.getParameter("proID")!=null) {
            
            try {
                if (dao.deleteProduct(Integer.parseInt(request.getParameter("proID")))==true) {
                     response.sendRedirect("ProductList");
                }else{
                 
                    product=dao.getProductByID(Integer.parseInt(productId));
            session.setAttribute("productInfor", product);
            session.setAttribute("error_message", "cannot delete product right now, please check again");
                     response.sendRedirect("Views/Product/EditProduct.jsp");
                }
            } catch (Exception ex) {
                Logger.getLogger(EditProductController.class.getName()).log(Level.SEVERE, null, ex);
            }
             
             
             
        }
         else{
               try {
            product=dao.getProductByID(Integer.parseInt(productId));
            session.setAttribute("productInfor", product);
             response.sendRedirect("Views/Product/EditProduct.jsp");
        } catch (Exception ex) {
            Logger.getLogger(EditProductController.class.getName()).log(Level.SEVERE, null, ex);
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
        String productName =request.getParameter("productName");
        String productDescription =request.getParameter("productDescription");
        String productPrice =request.getParameter("productPrice");
        String productImage =request.getParameter("productImage");
        String productType =request.getParameter("productType");
        String productStatus= request.getParameter("productStatus");
        String productId=request.getParameter("productId");
          ProductDAO dao = new ProductDAO();
          int status;
         try {
              if (productStatus == null) {
                status = 0;
            } else {
                status = 1;
            }
                 Product product = new Product(Integer.parseInt(productId),productName, Integer.parseInt(productType), productDescription, productImage, Double.parseDouble(productPrice),status);
      
            if (dao.updateProduct(product, product.getProduct_id())==true) {
                 response.sendRedirect("ProductList");
            }
        } catch (Exception ex) {
            Logger.getLogger(EditProductController.class.getName()).log(Level.SEVERE, null, ex);
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
