package stringdemo;

import java.util.Scanner;

public class ConcatenateAndConvert {

	public static void main(String[] args) {
		System.out.println("Welcome !! ");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first string : ");
		String str1 = input.next();
		System.out.print("Enter your second string : ");
		String str2 = input.next();
		String mainString = (str1+str2).toUpperCase();
		System.out.println(mainString);
		input.close();
	}
}
