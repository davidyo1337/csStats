package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	
	public Window() {
		super("krasses Programm");
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(700, 500));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel);
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Window();
	}
}
