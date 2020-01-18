package class2;

public class Math {
	int sum(int a, int b) {
		return a + b;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int subtract(int a, int b) {
		return a - b;
	}

	int divide(int a, int b) {
		return a / b;
	}

	void calculate(String a, String b, String c) {
		int input1 = Integer.parseInt(a);
		int input2 = Integer.parseInt(b);
		char sign = c.charAt(0);

		if (sign == '+') {
			System.out.println(input1 + " + " + input2 + " = " + sum(input1, input2));
		}
		if (sign == '-') {
			System.out.println(input1 + " - " + input2 + " = " + subtract(input1, input2));
		}
		if (sign == '*') {
			System.out.println(input1 + " * " + input2 + " = " + multiply(input1, input2));
		}
		if (sign == '/') {
			System.out.println(input1 + " / " + input2 + " = " + divide(input1, input2));
		}

	}
}
