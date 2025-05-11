package arraydemo;

import java.util.Scanner;

public class DeletingNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to number deletion Array");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number you want to delete : ");
		int	numberToDelete = input.nextInt();
		int[] numArray = ArrayUtility.arrayBuilder();
		int[] newArray = deletedArray(numArray, numberToDelete);
		System.out.println("Here is your new Array : ");
		ArrayUtility.displayArray(newArray);
		input.close();
	}

	public static int[] deletedArray(int[] numArray, int numberToDelete) {
		int numberOfOccurances = NumberOfOccurances.numberOfOccurances(numArray, numberToDelete);
		if (numberOfOccurances == 0) {
			return numArray;
		}
		int newSize = numArray.length - numberOfOccurances;
		int[] newArray = new int[newSize];
		int i = 0, j = 0;
		while (i < numArray.length) {
			if (numArray[i] != numberToDelete) {
				newArray[j] = numArray[i];
				j++;
			}
			i++;
		}
		return newArray;
	}
}
