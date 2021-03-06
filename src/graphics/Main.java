package graphics;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import backend.FileReader;
import backend.WriteFile;

public class Main {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		String cssavePath = FileReader.getCSsave();
		if (cssavePath == null) {
			cssavePath = FileChooser.showPathChooser(null);
		}
		WriteFile.safeCsgoPath(cssavePath);
		// System.out.println(cssavePath);

		// new Window();

		System.out.println(FileReader.decodeFile(cssavePath));
		System.out.println(FileReader.getListOfSteamIDs(FileReader.decodeFile(cssavePath)));
		System.out.println(" ");
		System.out.println(
				FileReader.getListofCalculatedIDs(FileReader.getListOfSteamIDs(FileReader.decodeFile(cssavePath))));

		for (int i = 0; i <= 10; i++) {
			System.out.println(FileReader.bestimmteSteamID64(i));
		}
	
	}

}

/*
 * steamID STEAM_0:0:142231653 steamID3 [U:1:284463306] steamID64
 * 76561198244729034 API KEY 648011BEFF8552A866AAE3F2D64D3AFD
 */