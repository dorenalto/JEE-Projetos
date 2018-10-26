package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HTMLServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = null;
		
		  try {
		out = response.getWriter();
		
		response.setContentType("text/html");
		
		out.print ("<HTML><BODY>");
		out.print ("<H1>Titulo da Página</H1>");
		out.print ("<STRONG>Este é um texto em negrito</STRONG>");
		out.print ("</BODY></HTML>");
		
	} finally { 
		if (out != null) { out.close();
		  }
		}
	}

}
