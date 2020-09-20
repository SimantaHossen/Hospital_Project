package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Hospital Management System</title>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("       \n");
      out.write("                <h1>New Hospital in Town</h1></font>\n");
      out.write("            \n");
      out.write("                <ul  id=\"slider1\">\n");
      out.write("                    <img src=\"Professional_Hospital_Guaynabo_2019.jpg\" alt=\"\"/>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                            <i ></i>Admin login\n");
      out.write("                            <a href=\"index_3.jsp\">\n");
      out.write("                                <button >LOGIN</button>\n");
      out.write("                            </a>\n");
      out.write("                       \n");
      out.write("                            <i ></i>live Chat\n");
      out.write("                            <a href=\"Chatroom.jsp\">\n");
      out.write("                                <button >LOGIN</button>\n");
      out.write("                            </a>\n");
      out.write("                   \n");
      out.write("                \n");
      out.write("                            <i ></i>Doctor login\n");
      out.write("                            <a href=\"index_1.jsp\">\n");
      out.write("                                <button > LOGIN</button>\n");
      out.write("                            </a>\n");
      out.write("                      \n");
      out.write("                \n");
      out.write("                            <i ></i>Patient login\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <a href=\"index_2.jsp\">\n");
      out.write("                                <button >LOGIN</button>\n");
      out.write("                            </a>\n");
      out.write("                        \n");
      out.write("                             <i ></i>Are you Covid19 Positive? Check here\n");
      out.write("                            <a href =\"http://corona.gov.bd/?gclid=CjwKCAjw2Jb7BRBHEiwAXTR4jbweOne-HosHi-o22Y8hImPvn-nz2FztB5o_9K0zACAzrw_Tex50pBoCkrYQAvD_BwE\">link</a>\n");
      out.write("         \n");
      out.write("                             <i ></i>Download your Covid Report\n");
      out.write("                            \n");
      out.write("                            <a href=\"CovidReport.jsp\">\n");
      out.write("                                <button >LOGIN</button>\n");
      out.write("                            </a>\n");
      out.write("                             \n");
      out.write("                              <i ></i>Need Blood? \n");
      out.write("                              <a href=\"blood.jsp\">\n");
      out.write("                                <button >LOGIN</button>\n");
      out.write("                            </a>\n");
      out.write("                            \n");
      out.write("                <article><h1>New Hospital in Town</h1>\n");
      out.write("                    <p>This is a Generalized Hospital. Spcially for poor, we have free services in terms of checkup, visiting and in some cases free Operations .<br></p\n");
      out.write("                </article>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
