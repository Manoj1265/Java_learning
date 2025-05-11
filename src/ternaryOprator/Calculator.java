package ternaryOprator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Calulator for Calculations");
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your number : ");
		int num1 = input.nextInt();
		System.out.print("Now, enter your another number : ");
		int num2 = input.nextInt();
		System.out.print("Now, enter the opration your want to perform : ");
		String opration = input.next();
		int result = 0;
		switch (opration) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("We don't support this operation");
			break;
		}
		System.out.println("Your Result is : " + result);
		input.close();
	}

}
