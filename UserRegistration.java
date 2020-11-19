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



	public static void main(String[] args){

		UserRegistration uservalidation = new UserRegistration();
		uservalidation.validateFirstName();

	}
}
