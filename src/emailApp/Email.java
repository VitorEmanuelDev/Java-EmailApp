package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private String alternateEmail;
	
	//Constructor to receive the first and last names
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department and return a department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
	}
	
	//Ask for the department
	private String setDepartment() {
		
		System.out.print("Pick a department\n1 Sales\n2 Development\n3 Accounting\n0 None");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		
		if(departmentChoice == 1) {
			
			return "sales";
	
		}else if (departmentChoice == 2) {
		
			return "dev";
		
		}else if (departmentChoice == 3) {
		
			return "acct";
		
		}else {
		
			return "";
		
		}
		
	}

}
