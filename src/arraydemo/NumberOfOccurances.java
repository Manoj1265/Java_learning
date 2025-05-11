package arraydemo;

import java.util.Scanner;

public class NumberOfOccurances {

	public static void main(String[] args) {
		System.out.println("Welcome to Number of Occurances Program");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number to find Occurances : ");
		int numberToFind = input.nextInt();
		int[] numArray = ArrayUtility.arrayBuilder();
		int occurances = numberOfOccurances(numArray, numberToFind);
		System.out.println("Your Number Occurces " + occurances + " time.");
		input.close();
	}

	public static int numberOfOccurances(int[] numArray, int numberToFind) {
		int occurance = 0;
		int i = 0;
		while (i < numArray.length) {
			if (numArray[i] == numberToFind) {
				occurance++;
			}
			i++;
		}
		return occurance;
	}
}
