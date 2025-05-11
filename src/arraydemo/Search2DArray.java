package arraydemo;

import java.util.Scanner;

public class Search2DArray {

	public static void main(String[] args) {
		System.out.println("Welcome to 2D Array Search");
		int[][] numArray = ArrayUtility.inpu2DArray();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number you want to search : ");
		int numberToFind = input.nextInt();
		boolean isFound = searchNumber(numArray, numberToFind);
		if (isFound) {
			System.out.println("Your Number is Found");
		} else {
			System.out.println("Your Number is not Found");
		}
		input.close();
	}

	public static boolean searchNumber(int[][] numArray, int num) {
		int i = 0;
		while (i < numArray.length) {
			int j = 0;
			while (j < numArray[i].length) {
				if (numArray[i][j] == num) {
					return true;
				}
				j++;
			}
			i++;
		}
		return false;
	}
}
