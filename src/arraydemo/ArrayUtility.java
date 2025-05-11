package arraydemo;

import java.util.Scanner;

public class ArrayUtility {

	public static int[] arrayBuilder() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the numbers of Elements : ");
		int size = input.nextInt();
		int[] numArray = new int[size];
		int i = 0;
		while (i < numArray.length) {
			System.out.print("Please Enter Your " + (i + 1) + " Number : ");
			numArray[i] = input.nextInt();
			i++;
		}
		input.close();
		return numArray;
	}

	public static void displayArray(int[] numArray) {
		int i = 0;
		while (i < numArray.length) {
			System.out.print(numArray[i] + " ");
			i++;
		}
		System.out.println();
	}

	public static int[][] inpu2DArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the numbers of row : ");
		int row = input.nextInt();
		System.out.print("Please Enter the numbers of column : ");
		int column = input.nextInt();
		int[][] numArray = new int[row][column];
		int i = 0;
		while (i < numArray.length) {
			int j = 0;
			while (j < numArray[i].length) {
				System.out.print("Please Enter Your " + (i + 1) + " row, column " + (j + 1) + ": ");
				numArray[i][j] = input.nextInt();
				j++;
			}
			i++;
		}
		input.close();
		return numArray;
	}
}
	