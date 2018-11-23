package backend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

class WriteFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(System.getenv("APPDATA") + "\\CsStats.txt");
		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write();
		bw.close();
	}
}