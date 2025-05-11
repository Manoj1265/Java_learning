package classAndObjects;

public class Course {

	static int maxCapacity=100;
	
	String courseName;
	int enrollement;
	String[] enrolledStudents; 

	Course(String courseName){
		this.courseName= courseName;
		this.enrollement=0;
		enrolledStudents = new String[maxCapacity];
	}
	public void enrolledStudent(String StudentName) {
		enrolledStudents[enrollement]=StudentName;
		System.out.println(StudentName + "Added");
	}

	public void unenrolledStudent(String StudentName) {
		System.out.println("Student unenrolled");
	}
	
	public static void setMaxCapacity(int capacity) {
		Course.maxCapacity=capacity;
	}
}
