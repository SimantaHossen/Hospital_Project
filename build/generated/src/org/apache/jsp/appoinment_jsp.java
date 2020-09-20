package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class appoinment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>User  | Book Appointment</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h1>Book Appointment</h1>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <form method=\"post\" action=\"UserRegistration1\">\n");
      out.write("           <tr>\n");
      out.write("                        <td>Patient Name: </td>\n");
      out.write("                        <td><input type=\"text\" name=\"pname\" value=\"\" size=\"50\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("  \n");
      out.write("            <label for=\"DoctorSpecialization\">\n");
      out.write("                Doctor Specialization\n");
      out.write("            </label>\n");
      out.write("            \n");
      out.write("                   \n");
      out.write("            \n");
      out.write("            <select name=\"dspec\" required=\"required\">\n");
      out.write("                <option value=\"\">Select Specialization</option>\n");
      out.write("                <option value=\"Brain surgery\">Brain surgery</option>\n");
      out.write("                <option value=\"Heart surgery\">Heart surgery</option>\n");
      out.write("                <option value=\"Plastic surgery\">Plastic surgery</option>\n");
      out.write("                <option value=\"Cancer treatment\">Cancer treatment</option>\n");
      out.write("\n");
      out.write("                <option value=\"Basic treatment\">Basic treatment</option>\n");
      out.write("            </select>\n");
      out.write("       \n");
      out.write("\n");
      out.write("       \n");
      out.write("            <label for=\"doctor\">\n");
      out.write("                Doctors\n");
      out.write("            </label>\n");
      out.write("            <select name=\"dname\" required=\"required\">\n");
      out.write("\n");
      out.write("                <option value=\"\">Select Doctor</option>\n");
      out.write("                <option value=\"Doc1\">Doc1</option>\n");
      out.write("                <option value=\"Doc2\">Doc2</option>\n");
      out.write("                <option value=\"Doc3\">Doc3</option>\n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("            <label for=\"AppointmentDate\">\n");
      out.write("                Date\n");
      out.write("            </label>\n");
      out.write("            <input  name=\"date\"  required=\"required\" data-date-format=\"yyyy-mm-dd\"><b>Format: YYYY-MM-DD</b>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("        <div >\n");
      out.write("            <label for=\"Appointmenttime\">\n");
      out.write("\n");
      out.write("                Time\n");
      out.write("\n");
      out.write("            </label>\n");
      out.write("            <input  name=\"time\" id=\"timepicker1\" required=\"required\"><b>Format: HH:MM:SS in 24hr format</b>\n");
      out.write("        </div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("        <button type=\"submit\" name=\"submit\" >\n");
      out.write("            Submit\n");
      out.write("        </button>\n");
      out.write("    </form>\n");
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
}
