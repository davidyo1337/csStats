package graphics;

import java.awt.Component;

import javax.swing.JFileChooser;

public class FileChooser {

	public static String showPathChooser(Component parent) {
		JFileChooser pc = new JFileChooser();
		pc.showOpenDialog(parent);
		pc.setDialogTitle("Pfad ausw�hlen");
		return pc.getSelectedFile().getAbsolutePath();
	}

}
