package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class social_002dicons_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Naukri Social Icons</title>\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" ></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        \n");
      out.write("        <body>\n");
      out.write("  <h1>Naukri Social Icons</h1>\n");
      out.write("\n");
      out.write("  <ul class=\"social-icons\">\n");
      out.write("    <li><a href=\"https://facebook.com/naukri\"><img src=\"path/to/facebook-icon.png\" alt=\"Facebook\"></a></li>\n");
      out.write("    <li><a href=\"https://twitter.com/naukri\"><img src=\"path/to/twitter-icon.png\" alt=\"Twitter\"></a></li>\n");
      out.write("    <li><a href=\"https://linkedin.com/company/naukri\"><img src=\"path/to/linkedin-icon.png\" alt=\"LinkedIn\"></a></li>\n");
      out.write("    <!-- Add more social icons as needed -->\n");
      out.write("  </ul>\n");
      out.write("</body>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Naukri Social Icons</h1>\n");
      out.write("    \n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"https://facebook.com/naukri\"><img src=\"path/to/facebook-icon.png\" alt=\"Facebook\"></a></li>\n");
      out.write("        <li><a href=\"https://twitter.com/naukri\"><img src=\"path/to/twitter-icon.png\" alt=\"Twitter\"></a></li>\n");
      out.write("        <li><a href=\"https://linkedin.com/company/naukri\"><img src=\"path/to/linkedin-icon.png\" alt=\"LinkedIn\"></a></li>\n");
      out.write("        <!-- Add more social icons as needed -->\n");
      out.write("    </ul>\n");
      out.write("</body>\n");
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
