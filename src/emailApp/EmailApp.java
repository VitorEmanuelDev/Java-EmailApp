package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		//EmailApp.main(args);
		Email emailOne = new Email("Person", "Doe");
		emailOne.setAlternateEmail("personal.mail@gmail.com"); 
		System.out.println(emailOne.showInfo());
		
	}

}
