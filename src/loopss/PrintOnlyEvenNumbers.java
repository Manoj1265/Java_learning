package loopss;

import arraydemo.ArrayUtility;

public class PrintOnlyEvenNumbers {

	public static void main(String[] args) {
		System.out.println("Welcome to All Positive Sum Program");
		int[] numArray = ArrayUtility.arrayBuilder();
		System.out.print("Your Even number are : ");
		for (int number : numArray) {
			if (number % 2 !=0) {
				continue;
			} 
			System.out.println(" "+number);
		}
	}
}
