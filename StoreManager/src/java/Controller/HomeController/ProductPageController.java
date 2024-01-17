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

/**
 *
 * @author notur
 */
public class ProductPageController extends HttpServlet {

    

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
            out.println("<title>Servlet ProductPageController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductPageController at " + request.getContextPath() + "</h1>");
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
        ProductDAO dao = new ProductDAO();
        List<Product> listProductPopular = new ArrayList<>();
        List<Product> listProductBirthday = new ArrayList<>();
        List<Product> listProductWedding = new ArrayList<>();
        List<Product> listProductCustom = new ArrayList<>();

        try {
            listProductPopular = dao.getAllProductWorking();
            listProductBirthday = dao.getProductByType(1);
            listProductWedding = dao.getProductByType(2);
            listProductCustom = dao.getProductByType(3);
            session.setAttribute("listProductPopular", listProductPopular);
            session.setAttribute("listProductBirthday", listProductBirthday);
            session.setAttribute("listProductWedding", listProductWedding);
            session.setAttribute("listProductCustom", listProductCustom);
            
            

        } catch (Exception ex) {
            Logger.getLogger(ProductPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("Views/HomeIndex/ProductPage.jsp");
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
        String proId = request.getParameter("proId");
        String proQuantity = request.getParameter("proQuantity");
int productId=0;
int productQuantity =0;

String cookieValue="";
 




        try {
            productId=Integer.parseInt(proId);
            productQuantity = Integer.parseInt(proQuantity);
            
            if (productId>0 && productQuantity>0) {
              Cookie cookie = getCookie(request, "myCart");
                if (cookie==null) {
                    cookieValue=productId+"-"+productQuantity;
                    cookie = new Cookie("myCart", cookieValue);
                    cookie.setMaxAge(1000);
                    response.addCookie(cookie);
                }else{
                     //create list to store id and quantity
                List<cartItem> mylist = new ArrayList<cartItem>();
                
                    //empty string to append new cookie
                String newCookie = "";
                String cookieDefaultValue=cookie.getValue();
                    //list to split by ' AND '
                String[] items = cookieDefaultValue.split("AND");
                cartItem cartItem;
                 for(String item : items)
                {
                    //list to split by ' - '
                    String[] pair = item.split("-");  
                    try
                    {
                        cartItem=new cartItem(Integer.parseInt(pair[0]),Integer.parseInt(pair[1]));
                    
                        //add to list with Key and Value
                        mylist.add(cartItem);
                    }
                    catch (Exception ex)
                    {
                        System.out.println("Error at 15000000000000000 "+ex);
                        
                    }
                }
                  //check duplicate id
                boolean checkDuplicate = false;
                 
                 for(cartItem c: mylist){
                     if (c.id==productId) {
                        checkDuplicate=true;
                        break;
                     }
                 }
                    if (checkDuplicate==true) {
                        for(cartItem c: mylist){
                     if (c.id==productId) {
                            
                         c.id=productId;
                         c.quantity+=productQuantity;
                       
                     }
                 }
                         String newString="";
                       for(cartItem c: mylist){
                     newString+="AND"+c.id+"-"+c.quantity;
                 }
                        if (newString.substring(0, 3).equalsIgnoreCase("AND")) {
                            newString=newString.substring(3, newString.length());
                        }
                       
                        cookie = new Cookie("myCart", newString);
                        cookie.setMaxAge(1000);
                        response.addCookie(cookie);
                       
                   
                    }
                    else{
                       //append next to string
                    cookieDefaultValue += "AND" + productId + "-" + proQuantity;
                    cookie = new Cookie("myCart", cookieDefaultValue);
                        cookie.setMaxAge(1000);
                        response.addCookie(cookie);
                    }
                    
                }
             
              
        }
            
            
            
        } catch (Exception e) {
        }
        
        doGet(request, response);
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

 public void appenCookie(HttpServletRequest request, HttpServletResponse response,Cookie cookie, int id, int quantity)
        {

            //if cookie is null
            if (cookie == null)

            {   //set Key
                String key = "myCard";

                //set value
                String value = id+ "-" + quantity;

                cookie = new Cookie(key, value);
                //set time expire
                cookie.setMaxAge(1000);
                
                //apend cookie
                response.addCookie(cookie);
              
            }

            //if not null
            else
            { 
                //create list to store id and quantity
               List<cartItem> mylist= new ArrayList<cartItem>();
                cartItem c ;
                //empty string to append new cookie
                String newCookie = "";

                //list to split by ' AND '
                String[] items = cookie.getName().split("AND");


                for(String item : items)
                {c=new cartItem();
                    //list to split by ' - '
                    String[] pair = item.split("-");
                    try
                    { 
                        c.setId(Integer.parseInt(pair[0]));
                        c.setQuantity(Integer.parseInt(pair[1]));
                        //add to list with Key and Value
                        mylist.add(c);
                    }
                    catch (Exception ex)
                    {
                        System.out.println("Error in line 1933333333333 " +ex);
                    }
                }


                //check duplicate id
                boolean checkDuplicate = false;

                for(cartItem item : mylist)
                {
                    //if id already exist in list
                    if (item.getId() == id)
                    {
                        //return true
                        checkDuplicate = true;
                        break;
                    }
                }

                //if product already exist in cookie
                if (checkDuplicate)
                {
                    for(cartItem i: mylist){
                        if (i.getId()==id) {
                            i.id=id;
                            i.quantity=999;
                            break;
                        }
                    }
                  
                    for(cartItem item : mylist)
                    {
                        //append new cookie
                        newCookie += "AND" + item.getId() + "-" + item.getQuantity();
                    }

                    if (newCookie.substring(0, 3).equals("AND"))
                    {
                        //substring if string begin with 'AND'
                        newCookie = newCookie.substring(3, newCookie.length() - 3);

                    }

                    //delete current cookie
                    // Response.Cookies.Delete(cookie);

                    //add new cookie with new string
                    
                    cookie=new Cookie("myCard", newCookie);
                    cookie.setMaxAge(1000);
                    response.addCookie(cookie);


                }

                //if product not exist in cookie
                else
                {
                  
                    //append next to string
                    String cookieValue=cookie.getValue();
                   cookieValue += "AND" + id + "-" + quantity;
                    cookie=new Cookie("myCard", cookieValue);
                    cookie.setMaxAge(1000);
                   response.addCookie(cookie);
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
