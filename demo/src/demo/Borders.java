package demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Borders extends JFrame implements ActionListener{

	JTextField nb = new JTextField("North Button");
	JButton sb = new JButton("South Button");
	JButton eb = new JButton("East Button");
	JButton wb = new JButton("West Button");
	JButton cb = new JButton("Center Button");
	
	JPanel buttonsPanel = new JPanel();
	
	public Borders() {
		super("Layout Demo");
		
		setSize(400,150);
		
		setLayout(new BorderLayout()); //instead of new layout
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(nb, BorderLayout.NORTH);
		add(sb, BorderLayout.SOUTH);
		add(eb, BorderLayout.EAST);
		add(wb, BorderLayout.WEST);
		add(buttonsPanel, BorderLayout.CENTER);
		
		nb.setEditable(false);//displays uneditable messages
		cb.addActionListener(this);
		buttonsPanel.setLayout(new GridLayout(2,2,5,5)); //(new FlowLayout());
		buttonsPanel.add(cb);
		buttonsPanel.add(new JButton("1"));
		buttonsPanel.add(new JLabel(""));
		buttonsPanel.add(new JButton("3"));
		//buttonsPanel.add(new JButton("4"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		super.dispose();
		
	}
}
