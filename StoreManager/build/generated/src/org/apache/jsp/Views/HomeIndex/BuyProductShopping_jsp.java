package org.apache.jsp.Views.HomeIndex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BuyProductShopping_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <section class=\"p-4 p-md-5\" style=\"\n");
      out.write("    background-image: url(https://mdbcdn.b-cdn.net/img/Photos/Others/background3.webp);\n");
      out.write("  \">\n");
      out.write("  <div class=\"row d-flex justify-content-center\">\n");
      out.write("    <div class=\"col-md-10 col-lg-8 col-xl-5\">\n");
      out.write("      <div class=\"card rounded-3\">\n");
      out.write("        <div class=\"card-body p-4\">\n");
      out.write("          <div class=\"text-center mb-4\">\n");
      out.write("            <h3>Settings</h3>\n");
      out.write("            <h6>Payment</h6>\n");
      out.write("          </div>\n");
      out.write("          <form action=\"\">\n");
      out.write("            <p class=\"fw-bold mb-4 pb-2\">Saved cards:</p>\n");
      out.write("\n");
      out.write("            <div class=\"d-flex flex-row align-items-center mb-4 pb-1\">\n");
      out.write("              <img class=\"img-fluid\" src=\"https://img.icons8.com/color/48/000000/mastercard-logo.png\" />\n");
      out.write("              <div class=\"flex-fill mx-3\">\n");
      out.write("                <div class=\"form-outline\">\n");
      out.write("                  <input type=\"text\" id=\"formControlLgXc\" class=\"form-control form-control-lg\"\n");
      out.write("                    value=\"**** **** **** 3193\" />\n");
      out.write("                  <label class=\"form-label\" for=\"formControlLgXc\">Card Number</label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <a href=\"#!\">Remove card</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"d-flex flex-row align-items-center mb-4 pb-1\">\n");
      out.write("              <img class=\"img-fluid\" src=\"https://img.icons8.com/color/48/000000/visa.png\" />\n");
      out.write("              <div class=\"flex-fill mx-3\">\n");
      out.write("                <div class=\"form-outline\">\n");
      out.write("                  <input type=\"text\" id=\"formControlLgXs\" class=\"form-control form-control-lg\"\n");
      out.write("                    value=\"**** **** **** 4296\" />\n");
      out.write("                  <label class=\"form-label\" for=\"formControlLgXs\">Card Number</label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <a href=\"#!\">Remove card</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <p class=\"fw-bold mb-4\">Add new card:</p>\n");
      out.write("\n");
      out.write("            <div class=\"form-outline mb-4\">\n");
      out.write("              <input type=\"text\" id=\"formControlLgXsd\" class=\"form-control form-control-lg\"\n");
      out.write("                value=\"Anna Doe\" />\n");
      out.write("              <label class=\"form-label\" for=\"formControlLgXsd\">Cardholder's Name</label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row mb-4\">\n");
      out.write("              <div class=\"col-7\">\n");
      out.write("                <div class=\"form-outline\">\n");
      out.write("                  <input type=\"text\" id=\"formControlLgXM\" class=\"form-control form-control-lg\"\n");
      out.write("                    value=\"1234 5678 1234 5678\" />\n");
      out.write("                  <label class=\"form-label\" for=\"formControlLgXM\">Card Number</label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-3\">\n");
      out.write("                <div class=\"form-outline\">\n");
      out.write("                  <input type=\"password\" id=\"formControlLgExpk\" class=\"form-control form-control-lg\"\n");
      out.write("                    placeholder=\"MM/YYYY\" />\n");
      out.write("                  <label class=\"form-label\" for=\"formControlLgExpk\">Expire</label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-2\">\n");
      out.write("                <div class=\"form-outline\">\n");
      out.write("                  <input type=\"password\" id=\"formControlLgcvv\" class=\"form-control form-control-lg\"\n");
      out.write("                    placeholder=\"Cvv\" />\n");
      out.write("                  <label class=\"form-label\" for=\"formControlLgcvv\">Cvv</label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button class=\"btn btn-success btn-lg btn-block\">Add card</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("    </body>\n");
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
}
