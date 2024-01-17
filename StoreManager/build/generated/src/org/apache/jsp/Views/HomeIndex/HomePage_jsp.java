package org.apache.jsp.Views.HomeIndex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("     <link href=\"");
      out.print( request.getContextPath());
      out.write("/img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("    <!-- Google Web Fonts -->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Oswald:wght@500;600;700&family=Pacifico&display=swap\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("    <!-- Icon Font Stylesheet -->\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Libraries Stylesheet -->\n");
      out.write("    <link href=\"");
      out.print( request.getContextPath());
      out.write("/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("    <link href=\"");
      out.print( request.getContextPath());
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Template Stylesheet -->\n");
      out.write("    <link href=\"");
      out.print( request.getContextPath());
      out.write("/css/style.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ProductType1 !=null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("    <!-- Topbar Start -->\n");
          out.write("    <div class=\"container-fluid px-0 d-none d-lg-block\">\n");
          out.write("        <div class=\"row gx-0\">\n");
          out.write("            <div class=\"col-lg-4 text-center bg-secondary py-3\">\n");
          out.write("                <div class=\"d-inline-flex align-items-center justify-content-center\">\n");
          out.write("                    <i class=\"bi bi-envelope fs-1 text-primary me-3\"></i>\n");
          out.write("                    <div class=\"text-start\">\n");
          out.write("                        <h6 class=\"text-uppercase mb-1\">Email Us</h6>\n");
          out.write("                        <span>info@example.com</span>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"col-lg-4 text-center bg-primary border-inner py-3\">\n");
          out.write("                <div class=\"d-inline-flex align-items-center justify-content-center\">\n");
          out.write("                    <a href=\"index.html\" class=\"navbar-brand\">\n");
          out.write("                        <h1 class=\"m-0 text-uppercase text-white\"><i class=\"fa fa-birthday-cake fs-1 text-dark me-3\"></i>CakeZone</h1>\n");
          out.write("                    </a>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"col-lg-4 text-center bg-secondary py-3\">\n");
          out.write("                <div class=\"d-inline-flex align-items-center justify-content-center\">\n");
          out.write("                    <i class=\"bi bi-phone-vibrate fs-1 text-primary me-3\"></i>\n");
          out.write("                    <div class=\"text-start\">\n");
          out.write("                        <h6 class=\"text-uppercase mb-1\">Call Us</h6>\n");
          out.write("                        <span>+012 345 6789</span>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <!-- Topbar End -->\n");
          out.write("\n");
          out.write("\n");
          out.write("    <!-- Navbar Start -->\n");
          out.write("    <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark shadow-sm py-3 py-lg-0 px-3 px-lg-0\">\n");
          out.write("        <a href=\"index.html\" class=\"navbar-brand d-block d-lg-none\">\n");
          out.write("            <h1 class=\"m-0 text-uppercase text-white\"><i class=\"fa fa-birthday-cake fs-1 text-primary me-3\"></i>CakeZone</h1>\n");
          out.write("        </a>\n");
          out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
          out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
          out.write("        </button>\n");
          out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
          out.write("            <div class=\"navbar-nav ms-auto mx-lg-auto py-0\">\n");
          out.write("                <a href=\"");
          out.print( request.getContextPath());
          out.write("/IndexController\" class=\"nav-item nav-link active\">Home</a>\n");
          out.write("                <a href=\"");
          out.print( request.getContextPath());
          out.write("/ProductPageController\" class=\"nav-item nav-link\">Menu & Pricing</a>\n");
          out.write("                \n");
          out.write("                <div class=\"nav-item dropdown\">\n");
          out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Thể Loại</a>\n");
          out.write("                    <div class=\"dropdown-menu m-0\">\n");
          out.write("                        <a href=\"");
          out.print( request.getContextPath());
          out.write("/ProductPageController\" class=\"dropdown-item\">Bánh Kem</a>\n");
          out.write("                        <a href=\"");
          out.print( request.getContextPath());
          out.write("/ProductPageController\" class=\"dropdown-item\">Bánh Khác</a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("          \n");
          out.write("                \n");
          out.write("                  \n");
          out.write("            </div>\n");
          out.write("           \n");
          out.write("        </div>\n");
          out.write("        <div style=\"margin-right:50px \" >\n");
          out.write("            ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_1.setPageContext(_jspx_page_context);
          _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
          _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
          if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                <a href=\"");
              out.print( request.getContextPath());
              out.write("/Views/Account/CustomerManager.jsp\" class=\"nav-item nav-link\" >Hello ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write(" <i class=\"fa fa-shopping-cart\"></i></a>\n");
              out.write("                \n");
              out.write("            ");
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
          out.write("                \n");
          out.write("           ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_2.setPageContext(_jspx_page_context);
          _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
          _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
          if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                <a href=\"");
              out.print( request.getContextPath());
              out.write("/Views/Account/Login.jsp\" class=\"nav-item nav-link\" >Login</a>\n");
              out.write("            ");
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
          out.write("        </div>\n");
          out.write("         \n");
          out.write("    </nav>\n");
          out.write("    <!-- Navbar End -->\n");
          out.write("\n");
          out.write("\n");
          out.write("    <!-- Hero Start -->\n");
          out.write("    <div class=\"container-fluid bg-primary py-5 mb-5 hero-header\">\n");
          out.write("        <div class=\"container py-5\">\n");
          out.write("            <div class=\"row justify-content-start\">\n");
          out.write("                <div class=\"col-lg-8 text-center text-lg-start\">\n");
          out.write("                    <h1 class=\"font-secondary text-primary mb-4\">Super Crispy</h1>\n");
          out.write("                    <h1 class=\"display-1 text-uppercase text-white mb-4\">CakeZone</h1>\n");
          out.write("                    <h1 class=\"text-uppercase text-white\">The Best Cake In London</h1>\n");
          out.write("                    <div class=\"d-flex align-items-center justify-content-center justify-content-lg-start pt-5\">\n");
          out.write("                        <a href=\"#\" class=\"btn btn-primary border-inner py-3 px-5 me-5\">Read More</a>\n");
          out.write("                        <button type=\"button\" class=\"btn-play\" data-bs-toggle=\"modal\"\n");
          out.write("                            data-src=\"https://www.youtube.com/embed/ad5_MXzibSM\" title=\"YouTube video player\" data-bs-target=\"#videoModal\">\n");
          out.write("                            <span></span>\n");
          out.write("                        </button>\n");
          out.write("                        <h5 class=\"font-weight-normal text-white m-0 ms-4 d-none d-sm-block\">Play Video</h5>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <!-- Hero End -->\n");
          out.write("\n");
          out.write("\n");
          out.write("    <!-- Video Modal Start -->\n");
          out.write("    <div class=\"modal fade\" id=\"videoModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
          out.write("        <div class=\"modal-dialog\">\n");
          out.write("            <div class=\"modal-content rounded-0\">\n");
          out.write("                <div class=\"modal-header\">\n");
          out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Youtube Video</h5>\n");
          out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"modal-body\">\n");
          out.write("                    <!-- 16:9 aspect ratio -->\n");
          out.write("                    <div class=\"ratio ratio-16x9\">\n");
          out.write("                        <iframe class=\"embed-responsive-item\" src=\"\" id=\"video\" allowfullscreen allowscriptaccess=\"always\"\n");
          out.write("                            allow=\"autoplay\"></iframe>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <!-- Video Modal End -->\n");
          out.write("\n");
          out.write("\n");
          out.write("    <!-- About Start -->\n");
          out.write("    <div class=\"container-fluid pt-5\">\n");
          out.write("        <div class=\"container\">\n");
          out.write("            <div class=\"section-title position-relative text-center mx-auto mb-5 pb-3\" style=\"max-width: 600px;\">\n");
          out.write("                <h2 class=\"text-primary font-secondary\">About Us</h2>\n");
          out.write("                <h1 class=\"display-4 text-uppercase\">Welcome To CakeZone</h1>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"row gx-5\">\n");
          out.write("                <div class=\"col-lg-5 mb-5 mb-lg-0\" style=\"min-height: 400px;\">\n");
          out.write("                    <div class=\"position-relative h-100\">\n");
          out.write("                        <img class=\"position-absolute w-100 h-100\" src=\"");
          out.print( request.getContextPath());
          out.write("/img/about.jpg\" style=\"object-fit: cover;\">\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-6 pb-5\">\n");
          out.write("                    <h4 class=\"mb-4\">Chocolate Cake preview</h4>\n");
          out.write("                    <p class=\"mb-5\">Make by 40% cacao and 10% surgar</p>\n");
          out.write("                    <div class=\"row g-5\">\n");
          out.write("                        <div class=\"col-sm-6\">\n");
          out.write("                            <div class=\"d-flex align-items-center justify-content-center bg-primary border-inner mb-4\" style=\"width: 90px; height: 90px;\">\n");
          out.write("                                <i class=\"fa fa-heartbeat fa-2x text-white\"></i>\n");
          out.write("                            </div>\n");
          out.write("                            <h4 class=\"text-uppercase\">100% Healthy</h4>\n");
          out.write("                            <p class=\"mb-0\">Best health food </p>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"col-sm-6\">\n");
          out.write("                            <div class=\"d-flex align-items-center justify-content-center bg-primary border-inner mb-4\" style=\"width: 90px; height: 90px;\">\n");
          out.write("                                <i class=\"fa fa-award fa-2x text-white\"></i>\n");
          out.write("                            </div>\n");
          out.write("                            <h4 class=\"text-uppercase\">Award Winning</h4>\n");
          out.write("                            <p class=\"mb-0\">Oscar Academy Awards and Nobel Prize </p>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <!-- About End -->\n");
          out.write("\n");
          out.write("\n");
          out.write("    <!-- Facts Start -->\n");
          out.write("    <div class=\"container-fluid bg-img py-5 mb-5\">\n");
          out.write("        <div class=\"container py-5\">\n");
          out.write("            <div class=\"row gx-5 gy-4\">\n");
          out.write("                <div class=\"col-lg-3 col-md-6\">\n");
          out.write("                    <div class=\"d-flex\">\n");
          out.write("                        <div class=\"bg-primary border-inner d-flex align-items-center justify-content-center mb-3\" style=\"width: 60px; height: 60px;\">\n");
          out.write("                            <i class=\"fa fa-star text-white\"></i>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"ps-4\">\n");
          out.write("                            <h6 class=\"text-primary text-uppercase\">Our Experience</h6>\n");
          out.write("                            <h1 class=\"display-5 text-white mb-0\" data-toggle=\"counter-up\">12345</h1>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-3 col-md-6\">\n");
          out.write("                    <div class=\"d-flex\">\n");
          out.write("                        <div class=\"bg-primary border-inner d-flex align-items-center justify-content-center mb-3\" style=\"width: 60px; height: 60px;\">\n");
          out.write("                            <i class=\"fa fa-users text-white\"></i>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"ps-4\">\n");
          out.write("                            <h6 class=\"text-primary text-uppercase\">Cake Specialist</h6>\n");
          out.write("                            <h1 class=\"display-5 text-white mb-0\" data-toggle=\"counter-up\">12345</h1>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-3 col-md-6\">\n");
          out.write("                    <div class=\"d-flex\">\n");
          out.write("                        <div class=\"bg-primary border-inner d-flex align-items-center justify-content-center mb-3\" style=\"width: 60px; height: 60px;\">\n");
          out.write("                            <i class=\"fa fa-check text-white\"></i>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"ps-4\">\n");
          out.write("                            <h6 class=\"text-primary text-uppercase\">Complete Project</h6>\n");
          out.write("                            <h1 class=\"display-5 text-white mb-0\" data-toggle=\"counter-up\">12345</h1>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-3 col-md-6\">\n");
          out.write("                    <div class=\"d-flex\">\n");
          out.write("                        <div class=\"bg-primary border-inner d-flex align-items-center justify-content-center mb-3\" style=\"width: 60px; height: 60px;\">\n");
          out.write("                            <i class=\"fa fa-mug-hot text-white\"></i>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"ps-4\">\n");
          out.write("                            <h6 class=\"text-primary text-uppercase\">Happy Clients</h6>\n");
          out.write("                            <h1 class=\"display-5 text-white mb-0\" data-toggle=\"counter-up\">12345</h1>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <!-- Facts End -->\n");
          out.write("\n");
          out.write("\n");
          out.write("    <!-- Products Start -->\n");
          out.write("    <div class=\"container-fluid about py-5\">\n");
          out.write("        <div class=\"container\">\n");
          out.write("            <div class=\"section-title position-relative text-center mx-auto mb-5 pb-3\" style=\"max-width: 600px;\">\n");
          out.write("                <h2 class=\"text-primary font-secondary\">Menu & Pricing</h2>\n");
          out.write("                <h1 class=\"display-4 text-uppercase\">Explore Our Cakes</h1>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"tab-class text-center\">\n");
          out.write("                <ul class=\"nav nav-pills d-inline-flex justify-content-center bg-dark text-uppercase border-inner p-4 mb-5\">\n");
          out.write("                    <li class=\"nav-item\">\n");
          out.write("                        <a class=\"nav-link text-white active\" data-bs-toggle=\"pill\" href=\"#tab-1\">Birthday</a>\n");
          out.write("                    </li>\n");
          out.write("                    <li class=\"nav-item\">\n");
          out.write("                        <a class=\"nav-link text-white\" data-bs-toggle=\"pill\" href=\"#tab-2\">Wedding</a>\n");
          out.write("                    </li>\n");
          out.write("                    <li class=\"nav-item\">\n");
          out.write("                        <a class=\"nav-link text-white\" data-bs-toggle=\"pill\" href=\"#tab-3\">Custom</a>\n");
          out.write("                    </li>\n");
          out.write("                </ul>\n");
          out.write("                <div class=\"tab-content\">\n");
          out.write("                    <div id=\"tab-1\" class=\"tab-pane fade show p-0 active\">\n");
          out.write("                        <div class=\"row g-3\">\n");
          out.write("                            \n");
          out.write("                          \n");
          out.write("                                \n");
          out.write("                            \n");
          out.write("                            ");
          if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                          \n");
          out.write("                            \n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                    <div id=\"tab-2\" class=\"tab-pane fade show p-0\">\n");
          out.write("                        <div class=\"row g-3\">\n");
          out.write("                            \n");
          out.write("                            \n");
          out.write("                            <!--hereeeeeeeeeeeeee -->\n");
          out.write("                            \n");
          out.write("                            ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("                            <!--hereeeeeeeeeeeeee -->\n");
          out.write("                            \n");
          out.write("                            \n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                    <div id=\"tab-3\" class=\"tab-pane fade show p-0\">\n");
          out.write("                        <div class=\"row g-3\">\n");
          out.write("                            \n");
          out.write("                            \n");
          out.write("                            \n");
          out.write("                            <!--hereeeeeeeeeeeeee -->\n");
          out.write("                            \n");
          out.write("                            \n");
          out.write("                            ");
          if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                           <!--hereeeeeeeeeeeeee --> \n");
          out.write("                            \n");
          out.write("                            \n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <!-- Products End -->\n");
          out.write("\n");
          out.write("\n");
          out.write("    <!-- Service Start -->\n");
          out.write("    <div class=\"container-fluid service position-relative px-5 mt-5\" style=\"margin-bottom: 135px;\">\n");
          out.write("        <div class=\"container\">\n");
          out.write("            <div class=\"row g-5\">\n");
          out.write("                <div class=\"col-lg-4 col-md-6\">\n");
          out.write("                    <div class=\"bg-primary border-inner text-center text-white p-5\">\n");
          out.write("                        <h4 class=\"text-uppercase mb-3\">Birthday Cake</h4>\n");
          out.write("                        <p>Ipsum ipsum clita erat amet dolor sit justo sea eirmod diam stet sit justo amet tempor amet kasd lorem dolor ipsum</p>\n");
          out.write("                        <a class=\"text-uppercase text-dark\" href=\"\">Read More <i class=\"bi bi-arrow-right\"></i></a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-4 col-md-6\">\n");
          out.write("                    <div class=\"bg-primary border-inner text-center text-white p-5\">\n");
          out.write("                        <h4 class=\"text-uppercase mb-3\">Wedding Cake</h4>\n");
          out.write("                        <p>Ipsum ipsum clita erat amet dolor sit justo sea eirmod diam stet sit justo amet tempor amet kasd lorem dolor ipsum</p>\n");
          out.write("                        <a class=\"text-uppercase text-dark\" href=\"\">Read More <i class=\"bi bi-arrow-right\"></i></a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-4 col-md-6\">\n");
          out.write("                    <div class=\"bg-primary border-inner text-center text-white p-5\">\n");
          out.write("                        <h4 class=\"text-uppercase mb-3\">Custom Cake</h4>\n");
          out.write("                        <p>Ipsum ipsum clita erat amet dolor sit justo sea eirmod diam stet sit justo amet tempor amet kasd lorem dolor ipsum</p>\n");
          out.write("                        <a class=\"text-uppercase text-dark\" href=\"\">Read More <i class=\"bi bi-arrow-right\"></i></a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-12 col-md-6 text-center\">\n");
          out.write("                    <h1 class=\"text-uppercase text-light mb-4\">30% Discount For This Summer</h1>\n");
          out.write("                    <a href=\"\" class=\"btn btn-primary border-inner py-3 px-5\">Order Now</a>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <!-- Service Start -->\n");
          out.write("\n");
          out.write("\n");
          out.write("    <!-- Team Start -->\n");
          out.write("    <div class=\"container-fluid py-5\">\n");
          out.write("        <div class=\"container\">\n");
          out.write("            <div class=\"section-title position-relative text-center mx-auto mb-5 pb-3\" style=\"max-width: 600px;\">\n");
          out.write("                <h2 class=\"text-primary font-secondary\">Team Members</h2>\n");
          out.write("                <h1 class=\"display-4 text-uppercase\">Our Master Chefs</h1>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"row g-5\">\n");
          out.write("                <div class=\"col-lg-4 col-md-6\">\n");
          out.write("                    <div class=\"team-item\">\n");
          out.write("                        <div class=\"position-relative overflow-hidden\">\n");
          out.write("                            <img class=\"img-fluid w-100\" src=\"");
          out.print( request.getContextPath());
          out.write("/img/team-1.jpg\" alt=\"\">\n");
          out.write("                            <div class=\"team-overlay w-100 h-100 position-absolute top-50 start-50 translate-middle d-flex align-items-center justify-content-center\">\n");
          out.write("                                <div class=\"d-flex align-items-center justify-content-start\">\n");
          out.write("                                    <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 mx-1\" href=\"#\"><i class=\"fab fa-twitter fw-normal\"></i></a>\n");
          out.write("                                    <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 mx-1\" href=\"#\"><i class=\"fab fa-facebook-f fw-normal\"></i></a>\n");
          out.write("                                    <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 mx-1\" href=\"#\"><i class=\"fab fa-linkedin-in fw-normal\"></i></a>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"bg-dark border-inner text-center p-4\">\n");
          out.write("                            <h4 class=\"text-uppercase text-primary\">Full Name</h4>\n");
          out.write("                            <p class=\"text-white m-0\">Designation</p>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-4 col-md-6\">\n");
          out.write("                    <div class=\"team-item\">\n");
          out.write("                        <div class=\"position-relative overflow-hidden\">\n");
          out.write("                            <img class=\"img-fluid w-100\" src=\"");
          out.print( request.getContextPath());
          out.write("/img/team-2.jpg\" alt=\"\">\n");
          out.write("                            <div class=\"team-overlay w-100 h-100 position-absolute top-50 start-50 translate-middle d-flex align-items-center justify-content-center\">\n");
          out.write("                                <div class=\"d-flex align-items-center justify-content-start\">\n");
          out.write("                                    <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 mx-1\" href=\"#\"><i class=\"fab fa-twitter fw-normal\"></i></a>\n");
          out.write("                                    <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 mx-1\" href=\"#\"><i class=\"fab fa-facebook-f fw-normal\"></i></a>\n");
          out.write("                                    <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 mx-1\" href=\"#\"><i class=\"fab fa-linkedin-in fw-normal\"></i></a>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"bg-dark border-inner text-center p-4\">\n");
          out.write("                            <h4 class=\"text-uppercase text-primary\">Full Name</h4>\n");
          out.write("                            <p class=\"text-white m-0\">Designation</p>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-4 col-md-6\">\n");
          out.write("                    <div class=\"team-item\">\n");
          out.write("                        <div class=\"position-relative overflow-hidden\">\n");
          out.write("                            <img class=\"img-fluid w-100\" src=\"");
          out.print( request.getContextPath());
          out.write("/img/team-3.jpg\" alt=\"\">\n");
          out.write("                            <div class=\"team-overlay w-100 h-100 position-absolute top-50 start-50 translate-middle d-flex align-items-center justify-content-center\">\n");
          out.write("                                <div class=\"d-flex align-items-center justify-content-start\">\n");
          out.write("                                    <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 mx-1\" href=\"#\"><i class=\"fab fa-twitter fw-normal\"></i></a>\n");
          out.write("                                    <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 mx-1\" href=\"#\"><i class=\"fab fa-facebook-f fw-normal\"></i></a>\n");
          out.write("                                    <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 mx-1\" href=\"#\"><i class=\"fab fa-linkedin-in fw-normal\"></i></a>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"bg-dark border-inner text-center p-4\">\n");
          out.write("                            <h4 class=\"text-uppercase text-primary\">Full Name</h4>\n");
          out.write("                            <p class=\"text-white m-0\">Designation</p>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <!-- Team End -->\n");
          out.write("\n");
          out.write("\n");
          out.write("    <!-- Offer Start -->\n");
          out.write("    <div class=\"container-fluid bg-offer my-5 py-5\">\n");
          out.write("        <div class=\"container py-5\">\n");
          out.write("            <div class=\"row gx-5 justify-content-center\">\n");
          out.write("                <div class=\"col-lg-7 text-center\">\n");
          out.write("                    <div class=\"section-title position-relative text-center mx-auto mb-4 pb-3\" style=\"max-width: 600px;\">\n");
          out.write("                        <h2 class=\"text-primary font-secondary\">Special Kombo Pack</h2>\n");
          out.write("                        <h1 class=\"display-4 text-uppercase text-white\">Super Crispy Cakes</h1>\n");
          out.write("                    </div>\n");
          out.write("                    <p class=\"text-white mb-4\">Eirmod sed tempor lorem ut dolores sit kasd ipsum. Dolor ea et dolore et at sea ea at dolor justo ipsum duo rebum sea. Eos vero eos vero ea et dolore eirmod et. Dolores diam duo lorem. Elitr ut dolores magna sit. Sea dolore sed et.</p>\n");
          out.write("                    <a href=\"\" class=\"btn btn-primary border-inner py-3 px-5 me-3\">Shop Now</a>\n");
          out.write("                    <a href=\"\" class=\"btn btn-dark border-inner py-3 px-5\">Read More</a>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <!-- Offer End -->\n");
          out.write("\n");
          out.write("\n");
          out.write("    <!-- Testimonial Start -->\n");
          out.write("    <!--  \n");
          out.write("    <div class=\"container-fluid py-5\">\n");
          out.write("        <div class=\"container\">\n");
          out.write("          <div class=\"row g-5\">\n");
          out.write("                <div class=\"col-lg-4 col-md-6\">\n");
          out.write("                    <div class=\"bg-primary border-inner text-center text-white p-5\">\n");
          out.write("                        <h4 class=\"text-uppercase mb-3\">Birthday Cake</h4>\n");
          out.write("                        <p>Ipsum ipsum clita erat amet dolor sit justo sea eirmod diam stet sit justo amet tempor amet kasd lorem dolor ipsum</p>\n");
          out.write("                        <a class=\"text-uppercase text-dark\" href=\"\">Read More <i class=\"bi bi-arrow-right\"></i></a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-4 col-md-6\">\n");
          out.write("                    <div class=\"bg-primary border-inner text-center text-white p-5\">\n");
          out.write("                        <h4 class=\"text-uppercase mb-3\">Wedding Cake</h4>\n");
          out.write("                        <p>Ipsum ipsum clita erat amet dolor sit justo sea eirmod diam stet sit justo amet tempor amet kasd lorem dolor ipsum</p>\n");
          out.write("                        <a class=\"text-uppercase text-dark\" href=\"\">Read More <i class=\"bi bi-arrow-right\"></i></a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-4 col-md-6\">\n");
          out.write("                    <div class=\"bg-primary border-inner text-center text-white p-5\">\n");
          out.write("                        <h4 class=\"text-uppercase mb-3\">Custom Cake</h4>\n");
          out.write("                        <p>Ipsum ipsum clita erat amet dolor sit justo sea eirmod diam stet sit justo amet tempor amet kasd lorem dolor ipsum</p>\n");
          out.write("                        <a class=\"text-uppercase text-dark\" href=\"\">Read More <i class=\"bi bi-arrow-right\"></i></a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-12 col-md-6 text-center\">\n");
          out.write("                    <h1 class=\"text-uppercase text-light mb-4\">30% Discount For This Summer</h1>\n");
          out.write("                    <a href=\"\" class=\"btn btn-primary border-inner py-3 px-5\">Order Now</a>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("     -->\n");
          out.write("    <!-- Testimonial End -->\n");
          out.write("    \n");
          out.write("\n");
          out.write("    <!-- Footer Start -->\n");
          out.write("    <div class=\"container-fluid bg-img text-secondary\" style=\"margin-top: 90px\">\n");
          out.write("        <div class=\"container\">\n");
          out.write("            <div class=\"row gx-5\">\n");
          out.write("                <div class=\"col-lg-4 col-md-6 mb-lg-n5\">\n");
          out.write("                    <div class=\"d-flex flex-column align-items-center justify-content-center text-center h-100 bg-primary border-inner p-4\">\n");
          out.write("                        <a href=\"index.html\" class=\"navbar-brand\">\n");
          out.write("                            <h1 class=\"m-0 text-uppercase text-white\"><i class=\"fa fa-birthday-cake fs-1 text-dark me-3\"></i>CakeZone</h1>\n");
          out.write("                        </a>\n");
          out.write("                        <p class=\"mt-3\">Lorem diam sit erat dolor elitr et, diam lorem justo labore amet clita labore stet eos magna sit. Elitr dolor eirmod duo tempor lorem, elitr clita ipsum sea. Nonumy rebum et takimata ea takimata amet gubergren, erat rebum magna lorem stet eos. Diam amet et kasd eos duo dolore no.</p>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-8 col-md-6\">\n");
          out.write("                    <div class=\"row gx-5\">\n");
          out.write("                        <div class=\"col-lg-4 col-md-12 pt-5 mb-5\">\n");
          out.write("                            <h4 class=\"text-primary text-uppercase mb-4\">Get In Touch</h4>\n");
          out.write("                            <div class=\"d-flex mb-2\">\n");
          out.write("                                <i class=\"bi bi-geo-alt text-primary me-2\"></i>\n");
          out.write("                                <p class=\"mb-0\">123 Street, New York, USA</p>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"d-flex mb-2\">\n");
          out.write("                                <i class=\"bi bi-envelope-open text-primary me-2\"></i>\n");
          out.write("                                <p class=\"mb-0\">info@example.com</p>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"d-flex mb-2\">\n");
          out.write("                                <i class=\"bi bi-telephone text-primary me-2\"></i>\n");
          out.write("                                <p class=\"mb-0\">+012 345 67890</p>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"d-flex mt-4\">\n");
          out.write("                                <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 me-2\" href=\"#\"><i class=\"fab fa-twitter fw-normal\"></i></a>\n");
          out.write("                                <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 me-2\" href=\"#\"><i class=\"fab fa-facebook-f fw-normal\"></i></a>\n");
          out.write("                                <a class=\"btn btn-lg btn-primary btn-lg-square border-inner rounded-0 me-2\" href=\"#\"><i class=\"fab fa-linkedin-in fw-normal\"></i></a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"col-lg-4 col-md-12 pt-0 pt-lg-5 mb-5\">\n");
          out.write("                            <h4 class=\"text-primary text-uppercase mb-4\">Quick Links</h4>\n");
          out.write("                            <div class=\"d-flex flex-column justify-content-start\">\n");
          out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Home</a>\n");
          out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>About Us</a>\n");
          out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Our Services</a>\n");
          out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Meet The Team</a>\n");
          out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Latest Blog</a>\n");
          out.write("                                <a class=\"text-secondary\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Contact Us</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"col-lg-4 col-md-12 pt-0 pt-lg-5 mb-5\">\n");
          out.write("                            <h4 class=\"text-primary text-uppercase mb-4\">Newsletter</h4>\n");
          out.write("                            <p>Amet justo diam dolor rebum lorem sit stet sea justo kasd</p>\n");
          out.write("                            <form action=\"\">\n");
          out.write("                                <div class=\"input-group\">\n");
          out.write("                                    <input type=\"text\" class=\"form-control border-white p-3\" placeholder=\"Your Email\">\n");
          out.write("                                    <button class=\"btn btn-primary\">Sign Up</button>\n");
          out.write("                                </div>\n");
          out.write("                            </form>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <div class=\"container-fluid text-secondary py-4\" style=\"background: #111111;\">\n");
          out.write("        <div class=\"container text-center\">\n");
          out.write("            <p class=\"mb-0\">&copy; <a class=\"text-white border-bottom\" href=\"#\">Your Site Name</a>. All Rights Reserved. \n");
          out.write("\t\t\t\n");
          out.write("\t\t\t<!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\n");
          out.write("\t\t\tDesigned by <a class=\"text-white border-bottom\" href=\"https://htmlcodex.com\">HTML Codex</a></p>\n");
          out.write("            <br>Distributed By: <a class=\"border-bottom\" href=\"https://themewagon.com\" target=\"_blank\">ThemeWagon</a>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <!-- Footer End -->\n");
          out.write("\n");
          out.write("\n");
          out.write("    <!-- Back to Top -->\n");
          out.write("    <a href=\"#\" class=\"btn btn-primary border-inner py-3 fs-4 back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\n");
          out.write("\n");
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
      out.write("     ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_3.setPageContext(_jspx_page_context);
      _jspx_th_c_if_3.setParent(null);
      _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ProductType1 ==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            ");

            String redirectURL = request.getContextPath()+"/IndexController";
                        
            response.sendRedirect(redirectURL);
            
          out.write("\n");
          out.write("\n");
          out.write("        ");
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
      out.write("    <!-- JavaScript Libraries -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/libs/easing/easing.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/libs/waypoints/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/libs/counterup/counterup.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/libs/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Template Javascript -->\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ProductType1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("list");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                            <div class=\"col-lg-6\">\n");
          out.write("                                <div class=\"d-flex h-100\">\n");
          out.write("                                    <div class=\"flex-shrink-0\">\n");
          out.write("                                        <img class=\"img-fluid\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_img()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 150px; height: 85px;\">\n");
          out.write("                                        <h4 class=\"bg-dark text-primary p-2 m-0\">$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4> \n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4\">\n");
          out.write("                                        <h5 class=\"text-uppercase\">Birthday Cake</h5>\n");
          out.write("                                        <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>  \n");
          out.write("                                        <span><a href=\"#\" >Go To Shop Now</a></span> \n");
          out.write("                                        \n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                           \n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ProductType2}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("list");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                            <div class=\"col-lg-6\">\n");
          out.write("                                <div class=\"d-flex h-100\">\n");
          out.write("                                    <div class=\"flex-shrink-0\">\n");
          out.write("                                        <img class=\"img-fluid\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_img()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 150px; height: 85px;\">\n");
          out.write("                                        <h4 class=\"bg-dark text-primary p-2 m-0\">$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4\">\n");
          out.write("                                        <h5 class=\"text-uppercase\">Wedding Cake</h5>\n");
          out.write("                                        <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        <span><a href=\"#\" >Go To Shop Now</a></span> \n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ProductType3}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("list");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \n");
          out.write("                            <div class=\"col-lg-6\">\n");
          out.write("                                <div class=\"d-flex h-100\">\n");
          out.write("                                    <div class=\"flex-shrink-0\">\n");
          out.write("                                        <img class=\"img-fluid\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_img()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 150px; height: 85px;\">\n");
          out.write("                                        <h4 class=\"bg-dark text-primary p-2 m-0\">$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4\">\n");
          out.write("                                        <h5 class=\"text-uppercase\">Custom Cake</h5>\n");
          out.write("                                        <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        <span><a href=\"#\" >Go To Shop Now</a></span> \n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            \n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
