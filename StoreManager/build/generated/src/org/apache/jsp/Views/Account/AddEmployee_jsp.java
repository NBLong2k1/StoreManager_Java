package org.apache.jsp.Views.Account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import DAO.EmployeeDAO;
import Model.Customer;
import Model.Employee;

public final class AddEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>SB Admin 2 - Dashboard</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom fonts for this template-->\r\n");
      out.write("        <link href=\"");
      out.print( request.getContextPath());
      out.write("/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template-->\r\n");
      out.write("        <link href=\"");
      out.print( request.getContextPath());
      out.write("/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("      \r\n");
      out.write("            <!-- Page Wrapper -->\r\n");
      out.write("            <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Sidebar -->\r\n");
      out.write("                <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Sidebar - Brand -->\r\n");
      out.write("                    <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"");
      out.print( request.getContextPath());
      out.write("/AdminController?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                        <div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("                            <i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"sidebar-brand-text mx-3\">Admin ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Divider -->\r\n");
      out.write("                    <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Nav Item - Dashboard -->\r\n");
      out.write("                    <li class=\"nav-item active\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath());
      out.write("/AdminController?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                            <i class=\"fas fa-fw fa-tachometer-alt\"></i>\r\n");
      out.write("                            <span>Dashboard</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Divider -->\r\n");
      out.write("                    <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Heading -->\r\n");
      out.write("                    <div class=\"sidebar-heading\">\r\n");
      out.write("                        Interface\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        \r\n");
          out.write("                     \r\n");
          out.write("                    <!-- Nav Item - Pages Collapse Menu -->\r\n");
          out.write("                    <li class=\"nav-item\">\r\n");
          out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"\r\n");
          out.write("                           aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
          out.write("                            <i class=\"fas fa-dollar-sign\"></i>\r\n");
          out.write("                            <span>Doanh Thu</span>\r\n");
          out.write("                        </a>\r\n");
          out.write("                        <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
          out.write("                            <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
          out.write("                                <h6 class=\"collapse-header\">Doanh Thu</h6>\r\n");
          out.write("                                <a class=\"collapse-item\" href=\"");
          out.print( request.getContextPath());
          out.write("/salaryController\">Đơn Hàng</a>\r\n");
          out.write("                              \r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </li>\r\n");
          out.write("                    \r\n");
          out.write("                     <!-- Nav Item - Utilities Collapse Menu -->\r\n");
          out.write("                    <li class=\"nav-item\">\r\n");
          out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilitiesStore\"\r\n");
          out.write("                           aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
          out.write("                            <i class=\"fas fa-user\"></i>\r\n");
          out.write("                            <span>Quản Lý Cửa Hàng</span>\r\n");
          out.write("                        </a>\r\n");
          out.write("                        <div id=\"collapseUtilitiesStore\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\r\n");
          out.write("                             data-parent=\"#accordionSidebar\">\r\n");
          out.write("                            <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
          out.write("                                <h6 class=\"collapse-header\">Đơn Hàng</h6>\r\n");
          out.write("                                <a class=\"collapse-item\" href=\"");
          out.print( request.getContextPath());
          out.write("/StoreController\" >Xem Cửa Hàng</a>\r\n");
          out.write("                      \r\n");
          out.write("\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </li>\r\n");
          out.write("                    \r\n");
          out.write("\r\n");
          out.write("                    <!-- Nav Item - Utilities Collapse Menu -->\r\n");
          out.write("                    <li class=\"nav-item\">\r\n");
          out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\r\n");
          out.write("                           aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
          out.write("                            <i class=\"fas fa-user\"></i>\r\n");
          out.write("                            <span>Quản Lý Tài khoản</span>\r\n");
          out.write("                        </a>\r\n");
          out.write("                        <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\r\n");
          out.write("                             data-parent=\"#accordionSidebar\">\r\n");
          out.write("                            <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
          out.write("                                <h6 class=\"collapse-header\">Account</h6>\r\n");
          out.write("                                <a class=\"collapse-item\" href=\"");
          out.print( request.getContextPath());
          out.write("/EmployeeList\" >Nhân Viên</a>\r\n");
          out.write("                      \r\n");
          out.write("\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </li>\r\n");
          out.write("                    \r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwoSP\"\r\n");
      out.write("                           aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                            <i class=\"fas fa-eye\"></i>\r\n");
      out.write("                            <span>Quản Lý Sản Phẩm</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div id=\"collapseTwoSP\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                            <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                                <h6 class=\"collapse-header\">Sản Phẩm</h6>\r\n");
      out.write("                                <a class=\"collapse-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/ProductList\">Product</a>\r\n");
      out.write("                                  <a class=\"collapse-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/CategoryController\">Category</a>\r\n");
      out.write("                                  \r\n");
      out.write("                                \r\n");
      out.write("                              \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <!-- Nav Item - Utilities Collapse Menu -->\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilitiesDH\"\r\n");
      out.write("                           aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("                            <i class=\"fas fa-user\"></i>\r\n");
      out.write("                            <span>Quản Lý Đơn Hàng</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div id=\"collapseUtilitiesDH\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\r\n");
      out.write("                             data-parent=\"#accordionSidebar\">\r\n");
      out.write("                            <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                                <h6 class=\"collapse-header\">Đơn Hàng</h6>\r\n");
      out.write("                                <a class=\"collapse-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/orderController\" >Đơn Hàng Chờ</a>\r\n");
      out.write("                                <a class=\"collapse-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/successOrderController\" >Đơn Hàng Đã Xử Lý</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                     \r\n");
      out.write("                    \r\n");
      out.write("                    <!-- Divider -->\r\n");
      out.write("                    <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- End of Sidebar -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Content Wrapper -->\r\n");
      out.write("                <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Main Content -->\r\n");
      out.write("                    <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Topbar -->\r\n");
      out.write("                            <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Topbar Navbar -->\r\n");
      out.write("                            <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"topbar-divider d-none d-sm-block\"></div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Nav Item - User Information -->\r\n");
      out.write("                                <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("                                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\r\n");
      out.write("                                       data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                        <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                        <img class=\"img-profile rounded-circle\"\r\n");
      out.write("                                             src=\"");
      out.print( request.getContextPath());
      out.write("/img/undraw_profile.svg\">\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <!-- Dropdown - User Information -->\r\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("                                         aria-labelledby=\"userDropdown\">\r\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/ProfileController?ManagerUsername=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&&Role=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                            Profile\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                      \r\n");
      out.write("                                        <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\r\n");
      out.write("                                            <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                            Logout\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("\r\n");
      out.write("                        </nav>\r\n");
      out.write("                        <!-- End of Topbar -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Begin Page Content -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"container-fluid\" id=\"EmployeeInsert\" style=\"display: block\" >\r\n");
      out.write("                            <h1>Add Employee</h1>\r\n");
      out.write("                            <h4 style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error_message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-7\"> \r\n");
      out.write("                                    <form action=\"");
      out.print( request.getContextPath());
      out.write("/AdminController\" method=\"post\">\r\n");
      out.write("                                        <div class=\"mb-3\">\r\n");
      out.write("                                            <label for=\"exampleInputEmail1\" class=\"form-label\">Email</label>\r\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" name=\"EmployeeEmail\" required placeholder=\"Nhập Email\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"mb-3\">\r\n");
      out.write("                                            <label for=\"EmployeeName\" class=\"form-label\">Họ Và Tên</label>\r\n");
      out.write("                                            <input type=\"text\" name=\"EmployeeName\" required placeholder=\"Nhập Họ Và Tên\" class=\"form-control\" id=\"EmployeeName\" aria-describedby=\"emailHelp\">\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"mb-3\">\r\n");
      out.write("                                            <label for=\"Usrname\" class=\"form-label\">Usrname</label>\r\n");
      out.write("                                            <input type=\"text\" name=\"EmployeeUsrname\" required placeholder=\"Nhập Username\" class=\"form-control\" id=\"Usrname\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"mb-3\">\r\n");
      out.write("                                            <label for=\"Password\" class=\"form-label\">Mật Khẩu</label>\r\n");
      out.write("                                            <input type=\"Password\" name=\"EmployeePassword\" required placeholder=\"Nhập Mật Khẩu\" class=\"form-control\" id=\"Password\" aria-describedby=\"emailHelp\">\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                            <input class=\"form-check-input\" type=\"radio\" name=\"EmployeeRole\" id=\"inlineRadio1\" checked value=\"0\">\r\n");
      out.write("                                            <label class=\"form-check-label\" for=\"inlineRadio1\">Nhân Viên</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-check form-check-inline\"style=\"margin-left: 15px\" >\r\n");
      out.write("                                            <input class=\"form-check-input\" type=\"radio\" name=\"EmployeeRole\" id=\"inlineRadio2\" value=\"1\">\r\n");
      out.write("                                            <label class=\"form-check-label\" for=\"inlineRadio2\">Quản Lý</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-3\">\r\n");
      out.write("                                                <label class=\"form-check-label\" for=\"EmployeStoreId\">Cửa Hàng</label>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                <select class=\"form-select form-select-sm\" id=\"EmployeStoreId\"  name=\"EmployeStoreId\" aria-label=\"Default select example\">\r\n");
      out.write("                                                    \r\n");
      out.write("                                                    <option value=\"1\">1</option>\r\n");
      out.write("                                                    <option value=\"2\">2</option>\r\n");
      out.write("                                                    <option value=\"3\">3</option>\r\n");
      out.write("                                                    <option value=\"4\">4</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-3\">\r\n");
      out.write("                                                <div class=\"form-check form-switch\">\r\n");
      out.write("                                                    <label class=\"form-check-label\" for=\"flexSwitchCheckChecked\">Trạng Thái</label>\r\n");
      out.write("                                                    <input style=\"margin-left: 15px\" class=\"form-check-input\" type=\"checkbox\" name=\"EmployeeStatus\" role=\"switch\" id=\"flexSwitchCheckChecked\" checked>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </br>\r\n");
      out.write("                                        <button type=\"submit\" name=\"submitAddEmployee\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- End of Main Content -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Footer -->\r\n");
      out.write("                    <footer class=\"sticky-footer bg-white\">\r\n");
      out.write("                        <div class=\"container my-auto\">\r\n");
      out.write("                            <div class=\"copyright text-center my-auto\">\r\n");
      out.write("                                <span>Copyright &copy; Your Website 2021</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </footer>\r\n");
      out.write("                    <!-- End of Footer -->\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- End of Page Wrapper -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Scroll to Top Button-->\r\n");
      out.write("            <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("                <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!-- Logout Modal-->\r\n");
      out.write("            <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("                 aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\r\n");
      out.write("                            <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                <span aria-hidden=\"true\">×</span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                            <a class=\"btn btn-primary\" href=\"");
      out.print( request.getContextPath());
      out.write("/LoginServlet\"\">Logout</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core JavaScript    mainDashboard        -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Core plugin JavaScript-->\r\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom scripts for all pages-->\r\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page level plugins -->\r\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page level custom scripts -->\r\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/demo/chart-pie-demo.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}