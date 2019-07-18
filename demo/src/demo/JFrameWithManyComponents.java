package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JFrameWithManyComponents extends JFrame 
implements ActionListener {
	final int FRAME_WIDTH = 300;
	final int FRAME_HEIGHT = 150;
	JLabel namePrompt;
	JLabel heading1;
	JTextField nameField;
	JButton button;
	
	public JFrameWithManyComponents() {
		super("Demonstrating many components"); //must be first statement
		
		namePrompt = new JLabel("Enter your name");
		heading1 = new JLabel("This frame has many components");
		nameField = new JTextField(12);
		button = new JButton("Click to continue");
		
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		button.setToolTipText("Click this button");
		heading1.setFont(new Font("Arial", Font.BOLD, 16));
		
		setLayout(new FlowLayout());
		add(heading1);
		add(namePrompt);
		add(nameField);
		add(button);
		button.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = nameField.getText();
		heading1.setText("Hello " + name);
	}
}
