package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {

	private static final int searchPanelheight = 130;
	private static final int infoPanelwidth = 390;
	private static final int width = 1080;
	private static final int height = 720;
	private static final long serialVersionUID = 1L;

	private Font textFont = new Font("helvetica", Font.BOLD, 25);
	private Font buttonFont = new Font("helvetica", Font.BOLD, 25);

	private JPanel searchPanel;
	private JButton searchButton;
	private JTextField searchText;

	private JPanel tablePanel;

	private JPanel infoPanel;
	private JButton cheaterButton;
	private JButton suspectButton;

	public Window() {
		super("CS:GO Stats auslesen");
		setLayout(new BorderLayout());
		searchPanel = new JPanel();
		searchPanel.setPreferredSize(new Dimension(width, searchPanelheight));
		searchPanel.setBackground(Color.WHITE);
		searchPanel.setLayout(null);
		add(searchPanel, BorderLayout.NORTH);

		searchButton = new JButton("Suche starten");
		searchButton.setBounds(750, 30, 300, 70);
		searchButton.setFont(buttonFont);
		searchPanel.add(searchButton);
		searchText = new JTextField();
		searchText.setBounds(30, 30, 690, 70);
		searchText.setFont(textFont);
		searchPanel.add(searchText);

		tablePanel = new JPanel();
		tablePanel.setPreferredSize(new Dimension(width - infoPanelwidth, height - searchPanelheight));
		tablePanel.setBackground(Color.WHITE.darker().darker());
		tablePanel.setLayout(null);
		add(tablePanel, BorderLayout.EAST);

		infoPanel = new JPanel();
		infoPanel.setPreferredSize(new Dimension(infoPanelwidth, height - searchPanelheight));
		infoPanel.setBackground(Color.WHITE.darker());
		infoPanel.setLayout(null);
		add(infoPanel, BorderLayout.WEST);

		cheaterButton = new JButton("CHEATER");
		cheaterButton.setBounds(30, 480, 150, 30);
		infoPanel.add(cheaterButton);
		suspectButton = new JButton("suspected");
		suspectButton.setBounds(210, 480, 150, 30);
		infoPanel.add(suspectButton);

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
