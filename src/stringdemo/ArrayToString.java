package stringdemo;

public class ArrayToString {

	public static void main(String[] args) {
		String[] strArr = new String[] {
				"I", " am", " curious", " to", " learn", " Java", " and", " its", " implimentations"
		};
		
		StringBuilder sbuilder =new StringBuilder();
		
		for (String string : strArr) {
			sbuilder.append(string);
		}
		System.out.println(sbuilder);
	}
}
