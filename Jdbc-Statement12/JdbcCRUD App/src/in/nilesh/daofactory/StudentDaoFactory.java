package in.nilesh.daofactory;

import in.nilesh.persistence.IStudentDao;
import in.nilesh.persistence.StudentDaoImpl;


public class StudentDaoFactory {

	private StudentDaoFactory() {
		
	}
	
	private static IStudentDao stdDao;
	
	public static IStudentDao getStudentDao() {
		
		stdDao = new StudentDaoImpl();
		
		return stdDao;
	}
	
}
