package arraydemo;

public class PalindromArray {

	public static void main(String[] args) {
		System.out.println("Welcome to Palindrome Array");
		int[] numArray = ArrayUtility.arrayBuilder();
		boolean palindrom = isPalindrom(numArray);
		if(palindrom) {
			System.out.println("Your Array is Palindrom");
		}else {
			System.out.println("Your Array is not Palindrom");
		}
		
	}
	
	public static boolean isPalindrom(int[] arr) {
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=arr[(arr.length-1)-i]) {
				return false;
			}
			i++;
		}
		return true;
	}
}
