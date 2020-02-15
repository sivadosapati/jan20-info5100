package class6;

import java.util.ArrayList;

public class AppleStoreArrayListImpl implements AppleStore {

	private ArrayList<iPhone> phones = new ArrayList<iPhone>();
	private int totalSales = 0;

	AppleStoreArrayListImpl() {
		for (int i = 0; i < 3; i++) {
			phones.add(makePhone(i));
		}
	}

	@Override
	public iPhone buyPhone() {
		if (phones.size() == 0)
			return null;
		iPhone p = phones.remove(0);
		totalSales += p.price;
		return p;
	}

	@Override
	public void returnPhone(iPhone phone) {
		totalSales -= phone.price;
		phones.add(phone);

	}

	@Override
	public int getNumberOfPhones() {
		return phones.size();
	}

	@Override
	public void addPhones(int numberOfPhones) {
		for (int i = 0; i < numberOfPhones; i++) {
			phones.add(makePhone(i));
		}

	}

	@Override
	public int getTotalSales() {
		return totalSales;
	}

	public String toString() {
		return phones.toString();
	}

}
