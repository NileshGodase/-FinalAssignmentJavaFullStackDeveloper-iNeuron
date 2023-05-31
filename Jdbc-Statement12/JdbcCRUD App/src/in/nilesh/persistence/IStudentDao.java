package in.nilesh.persistence;

import in.nilesh.dto.Student;

public interface IStudentDao {

	public String addStudent(String sname, Integer sage, String saddress);
	
	public Student searchStudent(Integer sid);
	
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress);
	
	public String deleteStudent(Integer sid);
	
}
