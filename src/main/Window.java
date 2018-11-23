package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;

	private JButton button;

	public Window() {
		super("CS:GO Stats auslesen");
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(1080, 720));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);

		button = new JButton("Hallo");
		button.setBounds(250, 200, 200, 50);
		panel.add(button);

		add(panel);
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setVisible(true);

		/*
		 * steamID STEAM_0:0:142231653 steamID3 [U:1:284463306] steamID
		 * 76561198244729034
		 * 
		 * API KEY 648011BEFF8552A866AAE3F2D64D3AFD
		 */

	}
}
