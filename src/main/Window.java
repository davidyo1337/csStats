package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Window extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	
	private JButton button;
	
	public Window() {
		super("krasses Programm");
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(700, 500));
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
		
		
	}
	
	public static void main(String[] args) {
		new Window();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}
}
