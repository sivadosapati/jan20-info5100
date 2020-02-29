package class8;

public class ClassRoom {
	static Student simeng = new Student();
	static Professor siva = new Professor();
	static Fan fan = new Fan();
	static Light l = new Light();

	public static void main(String[] args) {
		System.out.println("Start");
		// executeWithThreads();
		executeWithThreadsUsingLambdas();
		// executeWithoutThreads();
		System.out.println("End");
	}

	private static void executeWithoutThreads() {
		siva.teach();
		simeng.listen();
		fan.rotate();
		l.emit();

	}

	static class TeachingThread extends Thread {
		public void run() {
			siva.teach();
		}

	}

	static class ListeningThread extends Thread {
		public void run() {
			simeng.listen();
		}
	}

	static class FanRunnable implements Runnable {

		@Override
		public void run() {
			fan.rotate();

		}

	}

	public static void executeWithThreadsUsingLambdas() {
		new Thread(() -> siva.teach()).start();
		new Thread(() -> simeng.listen()).start();
		new Thread(() -> fan.rotate()).start();
		Thread lightThread = new Thread(() -> l.emit());
		lightThread.start();
	}

	public static void executeWithThreads() {
		TeachingThread teach = new TeachingThread();
		ListeningThread listen = new ListeningThread();
		Thread fanThread = new Thread(new FanRunnable());
		teach.start();
		listen.start();
		fanThread.start();

		Thread lightThread = new Thread(new Runnable() {
			public void run() {
				l.emit();
			}
		});
		lightThread.start();
	}

}
