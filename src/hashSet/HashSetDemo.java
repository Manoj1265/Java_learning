package hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSetDemo hset = new HashSetDemo();
		HashSet<String> hashSet = getHashSet();
//		hset.getSizeHS();
//		hset.emptyHS();
//		hset.isEmpty();
//		hset.cloneHS();
//		hset.convertToAL();
//		hset.convertToTreeSet();
//		hset.findNumTS();
//		hset.compareHS();
//		hset.compareAndRetainHS();
		hset.removeAllHS();

	}

	public static HashSet<String> getHashSet() {
		HashSet<String> mSet = new HashSet<String>();
		mSet.add("Pink");
		mSet.add("Red");
		mSet.add("Orange");
		mSet.add("Blue");
		return mSet;
	}

//	Write a Java program to append the specified element to the end of a hash set.
	public void appendElementHS() {
		HashSet<String> hashSet = getHashSet();
		hashSet.add("Black");
		System.out.println("New HashSet : " + hashSet);
	}

//	 Write a Java program to iterate through all elements in a hash list.
	public void iterateHS() {
		HashSet<String> hashSet = getHashSet();
		for (String color : hashSet) {
			System.out.println(color);
		}
	}

//	Write a Java program to get the number of elements in a hash set.
	public void getSizeHS() {
		HashSet<String> hashSet = getHashSet();
		int size = hashSet.size();
		System.out.println("The Size of HashSet : " + size);
	}

//	Write a Java program to empty an hash set.
	public void emptyHS() {
		HashSet<String> hashSet = getHashSet();
		hashSet.removeAll(hashSet);
		System.out.println("The hash set isEmpty : " + hashSet.isEmpty());
	}

//	Write a Java program to test if a hash set is empty or not.
	public void isEmpty() {
		HashSet<String> hashSet = getHashSet();
		System.out.println("The hash set isEmpty : " + hashSet.isEmpty());
	}

//	Write a Java program to clone a hash set to another hash set.
	public void cloneHS() {
		HashSet<String> hashSet = getHashSet();
		HashSet<String> cloneSet = (HashSet<String>) hashSet.clone();
		System.out.println(cloneSet);
	}

//	Write a Java program to convert a hash set to an array.
	public void convertToAL() {
		HashSet<String> hashSet = getHashSet();
		System.out.println("The HashSet : " + hashSet);
		String[] array = new String[hashSet.size()];
		hashSet.toArray(array);
		System.out.println("After coverting to array : ");
		for (String color : array) {
			System.out.println(color);
		}
	}

//	Write a Java program to convert a hash set to a tree set.
	public void convertToTreeSet() {
		HashSet<String> hashSet = getHashSet();
		System.out.println("The original HashSet : " + hashSet);
		Set<String> treeSet = new TreeSet<String>(hashSet);
		System.out.println("The tree set elements : ");
		for (String color : treeSet) {
			System.out.println(color);
		}
	}

//	Write a Java program to find numbers less than 7 in a tree set.
	public void findNumTS() {
		Set<Integer> nSet = new TreeSet<Integer>();
		nSet.add(45);
		nSet.add(6);
		nSet.add(4);
		nSet.add(0);
		nSet.add(98);
		nSet.add(101);
		System.out.println("The number that are less than 7 are : ");
		for (int number : nSet) {
			if (number < 7) {
				System.out.println(number);
			}
		}
	}

//	Write a Java program to compare two hash set.
	public void compareHS() {
		HashSet<String> hashSet = getHashSet();

		HashSet<String> hSet = new HashSet<String>();
		hSet.add("Blue");
		hSet.add("Green");
		hSet.add("Black");
		hSet.add("Red");
		hSet.add("Grey");
		hSet.add("Brown");

		for (String color : hashSet) {
			System.out.println(hSet.contains(color) ? "matched" : "Not matched");
		}
	}

//	Write a Java program to compare two sets and retain elements that are the same.
	public void compareAndRetainHS() {
		HashSet<String> hashSet = getHashSet();

		HashSet<String> hSet = new HashSet<String>();
		hSet.add("Blue");
		hSet.add("Green");
		hSet.add("Black");
		hSet.add("Red");
		hSet.add("Grey");
		hSet.add("Brown");

//		HashSet<String> resultSet = new HashSet<String>();
//		for (String color : hSet) {
//			if (hashSet.contains(color)) {
//				resultSet.add(color);
//			}
//		}
//		System.out.println("Result after comparison and Retaintion : " + resultSet);

//		shortcut
		hSet.retainAll(hashSet);
		System.out.println("After retaintion : " + hSet);
	}

//	 Write a Java program to remove all elements from a hash set.
	public void removeAllHS() {
		HashSet<String> hashSet = getHashSet();
//		hashSet.removeAll(hashSet);
		hashSet.clear();
		System.out.println("Is Hashset is Empty : " + hashSet.isEmpty());
	}
}
