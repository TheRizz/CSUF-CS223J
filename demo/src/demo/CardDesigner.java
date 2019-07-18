package demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardDesigner extends JFrame implements ActionListener{

	private JMenuBar mainBar = new JMenuBar();
	private JMenu menu1 = new JMenu("File");
	private JMenu menu2 = new JMenu("Select");
	private JMenu menu3 = new JMenu("Colors");
	private JMenu menu4 = new JMenu("Font");
	
	private JMenuItem exit = new JMenuItem("Exit");

	private JMenuItem home = new JMenuItem("Home");
	private JMenuItem grats = new JMenuItem("Congradulations Card");
	private JMenuItem bday = new JMenuItem("Birthday Card");
	
	private JMenu bright = new JMenu("Bright");
	private JMenu dark = new JMenu("Dark");
	private JMenuItem yellow = new JMenuItem("Yellow");
	private JMenuItem pink = new JMenuItem("Pink");
	private JMenuItem gray = new JMenuItem("Gray");
	private JMenuItem black = new JMenuItem("Black");
	private JMenuItem white = new JMenuItem("White");
	
	private JMenuItem arial = new JMenuItem("Arial");
	private JMenuItem lucida = new JMenuItem("Lucida Handwriting");
	private JMenuItem inkfree = new JMenuItem("Ink Free");
	
	private JTextField name = new JTextField("\"Please Enter The Recipient's Name\"");
	
	private JPanel homeScreen = new JPanel();
	private JPanel cardScreen = new JPanel();
	
	private JLabel header1 = new JLabel("Card Designer Application");
	private JLabel header2 = new JLabel("Then Get Started By Making Selections From the Menu");
	
	private JLabel cardDisplay = new JLabel();
	private JTextArea message= new JTextArea("enter your message here");
	
	private CardLayout cardLayout = new CardLayout();
	

	public CardDesigner() {
		super("Pimp My JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(cardLayout);
		
		setJMenuBar(mainBar);
		mainBar.add(menu1);
		mainBar.add(menu2);
		mainBar.add(menu3);
		mainBar.add(menu4);
		
		menu1.add(exit);
		menu2.add(home);
		menu2.add(grats);
		menu2.add(bday);
		menu3.add(bright);
		menu3.add(dark);
		menu3.add(white);
		bright.add(yellow);
		bright.add(pink);
		dark.add(black);
		dark.add(gray);
		menu4.add(arial);
		menu4.add(lucida);
		menu4.add(inkfree);
		
		exit.addActionListener(this);
		home.addActionListener(this);
		grats.addActionListener(this);
		bday.addActionListener(this);
		yellow.addActionListener(this);
		pink.addActionListener(this);
		black.addActionListener(this);
		gray.addActionListener(this);
		white.addActionListener(this);
		arial.addActionListener(this);
		lucida.addActionListener(this);
		inkfree.addActionListener(this);
		
		header1.setFont(new Font("Arial", Font.BOLD, 26));
		name.setPreferredSize(new Dimension(350,50));
		name.setFont(new Font("Arial", Font.ITALIC, 25));
		cardDisplay.setFont(new Font("Ink Free",Font.CENTER_BASELINE, 25));
		
		header1.setHorizontalAlignment(JLabel.CENTER);
		header2.setHorizontalAlignment(JLabel.CENTER);
		
		homeScreen.setLayout(new GridLayout(3,1,5,5));
		homeScreen.add(header1, BorderLayout.NORTH);
		homeScreen.add(name, BorderLayout.CENTER);
		homeScreen.add(header2, BorderLayout.SOUTH);
		
		cardScreen.setLayout(new GridLayout(2,1,5,5));
		cardScreen.add(cardDisplay);
		cardScreen.add(message);
		add("home", homeScreen);
		add("card", cardScreen);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == exit) {
			System.exit(0);
		}
		else if(source == home) {
			cardLayout.show(getContentPane(), "home");
		}
		else if(source == grats) {
			name.setText(name.getText());
			cardDisplay.setText("Congradulations " + name.getText());
			cardLayout.show(getContentPane(), "card");
			
		}
		else if(source == bday) {
			name.setText(name.getText());
			cardDisplay.setText("Happy Birthday " + name.getText());
			cardLayout.show(getContentPane(), "card");
		}
		
	}

	
	public static void main(String[] args) {
		CardDesigner a = new CardDesigner();
		a.setVisible(true);
		a.setSize(475, 250);
	}
	
	
}
