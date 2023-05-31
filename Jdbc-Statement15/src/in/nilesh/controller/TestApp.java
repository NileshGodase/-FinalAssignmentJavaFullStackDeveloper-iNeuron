package in.nilesh.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

import in.nilesh.util.JdbcUtil;

@WebServlet("/test")
public class TestApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultset = null;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request, response);		
	
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request, response);		
	
	}

	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		try {
			connection = JdbcUtil.getJdbcConnection();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		String sqlSelectQuery = "select * from MyTable";
		
		PrintWriter out = response.getWriter();
		
		try {
			statement = connection.createStatement();
			resultset = statement.executeQuery(sqlSelectQuery);
			
			out.println("MySql table data displayed on HTML page using JDBC");
			
			out.println("<table border='1'>");
			out.println("<th>Id</th> <th>Name</th> <th>Age</th> <th>Address</th>");
			
			while(resultset.next()) {
				
				Integer id = resultset.getInt(1);
				String name = resultset.getString(2);
				Integer age = resultset.getInt(3);
				String address = resultset.getString(4);		
				
				out.println("<tr> <td>"+id+"</td> <td>"+name+"</td> <td>"+age+"</td> <td>"+address+"</td> </tr>");
				
			}
			
			out.println("</table>");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
