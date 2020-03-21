package class6;

public class iPhone implements Comparable<iPhone> {
	public float price;
	public String number;

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