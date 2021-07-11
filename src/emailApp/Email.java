package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailBoxCapacity = 1000;
	private int defaultPasswordLength = 9;
	private String alternateEmail;
	private String companySuffix = "xyzcorp.com";
	
	//Constructor to receive the first and last names
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department and return a department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		//System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate e-mail
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your e-mail is: " + email);
	}
	
	//Ask for the department
	private String setDepartment() {
		
		System.out.print("Hey " + firstName + ", pick a department.\n1 Sales\n2 Development\n3 Accounting\n0 None");
		Scanner scanner = new Scanner(System.in);
		int departmentChoice = scanner.nextInt();
		scanner.close();
		
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
		
		String passwordSet = "abcdefghijklmnopqrstuvwxyzçABCDEFGHIJKLMNOPQRSTUVWXYZÇ0123456789!@#$%?&";
		char [] password = new char[length];
		
		for(int i = 0; i < length; i++) {
			
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password); 		
		
	}
	
	//Set mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		
		this.mailBoxCapacity = capacity;
		
	}
	
	//set alternate e-mail
	public void setAlternateEmail(String altEmail) {
		
		this.alternateEmail = altEmail;
		
	}
	
	//Change password
	public void changePassword(String password) {
		
		this.password = password;
		
	}
	
	public int getMailBoxCapacity() {
	
		return mailBoxCapacity;
	
	}
	
	public String getAlternateEmail() {
		
		return alternateEmail;
		
	}
	
	public String getPassword() {
		
		return password;
		
	}
	
	public String showInfo() {
		
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY E-MAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailBoxCapacity + " mb" + 
				"\nPASSWAORD: " + password;
		
		
	}

}
