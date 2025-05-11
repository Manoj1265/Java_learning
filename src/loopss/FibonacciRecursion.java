package loopss;

import java.util.Scanner;

public class FibonacciRecursion {

	public static void main(String[] args) {
		System.out.println("Welcome to fibonacci series Recursion");
		System.out.print("Enter the number for fibonacci series :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for(int i=1; i<=number; i++) {
			System.out.print(fibonacciRecursion(i) + " ");
		}
		input.close();
	}
	
	public static int fibonacciRecursion(int position) {
		if(position==1) {
			return 0;
		}
		if (position==2) {
			return 1;
		}
		
		return fibonacciRecursion(position-1)+fibonacciRecursion(position-2);
	}
}
