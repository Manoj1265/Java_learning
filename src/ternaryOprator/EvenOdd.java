package ternaryOprator;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Welcome to Even Odd Validator");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int number = input.nextInt();
		String result = number%2==0? "Even":"Odd";
		System.out.println("Your Number is " + result);
		input.close();
	}
}
