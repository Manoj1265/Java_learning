package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {

	public double areaOfCircle(double radius) {
		return (Math.PI)*(Math.pow(radius, 2));
	}
	
	public long areaOfRectangle(double width, double length) {
		return (long) (length*width);
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Rectangle rect = new Rectangle(4,5);
		
		Calculator areaCal= new Calculator();
		double areaOfCircle = areaCal.areaOfCircle(circle.radiusInCm)	;
		long areaOfRectangle = areaCal.areaOfRectangle(rect.length, rect.width);
		
		System.out.printf("The Area of Circle is : %f \nThe Area of Rectangle is : %d", areaOfCircle, areaOfRectangle);
	}
}
