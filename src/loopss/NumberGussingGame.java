package loopss;

import java.util.Scanner;

public class NumberGussingGame {

	public static void main(String[] args) {
		System.out.println("Welcome to number Guessing Game");
		Scanner input = new Scanner(System.in);
		System.out.println("Guess Number between 1 - 10 ");
		int systemNum = 4;
		int yourNum;
		do {
			System.out.print("Please Enter Your Number : ");
			yourNum= input.nextInt();
		}while(yourNum!=systemNum);
		System.out.println("Your Guess is correct");
		input.close();
	}
}
