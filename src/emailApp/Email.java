package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	
	//Constructor to receive the first and last names
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department and return a department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
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
	
	//Generate random poassword
	private String randomPassword(int length) {
		
		String passwordSet = "abcdefghijklmnopqrstuvwxyzçABCDEFGHIJKLMNOPQRSTUVWXYZÇ0123456789!@#$%~?&*-+";
		char [] password = new char[length];
		
		for(int i = 0; i < length; i++) {
			
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password); 		
		
	}

}
