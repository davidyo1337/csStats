package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

	public FileReader() {

	}

	public static String getCSsave() {
		File file = new File(System.getenv("APPDATA") + "/csStats/csStats.txt");
		if (!file.exists()) {
			return null;
		} else {
			return readFile(file).get(0);
		}
	}

	private static ArrayList<String> readFile(File file) {
		ArrayList<String> outp = new ArrayList<>();
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
				outp.add(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (outp.size() == 0) {
			return null;
		} else {
			return outp;
		}
	}

	public static ArrayList<String> decodeFile(String path) {
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
		ArrayList<String> tmp = decodeFile(path);
		File empty = new File(path);
		empty.delete();
		return tmp;

	}

}
