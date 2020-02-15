package class6;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Collection<String> names = makeCollection();
		names.add("John");
		names.add("Stark");
		names.add("Leena");
		names.add("Jasmine");
		names.add("John");
		System.out.println(names);

		iPhone x = iPhone.makePhone(1);

		TreeSet<iPhone> phones = new TreeSet<iPhone>();
		phones.add(x);

		iPhone xx = iPhone.makePhone(10);
		phones.add(xx);
		phones.add(iPhone.makePhone(31));
		phones.add(iPhone.makePhone(210));
		System.out.println(phones);

	}

	private static Collection<String> makeCollection() {

		// return new ArrayList<String>();
		// return new HashSet<String>();
		// return new LinkedHashSet<String>();
		return new TreeSet<String>();
	}

}
