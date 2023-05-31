package in.nilesh.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
		out.println("<div style=' border: 5px solid; margin: auto; width: 50%; padding: 10px;'>");
		
		out.println("<h1>Welcome to Servlet "+name+"</h1>");
		
		out.println("</div>");
		
	}

}
