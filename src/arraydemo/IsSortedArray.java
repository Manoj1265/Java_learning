package arraydemo;

public class IsSortedArray {

	public static void main(String[] args) {
		System.out.println("Welcome to Array sorted Validator");
		int[] numArray = ArrayUtility.arrayBuilder();
		boolean increasing = isIncreasing(numArray);
		boolean decreasing = isDecreasing(numArray);
		if(increasing || decreasing) {
			System.out.println("Your Array is sorted");
		}else {
			System.out.println("Your Array is not sorted");
		}
	}
	
	public static boolean isIncreasing(int[] numArray) {
		int i = 1;
		while(i<numArray.length) {
			if(numArray[i] < numArray[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static boolean isDecreasing(int[] numArray) {
		int i = 1;
		while(i<numArray.length) {
			if(numArray[i] > numArray[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}
}
