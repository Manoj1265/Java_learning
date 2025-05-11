package arraydemo;

public class MaxMinNumber {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Maximum and Minimum Number");
		int[] numArray = ArrayUtility.arrayBuilder();
		int maximumNumber = maximumNumber(numArray);
		System.out.println("The maximum number in Array is : "+maximumNumber);
		int minimumNumber = minimumNumber(numArray);
		System.out.println("The minimum number in Array is : "+minimumNumber);
	}
	
	public static int maximumNumber(int[] numArray) {
		if(numArray.length==0) {
			return Integer.MIN_VALUE;
		}
		int maximum = 0;
		int i = 0;
		while(i<numArray.length) {
			if(numArray[i]>maximum) {
				maximum=numArray[i];
			}
			i++;
		}
		return maximum;
	}
	
	public static int minimumNumber(int[] numArray) {
		int minimum =Integer.MAX_VALUE;
		int i=0;
		while(i<numArray.length) {
			if(numArray[i]<minimum) {
				minimum=numArray[i];
			}
			i++;
		}
		return minimum;
	}
}
