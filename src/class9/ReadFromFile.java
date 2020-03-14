package class9;

import java.io.File;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/sdosapati/remote1.txt");
		// File file = new File("D:\\users\\sdosapati\\remote.txt");
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		if (file.exists() == false) {
			file.createNewFile();
		}

		file = new File("/Users/sdosapati/x/y");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		if (file.exists() == false) {
			file.mkdirs();
			System.out.println("Directories are created");
		}

		file = new File("/Users/sdosapati/git/jan20-info5100/src");
		File f[] = file.listFiles();
		for (File ff : f) {
			System.out.println(ff.getAbsolutePath());
		}
		System.out.println("Print all files in the directory -> " + file.getPath());
		displayFilesRecursively(file);
	}

	private static void displayFilesRecursively(File file) {
		if (file.isDirectory() == false) {
			System.out.println(file.getPath());
			return;
		}
		for (File ff : file.listFiles()) {
			displayFilesRecursively(ff);
		}

	}

}
