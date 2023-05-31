package in.nilesh.service;

import in.nilesh.daofactory.StudentDaoFactory;
import in.nilesh.dto.Student;
import in.nilesh.persistence.IStudentDao;

public class StudentServiceImpl implements IStudentService {

	IStudentDao stdDeo = null;
	
	@Override
	public String addStudent(String sname, Integer sage, String saddress) {
		
		stdDeo = StudentDaoFactory.getStudentDao();
		
		if(stdDeo==null) {
			return "Record insertion is failed";
		}
		return stdDeo.addStudent(sname, sage, saddress);
	}

	
	@Override
	public Student searchStudent(Integer sid) {
		
		Student student = null;
		
		stdDeo = StudentDaoFactory.getStudentDao();
		
		if(stdDeo!=null) {
			return stdDeo.searchStudent(sid);
		}
		
		return student;
		
	}
	

	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
		stdDeo = StudentDaoFactory.getStudentDao();
		
		if(stdDeo!=null) {
			return stdDeo.updateStudent(sid, sname, sage, saddress);
		}else {
			return "Records update failed";
		}
		
	}

	@Override
	public String deleteStudent(Integer sid) {
		stdDeo = StudentDaoFactory.getStudentDao();
		
		if(stdDeo!=null) {
			return stdDeo.deleteStudent(sid);
		}
		return "Records deletion failed";
	}

}
