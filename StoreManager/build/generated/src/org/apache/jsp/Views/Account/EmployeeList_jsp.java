package org.apache.jsp.Views.Account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import DAO.EmployeeDAO;
import Model.Customer;
import Model.Employee;

public final class EmployeeList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>SB Admin 2 - Dashboard</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"");
      out.print( request.getContextPath());
      out.write("/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"");
      out.print( request.getContextPath());
      out.write("/css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("   \n");
      out.write(" \n");
      out.write("          \n");
      out.write(" \n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("              <!-- Sidebar -->\n");
      out.write("                <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("                    <!-- Sidebar - Brand -->\n");
      out.write("                    <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"");
      out.print( request.getContextPath());
      out.write("/Views/Account/Admin.jsp\">\n");
      out.write("                        <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("                            <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"sidebar-brand-text mx-3\">Admin ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <!-- Divider -->\n");
      out.write("                    <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("                    <!-- Nav Item - Dashboard -->\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("                            <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("                            <span>Dashboard</span></a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <!-- Divider -->\n");
      out.write("                    <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("                    <!-- Heading -->\n");
      out.write("                    <div class=\"sidebar-heading\">\n");
      out.write("                        Interface\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        \n");
          out.write("                     \n");
          out.write("                    <!-- Nav Item - Pages Collapse Menu -->\n");
          out.write("                    <li class=\"nav-item\">\n");
          out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"\n");
          out.write("                           aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
          out.write("                            <i class=\"fas fa-dollar-sign\"></i>\n");
          out.write("                            <span>Doanh Thu</span>\n");
          out.write("                        </a>\n");
          out.write("                        <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
          out.write("                            <div class=\"bg-white py-2 collapse-inner rounded\">\n");
          out.write("                                <h6 class=\"collapse-header\">Doanh Thu</h6>\n");
          out.write("                                <a class=\"collapse-item\" href=\"");
          out.print( request.getContextPath());
          out.write("/salaryController\">Đơn Hàng</a>\n");
          out.write("                              \n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </li>\n");
          out.write("                    \n");
          out.write("                     <!-- Nav Item - Utilities Collapse Menu -->\n");
          out.write("                    <li class=\"nav-item\">\n");
          out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilitiesStore\"\n");
          out.write("                           aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n");
          out.write("                            <i class=\"fas fa-user\"></i>\n");
          out.write("                            <span>Quản Lý Cửa Hàng</span>\n");
          out.write("                        </a>\n");
          out.write("                        <div id=\"collapseUtilitiesStore\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\n");
          out.write("                             data-parent=\"#accordionSidebar\">\n");
          out.write("                            <div class=\"bg-white py-2 collapse-inner rounded\">\n");
          out.write("                                <h6 class=\"collapse-header\">Đơn Hàng</h6>\n");
          out.write("                                <a class=\"collapse-item\" href=\"");
          out.print( request.getContextPath());
          out.write("/StoreController\" >Xem Cửa Hàng</a>\n");
          out.write("                      \n");
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </li>\n");
          out.write("                    \n");
          out.write("\n");
          out.write("                    <!-- Nav Item - Utilities Collapse Menu -->\n");
          out.write("                    <li class=\"nav-item\">\n");
          out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\n");
          out.write("                           aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n");
          out.write("                            <i class=\"fas fa-user\"></i>\n");
          out.write("                            <span>Quản Lý Tài khoản</span>\n");
          out.write("                        </a>\n");
          out.write("                        <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\n");
          out.write("                             data-parent=\"#accordionSidebar\">\n");
          out.write("                            <div class=\"bg-white py-2 collapse-inner rounded\">\n");
          out.write("                                <h6 class=\"collapse-header\">Account</h6>\n");
          out.write("                                <a class=\"collapse-item\" href=\"");
          out.print( request.getContextPath());
          out.write("/EmployeeList\" >Nhân Viên</a>\n");
          out.write("                      \n");
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </li>\n");
          out.write("                    \n");
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
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwoSP\"\n");
      out.write("                           aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("                            <i class=\"fas fa-eye\"></i>\n");
      out.write("                            <span>Quản Lý Sản Phẩm</span>\n");
      out.write("                        </a>\n");
      out.write("                        <div id=\"collapseTwoSP\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("                            <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                                <h6 class=\"collapse-header\">Sản Phẩm</h6>\n");
      out.write("                                <a class=\"collapse-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/ProductList\">Product</a>\n");
      out.write("                                  <a class=\"collapse-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/CategoryController\">Category</a>\n");
      out.write("                                  \n");
      out.write("                                \n");
      out.write("                              \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <!-- Nav Item - Utilities Collapse Menu -->\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilitiesDH\"\n");
      out.write("                           aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n");
      out.write("                            <i class=\"fas fa-user\"></i>\n");
      out.write("                            <span>Quản Lý Đơn Hàng</span>\n");
      out.write("                        </a>\n");
      out.write("                        <div id=\"collapseUtilitiesDH\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\n");
      out.write("                             data-parent=\"#accordionSidebar\">\n");
      out.write("                            <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                                <h6 class=\"collapse-header\">Đơn Hàng</h6>\n");
      out.write("                                <a class=\"collapse-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/orderController\" >Đơn Hàng Chờ</a>\n");
      out.write("                                <a class=\"collapse-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/successOrderController\" >Đơn Hàng Đã Xử Lý</a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                    <!-- Divider -->\n");
      out.write("                    <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("                  \n");
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                 \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper -->\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <div id=\"content\">\n");
      out.write("\n");
      out.write("                    <!-- Topbar -->\n");
      out.write("                    <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("                        <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                        <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <!-- Topbar Search -->\n");
      out.write("                        <form\n");
      out.write("                            class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\"\n");
      out.write("                                       aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("                                <div class=\"input-group-append\">\n");
      out.write("                                    <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                        <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <!-- Topbar Navbar -->\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow d-sm-none\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\"\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fas fa-search fa-fw\"></i>\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - Messages -->\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\"\n");
      out.write("                                     aria-labelledby=\"searchDropdown\">\n");
      out.write("                                    <form class=\"form-inline mr-auto w-100 navbar-search\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control bg-light border-0 small\"\n");
      out.write("                                                   placeholder=\"Search for...\" aria-label=\"Search\"\n");
      out.write("                                                   aria-describedby=\"basic-addon2\">\n");
      out.write("                                            <div class=\"input-group-append\">\n");
      out.write("                                                <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                                    <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - Alerts -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\"\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fas fa-bell fa-fw\"></i>\n");
      out.write("                                    <!-- Counter - Alerts -->\n");
      out.write("                                    <span class=\"badge badge-danger badge-counter\">3+</span>\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - Alerts -->\n");
      out.write("                                <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                     aria-labelledby=\"alertsDropdown\">\n");
      out.write("                                    <h6 class=\"dropdown-header\">\n");
      out.write("                                        Alerts Center\n");
      out.write("                                    </h6>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"mr-3\">\n");
      out.write("                                            <div class=\"icon-circle bg-primary\">\n");
      out.write("                                                <i class=\"fas fa-file-alt text-white\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"small text-gray-500\">December 12, 2019</div>\n");
      out.write("                                            <span class=\"font-weight-bold\">A new monthly report is ready to download!</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"mr-3\">\n");
      out.write("                                            <div class=\"icon-circle bg-success\">\n");
      out.write("                                                <i class=\"fas fa-donate text-white\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"small text-gray-500\">December 7, 2019</div>\n");
      out.write("                                            $290.29 has been deposited into your account!\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"mr-3\">\n");
      out.write("                                            <div class=\"icon-circle bg-warning\">\n");
      out.write("                                                <i class=\"fas fa-exclamation-triangle text-white\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"small text-gray-500\">December 2, 2019</div>\n");
      out.write("                                            Spending Alert: We've noticed unusually high spending for your account.\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show All Alerts</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - Messages -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\"\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fas fa-envelope fa-fw\"></i>\n");
      out.write("                                    <!-- Counter - Messages -->\n");
      out.write("                                    <span class=\"badge badge-danger badge-counter\">7</span>\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - Messages -->\n");
      out.write("                                <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                     aria-labelledby=\"messagesDropdown\">\n");
      out.write("                                    <h6 class=\"dropdown-header\">\n");
      out.write("                                        Message Center\n");
      out.write("                                    </h6>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"");
      out.print( request.getContextPath());
      out.write("/img/undraw_profile_1.svg\"\n");
      out.write("                                                 alt=\"...\">\n");
      out.write("                                            <div class=\"status-indicator bg-success\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"font-weight-bold\">\n");
      out.write("                                            <div class=\"text-truncate\">Hi there! I am wondering if you can help me with a\n");
      out.write("                                                problem I've been having.</div>\n");
      out.write("                                            <div class=\"small text-gray-500\">Emily Fowler · 58m</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"");
      out.print( request.getContextPath());
      out.write("/img/undraw_profile_2.svg\"\n");
      out.write("                                                 alt=\"...\">\n");
      out.write("                                            <div class=\"status-indicator\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"text-truncate\">I have the photos that you ordered last month, how\n");
      out.write("                                                would you like them sent to you?</div>\n");
      out.write("                                            <div class=\"small text-gray-500\">Jae Chun · 1d</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"");
      out.print( request.getContextPath());
      out.write("/img/undraw_profile_3.svg\"\n");
      out.write("                                                 alt=\"...\">\n");
      out.write("                                            <div class=\"status-indicator bg-warning\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"text-truncate\">Last month's report looks great, I am very happy with\n");
      out.write("                                                the progress so far, keep up the good work!</div>\n");
      out.write("                                            <div class=\"small text-gray-500\">Morgan Alvarez · 2d</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"https://source.unsplash.com/Mv9hjnEUHR4/60x60\"\n");
      out.write("                                                 alt=\"...\">\n");
      out.write("                                            <div class=\"status-indicator bg-success\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"text-truncate\">Am I a good boy? The reason I ask is because someone\n");
      out.write("                                                told me that people say this to all dogs, even if they aren't good...</div>\n");
      out.write("                                            <div class=\"small text-gray-500\">Chicken the Dog · 2w</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Read More Messages</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <div class=\"topbar-divider d-none d-sm-block\"></div>\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - User Information -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                    <img class=\"img-profile rounded-circle\"\n");
      out.write("                                         src=\"");
      out.print( request.getContextPath());
      out.write("/img/undraw_profile.svg\">\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - User Information -->\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                     aria-labelledby=\"userDropdown\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/ProfileController?ManagerUsername=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Profile\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                        <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Settings\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                        <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Activity Log\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                                        <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Logout\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </nav>\n");
      out.write("                    <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                    <!-- Begin Page Content \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <!--  Employee    -->\n");
      out.write("                    <div class=\"container-fluid\" id=\"listEmployee\" style=\"display: block\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div >\n");
      out.write("                            <h1>Danh Sách Nhân Viên</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-3\">\n");
      out.write("                                <a href=\"");
      out.print( request.getContextPath());
      out.write("/Views/Account/AddEmployee.jsp\" class=\"btn btn-success\" id=\"AddEmployee\"><i class=\"fa fa-plus\"></i> Thêm Nhân Viên</a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-9\">\n");
      out.write("                                <form action=\"");
      out.print( request.getContextPath());
      out.write("/EmployeeList\" method=\"post\"> \n");
      out.write("                                    <div class=\"row\"> \n");
      out.write("                                        <div class=\"col-7\"> \n");
      out.write("                                            <input type=\"text\" name=\"searchEmployee\" id=\"inputSearch\" class=\"form-control\" placeholder=\"Tìm Kiếm Nhân Viên\">\n");
      out.write("                                        </div> \n");
      out.write("                                        <div class=\"col-3\"> \n");
      out.write("                                            <button type=\"submit\" name=\"submitSearch\" class=\"btn btn-primary\">Search</button>\n");
      out.write("                                        </div> \n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">#</th>\n");
      out.write("                                    <th scope=\"col\">Họ Tên</th>\n");
      out.write("                                    <th scope=\"col\">Email</th>\n");
      out.write("                                    <th scope=\"col\">SÐT</th>\n");
      out.write("                                    <th scope=\"col\">Ngày Bắt Đầu</th>\n");
      out.write("                                    <th scope=\"col\">Trạng Thái</th>\n");
      out.write("                                    <th scope=\"col\">Chức Vụ</th>\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                   \n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");

                                int empCount=1;
                                
      out.write("\n");
      out.write("                                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("list");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\n");
            out.write("                                    <tr>\n");
            out.write("                                        <td>");
            out.print(empCount++);
            out.write("</td>\n");
            out.write("                                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getEmployee_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getStarted_date()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                        <td><div class=\"form-check form-switch\" >\n");
            out.write("                                                \n");
            out.write("                                                <input style=\"margin-left:   1px\" readonly disabled class=\"form-check-input\" type=\"checkbox\" name=\"EmployeeStatus\" role=\"switch\" id=\"flexSwitchCheckChecked\" \n");
            out.write("                                                       ");
            if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write(">\n");
            out.write("                                                       \n");
            out.write("                                            </div></td>\n");
            out.write("                                            <td>\n");
            out.write("                                                ");
            if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\n");
            out.write("                                                 ");
            if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\n");
            out.write("                                                 ");
            if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\n");
            out.write("                                            \n");
            out.write("                                            </td>\n");
            out.write("                                             ");
            if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\n");
            out.write("                                       \n");
            out.write("\n");
            out.write("\n");
            out.write("                                    </tr>\n");
            out.write("\n");
            out.write("                                ");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                                \n");
      out.write("                    <!----------------------------------  End Employee  --------------------------------------------->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write(" <div>\n");
      out.write("                                      <nav aria-label=\"Page navigation example\">\n");
      out.write("                            <ul class=\"pagination\">\n");
      out.write("                                 <li\n");
      out.write("                                    class=\"page-item ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                                     <a class=\"page-link\" name=\"myBTN\" href=\"EmployeeList?myBTN=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage - 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage - 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Previous</a></li>\n");
      out.write("                                        ");

                                        int pageNumber = Integer.parseInt(String.valueOf(session.getAttribute("pageNumber")));
                                  for (int i = 0; i < pageNumber; i++) {
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                <li\n");
      out.write("                                    class=\"page-item ");
if (Integer.parseInt(String.valueOf(session.getAttribute("currentPage"))) == i + 1) {
      out.write(" active ");
}
      out.write("\">\n");
      out.write("                                    <a  name=\"myBTN\" class=\"page-link\" href=\"EmployeeList?myBTN=");
      out.print(i + 1);
      out.write("\" value=\"");
      out.print(i + 1);
      out.write('"');
      out.write('>');
      out.print(i + 1);
      out.write("</a></li>\n");
      out.write("                                        ");

                                        }
                                        
      out.write("\n");
      out.write("                                <li\n");
      out.write("                                    class=\"page-item ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                                    <a class=\"page-link\" name=\"myBTN\" href=\"EmployeeList?myBTN=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Next</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                                </div>\n");
      out.write("                <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("                <!-- Footer -->\n");
      out.write("                <footer class=\"sticky-footer bg-white\">\n");
      out.write("                    <div class=\"container my-auto\">\n");
      out.write("                        <div class=\"copyright text-center my-auto\">\n");
      out.write("                            <span>Copyright &copy; Your Website 2021</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("                <!-- End of Footer -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("        <!-- Scroll to Top Button-->\n");
      out.write("        <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("            <i class=\"fas fa-angle-up\"></i>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <!-- Logout Modal-->\n");
      out.write("        <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("             aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                        <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">×</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                        <a class=\"btn btn-primary\" href=\"LoginServlet\">Logout</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript    mainDashboard        -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom scripts for all pages-->\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page level plugins -->\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page level custom scripts -->\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/demo/chart-area-demo.js\"></script>\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/demo/chart-pie-demo.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                     <th scope=\"col\">Chi Tiết</th>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getStatus()==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                                       checked\n");
        out.write("                                                       ");
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getRole()==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    Nhân Viên\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getRole()==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                   Quản Lý\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getRole()==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    Shipper\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                      <td><a href=\"EditEmployeeController?EmpId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getEmployee_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Xem</a></td>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage <=1 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  disabled");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage ==pageNumber}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  disabled");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }
}
