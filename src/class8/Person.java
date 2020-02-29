package class8;

public class Person extends BaseObject {
	private String name;

	private static Object ANSWER_LOCK = new Object();

	public void answerQuestion() {
		synchronized (Person.class) {
			loop(name + " is answering question");
		}
	}

	Person(String name) {
		this.name = name;
	}

	public void think() {
		loop(name + " is thinking");
	}

	public synchronized void talk() {
		loop(name + "is talking");
	}

	public synchronized void sleep() {
		loop(name + " is sleeping");
	}

	public synchronized void eat() {
		loop(name + " is eating");
	}

	public static void main(String args[]) {
		Person arch = new Person("Arch");
		Person swati = new Person("Swati");
		/*
		 * new Thread(() -> arch.talk()).start(); new Thread(() ->
		 * arch.think()).start();
		 * 
		 * new Thread(() -> arch.eat()).start(); new Thread(() -> arch.sleep()).start();
		 * 
		 * 
		 * new Thread(() -> swati.talk()).start(); new Thread(() ->
		 * swati.think()).start();
		 * 
		 * new Thread(() -> swati.eat()).start(); new Thread(() ->
		 * swati.sleep()).start();
		 */

		new Thread(() -> arch.answerQuestion()).start();
		new Thread(() -> swati.answerQuestion()).start();
		// new Thread(() -> arch.eat()).start();
		// new Thread(() -> swati.eat()).start();

	}

}
