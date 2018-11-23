package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

	private static final int searchPanelheight = 130;
	private static final int infoPanelwidth = 500;
	private static final int width = 1080;
	private static final int height = 720;

	private static final long serialVersionUID = 1L;
	private JPanel searchPanel;
	private JPanel tablePanel;
	private JPanel infoPanel;

	private JButton button;

	public Window() {
		super("CS:GO Stats auslesen");
		searchPanel = new JPanel();
		searchPanel.setPreferredSize(new Dimension(width, searchPanelheight));
		searchPanel.setBackground(Color.GREEN);
		searchPanel.setLayout(null);

		button = new JButton("Suche starten");
		button.setBounds(750, 30, 300, 70);
		searchPanel.add(button);

		add(searchPanel, BorderLayout.NORTH);

		tablePanel = new JPanel();
		tablePanel.setPreferredSize(new Dimension(width - infoPanelwidth, height - searchPanelheight));
		tablePanel.setBackground(Color.RED);
		tablePanel.setLayout(null);
		add(tablePanel, BorderLayout.EAST);

		infoPanel = new JPanel();
		infoPanel.setPreferredSize(new Dimension(infoPanelwidth, height - searchPanelheight));
		infoPanel.setBackground(Color.YELLOW);
		infoPanel.setLayout(null);
		add(infoPanel, BorderLayout.WEST);

		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setVisible(true);
	}
}
