/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.HomeController;


import DAO.ProductDAO;
import Model.Product;
import Model.cartItem;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
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
public class ShoppingCartController extends HttpServlet {
 
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
            out.println("<title>Servlet ShoppingCartController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShoppingCartController at " + request.getContextPath() + "</h1>");
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
    
          List<cartItem> list = ReadCookie(request,"myCart");
          List<Pair<Product, Integer>> productList = new ArrayList<Pair<Product, Integer>>();
          ProductDAO dao = new ProductDAO();
          for(cartItem x: list){
              
        try {
            productList.add(new Pair<>(dao.getProductByID(x.id),x.quantity));
        } catch (Exception ex) {
            Logger.getLogger(ShoppingCartController.class.getName()).log(Level.SEVERE, null, ex);
        }
              System.out.println(x);
          }
          
          session.setAttribute("productListCart", productList);
          response.sendRedirect("Views/HomeIndex/ShoppingCart.jsp");
    }

    
    public List<cartItem> ReadCookie(HttpServletRequest request,String name)
            {
                //create list
              List<cartItem> myProcductCart = new ArrayList<cartItem>();
                  cartItem cart;
                //get cookie
                Cookie cookie = getCookie(request, name);
                if (cookie != null)
                {
                    //create list split by ' AND '
                    String[] items = splitString(cookie.getValue(), "AND");

                    for(String item : items)
                    {
                        //create list split by ' - ' 
                        String[] pair = splitString(item, "-");

                        try
                        {
                            cart= new cartItem(Integer.parseInt(pair[0]),Integer.parseInt(pair[1]));
                            //add to list with Key and Value
                            myProcductCart.add(cart);
                        }
                        catch (Exception ex)
                        {
                            System.out.println("error in 1999999999999 "+ex);
                        }


                    }

                }
                return myProcductCart;
            }
    
     public String[] splitString(String value, String charac)
            {
                String[] result = value.split(charac);

                return result;
            }
    
      public static Cookie getCookie(HttpServletRequest request,String name) {
     
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    return cookie;
                }
            }
        }
        return null;
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
