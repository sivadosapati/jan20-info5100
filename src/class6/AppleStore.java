package class6;

public interface AppleStore {

	public iPhone[] getPhones();

	public iPhone buyPhone();

	public void returnPhone(iPhone phone);

	public int getNumberOfPhones();

	public void addPhones(int numberOfPhones);

	public int getTotalSales();

	public default iPhone makePhone(int i) {
		return iPhone.makePhone(i);
	}

}

class iPhone implements Comparable<iPhone> {
	float price;
	String number;

	public static iPhone makePhone(int i) {
		iPhone p = new iPhone();
		p.price = 1099;
		p.number = i + "";
		return p;
	}

	public boolean equals(Object o) {
		iPhone p = (iPhone) o;
		if (p.number.equals(this.number)) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return number.hashCode();
	}

	public String toString() {
		return "[Number,Price]=[" + number + "," + price + "]";
	}

	@Override
	public int compareTo(iPhone o) {
		// return this.number.compareTo(o.number);
		return Integer.parseInt(number) - Integer.parseInt(o.number);
	}
}