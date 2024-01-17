/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.AccountDAO;
import DAO.EmployeeDAO;
import Model.Customer;
import Model.Employee;
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
public class ProfileController extends HttpServlet {

    static int roleAccount = 3;

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
            out.println("<title>Servlet ProfileController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProfileController at " + request.getContextPath() + "</h1>");
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
        String ManagerUsername = request.getParameter("ManagerUsername");
        String CustomerUsername = request.getParameter("getCustomerUsername");
        String RoleAccount = request.getParameter("Role");
        EmployeeDAO dao = new EmployeeDAO();

        AccountDAO cusDao = new AccountDAO();
        Employee employee = new Employee();
        Customer customer = new Customer();

        try {
            roleAccount = Integer.parseInt(RoleAccount);
        } catch (Exception e) {
        }

        if (ManagerUsername != null) {
            try {

                employee = (Employee) dao.findEmployeeByName(ManagerUsername);

                request.setAttribute("employee", employee);

                request.getRequestDispatcher("Views/Account/ProfileManagerAccount.jsp").forward(request, response);
            } catch (Exception ex) {
                Logger.getLogger(EditEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (CustomerUsername != null) {
            try {
                customer = (Customer) cusDao.getCustomerByUsername(CustomerUsername);
                request.setAttribute("customer", customer);

                request.getRequestDispatcher("Views/Account/ProfileCustomerAccount.jsp").forward(request, response);
            } catch (Exception ex) {
                Logger.getLogger(EditEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
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
        String submitEditEmployee = request.getParameter("submitEditEmployee");
        String submitEditCustomer = request.getParameter("submitEditCustomer");
        HttpSession session = request.getSession();
        //Edit Manager Profile
        if (submitEditEmployee != null) {
            String EmployeeEmail = request.getParameter("EmployeeEmail");
            String EmployeeId = request.getParameter("EmployeeId");
            String EmployeeName = request.getParameter("EmployeeName");
            String EmployeeUsrname = request.getParameter("EmployeeUsrname");
            String EmployeePassword = request.getParameter("EmployeePassword");
            String EmployeePhone = request.getParameter("EmployeePhone");
            String EmployeePersonalID = request.getParameter("EmployeePersonalID");
            String EmployeeDob = request.getParameter("EmployeeDob");
            String EmployeeStartedDate = request.getParameter("EmployeeStartedDate");
            String EmployeeRole = request.getParameter("EmployeeRole");
            String EmployeStoreId = request.getParameter("EmployeStoreId");
            String EmployeeStatus = request.getParameter("EmployeeStatus");

            int status = 0;

            Employee employee = new Employee();
            if (EmployeeStatus == null) {
                status = 0;
            } else {
                status = 1;
            }

            EmployeeDAO employeeDAO = new EmployeeDAO();

            try {

                employee = new Employee(Integer.parseInt(EmployeeId), EmployeeEmail, Integer.parseInt(EmployeStoreId), EmployeeName, EmployeeUsrname, EmployeePassword, EmployeePhone, EmployeePersonalID, EmployeeDob, EmployeeStartedDate, Integer.parseInt(EmployeeRole), status);
                System.out.println("employee is " + employee);

                if (employeeDAO.checkEmployeeIfExist("", EmployeeUsrname) == true && !employeeDAO.findEmployeeById(Integer.parseInt(EmployeeId)).getUsername().equals(EmployeeUsrname)) {

                   
                    
                    request.setAttribute("error_message", "Username is already exist !");
                    request.setAttribute("employee", employee);
                    request.getRequestDispatcher("Views/Account/ProfileManagerAccount.jsp").forward(request, response);

                } else {

                    employeeDAO.updateEmployee(employee, Integer.parseInt(EmployeeId));
                    session.setAttribute("username", EmployeeUsrname);
             

                    if (Integer.parseInt(EmployeeRole) == 0) {
                        response.sendRedirect("Views/Account/EmployeeManager.jsp");
                    } else {
                        response.sendRedirect("Views/Account/Admin.jsp");
                    }
                }

            } catch (Exception ex) {
                Logger.getLogger(ProfileController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } //Edit Customer Profile
        else if (submitEditCustomer != null) {

            String customerEmail = request.getParameter("customerEmail");
            String customerID= request.getParameter("customerID");
            String customerName= request.getParameter("customerName");
            String customerUsrname= request.getParameter("customerUsrname");
            String customerPassword= request.getParameter("customerPassword");
            String customerPhone= request.getParameter("customerPhone");
            String customerDob= request.getParameter("customerDob");
             String customerAddress= request.getParameter("customerDob");

            int status =1;
            
            AccountDAO customerDao= new AccountDAO();
            Customer customer = new Customer(Integer.parseInt(customerID),customerName, customerUsrname, customerPassword, customerEmail, customerPhone, customerDob, status,customerAddress);
            try {
                
                       if (customerDao.checkAccountExist("", customerUsrname) == true && !customerDao.getCustomerByID(Integer.parseInt(customerID)).getUsername().equals(customerUsrname)) {

                   
                     request.setAttribute("error_message", "Username is already exist !");
                    request.setAttribute("customer", customer);
                    request.getRequestDispatcher("Views/Account/ProfileCustomerAccount.jsp").forward(request, response);
                    
                    
                    
                }
                else {

                    customerDao.updateCustomer(customer, Integer.parseInt(customerID));
                    session.setAttribute("username", customerUsrname);
                    response.sendRedirect("Views/Account/CustomerManager.jsp");

                   
                }
            } catch (Exception ex) {
                Logger.getLogger(ProfileController.class.getName()).log(Level.SEVERE, null, ex);
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
