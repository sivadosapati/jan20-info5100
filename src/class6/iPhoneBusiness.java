package class6;

import java.util.Scanner;

public class iPhoneBusiness {

	public static void main(String[] args) {
		// AppleStore as = new AppleStoreImpl();
		AppleStore as = new AppleStoreArrayListImpl();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Please Type(BUY,RETURN,SALES,COUNT,STOCK,QUIT,PRINT) for your operation");
			String line = scanner.nextLine();
			if (line.equals("QUIT")) {
				break;
			}
			if (line.equals("PRINT")) {
				System.out.println(as);
				continue;
			}

			if (line.equals("BUY")) {
				iPhone x = as.buyPhone();
				System.out.println("Bought a Phone with # " + x.number);
				continue;
			}
			if (line.equals("RETURN")) {
				int salesBeforeReturn = as.getTotalSales();
				as.returnPhone(makePhone());
				int salesAfterReturn = as.getTotalSales();
				System.out.println("Returned Phone. Sales Before -> " + salesBeforeReturn + " : Sales After -> "
						+ salesAfterReturn);
				continue;
			}
			if (line.equals("SALES")) {
				System.out.println("Sales -> " + as.getTotalSales());
				continue;
			}
			if (line.equals("COUNT")) {
				System.out.println("Count -> " + as.getNumberOfPhones());
				continue;
			}
			if (line.equals("STOCK")) {
				int before = as.getNumberOfPhones();
				as.addPhones(5);
				int after = as.getNumberOfPhones();
				System.out.println("Before -> " + before + " After -> " + after);
				continue;
			}

		}
		System.out.println("DONE");
	}

	private static iPhone makePhone() {
		iPhone p = new iPhone();
		p.price = 1099;
		p.number = (int) (Math.random() * 100) + "";
		return p;
	}

}
