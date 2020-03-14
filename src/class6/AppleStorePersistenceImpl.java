package class6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class AppleStorePersistenceImpl implements AppleStore {

	private AppleStore store = new AppleStoreMapImpl();
	String phonesFile = "/Users/sdosapati/phones.data";

	public AppleStorePersistenceImpl() {
		try {
			readPhonesFromFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		String data = "";
		for (iPhone x : getPhones()) {
			data = data + x.toString() + "\n";
		}
		return data;
	}

	private void readPhonesFromFile() throws FileNotFoundException {
		File file = new File(phonesFile);
		Scanner scanner = new Scanner(new FileInputStream(file));
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			iPhone p = makePhone(line);
			store.returnPhone(p);
		}
	}

	private iPhone makePhone(String line) {
		String x[] = line.split("\\:");
		iPhone p = new iPhone();
		p.number = x[0];
		p.price = Float.parseFloat(x[1]);
		return p;
	}

	@Override
	public iPhone buyPhone() {
		iPhone phone = store.buyPhone();
		writePhonesIntoFile();
		return phone;
	}

	@Override
	public void returnPhone(iPhone phone) {
		store.returnPhone(phone);
		writePhonesIntoFile();
	}

	@Override
	public int getNumberOfPhones() {
		return store.getNumberOfPhones();
	}

	@Override
	public void addPhones(int numberOfPhones) {
		store.addPhones(numberOfPhones);
		writePhonesIntoFile();
	}

	private void writePhonesIntoFile() {
		try {
			FileOutputStream fos = new FileOutputStream(phonesFile);
			PrintStream ps = new PrintStream(fos, true);
			iPhone p[] = getPhones();
			for (iPhone x : p) {
				String line = makeLine(x);
				ps.println(line);
			}
			ps.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String makeLine(iPhone x) {
		return x.number + ":" + x.price;
	}

	@Override
	public int getTotalSales() {
		return store.getTotalSales();
	}

	@Override
	public iPhone[] getPhones() {
		return store.getPhones();
	}

}
