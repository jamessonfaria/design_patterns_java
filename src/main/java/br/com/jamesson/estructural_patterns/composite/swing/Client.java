package br.com.jamesson.estructural_patterns.composite.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Client {

	public static void main(String[] args) {
		JLabel title = new JLabel("TITLE");
		
		JLabel label = new JLabel("Label #1");
		JButton button= new JButton("Button #1");

		JPanel panel = new JPanel(new FlowLayout());
		panel.add(label);  
		panel.add(button);  

		JFrame frame =new JFrame();  
		frame.setLayout(new BorderLayout());	
		frame.add(title, BorderLayout.NORTH);
		frame.add(panel, BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);  
		frame.setVisible(true);
	}
}
