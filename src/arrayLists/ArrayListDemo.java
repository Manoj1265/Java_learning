package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
//		System.out.println("JAVA Practice Set Start at 14-12-2024");
		ArrayListDemo al = new ArrayListDemo();
//		al.craeteArrayList();
//		al.iterateArrayList();
//		al.insertElementAL();
//		al.getElementAL();
//		al.updateElementAL();
//		al.removeElementAL();
//		al.searchElementAL();
//		al.sortAL();
//		al.copyAL();
//		al.shuffleAL();
//		al.reverseAL();
//		al.extractPortionAL();
//		al.compareAL();
//		al.swapElementAL();
//		al.joinAL();
//		al.cloneAL();
//		al.emptyAL();
//		al.isEmptyAL();
//		al.trimmingCapacityAL();
//		al.increaseSizeAL();
//		al.replaceElementAL("Pink");
		al.printALwithElementPosition();
	}

//	Write a Java program to create an array list, add some colors (strings) and print out the collection.
	public void craeteArrayList() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");
		System.out.println(mList);
	}

//	Write a Java program to iterate through all elements in an array list.
	public void iterateArrayList() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		for (String color : mList) {
			System.out.println("The color is : " + color);
		}
	}

//	Write a Java program to insert an element into the array list at the first position.
	public void insertElementAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");
		System.out.println("List Before Insertion : " + mList);

		mList.add(0, "White");
		System.out.println("List After Insertion : " + mList);
	}

//	Write a Java program to retrieve an element (at a specified index) from a given array list.
	public void getElementAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");
		System.out.println(mList.get(4));
	}

//	Write a Java program to update an array element by the given element.
	public void updateElementAL() {
		String givenElement = "Pink";

		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");
		mList.set(3, givenElement);
		System.out.println("Elements after Updation : " + mList);
	}

//	Write a Java program to remove the third element from an array list.
	public void removeElementAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");
		mList.remove(2);
		System.out.println("After Removing Element from List : " + mList);
	}

//	Write a Java program to search for an element in an array list.
	public void searchElementAL() {
		String elementToBeSearched = "voilet";

		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");
//		for(String color : mList) {
//			if(color.equalsIgnoreCase(elementToBeSearched)) {
////				return true;
//				System.out.println("Element found : " + elementToBeSearched);
//			}
//		}
		if (mList.contains(elementToBeSearched)) {
			System.out.println("Element found..");
		} else {
			System.out.println("Element not found");
		}
	}

//	Write a Java program to sort a given array list
	public void sortAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");
		System.out.println("List before sort : " + mList);
		Collections.sort(mList);
		System.out.println("List after sort : " + mList);
		Collections.sort(mList, Collections.reverseOrder());
		System.out.println("List after reverse sort : " + mList);
	}

//	Write a Java program to copy one array list into another.
	public void copyAL() {
		List<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		List<String> sList = mList;
		System.out.println(sList);

		List<String> cList = new ArrayList<String>();
		cList.add("Manoj");
		cList.add("Kumar");
		cList.add("Prajapati");
		Collections.copy(mList, cList);
		System.out.println("List after copy : ");
		System.out.println("mList : " + mList);
		System.out.println("cList : " + cList);
	}

//	Write a Java program to shuffle elements in an array list.
	public void shuffleAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		System.out.println("List before suffle : " + mList);
		Collections.shuffle(mList);
		System.out.println("List After suffle : " + mList);
	}

//	 Write a Java program to reverse elements in an array list.
	public void reverseAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		System.out.println("Before reversing List : " + mList);
		Collections.reverse(mList);
		System.out.println("After reversing List : " + mList);
	}

//	Write a Java program to extract a portion of an array list.
	public void extractPortionAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		System.out.println("Before extraction : " + mList);
		List<String> subList = mList.subList(0, 3);
		System.out.println("After extraction : " + subList);

		ArrayList<String> extractList = new ArrayList<String>();
		extractList.add(mList.get(0));
		extractList.add(mList.get(3));
		extractList.add(mList.get(4));
		System.out.println("New Extracted list : " + extractList);
	}

//	Write a Java program to compare two array lists.
	public void compareAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		ArrayList<String> nList = new ArrayList<String>();
		nList.add("Yellow");
		nList.add("Pink");
		nList.add("Red");
		nList.add("Green");
		nList.add("Purple");

		ArrayList<String> oList = new ArrayList<String>();

		for (String color : mList) {
//			oList.add(nList.contains(color) ? "Yes" : "No");
			if (!nList.contains(color)) {
				oList.add(color);
			}
		}
		System.out.println("The New List " + oList);
	}

//	Write a Java program that swaps two elements in an array list.
	public void swapElementAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");
		System.out.println("Before Swap : " + mList);
		Collections.swap(mList, 1, 4);
		System.out.println("After Swap : " + mList);
	}

//	Write a Java program to join two array lists.
	public void joinAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		ArrayList<String> nList = new ArrayList<String>();
		nList.add("Pink");
		nList.add("Red");
		nList.add("Voilet");
		nList.add("White");
		nList.add("Indigo");

		System.out.println("Before joining Arraylist : " + mList);
//		for(String color : nList) {
//			mList.add(color);
//		}
//		System.out.println("After joining Arraylist : " + mList);

//		or another way
		ArrayList<String> oList = new ArrayList<String>();
		oList.addAll(mList);
		oList.addAll(nList);
		System.out.println("New List after joining : " + oList);
	}

//	Write a Java program to clone an array list to another array list.
	public void cloneAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

//		ArrayList<String> nList = new ArrayList<String>();
		Object clone = mList.clone();
		String clonedAl = clone.toString();
		System.out.println(clonedAl);
		ArrayList<String> nList = (ArrayList<String>) mList.clone();
		System.out.println("Cloned ArrayList : " + nList);
	}

//	Write a Java program to empty an array list.
	public void emptyAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		System.out.println("Before clearing : " + mList);
//		mList.clear();
//		or 
		mList.removeAll(mList);
		System.out.println(mList.isEmpty());
	}

//	Write a Java program to test whether an array list is empty or not.
	public void isEmptyAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");
		System.out.println("The List is Empty : " + mList.isEmpty());
	}

//	Write a Java program for trimming the capacity of an array list.
	public void trimmingCapacityAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		mList.trimToSize();
		System.out.println("After trim : " + mList);
	}

//	Write a Java program to increase an array list size.
	public void increaseSizeAL() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		int size = mList.size();
		System.out.println("Current Size : " + size);
		System.out.println("Current ArrayList : " + mList);

		mList.ensureCapacity(6);
		mList.add("Pink");
		mList.add("White");
		mList.add("Brown");

		System.out.println("The New ArrayList after increasing size : " + mList);
		System.out.println("New Array Size : " + mList.size());
	}

//	 Write a Java program to replace the second element of an ArrayList with the specified element
	public void replaceElementAL(String valToInserted) {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		System.out.println("ArrayList before replacing : " + mList);
		Collections.replaceAll(mList, mList.get(1), mList.set(1, valToInserted));
		System.out.println("ArrayList after replacing : " + mList);
	}

//	Write a Java program to print all the elements of an ArrayList using the elements' position.
	public void printALwithElementPosition() {
		ArrayList<String> mList = new ArrayList<String>();
		mList.add("Yellow");
		mList.add("Blue");
		mList.add("Black");
		mList.add("Green");
		mList.add("Orange");

		for (int i = 0; i < mList.size(); i++) {
			System.out.println("The element at " + (i + 1) + " Position : " + mList.get(i));
		}

	}
}
