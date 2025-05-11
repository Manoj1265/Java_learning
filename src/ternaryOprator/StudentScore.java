package ternaryOprator;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Score Nested Ternary");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your marks : ");
		int marks = input.nextInt();
		String result = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
		System.out.println("Your marks status is : "+ result);
		input.close();
	}
}
