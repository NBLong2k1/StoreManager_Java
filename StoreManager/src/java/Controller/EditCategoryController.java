/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.CategoryDAO;
import Model.Category;
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
public class EditCategoryController extends HttpServlet {

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
            out.println("<title>Servlet EditCategoryController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditCategoryController at " + request.getContextPath() + "</h1>");
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
        String categoryId = request.getParameter("categoryId");
        CategoryDAO dao = new CategoryDAO();
        Category Category = new Category();
        HttpSession session = request.getSession();
       
                 
        if (request.getParameter("cateID")!=null) {
            try {
                if (dao.deleteCategory(Integer.parseInt(request.getParameter("cateID")))==true) {
                      response.sendRedirect("CategoryController");
                }
            } catch (Exception ex) {
                Logger.getLogger(EditCategoryController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(request.getParameter("categoryId")!=null)
        {
             try {
            Category = dao.findCategoryByID(Integer.parseInt(categoryId));
            session.setAttribute("Category", Category);
            
            response.sendRedirect("Views/Product/EditCategory.jsp");
        } catch (Exception ex) {
            Logger.getLogger(EditCategoryController.class.getName()).log(Level.SEVERE, null, ex);
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
        String CategoryID = request.getParameter("CategoryID");
        String CategoryName = request.getParameter("CategoryName");
        String CategoryType = request.getParameter("CategoryType");
         CategoryDAO dao = new CategoryDAO();
        Category Category = new Category(Integer.parseInt(CategoryID),CategoryName,Integer.parseInt(CategoryType));
        HttpSession session = request.getSession();
        
        try {
            boolean checkDup=false;
            for(Category x: dao.getAllCategory()){
                if (x.getCategory_name().equals(CategoryName) ) {
                    checkDup=true;
                }
            }
            if (checkDup==false) {
                 if (dao.updateCategory(Category, Category.getCategory_id())) {
                 response.sendRedirect("CategoryController");
            }
            }else{
               
                  request.setAttribute("ErrMSG", "Name is already Exist !");
                 request.getRequestDispatcher("Views/Product/EditCategory.jsp").forward(request, response);
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(EditCategoryController.class.getName()).log(Level.SEVERE, null, ex);
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
