package arraydemo;

public class SumAndAverage {

	public static void main(String[] args) {
		System.out.println("Welcome To Array Sum and Avarage");
		int[] numArray = ArrayUtility.arrayBuilder();
		long sum = sum(numArray);
		double average = average(numArray);
		System.out.println("Sum of Your Array is : "+ sum);
		System.out.println("Average of Your Array is : "+ average);
	}
	
	public static long sum(int[] numArray) {
		int sum = 0 ;
		int i=0;
		while(i<numArray.length) {
			sum+=numArray[i];
			i++;
		}
		return sum;
	}
	
	public static double average(int[] numArray) {
		long sum = sum(numArray);
		return sum/numArray.length;
	}
	
}
