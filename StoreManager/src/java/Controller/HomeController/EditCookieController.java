/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.HomeController;

import static Controller.HomeController.ShoppingCartController.getCookie;
import Model.cartItem;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author notur
 */
public class EditCookieController extends HttpServlet {

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
            out.println("<title>Servlet EditCookieController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditCookieController at " + request.getContextPath() + "</h1>");
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
        String deleteID = request.getParameter("deleteID");

        int productId = 0;

        String newCookie = "";

        try {
          productId = Integer.parseInt(deleteID);
        

            Cookie cookie = getCookie(request, "myCart");

            //create list to store id and quantity
            List<cartItem> mylist = new ArrayList<cartItem>();

            //empty string to append new cookie
            String cookieDefaultValue = cookie.getValue();
            //list to split by ' AND '
            String[] items = cookieDefaultValue.split("AND");
            cartItem cartItem;
            for (String item : items) {
                //list to split by ' - '
                String[] pair = item.split("-");
                try {
                    cartItem = new cartItem(Integer.parseInt(pair[0]), Integer.parseInt(pair[1]));

                    //add to list with Key and Value
                    mylist.add(cartItem);
                } catch (Exception ex) {
                    System.out.println("Error at 15000000000000000 " + ex);

                }
            }
            //check duplicate id
            boolean checkDuplicate = false;

            for (cartItem c : mylist) {
                if (c.id == productId) {
                    checkDuplicate = true;
                    break;
                }
            }
            if (checkDuplicate == true) {

                try {
                    for (int i = 0; i < mylist.size(); i++) {
                        if (mylist.get(i).id == productId) {
                            mylist.remove(i);
                            
                            break;
                        }
                    }
                } catch (Exception e) {
                }

                
                String newString = "";
                System.out.println("mylist size is "+mylist.size());
                if (mylist.size()>0) {
                    for (cartItem c : mylist) {
                    newString += "AND" + c.id + "-" + c.quantity;
                }
                     System.out.println("new String chua slpt "+newString);
                if (newString.substring(0, 3).equalsIgnoreCase("AND")) {
                    newString = newString.substring(3, newString.length());
                }
                 System.out.println("new String da slpt "+newString);
                }else{
                    newString = "";
                }
                
                 System.out.println("new String final "+newString);
                if (newString.length()<=0) {
                     cookie = new Cookie("myCart", "");
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                }else{
                    cookie = new Cookie("myCart", newString);
                cookie.setMaxAge(1000);
                response.addCookie(cookie);
                }
                 

                

            }

        } catch (Exception e) {
        }

