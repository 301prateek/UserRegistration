import java.util.*;
public class UserRegistration{

	public void validateFirstName() {
		System.out.println("Enter Your First Name : ");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.next();

		String expression ="^[A-Z][a-z]{2,}$";
		int invalid = 0;

		if(firstName.matches(expression)) {
			System.out.println("Accepted Valid First Name");
		}
		else {
			System.out.println("First letter Should be capital, minimum 3 characters");
			invalid = 1;
		}

		if(invalid == 1) {
			validateFirstName();
		}
	}

	public void validateLastName() {
		System.out.println("Enter Your Last Name : ");
		Scanner scanner = new Scanner(System.in);
		String lastName = scanner.nextLine();

		String expression = "^[A-Z][a-z]{2,}$";
		int invalid = 0;

		if(lastName.matches(expression)) {
			System.out.println("Accepted Valid Last Name");
		}
		else {
			System.out.println("First letter Should be capital, minimum 3 characters");
			invalid = 1;
		}
		if(invalid == 1) {
			validateLastName();
		}
	}

	public void validateEmail() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Valid Email : ");
		String email = scanner.nextLine();

		String expression = "^[0-9a-zA-Z]+([.])?([-_\\+])?([0-9A-Za-z])*[@]{1}([0-9A-Za-z])+[.]{1}[a-z)]+[.]*[a-z]*$";
		int invalid = 0;

		if(email.matches(expression)) {
			System.out.println("Accepted Valid Email Address");
		}
		else {
			System.out.println("Enter valid email");
			invalid = 1;
		}
		if(invalid == 1) {
			validateEmail();
		}
	}

	public void validatePhoneNumber() {
		System.out.println("Enter Phone Number : ");
		Scanner scanner = new Scanner(System.in);
		String phoneNumber = scanner.nextLine();

		String expression = "^[+]{1}[0-9]{2,3}[ ][0-9]{10}";
		int invalid = 0;

		if(phoneNumber.matches(expression)) {
			System.out.println("Accepted Valid Phone Number");
		}
		else {
			System.out.println("Invalid Phone Number");
			invalid = 1;
		}
		if(invalid == 1) {
			validatePhoneNumber();
		}

	}

	public void validatePassword() {
		System.out.println("Rules : \n 1) Password should contain minimum 8 characters. \n 2) Password shoud contain atleast 1 upper case character.");

		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();

		String expression = "[a-z]{7,}[A-Z]{1,}";
		int invalid = 0;

		if(password.matches(expression)) {
			System.out.println("Accepted Password");
		}
		else {
			System.out.println("Follow the Rules for Password");
			invalid = 1;
		}
		if(invalid == 1) {
			validatePassword();
		}
	}

	public static void main(String[] args){

		UserRegistration uservalidation = new UserRegistration();
		uservalidation.validateFirstName();
		uservalidation.validateLastName();
		uservalidation.validateEmail();
		uservalidation.validatePhoneNumber();
		uservalidation.validatePassword();

	}
}
