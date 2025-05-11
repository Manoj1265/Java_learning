package loopss;

import java.util.Scanner;

public class PrimeFor {

	public static void main(String[] args) {
		System.out.println("Welcome to Prime Number");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int number = input.nextInt();
		boolean isPrime = isPrime(number);
		System.out.println("Your Number is "+ (isPrime? "Prime":"Not Prime"));
		input.close();
	}
	
	public static boolean isPrime(int number) {
		if(number==1) {
			return true;
		}
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
}
