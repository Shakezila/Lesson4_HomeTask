package Helpers;

import java.util.Scanner;

public class Reader {

	static private Scanner scanner = new Scanner(System.in);

	public static String readString(String message) {
		String string = "";
		printMessage(message);
		while(true) {
			string = scanner.next();
			if(Validator.stringValidator(string)) {
				break;
			}
			System.out.println("You entered wrong string!");
			printMessage(message);
		}
		return string;
	}
	
	public static int readInt(String message) {
		int number = 0;
		printMessage(message);
		while(!scanner.hasNextInt()) {
			System.out.println("You entered not a number!");
			printMessage(message);
			scanner.next();
		}
		return number = scanner.nextInt();
	}
	
	public static String readGroup(String message) {
		String string = "";
		printMessage(message);
		while(true) {
			string = scanner.next();
			if(Validator.groupValidator(string)) {
				break;
			}
			System.out.println("You entered wrong group name!");
			printMessage(message);
		}
		return string;
	}
	
	public static String readMenu(String message) {
		String string = "";
		printMessage(message);
		while(true) {
			string = scanner.next();
			if(Validator.menuValidator(string)) {
				break;
			}
			System.out.println("You entered incorrect data!");
			printMessage(message);
		}
		return string;
	}
	
	private static void printMessage(String message) {
		System.out.print(message);
	}
}
