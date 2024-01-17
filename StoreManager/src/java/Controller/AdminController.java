/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.AccountDAO;
import DAO.EmployeeDAO;
import DAO.OrderGuestDAO;
import DAO.OrdersDAO;
import Model.Customer;
import Model.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notur
 */
public class AdminController extends HttpServlet {
        List<Employee> empList = new ArrayList<>();
        List<Customer> cusList = new ArrayList<>();
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
            out.println("<title>Servlet AdminController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminController at " + request.getContextPath() + "</h1>");
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
        List<Employee> empList = new ArrayList<>();
        HttpSession session = request.getSession();
        
        Double earningMonthlyCustomer=0.0;
        Double earningDailyCustomer=0.0;
        Double earningGuestDaily=0.0;
        Double SumearningDaily=0.0;
        Double earningGuestMonthly=0.0;
        
        List<Double>totalEachMonth= new ArrayList<>();
        String month="0";
       
        
         Double SumearningMonthly=0.0;
         
        String username= request.getParameter("username");
                                      EmployeeDAO empDao = new EmployeeDAO();
                                      OrdersDAO orDao = new OrdersDAO();
                                      OrderGuestDAO orGuestDao = new OrderGuestDAO();
            try {
                
                List<String>listMonth= new ArrayList<>();
                listMonth.add("01");
                listMonth.add("02");
                listMonth.add("03");
                listMonth.add("04");
                listMonth.add("05");
                listMonth.add("06");
                listMonth.add("07");
                listMonth.add("08");
                listMonth.add("09");
                listMonth.add("10");
                listMonth.add("11");
                listMonth.add("12");
                for(String x : listMonth){
                     totalEachMonth.add(orDao.getAllTotalEachMonth(x));
                }
                
                System.out.println("isss "+totalEachMonth);
                //get all employee (not admin)
                empList=empDao.getAllEmployee(0);
                earningMonthlyCustomer=orDao.getTotalMonth();
                earningDailyCustomer=orDao.getTotalDaily();
                 earningGuestDaily=orGuestDao.getTotalDaily();
                 
                earningGuestMonthly=orGuestDao.getTotalMonth();
                
                
                
                SumearningMonthly=earningMonthlyCustomer+earningGuestMonthly;
                SumearningDaily=earningDailyCustomer+earningGuestDaily;
                
                session.setAttribute("totalCustomer", earningMonthlyCustomer);
                session.setAttribute("totalGuest", earningGuestMonthly);
                session.setAttribute("earningMonthly", SumearningMonthly);
                session.setAttribute("earningDaily", SumearningDaily);
                
                 session.setAttribute("totalEachMonth", totalEachMonth);
                
            } catch (Exception ex) {
                Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            } 
                                      
                                        //list employee and customer
                                         session.setAttribute("empList", empList);
                                         if (username!=null) {
               session.setAttribute("username", username);
        }
                                       
         response.sendRedirect("Views/Account/Admin.jsp");
        
        
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
int flag=0;
         HttpSession sessionList = request.getSession();
        String submitAddEmployee = request.getParameter("submitAddEmployee");
          if (submitAddEmployee != null) {
            System.out.println("this is add");
            String email = request.getParameter("EmployeeEmail");
            String fullname = request.getParameter("EmployeeName");
            String username = request.getParameter("EmployeeUsrname");
            String password = request.getParameter("EmployeePassword");
            String role = request.getParameter("EmployeeRole");
            String status = request.getParameter("EmployeeStatus");
            String EmployeStoreId = request.getParameter("EmployeStoreId");

            int Active = 0;

            try {
                if (status.equals("on")) {
                    Active = 1;
                } else {
                    Active = 0;
                }
            } catch (Exception e) {
            }

            System.out.println("status is: " + Active);

            EmployeeDAO dao = new EmployeeDAO();
            AccountDAO cusDao = new AccountDAO();
            Employee emp = new Employee(email, fullname, username, password, Integer.parseInt(EmployeStoreId), Integer.parseInt(role), Active);
            try {
                if (dao.checkEmployeeIfExist(email, username) == true) {
                  
                    request.setAttribute("error_message", "Email or Username is already exist !");
                    request.getRequestDispatcher("Views/Account/AddEmployee.jsp").forward(request, response);

                } else {

                    dao.addEmployee(emp);

                    List<Employee> empList = new ArrayList<>();
                    List<Customer> cusList = new ArrayList<>();
                    //get all employee (not admin)
                    empList = dao.getAllEmployee(0);
                    cusList = cusDao.getAllCustomer();

                    //list employee and customer
                    request.setAttribute("cusList", cusList);
                    request.setAttribute("empList", empList);
                 

                 

                }
                 sessionList.setAttribute("flagAdd", null);
                
              response.sendRedirect("EmployeeList");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println("Error in: " + e);
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
