package stringdemo;

public class StudentToString {

	String name;
	int age;
	
	StudentToString(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Student Details : { name: "+name+", age: "+age
				+ "}";
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Use of to String method in String class");
		StudentToString student = new StudentToString("manoj", 25);
		System.out.println(student);
	}
}

	
