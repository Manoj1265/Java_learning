package getInputs;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GetInputsFromUser {
	public static void main(String[] args) throws IOException {
//		getInputFromUser01();
//		getInputFromUser02();
//		getInputFromUser03();
//		getInputFromUser04(args);
		getInputFromUser05();
	}

	// Using Buffered Reader Class JDK1.0
	public static void getInputFromUser01() throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the text : ");
		String inputLine = bfr.readLine();
		System.out.println(inputLine);
	}

	// Using Scanner Class JDK1.5
	public static void getInputFromUser02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		System.out.println("Your entered String : " + str);

		System.out.print("Enter the Integer : ");
		int integer = sc.nextInt();
		System.out.println("Your entered integer : " + integer);

		System.out.print("Enter the Integer : ");
		float floatNum = sc.nextFloat();
		System.out.println("Your entered integer : " + floatNum);
		sc.close();
	}

	// Using console Class JDK 1.6
	public static void getInputFromUser03() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text : ");
		String nextLine = sc.nextLine();
		System.out.println("Your entered text : " + nextLine);
		sc.close();
	}

	// Using Command line argument JDK 1.0
	// Need to Understand the working of this program
	public static void getInputFromUser04(String[] args) {
		if (args.length > 0) {
			System.out.print("The Command Line arguments are : ");
			for (String arg : args) {
				System.out.println(arg);
			}
		} else {
			System.out.println("No Command Line argumnets are found..");
		}
	}

	// Using DataInputStream Class JDK 1.0
	// Can be avoided for usage as deprecated
	public static void getInputFromUser05() throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("Enter the Integer : ");
		int interger = Integer.parseInt(dis.readLine());

		System.out.print("Enter the String : ");
		String str = dis.readLine();

		System.out.println("Your Entered Integer : " + interger);
		System.out.println("Your Entered String : " + str);
	}
}
