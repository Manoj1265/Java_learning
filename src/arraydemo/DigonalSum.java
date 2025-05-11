package arraydemo;

public class DigonalSum {
//	for Digonal Sum Assume both Arrays are homogeneous (both indexes are same)

	public static void main(String[] args) {
		System.out.println("Welcome to Digonal Sum of Array");
		int[][] numArray = ArrayUtility.inpu2DArray();
		long sum = sumOfDigonal(numArray);
		System.out.println("Sum of dignonal is : " + sum);
	}

	public static long sumOfDigonal(int[][] numArray) {
		long sumOfLeftDigonal = sumOfLeftDigonal(numArray);
		long sumOfRightDigonal = sumOfRightDigonal(numArray);
		long sum = sumOfLeftDigonal+sumOfRightDigonal;
		if(numArray.length%2!=0) {
			int ind = numArray.length/2;
			sum-=numArray[ind][ind];
		}
		return sum;
	}

	public static long sumOfLeftDigonal(int[][] numArray) {
		long sum = 0;
		int i = 0;
		while (i < numArray.length) {
			sum += numArray[i][i];
			i++;
		}
		return sum;
	}
	
	public static long sumOfRightDigonal(int[][] numArray) {
		long sum = 0;
		int i = 0;
		while (i < numArray.length) {
			int col = (numArray.length-1)-i;
			sum+=numArray[i][col];
			i++;
		}
		return sum;
	}
}
