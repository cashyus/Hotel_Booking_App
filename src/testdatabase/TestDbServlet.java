package testdatabase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Starting here: ").append(request.getContextPath());
		
		
		
		//set up connection variables
		String user = "admin01";
		String pass = "password";
		
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hotelbooking?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		//get connection to database
		
		try { 
			PrintWriter out = response.getWriter();
			
			out.println("Connection establishing to database: " + jdbcUrl);
			
			Class.forName(driver);
			
			Connection connect = DriverManager.getConnection(jdbcUrl, user, pass);
			
			out.println("Connection has been established");
			
			connect.close();
		}
		catch (Exception exc){
			exc.printStackTrace();
			throw new ServletException(exc);
		}
	}

}
