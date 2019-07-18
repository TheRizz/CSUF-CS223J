import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MadLibs extends JFrame implements ActionListener{

	private JButton next = new JButton("Next");
	private JButton prev = new JButton("Prev");
	private JButton exit = new JButton("Exit");
	
	JLabel title1 = new JLabel("Welcome To Mad Libs");
	JLabel title2 = new JLabel("Welcome To Mad Libs");
	
	JLabel in1 = new JLabel("Please Enter Your Name");
	JLabel in2 = new JLabel("Please Enter A verb ending in \"ing\"");
	JLabel in3 = new JLabel("Please Enter A Plural Noun");
	JLabel in4 = new JLabel("Please Enter An Adjective");
	
	JTextField name = new JTextField(12);
	JTextField verb = new JTextField(12);
	JTextField noun = new JTextField(12);
	JTextField adj = new JTextField(12);
	
	JPanel input = new JPanel();
	JPanel inputText = new JPanel();
	JPanel output = new JPanel();
	JPanel header = new JPanel();
	JPanel header2 = new JPanel();
	JPanel story2 = new JPanel();
	
	private Container con = getContentPane();
	
	private JTextArea story = new JTextArea("STORY\' \n INSERT", 4, 20);
	
	CardLayout cardLayout = new CardLayout();
	
	public MadLibs() {
		super("CardLayout");
		setSize(450,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(cardLayout);
		
		con.setLayout(cardLayout);
		input.setLayout(new BorderLayout());
		inputText.setLayout(new FlowLayout(FlowLayout.CENTER));
		output.setLayout(new BorderLayout());
		header.setLayout(new FlowLayout(FlowLayout.CENTER));
		header2.setLayout(new FlowLayout(FlowLayout.CENTER));
		story2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		title1.setFont(new Font("Arial", Font.BOLD, 26));
		title2.setFont(new Font("Arial", Font.BOLD, 26));
		
		header.add(title1);
		header2.add(title2);
		
		input.add(next, BorderLayout.EAST);
		input.add(header, BorderLayout.NORTH);
		inputText.add(in1);
		inputText.add(name);
		inputText.add(in2);
		inputText.add(verb);
		inputText.add(in3);
		inputText.add(noun);
		inputText.add(in4);
		inputText.add(adj);
		input.add(inputText, BorderLayout.CENTER);
		story2.add(story);
		
		output.add(header2, BorderLayout.NORTH);
		output.add(story2, BorderLayout.CENTER);
		output.add(prev, BorderLayout.WEST);
		output.add(exit, BorderLayout.EAST);
		
		next.addActionListener(this);
		prev.addActionListener(this);
		exit.addActionListener(this);
		con.add("input", input);
		con.add("output", output);
		//construct a panel and then show the specific panel you want to show
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == next) {
			int x = (int) (Math.random() * 2 + 1);
			if(x == 1) {
				story.setText("Hi there, all you " + adj.getText() + " little boys and girls!"
						+ "\nThis is your old TV buddy, " + name.getText() + "!\nWith another "
						+ adj.getText() + "-hour program of\n" + verb.getText()
						+ " " + noun.getText() + " for all of you");
				System.out.println("1");
			}
			else {
				story.setText("Driving a car can be fun..."
						+ "\nIf you follow " + name.getText() + "\'s " + adj.getText()
						+ " advice:\nBefore " + verb.getText() + ", always stick you " + noun.getText() +
						"\nout of the window.");
				System.out.println("2");
			}
			
			cardLayout.next(getContentPane());
		}
		else if(source == prev) {
			
			cardLayout.previous(getContentPane());
		}
		else if(source == exit) {
			super.dispose();
		}
	}

}
