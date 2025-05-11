package arraydemo;

public class SumAndAverage2DArray {

	public static void main(String[] args) {
		System.out.println("Welcome to 2D Sum and Avarage");
		int[][] numArray = ArrayUtility.inpu2DArray();
		long sum = sum2DArray(numArray);
		double average = average2DArray(numArray);
		System.out.println("The Sum of your Array is : "+ sum);
		System.out.println("The Average of your Array is : "+ average);
	}
	
	public static long sum2DArray(int[][] numArray) {
		long sum = 0;
		int i = 0;
		while(i<numArray.length) {
			int j = 0;
			while(j<numArray[i].length) {
				sum+=numArray[i][j];
				j++;
			}
			i++;
		}
		return sum;
	}
	
	public static double average2DArray(int[][] numAraay) {
		if (numAraay.length==0) {
			return 0;
		}
		int rows = numAraay.length;
		int cols = numAraay[0].length;
		int size = rows * cols;
		long sum = sum2DArray(numAraay);
		return sum/size;
	}
}
