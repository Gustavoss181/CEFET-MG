/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.56
 * Generated at: 2019-09-19 19:57:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class processa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

//servlet servlet = new servlet(); 
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tfooter{\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\theight: 50px;\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tbottom: 0;\r\n");
      out.write("\t\tbackground-color: gray;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\timg{\r\n");
      out.write("\t\theight: 100px;\r\n");
      out.write("\t}\r\n");
      out.write("\theader{\r\n");
      out.write("\t\tbackground-color: darkblue;\r\n");
      out.write("\t}\r\n");
      out.write("\tdiv{\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String nome, email, filme, franquia;
	nome = request.getParameter("nome");
	email = request.getParameter("email");
	filme = request.getParameter("filme");
	franquia = request.getParameter("franquia");
	
	if(filme.equals("Vingadores")){
		response.getWriter().append("<header><center><img src='vingadores.jpg'></center></header>");
	}else if(filme.equals("Liga")){
		response.getWriter().append("<header><center><img src='liga.jpg'></center></header>");
	}
	
	response.getWriter().append("<div><br><br><br><b>Nome: </b>" + nome + "<br>");
	response.getWriter().append("<b>Email: </b>" + email + "<br>");
	response.getWriter().append("<b>Filme: </b>" + filme + "<br>");
	response.getWriter().append("<b>Franquia: </b>" + franquia + "<br>");
	response.getWriter().append("<a href='http://localhost:8080/AtividadeHerois6pts/servidor?nome="+nome+"&nome="+nome+"&filme="+filme+"&franquia="+franquia+"'>Servlet</a></div>");
	
	if(franquia.equals("Marvel")){
		if(filme.equals("Vingadores"))
			response.getWriter().append("<footer>"+ nome +"</footer>");
		else if(filme.equals("Liga"))
			response.getWriter().append("<footer>"+ nome +", Liga é da DC</footer>");
	}else if(franquia.equals("DC")){
		if(filme.equals("Vingadores"))
			out.print("<footer>"+ nome +"Vingadores é da Marvel</footer>");
		else if(filme.equals("Liga"))
			out.print("<footer>"+ nome +"</footer>");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
