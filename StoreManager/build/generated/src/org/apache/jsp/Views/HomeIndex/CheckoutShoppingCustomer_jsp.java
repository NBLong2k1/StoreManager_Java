package org.apache.jsp.Views.HomeIndex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CheckoutShoppingCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <section class=\"h-100 h-custom\" style=\"background-color: #eee;\">\n");
      out.write("        <div class=\"container py-5 h-100\">\n");
      out.write("          <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("            <div class=\"col\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <div class=\"card-body p-4\">\n");
      out.write("      \n");
      out.write("                  <div class=\"row\">\n");
      out.write("      \n");
      out.write("                    <div class=\"col-lg-7\">\n");
      out.write("                      <h5 class=\"mb-3\"><a href=\"#!\" class=\"text-body\"><i\n");
      out.write("                            class=\"fas fa-long-arrow-alt-left me-2\"></i>Continue shopping</a></h5>\n");
      out.write("                      <hr>\n");
      out.write("      \n");
      out.write("                      <div class=\"d-flex justify-content-between align-items-center mb-4\">\n");
      out.write("                        <div> \n");
      out.write("                          <p class=\"mb-1\">Shopping cart</p>\n");
      out.write("                          <p class=\"mb-0\">You have ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numberProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" items in your cart</p>\n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                      </div>\n");
      out.write("       ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                       <!-- Product Start-->\n");
      out.write("                          \n");
      out.write("                       ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                     \n");
      out.write("                      <!-- Product End -->\n");
      out.write("                      <a href=\"");
      out.print( request.getContextPath());
      out.write("/ShoppingCartController?customerUser=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${getCustomerUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Back To Cart</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-5\">\n");
      out.write("      \n");
      out.write("                      <div class=\"card bg-warning text-white rounded-3\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                          <div class=\"d-flex justify-content-between align-items-center mb-4\">\n");
      out.write("                            <h5 class=\"mb-0\">Card details</h5>\n");
      out.write("                            <img src=\"https://mdbcdn.b-cdn.net/img/Photos/Avatars/avatar-6.webp\"\n");
      out.write("                              class=\"img-fluid rounded-3\" style=\"width: 45px;\" alt=\"Avatar\">\n");
      out.write("                          </div>\n");
      out.write("      \n");
      out.write("                          <a href=\"#!\" type=\"submit\" class=\"text-white\"><i\n");
      out.write("                              class=\"fab fa-cc-mastercard fa-2x me-2\"></i></a>\n");
      out.write("                          <a href=\"#!\" type=\"submit\" class=\"text-white\"><i\n");
      out.write("                              class=\"fab fa-cc-visa fa-2x me-2\"></i></a>\n");
      out.write("                          <a href=\"#!\" type=\"submit\" class=\"text-white\"><i\n");
      out.write("                              class=\"fab fa-cc-amex fa-2x me-2\"></i></a>\n");
      out.write("                          <a href=\"#!\" type=\"submit\" class=\"text-white\"><i class=\"fab fa-cc-paypal fa-2x\"></i></a>\n");
      out.write("      \n");
      out.write("                          <form action=\"");
      out.print( request.getContextPath());
      out.write("/checkoutShoppingController\" method=\"post\" class=\"mt-4\">\n");
      out.write("                            <div class=\"form-outline form-white mb-4\">\n");
      out.write("                                  <label class=\"form-label\" for=\"typeName\">Họ Và Tên</label>\n");
      out.write("                                  <input type=\"text\" required=\"\" id=\"typeName\" name=\"guestName\" class=\"form-control form-control-lg\" siez=\"17\"\n");
      out.write("                                placeholder=\"Họ Và Tên\" />\n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"form-outline form-white mb-4\">\n");
      out.write("                                  <label class=\"form-label\" for=\"typeName\">Email</label>\n");
      out.write("                              <input type=\"email\" required id=\"typeName\" name=\"guestEmail\" class=\"form-control form-control-lg\" siez=\"17\"\n");
      out.write("                                placeholder=\"Enter email\" />\n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-outline form-white mb-4\">\n");
      out.write("                                  <label class=\"form-label\" for=\"typeName\">Số Điện Thoại</label>\n");
      out.write("                              <input type=\"number\" required id=\"typeName\" name=\"guestPhone\" class=\"form-control form-control-lg\" siez=\"17\"\n");
      out.write("                                placeholder=\"Số Điện Thoại\" />\n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("                               <div class=\"form-outline form-white mb-4\">\n");
      out.write("                                  <label class=\"form-label\" for=\"typeName\">Địa Chỉ</label>\n");
      out.write("                              <input type=\"text\" id=\"typeName\" required name=\"guestAddress\" class=\"form-control form-control-lg\" siez=\"17\"\n");
      out.write("                                placeholder=\"Địa Chỉ\" />\n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("                              \n");
      out.write("                              <div class=\"form-outline form-white mb-4\">\n");
      out.write("                                  <label class=\"form-label\" for=\"typeName\">Ghi Chú</label>\n");
      out.write("                              <input type=\"text\" id=\"typeName\"  name=\"guestNote\" class=\"form-control form-control-lg\" siez=\"17\"\n");
      out.write("                                placeholder=\"Ghi Chú\" />\n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"form-outline form-white mb-4\">\n");
      out.write("                                \n");
      out.write("                <div class=\"form-check form-check-inline\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"deliveryWay\" id=\"inlineRadio1\" value=\"0\">\n");
      out.write("  <label class=\"form-check-label\" for=\"inlineRadio1\">Nhận tại cửa hàng</label>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-check form-check-inline\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"deliveryWay\" id=\"inlineRadio2\" value=\"1\">\n");
      out.write("  <label class=\"form-check-label\" for=\"inlineRadio2\">Giao hàng</label>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("                                 \n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("      \n");
      out.write("                            \n");
      out.write("      \n");
      out.write("                          \n");
      out.write("      \n");
      out.write("                          <hr class=\"my-4\">\n");
      out.write("      \n");
      out.write("                          <div class=\"d-flex justify-content-between\">\n");
      out.write("                            <p class=\"mb-2\">Subtotal</p>\n");
      out.write("                            <p class=\"mb-2\">$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                          </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("                          <div class=\"d-flex justify-content-between mb-4\">\n");
      out.write("                            <p class=\"mb-2\">Total(Incl. taxes)</p>\n");
      out.write("                            <input  type=\"text\" hidden name=\"getTotalPrice\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <h4 class=\"mb-2\">$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                          </div>\n");
      out.write("      \n");
      out.write("                          <button type=\"submit\" name=\"submitCheckoutOrder\" class=\"btn btn-info btn-block btn-lg\">\n");
      out.write("                            <div class=\"d-flex justify-content-between\">\n");
      out.write("                          \n");
      out.write("                              <span>Checkout <i class=\"fas fa-long-arrow-alt-right ms-2\"></i></span>\n");
      out.write("                            </div>\n");
      out.write("                          </button>\n");
      out.write("                                </form>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("      \n");
      out.write("                    </div>\n");
      out.write("      \n");
      out.write("                  </div>\n");
      out.write("      \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("totalPrice");
    _jspx_th_c_set_0.setValue(new String("0"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListCart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("list");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \n");
          out.write("                            \n");
          out.write("                            ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("     ");
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                      <div class=\"card mb-3\">\n");
          out.write("                        <div class=\"card-body\">\n");
          out.write("                          <div class=\"d-flex justify-content-between\">\n");
          out.write("                            <div class=\"d-flex flex-row align-items-center\">\n");
          out.write("                              <div>\n");
          out.write("                                <img\n");
          out.write("                                  src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getKey().getProduct_img()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                  class=\"img-fluid rounded-3\" alt=\"Shopping item\" style=\"width: 65px;\">\n");
          out.write("                              </div>\n");
          out.write("                              <div class=\"ms-3\">\n");
          out.write("                                <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getKey().getProduct_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                <p class=\"small mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getKey().getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                              </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"d-flex flex-row align-items-center\">\n");
          out.write("                              <div style=\"width: 50px;\">\n");
          out.write("                                <h5 class=\"fw-normal mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getValue()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                              </div>\n");
          out.write("                              <div style=\"width: 80px;\">\n");
          out.write("                                <p class=\"mb-0\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${salary}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                              </div>\n");
          out.write("                              <a href=\"#!\" style=\"color: #cecece;\"><i class=\"fas fa-trash-alt\"></i></a>\n");
          out.write("                            </div>\n");
          out.write("                          </div>\n");
          out.write("                        </div>\n");
          out.write("                      </div>\n");
          out.write("                      ");
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

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setVar("salary");
    _jspx_th_c_set_1.setScope("session");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getKey().getPrice()*list.getValue()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_2.setVar("totalPrice");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPrice + salary}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }
}
