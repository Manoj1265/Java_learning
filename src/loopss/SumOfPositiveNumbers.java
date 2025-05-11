package loopss;

import arraydemo.ArrayUtility;

public class SumOfPositiveNumbers {

	public static void main(String[] args) {
		System.out.println("Welcome to All Positive Sum Program");
		int[] numArray = ArrayUtility.arrayBuilder();
		int sum = 0;
		for(int number : numArray) {
			if(number<0) {
				continue;
			}else {
				sum+=number;
			}
		}
		System.out.println("Sum of all Positive Numbers is : "+ sum);
	}
	
}
