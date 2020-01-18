package class2;

import java.util.Scanner;

public class Calculator {

	public static void mainWithForLoop(String args[]) {
		Scanner scanner = new Scanner(System.in);

		for (int counter = 1; counter <= 3; counter++) {

			System.out.println("Enter first number");
			String a = scanner.nextLine();
			System.out.println("Enter second number");
			String b = scanner.nextLine();
			System.out.println("Enter the operator (+,-,*,/)");
			String c = scanner.nextLine();
			Math math = new Math();
			boolean operatorCheck = checkOperator(c);
			if (operatorCheck == false) {
				System.out.println("Invalid operator. Please enter the next set of numbers ");
				continue;
			}
			math.calculate(a, b, c);
			System.out.println("Enter Y if you want to continue");
			String n = scanner.nextLine();
			if (!n.equals("Y")) {
				break;
			}

		}
		System.out.println("Done");

	}

	public static void mainWithWhileLoopAndCondition(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		while (counter <= 3) {
			System.out.println("Enter first number");
			String a = scanner.nextLine();
			System.out.println("Enter second number");
			String b = scanner.nextLine();
			System.out.println("Enter the operator (+,-,*,/)");
			String c = scanner.nextLine();
			Math math = new Math();
			boolean operatorCheck = checkOperator(c);
			if (operatorCheck == false) {
				System.out.println("Invalid operator. Please enter the next set of numbers ");
				continue;
			}
			math.calculate(a, b, c);
			System.out.println("Enter Y if you want to continue");
			String n = scanner.nextLine();
			if (!n.equals("Y")) {
				break;
			}
			counter = counter + 1;
		}
		System.out.println("Done");

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		while (true) {
			if (counter > 3) {
				System.out.println("I played for 3 times. We should stop now.");
				break;
			}
			System.out.println("Enter first number");
			String a = scanner.nextLine();
			System.out.println("Enter second number");
			String b = scanner.nextLine();
			System.out.println("Enter the operator (+,-,*,/)");
			String c = scanner.nextLine();
			Math math = new Math();
			boolean operatorCheck = checkOperator(c);
			if (operatorCheck == false) {
				System.out.println("Invalid operator. Please enter the next set of numbers ");
				continue;
			}
			math.calculate(a, b, c);
			System.out.println("Enter Y if you want to continue");
			String n = scanner.nextLine();
			if (!n.equals("Y")) {
				break;
			}
			counter = counter + 1;
		}
		System.out.println("Done");

		// System.out.println(a + " " + b + " " + c);
	}

	private static boolean checkOperator(String c) {
		if (c.equals("+")) {
			return true;
		}
		if (c.equals("-")) {
			return true;
		}
		if (c.equals("*")) {
			return true;
		}
		if (c.equals("/")) {
			return true;
		}
		return false;

	}

	private static boolean checkOperatorUsingLoop(String c) {
		char cops[] = new char[] { '+', '-', '*', '/' };
		char cc = c.charAt(0);
		for (char x : cops) {
			if (cc == x)
				return true;
		}
		return false;
	}

}






