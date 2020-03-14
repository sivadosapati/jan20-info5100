package class9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/sdosapati/remote.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		// readOneByteAtATime(fileInputStream);
		//readAllBytesInOneShot(fileInputStream);
		readDataUsingScanner(fileInputStream);
		fileInputStream.close();
		System.out.println("-----");
		fileInputStream = new FileInputStream(file);
		findWord(fileInputStream, "hot");
		fileInputStream.close();
	}

	private static void findWord(FileInputStream fileInputStream, String word) {
		Scanner scanner = new Scanner(fileInputStream);
		while (scanner.hasNext()) {
			String x = scanner.nextLine();
			if (x.contains(word)) {
				System.out.println("Found -> " + word);
			}
		}

	}

	private static void readDataUsingScanner(FileInputStream fileInputStream) {
		Scanner scanner = new Scanner(fileInputStream);
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}

	}

	private static void readAllBytesInOneShot(FileInputStream fileInputStream) throws IOException {
		int x = fileInputStream.available();
		byte b[] = new byte[x];
		fileInputStream.read(b);
		String string = new String(b);
		System.out.println(string);

	}

	private static void readOneByteAtATime(FileInputStream fileInputStream) throws IOException {
		while (true) {
			int x = fileInputStream.read();
			if (x == -1) {
				break;
			}
			System.out.print((char) x);
		}

	}

}
