package hust.soict.hedspi.swing;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class NumberGrid extends JFrame{
	private JButton[] btNumbers = new JButton[10];
	private JButton btnDelete, btnReset;
	private JTextField tfDisplay;
	
	public NumberGrid() {
		tfDisplay = new JTextField();
		tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		JPanel panelButtons = new JPanel(new GridLayout(4, 3));
		addButtons(panelButtons);
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(tfDisplay, BorderLayout.NORTH);
		cp.add(panelButtons, BorderLayout.CENTER);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
