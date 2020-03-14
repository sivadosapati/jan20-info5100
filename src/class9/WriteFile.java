package class9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/sdosapati/remote.txt");
		FileOutputStream fos = new FileOutputStream(file, true);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Please say CONTENT|EXIT to write data into file");
			String x = scanner.nextLine();
			if (x.equals("CONTENT")) {
				System.out.println("Enter the content in line");
				String data = scanner.nextLine();
				// writeDataIntoOutputStream(fos, data);
				writeDataIntoFileUsingPrintStream(fos, data);
			}
			if (x.equals("EXIT")) {
				break;
			}
		}
		fos.close();
	}

	private static void writeDataIntoFileUsingPrintStream(FileOutputStream fos, String data) {
		PrintStream ps = new PrintStream(fos, true);
		ps.println(data);
	}

	private static void writeDataIntoOutputStream(FileOutputStream fos, String data) throws IOException {
		fos.write(data.getBytes());
		fos.write("\n".getBytes());

	}

}
