package graphics;

import java.awt.Component;

import javax.swing.JFileChooser;

public class FileChooser {

	public static String showPathChooser(Component parent) {
		JFileChooser pc = new JFileChooser();
		pc.setDialogTitle("W�hlen Sie den Pfad ihrer log.txt-Datei");
		pc.showOpenDialog(parent);
		return pc.getSelectedFile().getAbsolutePath();
	}

}
