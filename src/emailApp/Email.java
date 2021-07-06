package emailApp;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private String alternateEmail;
	
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		
	}
	
	
	private String setDepartment() {
		
		System.out.print("Enter the department\n1 Sales\n2 Development\n3 Accounting\n0 None");
		Scanner in = new Scanner(System.in);
		int 
		
	}

}
