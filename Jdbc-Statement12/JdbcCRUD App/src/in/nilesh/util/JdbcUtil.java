package in.nilesh.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {
	
	private JdbcUtil() {
	}
	
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}
	
	public static Connection getJdbcConnection() {

		File f = new File("F:\\workspace for eclips\\JdbcCRUD App\\src\\in\\nilesh\\properties\\application.properties");
		
		Connection connection = null;
		
		try {
			
			FileInputStream fis = new FileInputStream(f);
			Properties properties = new Properties();
			properties.load(fis);
			
			
			connection = DriverManager.getConnection(properties.getProperty("url"),
													 properties.getProperty("username"),
													 properties.getProperty("password"));

			
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
				
	}
	
	public void cleanUp(Connection connection, Statement statement) {
		try {
			connection.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
