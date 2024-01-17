/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.EmployeeDAO;
import Model.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notur
 */
public class EditEmployeeController extends HttpServlet {

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
            out.println("<title>Servlet EditEmployeeController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditEmployeeController at " + request.getContextPath() + "</h1>");
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
        String EmpId = request.getParameter("EmpId");
        EmployeeDAO dao = new EmployeeDAO();
        Employee employee = new Employee();
        try {
            employee = (Employee) dao.findEmployeeById(Integer.parseInt(EmpId));
            request.setAttribute("employee", employee);
 
            request.getRequestDispatcher("Views/Account/EditEmployee.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(EditEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
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
        if (submitEditEmployee != null) {
            String EmployeeId = request.getParameter("EmployeeId");
            String EmployeeEmail = request.getParameter("EmployeeEmail");
            String EmployeeName = request.getParameter("EmployeeName");
            String EmployeeUsrname = request.getParameter("EmployeeUsrname");
            String EmployeePassword = request.getParameter("EmployeePassword");
            String EmployeeRole = request.getParameter("EmployeeRole");
            String EmployeStoreId = request.getParameter("EmployeStoreId");
            String EmployeeStatus = request.getParameter("EmployeeStatus");
            String EmployeePhone = request.getParameter("EmployeePhone");
            String EmployeePersonalID = request.getParameter("EmployeePersonalID");
            String EmployeeDob = request.getParameter("EmployeeDob");
            String EmployeeStartedDate = request.getParameter("EmployeeStartedDate");

            int status;
            int storeid = Integer.parseInt(EmployeStoreId);
            int role = Integer.parseInt(EmployeeRole);
            if (EmployeeStatus == null) {
                status = 0;
            } else {
                status = 1;
            }

            EmployeeDAO empDao = new EmployeeDAO();

            Employee employee = new Employee(Integer.parseInt(EmployeeId), EmployeeEmail, storeid, EmployeeName, EmployeeUsrname, EmployeePassword, EmployeePhone, EmployeePersonalID, EmployeeDob, EmployeeStartedDate, role, status);

            try {

                String currentEmail = empDao.findEmployeeById(Integer.parseInt(EmployeeId)).email;
                String currentUsername = empDao.findEmployeeById(Integer.parseInt(EmployeeId)).username;

                if (empDao.checkEmployeeIfExist("", EmployeeUsrname) == true && !empDao.findEmployeeById(Integer.parseInt(EmployeeId)).getUsername().equals(EmployeeUsrname)) {

                    request.setAttribute("error_message", "Username is already exist !");
                    request.setAttribute("employee", employee);
                    request.getRequestDispatcher("Views/Account/EditEmployee.jsp").forward(request, response);

                } else {
                    HttpSession sessionList = request.getSession();
                    empDao.updateEmployee(employee, Integer.parseInt(EmployeeId));
                    sessionList.setAttribute("flagAdd", null);
                    response.sendRedirect("EmployeeList");

                }

            } catch (Exception ex) {
                Logger.getLogger(EditEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
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
