package class2;

public class Algebra {

	public static void mainOld(String[] args) {

		Math math = new Math();
		int input1 = Integer.parseInt(args[0]);
		int input2 = Integer.parseInt(args[2]);
		char sign = args[1].charAt(0);
		System.out.println("Before");
		if (sign == '+') {
			System.out.println(input1 + " + " + input2 + " = " + math.sum(input1, input2));
		}
		if (sign == '-') {
			System.out.println(input1 + " - " + input2 + " = " + math.subtract(input1, input2));
		}
		if (sign == '*') {
			System.out.println(input1 + " * " + input2 + " = " + math.multiply(input1, input2));
		}
		if (sign == '/') {
			System.out.println(input1 + " / " + input2 + " = " + math.divide(input1, input2));
		}
		System.out.println("Done");
	}

	public static void main(String args[]) {
		Math math = new Math();
		math.calculate(args[0], args[2], args[1]);
	}

}
