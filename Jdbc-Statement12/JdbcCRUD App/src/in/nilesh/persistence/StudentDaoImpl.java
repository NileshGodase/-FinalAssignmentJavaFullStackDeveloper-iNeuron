package in.nilesh.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import in.nilesh.dto.Student;
import in.nilesh.util.JdbcUtil;

public class StudentDaoImpl implements IStudentDao {
	
	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet resultset = null;

	@Override
	public String addStudent(String sname, Integer sage, String saddress) {
		
		connection = JdbcUtil.getJdbcConnection();
		
		String insertSqlQuery = "insert into MyTable(name,age,address) value(?,?,?)";
		try {
			
			PreparedStatement pstmt = connection.prepareStatement(insertSqlQuery);
			pstmt.setString(1, sname);
			pstmt.setInt(2, sage);
			pstmt.setString(3, saddress);
			
			int rowsAffected = pstmt.executeUpdate();
			
			if(rowsAffected==1)  return "Records inserted Successfully";
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "Records insertion is failed";
	}

	
	@Override
	public Student searchStudent(Integer sid) {
		
		Student student = null;
		connection = JdbcUtil.getJdbcConnection();
		
		String sqlSelectQuery = "select name, age, address from MyTable where id=?";
		
		try {
			
			if(connection!=null)
			pstmt = connection.prepareStatement(sqlSelectQuery);
			
			if(pstmt!=null)
			pstmt.setInt(1, sid);
			
			if(pstmt!=null)
			resultset = pstmt.executeQuery();
			
			if(resultset!=null) {
			
				while(resultset.next()) {
					
					student = new Student();
					
					student.setSid(sid);
		
					student.setSname(resultset.getString(1));
					
					student.setSage( resultset.getInt(2));
					
					student.setSaddress(resultset.getString(3));
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if(student!=null)
			return student;
		else
			return null;
		
	}

	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		
		try {
			connection = JdbcUtil.getJdbcConnection();
			String updateSqlQuery = "update MyTable set name=? , age=? , address=? where id=? ";
			pstmt = connection.prepareStatement(updateSqlQuery);
			
			pstmt.setString(1, sname);
			pstmt.setInt(2, sage);
			pstmt.setString(3, saddress);
			pstmt.setInt(4, sid);
			int rowsAffected = pstmt.executeUpdate();
			
			if(rowsAffected==1)  return "Records updated Successfully";

		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Records update failed";
		
		
	}

	@Override
	public String deleteStudent(Integer sid) {
		
		connection = JdbcUtil.getJdbcConnection();
		String deleteSqlQuery = "delete from MyTable where id = ? ";
		
		try {
			pstmt = connection.prepareStatement(deleteSqlQuery);
			pstmt.setInt(1, sid);
			int rowsAffected = pstmt.executeUpdate();
			
			if(rowsAffected==1) {
				return "Records deleted successfully";
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
		return "Records deletion failed";
	}

}
