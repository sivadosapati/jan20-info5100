
public class ClassRoom {

	public static void main(String[] args) {
		Professor siva = new Professor();
		Student leena = new Student();
		siva.greet();
		leena.introduce();

	}

}

class Professor {
	void greet() {
		System.out.println("Welcome to the class");
	}

}

class Student {
	void introduce() {
		System.out.println("I'm a Student");
	}

}