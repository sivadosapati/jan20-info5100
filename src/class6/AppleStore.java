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

