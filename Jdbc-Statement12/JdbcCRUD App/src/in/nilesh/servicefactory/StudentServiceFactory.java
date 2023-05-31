package in.nilesh.servicefactory;

import in.nilesh.service.IStudentService;
import in.nilesh.service.StudentServiceImpl;

public class StudentServiceFactory {

	private StudentServiceFactory() {
		
	}
	
	private static IStudentService stdService;
	
	public static IStudentService getStudentService() {
		
		stdService = new StudentServiceImpl();
				
		return stdService;
		
	}
	
}
