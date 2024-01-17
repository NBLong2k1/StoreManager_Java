package org.apache.jsp.Views.HomeIndex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProductPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Shop Homepage - Start Bootstrap Template</title>\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"");
      out.print( request.getContextPath());
      out.write("/assets/favicon.ico\" />\n");
      out.write("        <!-- Bootstrap icons-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"");
      out.print( request.getContextPath());
      out.write("/cssForHomePage/styles.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!-- Navigation-->\n");
      out.write("     <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <div class=\"container px-4 px-lg-5\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"");
      out.print( request.getContextPath());
      out.write("/ProductPageController\">Bakery Store</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\" >\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"");
      out.print( request.getContextPath());
      out.write("/ProductPageController\">Home</a></li>\n");
      out.write("                      \n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Shop</a>\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/ProductPageController\">Popular Items</a></li>\n");
      out.write("                             \n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Category</a>\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/ProductSearchController?cate=1\">Birthday Cake</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/ProductSearchController?cate=2\">Wedding Cake</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print( request.getContextPath());
      out.write("/ProductSearchController?cate=3\">Custom Cake</a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <div style=\"margin-right:100px\">\n");
      out.write("\n");
      out.write("                        <form class=\"d-flex\" action=\"");
      out.print( request.getContextPath());
      out.write("/ProductSearchController\" method=\"post\">\n");
      out.write("\n");
      out.write("                      \n");
      out.write("                              <input class=\"form-control me-2 \" size=\"50\" name=\"searchString\"  type=\"search\" placeholder=\"Search Product\" aria-label=\"Search\">\n");
      out.write("\n");
      out.write("                           \n");
      out.write("\n");
      out.write("                         <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("                         \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("             ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                  <div class=\"d-flex\" style=\"float:right;margin-right:25px\"> <a class=\"btn btn-outline-dark\" href=\"");
          out.print( request.getContextPath());
          out.write("/ShowCustomerCart?customerUser=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"bi-cart-fill me-1\"></i>Cart <span class=\"badge bg-dark text-white ms-1 rounded-pill\"></span></a></div> \n");
          out.write("           \n");
          out.write("                <a href=\"");
          out.print( request.getContextPath());
          out.write("/CustomerManager?cusUsername=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Hello ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("            ");
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
      out.write("                ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_1.setPageContext(_jspx_page_context);
      _jspx_th_c_if_1.setParent(null);
      _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                     <div class=\"d-flex\" style=\"float:right;margin-right:25px\"> <a class=\"btn btn-outline-dark\" href=\"");
          out.print( request.getContextPath());
          out.write("/ShoppingCartController\"><i class=\"bi-cart-fill me-1\"></i>Cart <span class=\"badge bg-dark text-white ms-1 rounded-pill\"></span></a></div> \n");
          out.write("           \n");
          out.write("              <a href=\"");
          out.print( request.getContextPath());
          out.write("/Views/Account/Login.jsp\" style=\"margin-right: 20px;\" class=\"btn btn-outline-dark\">Login</a>\n");
          out.write("       \n");
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
      out.write("             \n");
      out.write("        </nav>\n");
      out.write("        <!-- Header-->\n");
      out.write("        <header class=\"bg-dark py-5\">\n");
      out.write("            <div class=\"container px-4 px-lg-5 my-5\">\n");
      out.write("                <div class=\"text-center text-white\">\n");
      out.write("                    <h1 class=\"display-4 fw-bolder\">Shoping Bakery</h1>\n");
      out.write("                    <p class=\"lead fw-normal text-white-50 mb-0\">Provide complete nutrition in each cake</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("         <section class=\"py-5\">\n");
      out.write("            <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("                <h3>Popular</h3>\n");
      out.write("                <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_2.setPageContext(_jspx_page_context);
      _jspx_th_c_if_2.setParent(null);
      _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProductPopular !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                 ");
 int count =0;
          out.write("\n");
          out.write("                        ");
          //  c:forEach
          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
          _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
          _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
          _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProductPopular}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
          _jspx_th_c_forEach_0.setVar("list");
          int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
          try {
            int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
            if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write(" \n");
                out.write("                          \n");
                out.write("                             ");
count++;
                out.write("\n");
                out.write("                          ");
 if(count<9){
                out.write("  \n");
                out.write("                          \n");
                out.write("                          ");
                //  c:if
                org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                _jspx_th_c_if_3.setPageContext(_jspx_page_context);
                _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
                if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                               <form action=\"");
                    out.print( request.getContextPath());
                    out.write("/cartForCustomer\" method=\"post\">\n");
                    out.write("                                   <input type=\"text\" hidden name=\"getCustomerUsername\" value=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                    out.write("\"/>\n");
                    out.write("                          ");
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
                out.write("                           ");
                //  c:if
                org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                _jspx_th_c_if_4.setPageContext(_jspx_page_context);
                _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
                if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                               <form action=\"");
                    out.print( request.getContextPath());
                    out.write("/ProductPageController\" method=\"post\">\n");
                    out.write("                          ");
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
                out.write("                          \n");
                out.write("                              \n");
                out.write("                            <div class=\"col mb-5\">\n");
                out.write("                                <div class=\"card h-100\">\n");
                out.write("                                    <!-- Sale badge-->\n");
                out.write("                                    <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
                out.write("                                    <!-- Product image-->\n");
                out.write("                                    <a href=\"");
                out.print( request.getContextPath());
                out.write("/ClickViewProductDetailsController?productID=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"><img class=\"card-img-top\" src=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_img()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"  width=\"450\" height=\"200\" alt=\"...\" /></a>\n");
                out.write("                                     \n");
                out.write("                                    <!-- Product details-->\n");
                out.write("                                    <div class=\"card-body p-4\">\n");
                out.write("                                        <div class=\"text-center\">\n");
                out.write("                                            <!-- Product name--> \n");
                out.write("                                            <div>\n");
                out.write("\n");
                out.write("                                                <a style=\" text-decoration: none;font-size:20px;overflow: hidden;\" class=\"fw-bolder text\" href=\"");
                out.print( request.getContextPath());
                out.write("/ClickViewProductDetailsController?productID=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\" >");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("</a>\n");
                out.write("                                            </div>\n");
                out.write("                                            <!-- Product price-->\n");
                out.write("                                          $ ");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\n");
                out.write("\n");
                out.write("                                        </div>\n");
                out.write("                                    </div>\n");
                out.write("                                    <!-- Product actions-->\n");
                out.write("                                    <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
                out.write("                                        <div class=\"row\">\n");
                out.write("                                            <div style=\"margin-left:10px;margin-bottom:5px\"> \n");
                out.write("                                                <input type=\"number\" name=\"proId\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"hidden>\n");
                out.write("                                                <input type=\"number\" name=\"proQuantity\" placeholder=\"0\" min=\"0\">\n");
                out.write("\n");
                out.write("                                            </div>\n");
                out.write("\n");
                out.write("\n");
                out.write("                                            <div class=\"text-center \"><button type=\"submit\" class=\"btn btn-outline-dark mt-auto\" >Add to cart</button></div>\n");
                out.write("\n");
                out.write("                                        </div>\n");
                out.write("                                    </div>\n");
                out.write("                                </div>\n");
                out.write("                            </div>\n");
                out.write("                                          </form>\n");
                out.write("                                ");
}
                out.write("          \n");
                out.write("                        ");
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
          out.write("                    ");
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
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write(" <!-- Section-->\n");
      out.write("        <section class=\"py-5\">\n");
      out.write("            <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("                <h3>Birthday Cake</h3>\n");
      out.write("                <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_5.setPageContext(_jspx_page_context);
      _jspx_th_c_if_5.setParent(null);
      _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProductBirthday !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                 ");
 int count =0;
          out.write("\n");
          out.write("                        ");
          //  c:forEach
          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
          _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
          _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
          _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProductBirthday}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
          _jspx_th_c_forEach_1.setVar("list");
          int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
          try {
            int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
            if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write(" \n");
                out.write("                          \n");
                out.write("                             ");
count++;
                out.write("\n");
                out.write("                          ");
 if(count<9){
                out.write("  \n");
                out.write("                        ");
                //  c:if
                org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                _jspx_th_c_if_6.setPageContext(_jspx_page_context);
                _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
                _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
                if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                               <form action=\"");
                    out.print( request.getContextPath());
                    out.write("/cartForCustomer\" method=\"post\">\n");
                    out.write("                                   <input type=\"text\" hidden name=\"getCustomerUsername\" value=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                    out.write("\"/>\n");
                    out.write("                          ");
                    int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
                  return;
                }
                _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
                out.write("\n");
                out.write("                           ");
                //  c:if
                org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                _jspx_th_c_if_7.setPageContext(_jspx_page_context);
                _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
                _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
                if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                               <form action=\"");
                    out.print( request.getContextPath());
                    out.write("/ProductPageController\" method=\"post\">\n");
                    out.write("                          ");
                    int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
                  return;
                }
                _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
                out.write("\n");
                out.write("                            <div class=\"col mb-5\">\n");
                out.write("                                <div class=\"card h-100\">\n");
                out.write("                                    <!-- Sale badge-->\n");
                out.write("                                    <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
                out.write("                                    <!-- Product image-->\n");
                out.write("                                    <a href=\"");
                out.print( request.getContextPath());
                out.write("/ClickViewProductDetailsController?productID=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"><img class=\"card-img-top\" src=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_img()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"  width=\"450\" height=\"200\" alt=\"...\" /></a>\n");
                out.write("                                    <!-- Product details-->\n");
                out.write("                                    <div class=\"card-body p-4\">\n");
                out.write("                                        <div class=\"text-center\">\n");
                out.write("                                            <!-- Product name--> \n");
                out.write("                                            <div>\n");
                out.write("\n");
                out.write("                                                <a style=\" text-decoration: none;font-size:20px;overflow: hidden;\" class=\"fw-bolder text\" href=\"");
                out.print( request.getContextPath());
                out.write("/ClickViewProductDetailsController?productID=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\" >");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("</a>\n");
                out.write("                                            </div>\n");
                out.write("                                            <!-- Product price-->\n");
                out.write("                                          $ ");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\n");
                out.write("\n");
                out.write("                                        </div>\n");
                out.write("                                    </div>\n");
                out.write("                                    <!-- Product actions-->\n");
                out.write("                                    <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
                out.write("                                        <div class=\"row\">\n");
                out.write("                                            <div style=\"margin-left:10px;margin-bottom:5px\"> \n");
                out.write("                                                <input type=\"number\" name=\"proId\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"hidden>\n");
                out.write("                                                <input type=\"number\" name=\"proQuantity\" placeholder=\"0\" min=\"0\">\n");
                out.write("\n");
                out.write("                                            </div>\n");
                out.write("\n");
                out.write("\n");
                out.write("                                            <div class=\"text-center \"><button type=\"submit\" class=\"btn btn-outline-dark mt-auto\" >Add to cart</button></div>\n");
                out.write("\n");
                out.write("                                        </div>\n");
                out.write("                                    </div>\n");
                out.write("                                </div>\n");
                out.write("                            </div>\n");
                out.write("                                          </form>\n");
                out.write("                                ");
}
                out.write("          \n");
                out.write("                        ");
                int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              return;
            }
          } catch (Throwable _jspx_exception) {
            while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
              out = _jspx_page_context.popBody();
            _jspx_th_c_forEach_1.doCatch(_jspx_exception);
          } finally {
            _jspx_th_c_forEach_1.doFinally();
            _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
          }
          out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("  <!-- Section-->\n");
      out.write("        <section class=\"py-5\">\n");
      out.write("            <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("                <h3>Wedding Cake</h3>\n");
      out.write("                <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_8.setPageContext(_jspx_page_context);
      _jspx_th_c_if_8.setParent(null);
      _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProductWedding !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
      if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                 ");
 int count =0;
          out.write("\n");
          out.write("                        ");
          //  c:forEach
          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
          _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
          _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
          _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProductWedding}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
          _jspx_th_c_forEach_2.setVar("list");
          int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
          try {
            int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
            if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write(" \n");
                out.write("                          \n");
                out.write("                             ");
count++;
                out.write("\n");
                out.write("                          ");
 if(count<9){
                out.write("  \n");
                out.write("                ");
                //  c:if
                org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                _jspx_th_c_if_9.setPageContext(_jspx_page_context);
                _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
                _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
                if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                               <form action=\"");
                    out.print( request.getContextPath());
                    out.write("/cartForCustomer\" method=\"post\">\n");
                    out.write("                                   <input type=\"text\" hidden name=\"getCustomerUsername\" value=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                    out.write("\"/>\n");
                    out.write("                          ");
                    int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
                  return;
                }
                _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
                out.write("\n");
                out.write("                           ");
                //  c:if
                org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                _jspx_th_c_if_10.setPageContext(_jspx_page_context);
                _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
                _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
                if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                               <form action=\"");
                    out.print( request.getContextPath());
                    out.write("/ProductPageController\" method=\"post\">\n");
                    out.write("                          ");
                    int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
                  return;
                }
                _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
                out.write("\n");
                out.write("                            <div class=\"col mb-5\">\n");
                out.write("                                <div class=\"card h-100\">\n");
                out.write("                                    <!-- Sale badge-->\n");
                out.write("                                    <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
                out.write("                                    <!-- Product image-->\n");
                out.write("                                    <a href=\"");
                out.print( request.getContextPath());
                out.write("/ClickViewProductDetailsController?productID=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"><img class=\"card-img-top\" src=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_img()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"  width=\"450\" height=\"200\" alt=\"...\" /></a>\n");
                out.write("                                    <!-- Product details-->\n");
                out.write("                                    <div class=\"card-body p-4\">\n");
                out.write("                                        <div class=\"text-center\">\n");
                out.write("                                            <!-- Product name--> \n");
                out.write("                                            <div>\n");
                out.write("\n");
                out.write("                                                <a style=\" text-decoration: none;font-size:20px;overflow: hidden;\" class=\"fw-bolder text\" href=\"");
                out.print( request.getContextPath());
                out.write("/ClickViewProductDetailsController?productID=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\" >");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("</a>\n");
                out.write("                                            </div>\n");
                out.write("                                            <!-- Product price-->\n");
                out.write("                                          $ ");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\n");
                out.write("\n");
                out.write("                                        </div>\n");
                out.write("                                    </div>\n");
                out.write("                                    <!-- Product actions-->\n");
                out.write("                                    <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
                out.write("                                        <div class=\"row\">\n");
                out.write("                                            <div style=\"margin-left:10px;margin-bottom:5px\"> \n");
                out.write("                                                <input type=\"number\" name=\"proId\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"hidden>\n");
                out.write("                                                <input type=\"number\" name=\"proQuantity\" placeholder=\"0\" min=\"0\">\n");
                out.write("\n");
                out.write("                                            </div>\n");
                out.write("\n");
                out.write("\n");
                out.write("                                            <div class=\"text-center \"><button type=\"submit\" class=\"btn btn-outline-dark mt-auto\" >Add to cart</button></div>\n");
                out.write("\n");
                out.write("                                        </div>\n");
                out.write("                                    </div>\n");
                out.write("                                </div>\n");
                out.write("                            </div>\n");
                out.write("                                          </form>\n");
                out.write("                                ");
}
                out.write("          \n");
                out.write("                        ");
                int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              return;
            }
          } catch (Throwable _jspx_exception) {
            while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
              out = _jspx_page_context.popBody();
            _jspx_th_c_forEach_2.doCatch(_jspx_exception);
          } finally {
            _jspx_th_c_forEach_2.doFinally();
            _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
          }
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("   <!-- Section-->\n");
      out.write("        <section class=\"py-5\">\n");
      out.write("            <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("                <h3>Custom Cake</h3>\n");
      out.write("                <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_11.setPageContext(_jspx_page_context);
      _jspx_th_c_if_11.setParent(null);
      _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProductCustom !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
      if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                 ");
 int count =0;
          out.write("\n");
          out.write("                        ");
          //  c:forEach
          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
          _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
          _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
          _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProductCustom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
          _jspx_th_c_forEach_3.setVar("list");
          int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
          try {
            int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
            if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write(" \n");
                out.write("                          \n");
                out.write("                             ");
count++;
                out.write("\n");
                out.write("                          ");
 if(count<9){
                out.write("  \n");
                out.write("                       ");
                //  c:if
                org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                _jspx_th_c_if_12.setPageContext(_jspx_page_context);
                _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
                _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
                if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                               <form action=\"");
                    out.print( request.getContextPath());
                    out.write("/cartForCustomer\" method=\"post\">\n");
                    out.write("                                   <input type=\"text\" hidden name=\"getCustomerUsername\" value=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                    out.write("\"/>\n");
                    out.write("                          ");
                    int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
                  return;
                }
                _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
                out.write("\n");
                out.write("                           ");
                //  c:if
                org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                _jspx_th_c_if_13.setPageContext(_jspx_page_context);
                _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
                _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
                if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                               <form action=\"");
                    out.print( request.getContextPath());
                    out.write("/ProductPageController\" method=\"post\">\n");
                    out.write("                          ");
                    int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
                  return;
                }
                _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
                out.write("\n");
                out.write("                            <div class=\"col mb-5\">\n");
                out.write("                                <div class=\"card h-100\">\n");
                out.write("                                    <!-- Sale badge-->\n");
                out.write("                                    <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
                out.write("                                    <!-- Product image-->\n");
                out.write("                                    <a href=\"");
                out.print( request.getContextPath());
                out.write("/ClickViewProductDetailsController?productID=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"><img class=\"card-img-top\" src=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_img()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"  width=\"450\" height=\"200\" alt=\"...\" /></a>\n");
                out.write("                                    <!-- Product details-->\n");
                out.write("                                    <div class=\"card-body p-4\">\n");
                out.write("                                        <div class=\"text-center\">\n");
                out.write("                                            <!-- Product name--> \n");
                out.write("                                            <div>\n");
                out.write("\n");
                out.write("                                                <a style=\" text-decoration: none;font-size:20px;overflow: hidden;\" class=\"fw-bolder text\" href=\"");
                out.print( request.getContextPath());
                out.write("/ClickViewProductDetailsController?productID=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\" >");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("</a>\n");
                out.write("                                            </div>\n");
                out.write("                                            <!-- Product price-->\n");
                out.write("                                          $ ");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\n");
                out.write("\n");
                out.write("                                        </div>\n");
                out.write("                                    </div>\n");
                out.write("                                    <!-- Product actions-->\n");
                out.write("                                    <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
                out.write("                                        <div class=\"row\">\n");
                out.write("                                            <div style=\"margin-left:10px;margin-bottom:5px\"> \n");
                out.write("                                                <input type=\"number\" name=\"proId\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getProduct_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\"hidden>\n");
                out.write("                                                <input type=\"number\" name=\"proQuantity\" placeholder=\"0\" min=\"0\">\n");
                out.write("\n");
                out.write("                                            </div>\n");
                out.write("\n");
                out.write("\n");
                out.write("                                            <div class=\"text-center \"><button type=\"submit\" class=\"btn btn-outline-dark mt-auto\" >Add to cart</button></div>\n");
                out.write("\n");
                out.write("                                        </div>\n");
                out.write("                                    </div>\n");
                out.write("                                </div>\n");
                out.write("                            </div>\n");
                out.write("                                          </form>\n");
                out.write("                                ");
}
                out.write("          \n");
                out.write("                        ");
                int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              return;
            }
          } catch (Throwable _jspx_exception) {
            while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
              out = _jspx_page_context.popBody();
            _jspx_th_c_forEach_3.doCatch(_jspx_exception);
          } finally {
            _jspx_th_c_forEach_3.doFinally();
            _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
          }
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("  \n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer class=\"py-5 bg-dark\">\n");
      out.write("            <div class=\"container\"><p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2022</p></div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/jsForHomePage/scripts.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
