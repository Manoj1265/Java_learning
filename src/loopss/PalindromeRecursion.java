package loopss;

import java.util.Scanner;

public class PalindromeRecursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Palindrome Checker");
		System.out.print("Enter the String to check Palindrome : ");
		String str = input.next();
		System.out.println("Your String is " + (isPalindorme(str) ? "Palindorme" : "Not Palindrome"));
		input.close();
	}

	public static boolean isPalindorme(String str) {
		if (str.length() <= 1) {
			return true;
		}
		int lastPosition = str.length() - 1;
		if (str.charAt(0) != str.charAt(lastPosition)) {
			return false;
		}
		String newStr = str.substring(1, lastPosition);
		return isPalindorme(newStr);
	}
}
