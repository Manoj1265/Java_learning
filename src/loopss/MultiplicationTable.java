package loopss;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Welcome to Multiplication Table");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number for Multiplication : ");
		int number = input.nextInt();
		printTable(number);
		input.close();
	}
	
	public static void printTable(int num) {
		for(int i =1; i<=10; i++) {
			System.out.println(num+" x "+i+" : " +num*i);
		}
	}
}