        response.sendRedirect("ShoppingCartController");

    }

    public void DeleteProductCookie(HttpServletRequest request, HttpServletResponse response, int proid) {

        //get cookie 
        Cookie cookie = getCookie(request, "myCard");
        if (cookie != null) {
            //create new list
            List<cartItem> listProductCart = new ArrayList<cartItem>();

            //create empty string
            String newCookie = "";
            String defaultValue = cookie.getValue();
            //create list split cookie value by ' AND '
            String[] items = splitString(defaultValue, "AND");

            for (String item : items) {
                //create list split by ' - '
                String[] pair = splitString(item, "-");
                try {
                    //add product id and quantity to list
                    listProductCart.add(new cartItem(Integer.parseInt(pair[0]), Integer.parseInt(pair[1])));
                } catch (Exception ex) {
                    System.out.println("Error at 1055555555555 " + ex);
                }
            }

            //check if ID exist in list
            boolean checkDuplicate = false;
            for (cartItem item : listProductCart) {
                if (item.id == proid) {
                    checkDuplicate = true;
                    break;
                }
            }

            if (checkDuplicate == true) {
                for (int i = 0; i < listProductCart.size(); i++) {
                    //if Id exist in List
                    if (listProductCart.get(i).id == proid) {
                        //remove from list
                        listProductCart.remove(i);

                        break;
                    }

                }

                //if list not empty
                if (listProductCart.size() > 0) {
                    for (cartItem item : listProductCart) {
                        //append new string cookie value
                        newCookie += "AND" + item.id + "-" + item.quantity;
                    }

                    //if string begin with ' AND '
                    if (newCookie.substring(0, 3).equalsIgnoreCase("AND")) {
                        //remove ' AND ' from begining string
                        newCookie = newCookie.substring(3, newCookie.length());

                    }
                } //if list is empty
                else {
                    newCookie = null;
                }

                //options.Expires = DateTime.Now.AddSeconds(0);
                //if new string value is null
                if (newCookie == null) {

                    // Expire cookie
                    cookie = new Cookie("myCart", "");
                    cookie.setMaxAge(0);

                    response.addCookie(cookie);
                } //if new string not null
                else {
                    //append new string to cookie
                    cookie = new Cookie("myCart", newCookie);
                    cookie.setMaxAge(1000);

                    response.addCookie(cookie);

                }

            }

        }

    }

    public String[] splitString(String value, String charac) {
        String[] result = value.split(charac);

        return result;
    }

    public List<cartItem> ReadCookie(HttpServletRequest request, String name) {
        //create list
        List<cartItem> myProcductCart = new ArrayList<cartItem>();
        cartItem cart;
        //get cookie
        Cookie cookie = getCookie(request, name);
        if (cookie != null) {
            //create list split by ' AND '
            String[] items = splitString(cookie.getValue(), "AND");

            for (String item : items) {
                //create list split by ' - ' 
                String[] pair = splitString(item, "-");

                try {
                    cart = new cartItem(Integer.parseInt(pair[0]), Integer.parseInt(pair[1]));
                    //add to list with Key and Value
                    myProcductCart.add(cart);
                } catch (Exception ex) {
                    System.out.println("error in 1999999999999 " + ex);
                }

            }

        }
        return myProcductCart;
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
        String proId = request.getParameter("proid");
        String proQuantity = request.getParameter("proQuantity");
        int productId = 0;
        int productQuantity = 0;

        String cookieValue = "";

        try {
            productId = Integer.parseInt(proId);
            productQuantity = Integer.parseInt(proQuantity);

            if (productId > 0 && productQuantity > 0) {
                Cookie cookie = getCookie(request, "myCart");
                if (cookie == null) {
                    cookieValue = productId + "-" + productQuantity;
                    cookie = new Cookie("myCart", cookieValue);
                    cookie.setMaxAge(1000);
                    response.addCookie(cookie);
                } else {
                    //create list to store id and quantity
                    List<cartItem> mylist = new ArrayList<cartItem>();

                    //empty string to append new cookie
                    String newCookie = "";
                    String cookieDefaultValue = cookie.getValue();
                    //list to split by ' AND '
                    String[] items = cookieDefaultValue.split("AND");
                    cartItem cartItem;
                    for (String item : items) {
                        //list to split by ' - '
                        String[] pair = item.split("-");
                        try {
                            cartItem = new cartItem(Integer.parseInt(pair[0]), Integer.parseInt(pair[1]));

                            //add to list with Key and Value
                            mylist.add(cartItem);
                        } catch (Exception ex) {
                            System.out.println("Error at 15000000000000000 " + ex);

                        }
                    }
                    //check duplicate id
                    boolean checkDuplicate = false;
                    System.out.println("I have list cookie " + mylist);
                    for (cartItem c : mylist) {
                        if (c.id == productId) {
                            checkDuplicate = true;
                            break;
                        }
                    }
                    if (checkDuplicate == true) {
                        for (cartItem c : mylist) {
                            if (c.id == productId) {

                                c.id = productId;
                                c.quantity = productQuantity;

                            }
                        }
                        String newString = "";
                        for (cartItem c : mylist) {
                            newString += "AND" + c.id + "-" + c.quantity;
                        }
                        if (newString.substring(0, 3).equalsIgnoreCase("AND")) {
                            newString = newString.substring(3, newString.length());
                        }

                        cookie = new Cookie("myCart", newString);
                        cookie.setMaxAge(1000);
                        response.addCookie(cookie);

                        System.out.println("I have new list cookie " + mylist);
                        System.out.println("I have new list string value " + newString);

                    } else {
                        cookie.setMaxAge(0);
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

        response.sendRedirect("ShoppingCartController");
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
