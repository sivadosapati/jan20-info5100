package class5;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class Professor {

	public static void main(String args[]) throws ProjectorException {

		Professor siva = new Professor();
		try {
			System.out.println("Before writing code");
			siva.writeCode();
			System.out.println("After writing code");
		} catch (ProjectorException pe) {
			System.out.println("******ProjectorException***** Siva is trying other options to write code..");
		} catch (BatteryLowException be) {
			System.out.println("****BatteryLowException****** Please connect power cable");
		} catch (RuntimeException e) {
			String message = e.getMessage();
			if (message.contains("Battery")) {
				System.out.println("Please connect power cable");
			} else {
				System.out.println("Siva is trying other options to write code..");
			}
		} finally {
			System.out.println("I will get executed irrespective of having an exception or not..");
		}

		System.out.println("Finally Done..");
	}

	public void writeCode() throws ProjectorException, BatteryLowException {
		openLaptop();
		connectProjectorCableToLaptop();
		turnOnTheProjector();
		makeScreenVisible();
		try {
			// makeScreenVisible();
		} catch (Exception e) {
			System.out.println("*****Screen Exception --- Pull the screen manually with your hand");
		}
		typeOnLaptop();
		projectorEmitTextOnScreen();

	}

	private void projectorEmitTextOnScreen() {
		System.out.println("Project emits text on to screen");

	}

	private void typeOnLaptop() {
		System.out.println("Type some code on laptop");

	}

	private void makeScreenVisible() throws RuntimeException {
		int x = Util.getRandomNumber(10);
		if (x < 9) {
			throw new RuntimeException();
		}
		System.out.println("Make Screen visible");

	}

	private void turnOnTheProjector() throws ProjectorException {
		System.out.println("Turn on projector");
		int x = Util.getRandomNumber(10);
		System.out.println("Random number -> " + x);
		if (x < 1) {
			// RuntimeException exception = new RuntimeException();
			ProjectorException exception = new ProjectorException();
			throw exception;
		} else {
			System.out.println("Projector confirms that content from laptop is shown on screen");
		}

	}

	private void connectProjectorCableToLaptop() {
		System.out.println("Connect Projector cable to Laptop");
	}

	private void openLaptop() throws BatteryLowException {
		System.out.println("Open Laptop");
		System.out.println("Checking the battery");
		int x = Util.getRandomNumber(10);
		System.out.println("Battery random -> " + x);
		if (x < 1) {
			// throw new RuntimeException("Battery is low");
			throw new BatteryLowException();
		} else {
			System.out.println("Battery is sufficient..");
		}

	}

}

class BatteryLowException extends RuntimeException {

}

class ProjectorException extends Exception {
}

class Util {
	public static int getRandomNumber(int x) {
		return (int) (Math.random() * x);
	}

}

//throw an Exception
//catch an exception
//Use try{} catch block to handle exceptions
//Throw a specific type of exception by extending RuntimeException
//Expand the method signature to have throws xxxException in it
