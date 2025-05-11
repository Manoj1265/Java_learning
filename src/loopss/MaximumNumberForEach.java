package loopss;

import java.util.Scanner;

public class MaximumNumberForEach {

	public static void main(String[] args) {
		System.out.println("Welcome to maximum value finder");
		int[] numArray = inputArray();
		int maxNumber = maxNumber(numArray);
		System.out.println("Maximum number in Your Array is : " + maxNumber);
	}

	public static int[] inputArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of element your want is Array : ");
		int number = input.nextInt();
		int[] numArray = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.print("Enter your " + (i + 1) + " number : ");
			int element = input.nextInt();
			numArray[i] = element;
		}
		input.close();
		return numArray;
	}

	public static int maxNumber(int[] numArray) {
		int max = Integer.MIN_VALUE;
		for (int number : numArray) {
			if (number > max) {
				max = number;
			}
		}
		return max;
	}
}
