package arraydemo;

public class MergeArray {
	//Not Understood
	public static void main(String[] args) {
		System.out.println("Welcome to Merge Array");
		int[] arr1 = ArrayUtility.arrayBuilder();
		int[] arr2 = ArrayUtility.arrayBuilder();
		int[] mergeArray = merge(arr1, arr2);
		System.out.println("Here is your new array : ");
		ArrayUtility.displayArray(mergeArray);
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int newSize = arr1.length + arr2.length;
		int[] newArray = new int[newSize];
		int i = 0, j = 0, k = 0;
		while(i<arr1.length || j<arr2.length) {
			if(j==arr2.length || (i<arr1.length && arr1[i]<arr2[j])) {
				newArray[k]=arr1[i];
				i++;
				k++;
			}else {
				newArray[k]=arr2[j];
				j++;
				k++;
			}
		}
		return newArray;
	}
}
