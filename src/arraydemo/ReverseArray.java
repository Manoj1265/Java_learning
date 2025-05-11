package arraydemo;

public class ReverseArray {
	public static void main(String[] args) {
		System.out.println("Welcome to Array Reverse");
		int[] yourArray = ArrayUtility.arrayBuilder();
		reverseArray(yourArray);
		System.out.println("Your Reverse Array is : ");
		ArrayUtility.displayArray(yourArray);
	}
	
	public static void reverseArray(int[] arr) {
		int i=0;
		while(i<arr.length/2) {
			int swap=arr[i];
			arr[i]=arr[(arr.length-1)-i];
			arr[(arr.length-1)-i] = swap;
			i++;
		}
	}
}