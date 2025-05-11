package loopss;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Password Checker");
		String password;
		do {
			System.out.print("Please Enter Your Password : ");
			password = input.next();
		}while(!passwordValidator(password));
		System.out.println("Thanks for entering valid password");
		input.close();
	}
	
	public static boolean passwordValidator(String password) {
		return password.length()>6;
	}
}
