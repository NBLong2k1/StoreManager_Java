package org.apache.jsp.Views.Account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Customer;
import java.util.ArrayList;

public final class EmployeeManager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>Dashboard</title>\r\n");
      out.write("\r\n");
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
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("            <!-- Page Wrapper -->\r\n");
      out.write("            <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("                 <!-- Sidebar -->\r\n");
      out.write("                <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Sidebar - Brand -->\r\n");
      out.write("                    <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"");
      out.print( request.getContextPath());
      out.write("/EmployeeController?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                        <div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("                            <i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"sidebar-brand-text mx-3\">Employee ");
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
      out.write("/EmployeeController?username=");
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
      out.write("                    \r\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                         <!-- Nav Item - Utilities Collapse Menu -->\r\n");
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
          out.write("/ListCustomer\" >Khách Hàng</a>\r\n");
          out.write("\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </li>\r\n");
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
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_1.setPageContext(_jspx_page_context);
      _jspx_th_c_if_1.setParent(null);
      _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
          out.write("                   \r\n");
          out.write("                    \r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
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
      out.write("                  \r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("                 \r\n");
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
      out.write("                        <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("                            <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("                                <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                            </button>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Topbar Search -->\r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("                            <!-- Topbar Navbar -->\r\n");
      out.write("                            <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- Nav Item - Search Dropdown (Visible Only XS) -->\r\n");
      out.write("                                <li class=\"nav-item dropdown no-arrow d-sm-none\">\r\n");
      out.write("                                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\"\r\n");
      out.write("                                       data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                        <i class=\"fas fa-search fa-fw\"></i>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <!-- Dropdown - Messages -->\r\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\"\r\n");
      out.write("                                         aria-labelledby=\"searchDropdown\">\r\n");
      out.write("                                        <form class=\"form-inline mr-auto w-100 navbar-search\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control bg-light border-0 small\"\r\n");
      out.write("                                                       placeholder=\"Search for...\" aria-label=\"Search\"\r\n");
      out.write("                                                       aria-describedby=\"basic-addon2\">\r\n");
      out.write("                                                <div class=\"input-group-append\">\r\n");
      out.write("                                                    <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                                                        <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("                                       \r\n");
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
      out.write("                        <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Page Heading -->\r\n");
      out.write("                            <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Content Row -->\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- Earnings (Monthly) Card Example -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <!-- Earnings (Monthly) Card Example -->\r\n");
      out.write("                                <div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("                                    <div class=\"card border-left-success shadow h-100 py-2\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                                                <div class=\"col mr-2\">\r\n");
      out.write("                                                    <div class=\"text-xs font-weight-bold text-success text-uppercase mb-1\">\r\n");
      out.write("                                                        Earnings (Daily)</div>\r\n");
      out.write("                                                    <div class=\"h5 mb-0 font-weight-bold text-gray-800\">$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SumearningDaily}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-auto\">\r\n");
      out.write("                                                    <i class=\"fas fa-dollar-sign fa-2x text-gray-300\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Earnings (Monthly) Card Example -->\r\n");
      out.write("                                <div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("                                    <div class=\"card border-left-primary shadow h-100 py-2\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                                                <div class=\"col mr-2\">\r\n");
      out.write("                                                    <div class=\"text-xs font-weight-bold text-primary text-uppercase mb-1\">\r\n");
      out.write("                                                        Earnings Customer (Daily)</div>\r\n");
      out.write("                                                    <div class=\"h5 mb-0 font-weight-bold text-gray-800\">$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${earningDailyCustomer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-auto\">\r\n");
      out.write("                                                    <i class=\"fas fa-dollar-sign fa-2x text-gray-300\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <!-- Earnings (Monthly) Card Example -->\r\n");
      out.write("                                <div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("                                    <div class=\"card border-left-danger shadow h-100 py-2\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                                                <div class=\"col mr-2\">\r\n");
      out.write("                                                    <div class=\"text-xs font-weight-bold text-danger text-uppercase mb-1\">\r\n");
      out.write("                                                        Earnings Guest (Daily)</div>\r\n");
      out.write("                                                    <div class=\"h5 mb-0 font-weight-bold text-gray-800\">$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${earningGuestDaily}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-auto\">\r\n");
      out.write("                                                    <i class=\"fas fa-dollar-sign fa-2x text-gray-300\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Content Row -->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- Area Chart -->\r\n");
      out.write("                                <div class=\"col-xl-12 col-lg-12\">\r\n");
      out.write("                                    <div class=\"card shadow mb-4\">\r\n");
      out.write("                                        <!-- Card Header - Dropdown -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <!--------------------------------- End Customer   ---------------------------------------------->    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <!-- List Product  -->     \r\n");
      out.write("\r\n");
      out.write("                                        <!-- Card Body -->\r\n");
      out.write("                                        <div class=\"card-body\" id=\"listProduct\" style=\"display: block\">\r\n");
      out.write("                                            \r\n");
      out.write("                                           \r\n");
      out.write("                                                 <h1 style='display:inline'>Danh Sách Đơn Hàng Chờ Guest</h1>  \r\n");
      out.write("                                            <table class=\"table\">\r\n");
      out.write("                                                <thead>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th scope=\"col\">#</th>\r\n");
      out.write("                                                        <th scope=\"col\">Tên Khách Hàng</th>\r\n");
      out.write("                                                        <th scope=\"col\">Email</th>\r\n");
      out.write("                                                        <th scope=\"col\">SDT</th>\r\n");
      out.write("                                                        <th scope=\"col\">Trạng Thái</th>\r\n");
      out.write("                                                        <th scope=\"col\">Thời Gian</th>\r\n");
      out.write("                                                        <th scope=\"col\">Tổng Tiền</th>\r\n");
      out.write("                                                        <th scope=\"col\">Chi Tiết</th>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                </thead>\r\n");
      out.write("                                                <tbody>\r\n");
      out.write("\r\n");
      out.write("                                                   ");
int count=0;
      out.write("\r\n");
      out.write("                                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listprocessOrder}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("list");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write(" \r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("                                                        <tr>\r\n");
            out.write("                                                            <th scope=\"row\">");
            out.print(count++);
            out.write("</th>\r\n");
            out.write("                                                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getGuest_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                                            <td>\r\n");
            out.write("                                                                ");
            if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("                                                                ");
            if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("                                                              \r\n");
            out.write("                                                            </td>\r\n");
            out.write("\r\n");
            out.write("                                                            <td> ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getOrder_date()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getTotal_price()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                                            <td><a  href=\"processOrderDetailsController?guest_id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getOrder_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">Xem Chi Tiết</a></td>\r\n");
            out.write("                                                        </tr>\r\n");
            out.write("                                                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                </tbody>\r\n");
      out.write("                                            </table>\r\n");
      out.write("                                           \r\n");
      out.write("                                                \r\n");
      out.write("                                            \r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                                    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                      <nav aria-label=\"Page navigation example\">\r\n");
      out.write("                            <ul class=\"pagination\">\r\n");
      out.write("                                 <li\r\n");
      out.write("                                    class=\"page-item ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("                                     <a class=\"page-link\" name=\"myBTN\" href=\"EmployeeController?myBTN=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage - 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage - 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Previous</a></li>\r\n");
      out.write("                                        ");

                                        int pageNumber = Integer.parseInt(String.valueOf(session.getAttribute("pageNumber")));
                                  for (int i = 0; i < pageNumber; i++) {
                                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <li\r\n");
      out.write("                                    class=\"page-item ");
if (Integer.parseInt(String.valueOf(session.getAttribute("currentPage"))) == i + 1) {
      out.write(" active ");
}
      out.write("\">\r\n");
      out.write("                                    <a  name=\"myBTN\" class=\"page-link\" href=\"EmployeeController?myBTN=");
      out.print(i + 1);
      out.write("\" value=\"");
      out.print(i + 1);
      out.write('"');
      out.write('>');
      out.print(i + 1);
      out.write("</a></li>\r\n");
      out.write("                                        ");

                                        }
                                        
      out.write("\r\n");
      out.write("                                <li\r\n");
      out.write("                                    class=\"page-item ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("                                    <a class=\"page-link\" name=\"myBTN\" href=\"EmployeeController?myBTN=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Next</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Content Row -->\r\n");
      out.write("                 \r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.container-fluid -->\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
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
      out.write("/LoginServlet\">Logout</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Core plugin JavaScript-->\r\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom scripts for all pages-->\r\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page level plugins -->\r\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page level custom scripts -->\r\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/demo/chart-pie-demo.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getOrder_status()==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <a readonly class=\"btn btn-secondary\">Đang Chờ</a>\r\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getOrder_status()==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                     <a readonly class=\"btn btn-success\">Đang Tiến Hành</a>\r\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage <=1 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  disabled");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage ==pageNumber}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  disabled");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }
}
