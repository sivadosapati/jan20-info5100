package class6;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(100, "Leena");
		students.put(101, "Holiday");
		students.put(102, "Simeng");

		System.out.println(students);

		System.out.println(students.get(101));
		System.out.println(students.get(105));
		students.put(101, "Jasmine");
		System.out.println(students.get(101));

		// int a = 10;
		// Integer x = new Integer(15);
		// a = x;
	}

}

//int, long, short, byte
//Integer, Long, Short, Byte, Float, Double, Character, Boolean
