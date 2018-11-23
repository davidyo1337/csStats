package backend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class WriteFile {

	public WriteFile() {

	}

	

	public static void safeCsgoPath(String csgoPath) {

		try {
			File csgoPathFile = new File(System.getenv("APPDATA") + "\\CsStats\\CsStats.txt");
			File csgoPathFolder = new File(System.getenv("APPDATA") + "\\CsStats");
			csgoPathFolder.mkdirs();
			if (!csgoPathFile.exists()) {
				csgoPathFile.createNewFile();
			}
			FileWriter fw = new FileWriter(csgoPathFile);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(csgoPath);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}