package loopss;

import java.util.Scanner;

import arraydemo.ArrayUtility;

public class OccuranceNumberForEach {

	public static void main(String[] args) {
		System.out.println("Welcome to Occurance of Specific number");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number your want to find : ");
		int numberToFind = input.nextInt();
		int[] numArray = ArrayUtility.arrayBuilder();
		int occuranceCount = occurancesOfNumber(numArray, numberToFind);
		System.out.println("Your Number Occured for "+occuranceCount+ " times");
		input.close();
	}
	
	public static int occurancesOfNumber(int[] numArray, int num) {
		int occurance = 0;
		for(int number : numArray) {
			if(number==num) {
				occurance++;
			}
		}
		return occurance;
	}
}
