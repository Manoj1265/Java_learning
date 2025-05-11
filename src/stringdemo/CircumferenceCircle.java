package stringdemo;

import java.util.Scanner;

public class CircumferenceCircle {

	public static void main(String[] args) {
		System.out.println("Welcome to circle Calculations ");
		System.out.print("Enter radius of circle : ");
		Scanner input = new Scanner(System.in);
		float radius = input.nextFloat();
		double circumference = circumference(radius);
		double areaOfCircle = areaOfCircle(radius);
		System.out.println("Circumference of circle is : " + circumference+ "\nand Area of circle is : "+areaOfCircle);
		input.close();
	}
	
	public static double circumference(float radius) {
		return 2 * Math.PI * radius;
	}
	
	public static double areaOfCircle(float radius) {
		return Math.PI*Math.pow(radius, 2);
	}
}
