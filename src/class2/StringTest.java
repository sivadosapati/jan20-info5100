package class2;

public class StringTest {

	public static void main(String[] args) {
		String professorName;
		String studentName;

		int studentAge = 25;

		professorName = new String("Siva");
		studentName = "Arch";
		String x = studentName;
		String y = "Arch";
		String n = new String("Arch");
		String t = "Arch";
		n = x;

		if (studentAge == 25) {
			System.out.println("Age is 25");
		}
		n = null;

		if (studentName == "Arch") {
			System.out.println("Arch wrote some code in the class today");
		}
		n.equals("Siva");
		if (professorName.equalsIgnoreCase("Siva")) {
			System.out.println("Siva has been teaching this class from last week");
		}

		String anotherStudentName = new String("Arch");
		if (studentName == anotherStudentName) {
			System.out.println("We have two Arch in the class");
		}

		System.out.println("Done");

	}

}
