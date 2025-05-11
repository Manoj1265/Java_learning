package ternaryOprator;

import java.util.Scanner;

public class AbsoluteNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to Absolute Number");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int number = input.nextInt();
		int result = number >= 0 ? number : -number;
		System.out.println("Your Absolute Number is : "+result);
		input.close();
	}
}
