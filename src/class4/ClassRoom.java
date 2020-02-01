package class4;

public class ClassRoom {

	public static void main(String[] args) {
		Jan2020INFO5100Student swathi = new Jan2020INFO5100Student();
		Jan2020INFO5100Student jiali = new Jan2020INFO5100Student();
		swathi.printNameOfTeacher();
		jiali.printNameOfTeacher();
		swathi.teacher.name = "Cva";
		swathi.printNameOfTeacher();
		jiali.printNameOfTeacher();
		jiali.teacher = null;
		System.out.println("----");
		System.out.println(jiali.teacher);
		System.out.println(swathi.teacher);
		Jan2020INFO5100Student.teacher = new Jan2020INFO5100Teacher("John");
		System.out.println(Jan2020INFO5100Student.teacher.name);
		System.out.println("---");
		swathi.askQuestionToTeacher();
		System.out.println("-----");
		Jan2020INFO5100Student.askQuestionToTeacher();
	}

}

class Jan2020INFO5100Teacher {
	String name = "Siva";

	public Jan2020INFO5100Teacher() {

	}

	public Jan2020INFO5100Teacher(String n) {
		this.name = n;
	}

	public void answerQuestion() {
		System.out.println("Professor is answering question");
	}
}

class Jan2020INFO5100Student {
	static Jan2020INFO5100Teacher teacher = new Jan2020INFO5100Teacher();

	Jan2020INFO5100Student() {

	}

	public void printNameOfTeacher() {
		System.out.println(teacher.name);
	}

	public static void askQuestionToTeacher() {
		System.out.println("Student is asking question");
		teacher.answerQuestion();
	}

}












