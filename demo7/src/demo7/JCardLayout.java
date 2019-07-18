package demo7;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class JCardLayout extends JFrame implements ActionListener {

	private JButton next = new JButton("Next");
	private JButton next2 = new JButton("Exit");
	
	private JPanel buttonsPanel = new JPanel();
	private JPanel buttonsPanel2 = new JPanel();
	
	CardLayout cardLayout = new CardLayout();
	
	public JCardLayout() {
		super("Card Layout");
		setSize(400,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		next.addActionListener(this);
		next2.addActionListener(this);
		
		buttonsPanel.setLayout(new FlowLayout());
		buttonsPanel.add(new JButton("1"));
		buttonsPanel.add(new JButton("2"));
		buttonsPanel.add(new JButton("3"));
		buttonsPanel.add(next);
		add("Panel", buttonsPanel);
		
		buttonsPanel2.setLayout(new FlowLayout());
		buttonsPanel2.add(new JButton("4"));
		buttonsPanel2.add(new JButton("5"));
		buttonsPanel2.add(new JButton("6"));
		buttonsPanel2.add(next2);
		add("Panel2", buttonsPanel2);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object source = e.getSource();
		if(source == next) {
			cardLayout.show(getContentPane(),"Panel2");
			//cardLayout.next(getContentPane());
		}
		else if ( source == next2) {
			cardLayout.show(getContentPane(), "Panel");
			//super.dispose();
		}
		
	}
}
