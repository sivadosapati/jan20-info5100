package class6;

import java.util.HashMap;
import java.util.Map;

public class AppleStoreMapImpl implements AppleStore {

	private Map<String, iPhone> phonesMap = new HashMap<String, iPhone>();
	int totalSales = 0;

	@Override
	public iPhone buyPhone() {
		String number = phonesMap.keySet().iterator().next();
		iPhone p = phonesMap.remove(number);
		totalSales += p.price;
		return p;

	}

	@Override
	public void returnPhone(iPhone phone) {
		String key = phone.number;
		if (phonesMap.containsKey(key)) {
			System.out.println("I already have a phone with # " + key);
			return;
		}
		totalSales -= phone.price;
		phonesMap.put(phone.number, phone);

	}

	@Override
	public int getNumberOfPhones() {
		return phonesMap.size();
	}

	@Override
	public void addPhones(int numberOfPhones) {
		for (int i = phonesMap.size(); i < numberOfPhones + phonesMap.size(); i++) {
			iPhone p = makePhone(i);
			phonesMap.put(p.number, p);
		}

	}

	@Override
	public int getTotalSales() {
		return totalSales;
	}

}
