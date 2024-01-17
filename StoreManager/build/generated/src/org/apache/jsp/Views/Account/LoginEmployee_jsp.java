package org.apache.jsp.Views.Account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("              ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>login</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath());
      out.write("/css/login.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        <section class=\" gradient-form\" style=\"background-color: #eee;\">\r\n");
      out.write("            <div class=\"container h-100\">\r\n");
      out.write("                <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("                    <div class=\"col-xl-10\">\r\n");
      out.write("                        <div class=\"card rounded-3 text-black\">\r\n");
      out.write("                            <div class=\"row g-0\">\r\n");
      out.write("                                <div class=\"col-lg-6\">\r\n");
      out.write("                                    <div class=\"card-body p-md-5 mx-md-4\">\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"text-center\">\r\n");
      out.write("                                            <img src=\"");
      out.print( request.getContextPath());
      out.write("/img/cake-food-logo.png\"\r\n");
      out.write("                                                 style=\"width: 100px;\" alt=\"logo\">\r\n");
      out.write("                                            <h4 class=\"mt-1 mb-5 pb-1\">Administrator Login</h4>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <form action=\"");
      out.print( request.getContextPath());
      out.write("/LoginServlet\" method=\"POST\">\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            <div class=\"form-outline mb-4\">\r\n");
      out.write("                                                <label class=\"form-label\" for=\"form2Example11\">Username</label>\r\n");
      out.write("                                                <input type=\"text\" id=\"form2Example11\" class=\"form-control\" name=\"username\"\r\n");
      out.write("                                                       placeholder=\"Enter Username or Email\" />\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-outline mb-4\">\r\n");
      out.write("                                                <label class=\"form-label\" for=\"form2Example22\">Password</label>\r\n");
      out.write("                                                <input type=\"password\" id=\"form2Example22\" class=\"form-control\" placeholder=\"Enter Password\" name=\"password\"/>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"text-center pt-1 mb-5 pb-1\">\r\n");
      out.write("                                                <button name=\"EmployeeLogin\" class=\"btn btn-primary btn-block fa-lg gradient-custom-2 mb-3\" type=\"submit\">Login</button>\r\n");
      out.write("                                                \r\n");
      out.write("                                              \r\n");
      out.write("                                                \r\n");
      out.write("                                                      \r\n");
      out.write("    </a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                         \r\n");
      out.write("                                        </form>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-lg-6 d-flex align-items-center gradient-custom-2\">\r\n");
      out.write("                                    <div class=\"text-white px-3 py-4 p-md-5 mx-md-4\">\r\n");
      out.write("                                        <img src=\"");
      out.print( request.getContextPath());
      out.write("/img/cake-food-logo.png\"\r\n");
      out.write("                                             style=\"\" alt=\"logo\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty error_message}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <div class=\"alert alert-danger\" role=\"alert\">\r\n");
        out.write("                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error_message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
