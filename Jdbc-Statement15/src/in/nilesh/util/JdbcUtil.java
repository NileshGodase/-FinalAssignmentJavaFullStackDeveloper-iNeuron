package in.nilesh.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
	
	private static Connection connection = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private JdbcUtil() {
		
	}
	
	public static Connection getJdbcConnection() throws SQLException, IOException{
		
		FileInputStream fis = new FileInputStream(new File("F:\\workspace for eclips\\Jdbc-Statement15\\src\\in\\nilesh\\properties\\application.properties"));
		
		Properties properties = new Properties();
		
		properties.load(fis);
		
		connection = DriverManager.getConnection(properties.getProperty("url"),
												properties.getProperty("username"),
												properties.getProperty("password"));
		System.out.println("Connection established successfully...");
		return connection;		
	}
	
	
}
