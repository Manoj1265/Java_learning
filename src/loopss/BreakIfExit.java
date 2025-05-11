package loopss;

import java.util.Scanner;

public class BreakIfExit {

	public static void main(String[] args) {
		System.out.println("Welcome to Read input form User");
		Scanner input = new Scanner(System.in);
		String userInput;
		
		do {
			System.out.print("Please Enter your input : ");
			userInput = input.next();
		}while(!userInput.equalsIgnoreCase("exit"));
		System.out.println("Do while Ended");
		
		for(int i=0; i<Integer.MAX_VALUE; i++) {
			System.out.print("Please Enter your input : ");
			userInput = input.next();
			if(userInput.equalsIgnoreCase("exit")) {
				break;
			}
		}
		System.out.println("For loop Ended");
		
		while(true) {
			System.out.print("Please Enter your input : ");
			userInput = input.next();
			if(userInput.equalsIgnoreCase("exit")) {
				break;
			}
		}
		System.out.println("You are out of loop successfully");
		input.close();
	}
}
