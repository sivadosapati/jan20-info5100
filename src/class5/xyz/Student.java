package class5.xyz;

import class5.pack.Marker;

public class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		Marker m = new Marker();
		// m.write();
		Student jasmine = new Student("Jasmine");
		System.out.println(m.getClass().getName());
		System.out.println(jasmine);
	}

}
