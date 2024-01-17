package org.apache.jsp.Views.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import DAO.EmployeeDAO;
import Model.Customer;
import Model.Employee;

public final class EditProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("             <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("                    <!-- Sidebar - Brand -->\n");
      out.write("                   \n");
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
          out.write("                             <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"");
          out.print( request.getContextPath());
          out.write("/AdminController?username=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                          \n");
          out.write("                        ");
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
      out.write("                                 ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_1.setPageContext(_jspx_page_context);
      _jspx_th_c_if_1.setParent(null);
      _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                             <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"");
          out.print( request.getContextPath());
          out.write("/EmployeeController?username=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                          \n");
          out.write("                        ");
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
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("                            <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"sidebar-brand-text mx-3\">");
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
      out.write("                        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_2.setPageContext(_jspx_page_context);
      _jspx_th_c_if_2.setParent(null);
      _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                             <a class=\"nav-link\" href=\"");
          out.print( request.getContextPath());
          out.write("/AdminController?username=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                          \n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      out.write("\n");
      out.write("                                 ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_3.setPageContext(_jspx_page_context);
      _jspx_th_c_if_3.setParent(null);
      _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                             <a class=\"nav-link\" href=\"");
          out.print( request.getContextPath());
          out.write("/EmployeeController?username=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                          \n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      out.write("\n");
      out.write("                          <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
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
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_4.setPageContext(_jspx_page_context);
      _jspx_th_c_if_4.setParent(null);
      _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                         <!-- Nav Item - Utilities Collapse Menu -->\n");
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
          out.write("/ListCustomer\" >Khách Hàng</a>\n");
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </li>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      out.write("\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_5.setPageContext(_jspx_page_context);
      _jspx_th_c_if_5.setParent(null);
      _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
          out.write("                   \n");
          out.write("                    \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
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
      out.write("/orderCustomerController\" >Đơn Hàng  Chờ</a>\n");
      out.write("                                <a class=\"collapse-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/successCustomerOrderController\" >Đơn Hàng Đã Xử Lý</a>\n");
      out.write("                                <a class=\"collapse-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/orderController\" >Đơn Hàng Guest </a>\n");
      out.write("                                <a class=\"collapse-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/successOrderController\" >Đơn Hàng Guest Đã Xử Lý</a>\n");
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
      out.write("            <!-- End of Sidebar -->\n");
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
      out.write("                        \n");
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
      out.write("&&Role=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Profile\n");
      out.write("                                    </a>\n");
      out.write("                                 \n");
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
      out.write("                    <!-- Begin Page Content -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"container-fluid\" id=\"EmployeeInsert\" style=\"display: block\" >\n");
      out.write("                        <h1>Thông Tin Sản Phẩm</h1>\n");
      out.write("                        <h4 style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error_message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-7\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("                                <form action=\"");
      out.print( request.getContextPath());
      out.write("/EditProductController\" method=\"post\">\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"productName\" class=\"form-label\">Product Name</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"productId\" required hidden>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getProduct_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"productName\" required placeholder=\"Enter Product Name\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"productDescription\" class=\"form-label\">Description</label>\n");
      out.write("                                        <input type=\"text\" name=\"productDescription\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required placeholder=\"Product Description\" class=\"form-control\" >\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"productPrice\" class=\"form-label\">Price</label>\n");
      out.write("                                        <input type=\"number\" name=\"productPrice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required placeholder=\"Product Price\" class=\"form-control\" >\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                                            <div class=\"col-7\" id=\"imageLink\"> \n");
      out.write("                                                <div class=\"form-check\">\n");
      out.write("\n");
      out.write("                                                    <label class=\"form-check-label\" for=\"flexRadioDefault1\">\n");
      out.write("                                                        Image Link\n");
      out.write("                                                    </label>\n");
      out.write("                                                    <input class=\"form-check-input\" style=\"margin-left:5px\" type=\"radio\" name=\"flexRadioDefault\" id=\"flexRadioDefault1\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <input   id=\"image-input\"   class=\"form-control\" readonly  required placeholder=\"Enter link image\" type=\"text\"/>\n");
      out.write("                                                <input name=\"productImage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getProduct_img()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"image-final\" hidden  class=\"form-control\"   type=\"text\"/>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"col-5\"> \n");
      out.write("                                                <div class=\"form-check\">\n");
      out.write("\n");
      out.write("                                                    <label class=\"form-check-label\" for=\"flexRadioDefault2\">\n");
      out.write("                                                        Choose File\n");
      out.write("                                                    </label>\n");
      out.write("                                                    <input class=\"form-check-input\" style=\"margin-left:5px\" type=\"radio\" name=\"flexRadioDefault\" id=\"flexRadioDefault2\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <input name=\"productImage\" readonly id=\"image-upload\" disabled  class=\"form-control\" type=\"file\"/>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getProduct_img()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  id=\"image-preview\" width=\"250\" height=\"200\" alt=\"product\"/>\n");
      out.write("                                    </div>    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-3\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <select class=\"form-select form-select-sm\" name=\"productType\"  >\n");
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <option value=\"1\">Birthday Cake</option>\n");
      out.write("                                                <option value=\"2\">Wedding Cake</option>\n");
      out.write("                                                <option value=\"3\">Custom Cake</option>\n");
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-3\">\n");
      out.write("                                        <div class=\"form-check form-switch\">\n");
      out.write("                                            <label class=\"form-check-label\" for=\"flexSwitchCheckChecked\">Trạng Thái</label>\n");
      out.write("                                            <input style=\"margin-left: 15px\" class=\"form-check-input\" type=\"checkbox\" name=\"productStatus\" role=\"switch\" id=\"flexSwitchCheckChecked\" \n");
      out.write("                                                   ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                   >\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </br>\n");
      out.write("                                    <button type=\"submit\" name=\"submitUpdateProduct\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                    <a class=\"btn btn-danger\" href=\"");
      out.print( request.getContextPath());
      out.write("/EditProductController?proID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Delete</a>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
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
      out.write("                        <a class=\"btn btn-primary\" href=\"");
      out.print( request.getContextPath());
      out.write("/LoginServlet\">Logout</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("     <script>\n");
      out.write("\n");
      out.write("const input = document.getElementById('image-input');\n");
      out.write("const preview = document.getElementById('image-preview');\n");
      out.write("const upload = document.getElementById('image-upload');\n");
      out.write("const finalInput = document.getElementById('image-final');\n");
      out.write("\n");
      out.write("input.addEventListener('paste', (event) => {\n");
      out.write("  const url = event.clipboardData.getData('text');\n");
      out.write("  preview.src = url;\n");
      out.write("  finalInput.value=url;\n");
      out.write("});\n");
      out.write("input.addEventListener('input', (event) => {\n");
      out.write("  const url = event.target.value;\n");
      out.write("  preview.src = url;\n");
      out.write("  finalInput.value=url;\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("upload.addEventListener('change', () => {\n");
      out.write("  const file = upload.files[0];\n");
      out.write("  const reader = new FileReader();\n");
      out.write("\n");
      out.write("  reader.addEventListener('load', () => {\n");
      out.write("    preview.src = reader.result;\n");
      out.write("    finalInput.value=reader.result;\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  if (file) {\n");
      out.write("    reader.readAsDataURL(file);\n");
      out.write("  }\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  var myRadio1 = document.getElementById(\"flexRadioDefault1\");\n");
      out.write("\n");
      out.write("  var myRadio2 = document.getElementById(\"flexRadioDefault2\");\n");
      out.write("\n");
      out.write("\n");
      out.write("  myRadio1.addEventListener(\"click\", function() {\n");
      out.write("    upload.setAttribute(\"readonly\", true);\n");
      out.write("    input.removeAttribute(\"readonly\");\n");
      out.write("    document.getElementById(\"image-upload\").disabled = true;\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  myRadio2.addEventListener(\"click\", function() {\n");
      out.write("    input.setAttribute(\"readonly\", true);\n");
      out.write("    upload.removeAttribute(\"readonly\");\n");
      out.write("    document.getElementById(\"image-upload\").disabled = false;\n");
      out.write("  });\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    \n");
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

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getProduct_type()==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getProduct_type()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" selected>Birthday Cake</option>\n");
        out.write("                                                ");
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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getProduct_type()==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getProduct_type()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" selected>Wedding Cake</option>\n");
        out.write("                                                ");
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
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getProduct_type()==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getProduct_type()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" selected>Custom Cake</option>\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productInfor.getStatus()==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                                       checked\n");
        out.write("                                                   ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }
}
