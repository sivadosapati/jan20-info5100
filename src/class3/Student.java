package class3;

public class Student {

	public float tellAreaOfCirlce(Cirlce c) {
		return c.getArea();
	}

	public boolean doesStringHaveASpaceInIt(String s) {
		// return writeLogicForFindingSpace(s);
		int i = s.indexOf(' ');
		if (i > 0)
			return true;
		else
			return false;
	}

	private boolean writeLogicForFindingSpace(String s) {
		for (char c : s.toCharArray()) {
			if (c == ' ')
				return true;
		}
		return false;
	}
}
