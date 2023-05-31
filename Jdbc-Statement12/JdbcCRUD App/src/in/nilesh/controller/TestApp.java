package in.nilesh.controller;

import java.io.IOException;
import java.util.Scanner;

import in.nilesh.dto.Student;
import in.nilesh.service.IStudentService;
import in.nilesh.servicefactory.StudentServiceFactory;

public class TestApp {
	 
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			displayOperations();
			System.out.println("\n hit enter to restart the program");
			System.in.read();
		}
		
	}
	
	private static void displayOperations() {
		
		System.out.println("For AddStudent			= 1");
		System.out.println("For Searching			= 2");
		System.out.println("For updating info		= 3");
		System.out.println("For deletion records		= 4");
		
		System.out.println("\nEnter the corresponding number for above services\n");
		
		String userInput = scanner.next();
		
		switch (userInput) {
		case "1":
			insertionOperation();
			break;
			
		case "2":
			searchOperation();
			break;

		case "3":
			updateOperation();
			break;
			
		case "4":
			deleteOperation();
			break;
			
		default:
			System.out.println("Enter valid input");
			break;
			
		}
		
	}
	
	
	private static void insertionOperation() {
		
		IStudentService service = StudentServiceFactory.getStudentService();
		
		System.out.println("Enter your name\n");
		String sname = scanner.next();
		System.out.println("Enter your age\n");
		Integer sage = scanner.nextInt();
		System.out.println("Enter your address\n");
		String saddress = scanner.next();
		System.out.println(service.addStudent(sname, sage, saddress));
	}
	
	
	private static void searchOperation() {
		
		IStudentService service = StudentServiceFactory.getStudentService();
		
		System.out.println("Enter your sid\n");
		Integer sid = scanner.nextInt();
		
		Student student = null;
		student = service.searchStudent(sid);
		
		if(student!=null)
			System.out.println(student.toString());
		else 
			System.out.println("Records Not Found");
		
	}
	
	
	private static void updateOperation() {
		
		IStudentService service = StudentServiceFactory.getStudentService();
		
		if(service!=null) {
			
			System.out.println("Enter your sid");
			Integer sid = scanner.nextInt();
			System.out.println("Enter your sname");
			String sname = scanner.next();
			System.out.println("Enter your sage");
			Integer sage = scanner.nextInt();
			System.out.println("Enter your saddress");
			String saddress = scanner.next();
			
			String res = service.updateStudent(sid, sname, sage, saddress);
			
			if(res!=null) {
				System.out.println(res);
			}else {
				System.out.println("Records update failed");
			}
			
		}
		
	}
	
	
	private static void deleteOperation() {
		
		IStudentService service = StudentServiceFactory.getStudentService();
		
		if(service!=null) {
			
			System.out.println("Enter your sid");
			Integer sid = scanner.nextInt();
			
			String res = service.deleteStudent(sid);
			
			if(res!=null) {
				System.out.println(res);
			}else {
				System.out.println("Records deletion failed");
			}
			
		}
		
	}

}
