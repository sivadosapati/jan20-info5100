import java.util.ArrayList;
import java.util.Collection;

public class ABC {

	public static void main(String[] args) {
		ABC a = new ABC();
		String[] first = new String[] { "/start", "a", "b", "y", "1", "22", "z", "t" };
		String[] second = new String[] { "/start", "a", "y", "1", "22", "t" };
		Object[] r = a.findContiguousHistory(first, second);
		for (Object x : r) {
			System.out.print(x + " ");
		}
	}

	public Object[] findContiguousHistory(String first[], String second[]) {
		Collection<String> results = new ArrayList<String>();
		Collection<String> matchingResults = new ArrayList<String>();
		for (int i = 0; i < first.length;) {

			String start = first[i];
			for (int j = 0; j < second.length; j++) {

				if (second[j].equals(start)) {
					// System.out.println("Matched -> " + start);
					matchingResults = new ArrayList<String>();
					matchingResults.add(start);
					i = identifyMaximumMatching(matchingResults, i, j, first, second);
					//System.out.println(matchingResults);
					// System.out.println("Matching Index -> " + i);
					if (matchingResults.size() > results.size()) {
						results = matchingResults;

						break;
					}
				}
			}
			i++;
		}
		return (Object[]) results.toArray();

	}

	private int identifyMaximumMatching(Collection<String> matchingResults, int i, int j, String[] first,
			String[] second) {
		int index = i + 1;
		int si = j + 1;
		for (; index < first.length; index++) {
			for (; si < second.length;) {
				if (first[index].equals(second[si])) {
					matchingResults.add(first[index]);
					si++;
					break;
				} else {
					return index - 1;
				}
			}
		}
		return index;
	}

}
