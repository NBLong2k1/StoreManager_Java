/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.CustomerManage;


import Controller.EmployeeController;
import DAO.customerProcessOrdersDAO;
import Model.customerProcessOrders;
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
public class orderCustomerController extends HttpServlet {
static int page = 0;
    static int number = 0;
     List<customerProcessOrders> listCustomerProcessOrder = new ArrayList<>();
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
            out.println("<title>Servlet orderCustomerController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet orderCustomerController at " + request.getContextPath() + "</h1>");
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
        customerProcessOrdersDAO processDao= new customerProcessOrdersDAO();
            
            String pageNumber =request.getParameter("myBTN");
             if (pageNumber==null) {
				pageNumber="1";
			}
             
           
             try {   if (sessionList.getAttribute("flagAdd")==null) {
                 listCustomerProcessOrder = processDao.getAllprocessOrder();}
                 //get all employee (not admin)
             if (listCustomerProcessOrder.size() % 5 == 0) {
					page = listCustomerProcessOrder.size() / 5;

				} else {
					page = listCustomerProcessOrder.size() / 5 + 1;

				}
             
              ArrayList<customerProcessOrders> get5Record = new ArrayList<>();
                 
                if (pageNumber!=null) {
                if (Integer.parseInt(pageNumber) >= 1 && Integer.parseInt(pageNumber) <= page) {

						number = Integer.parseInt(pageNumber);
		}

            }
            int totalEmployee = listCustomerProcessOrder.size();
            if (!listCustomerProcessOrder.isEmpty()) {
					
				 
				for (int j = number * 5 - 5; j < number * 5; j++) {

					if (j < totalEmployee) {

						get5Record.add(listCustomerProcessOrder.get(j));

					}
				 
				}
				sessionList.setAttribute("pageNumber", page);
				sessionList.setAttribute("currentPage", number);
                                sessionList.setAttribute("listprocessOrder", get5Record);
				sessionList.setAttribute("setStatus", 0);
				
				
				 request.getRequestDispatcher("Views/Product/OrderCustomerList.jsp").forward(request, response);
	           }
             else {
					page=0;
					number=0;
					get5Record.clear();
					sessionList.setAttribute("pageNumber", page);
					sessionList.setAttribute("currentPage", number);
					sessionList.setAttribute("listprocessOrder", get5Record);
					request.getRequestDispatcher("Views/Product/OrderCustomerList.jsp").forward(request, response);
				}
            
            
                 
             } catch (Exception ex) {
                 Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, ex);
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
        String submitSearch = request.getParameter("submitSearch");
      HttpSession sessionList = request.getSession();
      
        if (submitSearch != null) {

            String searchString = request.getParameter("searchString");
           customerProcessOrdersDAO proDao = new customerProcessOrdersDAO();
          
            try {
                  listCustomerProcessOrder = proDao.getAllprocessOrderByID(searchString);
                  sessionList.setAttribute("flagAdd", 0);
                  doGet(request, response);
            } catch (Exception e) {
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
