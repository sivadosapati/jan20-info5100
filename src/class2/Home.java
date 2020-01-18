package class2;

public class Home {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args.length);
		Math math = new Math();
		int a = 34;
		int b = 56;
		int result = math.sum(a, b);
		System.out.println(a + " + " + b + " = " + result);
		// System.out.println(result);
		result = math.subtract(a, b);
		System.out.println(a + " - " + b + " = " + result);

	}

}
