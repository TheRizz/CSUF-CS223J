package demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


public class JMenuFrame extends JFrame implements ActionListener{
	
	private JMenuBar mainBar = new JMenuBar();
	private JMenu menu1 = new JMenu("File");
	private JMenuItem exit = new JMenuItem("Exit");
	
	private JMenu menu2 = new JMenu("Colors");
	private JMenu dark = new JMenu("Dark");
	private JMenuItem pink = new JMenuItem("Pink");
	private JMenuItem grey = new JMenuItem("Grey");
	private JMenuItem black = new JMenuItem("Black");
	
	JPanel home = new JPanel();
	JPanel card = new JPanel();
	
	JLabel header1 = new JLabel("Card Designer Application");
	
	CardLayout cardLayout = new CardLayout();
	
	public JMenuFrame() {
		super("Main Demo");
		setLayout(new FlowLayout());
		
		exit.addActionListener(this);
		grey.addActionListener(this);
		pink.addActionListener(this);
		black.addActionListener(this);
		
		setJMenuBar(mainBar);
		mainBar.add(menu1);
		menu1.add(exit);
		
		mainBar.add(menu2);
		menu2.add(dark);
		menu2.add(pink);
		dark.add(grey);
		dark.add(black);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		Container con = getContentPane();
		
		if(source == exit) {
			System.exit(0);
		}
		else if(source == pink) {
			con.setBackground(Color.pink);
		}
		else if(source == black) {
			con.setBackground(Color.black);
		}
		else if(source == grey) {
			con.setBackground(Color.gray);
		}
		
	}

	public static void main(String[] args) {
		JMenuFrame frame = new JMenuFrame();
		frame.setVisible(true);
		frame.setSize(400, 200);
		
	}
	
	
}
