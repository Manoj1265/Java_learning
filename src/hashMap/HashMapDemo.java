package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
//		System.out.println("HashMaps");
		HashMapDemo hmd = new HashMapDemo();
//		hmd.createHM();
//		hmd.countHM();
//		hmd.copyHM();
//		hmd.removeAllHM();
//		hmd.shallowCopyHM();
//		hmd.mappingValueofKeyHM();
//		hmd.mappingKeyOfValueHM();
//		hmd.createSetFromHM();
//		hmd.getValueOfKey();
//		hmd.getCollectionViewOfValuesHM();
		hmd.loopingHM();
	}
//	 Write a Java program to associate the specified value with the specified key in a HashMap.
	public void createHM() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Vue");
		map.put(2, "Yellow");
		map.put(3, "Pink");
		map.put(4, "Red");
		System.out.println(map);
		for (Entry x : map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}

//	Write a Java program to count the number of key-value (size) mappings in a map.
	public void countHM() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Vue");
		map.put(2, "Yellow");
		map.put(3, "Pink");
		map.put(4, "Red");
		System.out.println(map.size());
	}

//	Write a Java program to copy all mappings from the specified map to another map.
	public void copyHM() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> copy = new HashMap<Integer, String>();

		map.put(1, "Vue");
		map.put(2, "Yellow");
		map.put(3, "Pink");
		map.put(4, "Red");
		System.out.println(map);
		copy.put(5, "Vue");
		copy.put(6, "White");
		copy.put(7, "Blue");
		copy.put(8, "Black");
		System.out.println(copy);

		map.putAll(copy);
		System.out.println(map);
	}

//	Write a Java program to remove all mappings from a map
//	Write a Java program to check whether a map contains key-value mappings (empty) or not.
	public void removeAllHM() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Vue");
		map.put(2, "Yellow");
		map.put(3, "Pink");
		map.put(4, "Red");
		System.out.println("Map before removing all elements : " + map);
		map.clear();
		System.out.println(map.isEmpty());
	}

//	Write a Java program to get a shallow copy of a HashMap instance.
	public void shallowCopyHM() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Vue");
		map.put(2, "Yellow");
		map.put(3, "Pink");
		map.put(4, "Red");
//		String cloneMap = map.clone().toString();
		HashMap<Integer, String> cloneMap = (HashMap) map.clone();
		System.out.println(cloneMap);
	}

//	 Write a Java program to test if a map contains a mapping for the specified key.
	public void mappingValueofKeyHM() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Vue");
		map.put(2, "Yellow");
		map.put(3, "Pink");
		map.put(4, "Red");
		boolean containsKey = map.containsKey(2);
		System.out.println(containsKey);
		if (map.containsKey(3)) {
			System.out.print("The exists with value : " + map.get(3));
		} else {
			System.out.println("Not exist");
		}
	}

//	Write a Java program to test if a map contains a mapping for the specified value.
	public void mappingKeyOfValueHM() {
		HashMap<Object, String> map = new HashMap<Object, String>();
		map.put(2, "Green");
		map.put("Color", "White");
		map.put(10.9, "7654");
		map.put("Job", "Automation");

		if (map.containsValue("Automation")) {
			System.out.println("Yes Exist");
		} else {
			System.out.println("Not Exist");
		}
	}

//	Write a Java program to create a set view of the mappings contained in a map.
	public void createSetFromHM() {
		HashMap<Object, String> map = new HashMap<Object, String>();
		map.put(2, "Green");
		map.put("Color", "White");
		map.put(10.9, "7654");
		map.put("Job", "Automation");

//		Write a Java program to get a set view of the keys contained in this map.
		Set<Object> keySet = map.keySet();
		System.out.println(keySet);

		Set<Entry<Object, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
	}

//	Write a Java program to get the value of a specified key in a map.
	public void getValueOfKey() {
		HashMap<Object, String> map = new HashMap<Object, String>();
		map.put(2, "Green");
		map.put("Color", "White");
		map.put(10.9, "7654");
		map.put("Job", "Automation");

		if (map.containsKey(10.9)) {
			System.out.println("Yes Key Exist with Value : " + map.get(10.9));
		} else {
			System.out.println("Not Exist");
		}
	}

//	Write a Java program to get a collection view of the values contained in this map.
	public void getCollectionViewOfValuesHM() {
		HashMap<Object, String> map = new HashMap<Object, String>();
		map.put(2, "Green");
		map.put("Color", "White");
		map.put(10.9, "7654");
		map.put("Job", "Automation");

		Set<Object> keys = map.keySet();
		for (Object key : keys) {
			System.out.println(key + " : " + map.get(key));
		}

		System.out.println("Collection<String> view of map : " + map.values());

	}

//	loops on Hash Map
	public void loopingHM() {
		HashMap<Object, String> map = new HashMap<Object, String>();
		map.put(2, "Green");
		map.put("Color", "White");
		map.put(10.9, "7654");
		map.put("Job", "Automation");

		for (Entry<Object, String> value : map.entrySet()) {
			Object key = value.getKey();
			String val = value.getValue();
			System.out.println(key + " : " + val);
		}
	}

}
