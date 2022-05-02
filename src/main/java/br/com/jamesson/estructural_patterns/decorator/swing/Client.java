package br.com.jamesson.estructural_patterns.decorator.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Client {

	public static void main(String[] args) {
		JFrame frame =new JFrame();  
		frame.setLayout(new FlowLayout());
		
//		JTextArea textArea = new JTextArea(10, 30);
//		frame.add(textArea);
		
		JTextArea textArea = new JTextArea(10, 30);
		JScrollPane scroll = new JScrollPane(textArea, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		frame.add(scroll);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);            
		frame.setVisible(true);
	}
}
