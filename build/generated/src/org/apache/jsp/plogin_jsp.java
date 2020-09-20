package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class plogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>patient login</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"main.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.css\">\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"plog.css\">\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"vendor/fontawesome/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"vendor/themify-icons/themify-icons.min.css\">\r\n");
      out.write("\t\t<link href=\"vendor/animate.css/animate.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/perfect-scrollbar/perfect-scrollbar.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/switchery/switchery.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/plugins.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/themes/theme-1.css\" id=\"skin_color\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image:url(https://www.elegantthemes.com/blog/wp-content/uploads/2013/09/bg-9-full.jpg)\">\r\n");
      out.write("  <!--patient login page--><br><br><br>\r\n");
      out.write(" \t\t<center><div class=\"logo margin-top-30\">\r\n");
      out.write("\t\t\t\t<h2> HospDBMS | Patient Login</h2><br>\r\n");
      out.write("\t\t</div></center>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"ui container login\">\r\n");
      out.write("        <div class=\"ui red centered card\">\r\n");
      out.write("   \r\n");
      out.write("                 <form class=\"ui  form log\" method=\"post\" action=\"RedirectPage.jsp\">\r\n");
      out.write("                         <div class=\"field\">\r\n");
      out.write("                         <div  class=\"sixteen wide field\">  \r\n");
      out.write("              <br>\r\n");
      out.write("                           <label class=\"header\">User Name</label>\r\n");
      out.write("                           <input type=\"text\" name=\"uname\" placeholder=\"username\">\r\n");
      out.write("                         </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                         <div class=\"field\">\r\n");
      out.write("                        <div  class=\"sixteen wide field\">   \r\n");
      out.write("                           <label class=\"ui header\">Password</label>\r\n");
      out.write("                           <input type=\"password\" name=\"pwd\" placeholder=\"password\" required=\"required\">\r\n");
      out.write("                         </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("         \r\n");
      out.write("\r\n");
      out.write("                         <div class=\"field\">\r\n");
      out.write("                          <p class=\"header\">Don't have an account?\r\n");
      out.write("                          <a href=\"newuser.html\" id=\"field1\">Create account</a></p>\r\n");
      out.write("                             <b>   <font color=\"red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font> </b>\r\n");
      out.write("                         </div>\r\n");
      out.write("                         <a href=\"../../Hospital_project/web/RedirectPage.jsp\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary pull-right\" name=\"submit\">\r\n");
      out.write("\t\t\tLogin <i class=\"fa fa-arrow-circle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("                             </a>\r\n");
      out.write("                       </form>\r\n");
      out.write("                       \r\n");
      out.write("         </div>\r\n");
      out.write("     </div>     \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
}
