package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

	public FileReader() {

	}

	public static ArrayList<String> readFile(String path) {
		ArrayList<String> lines = new ArrayList<>();
		try {
			Scanner sc = new Scanner(new File(path));
			while (sc.hasNext()) {
				String nextLine = sc.nextLine();
				if (nextLine.startsWith("#")) {
					lines.add(nextLine);
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}

		lines.remove(0);
		lines.remove(lines.size() - 1);
		return lines;

	}

	public static ArrayList<String> readAndDeleteFile(String path) {
		ArrayList<String> tmp = readFile(path);
		File empty = new File(path);
		empty.delete();
		return tmp;
		
	}
	
	
}
