package ternaryOprator;

import java.util.Scanner;

public class MinimumNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to Minimum Number Finder");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num1 = input.nextInt();
		System.out.print("Now, Enter your another number : ");
		int num2 = input.nextInt();
		int miniumumNumber = num1<num2? num1:num2;
		System.out.println("The minimum number is : "+miniumumNumber);
		input.close();
	}
}
