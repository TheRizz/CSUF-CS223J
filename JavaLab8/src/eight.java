import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class eight {

	public static void main(String[] args) {
		String CompanyName;
		String Message;
		String ContactInfo;
		Scanner input = new Scanner(System.in);
		final int FRAME_WIDTH = 810;
		final int FRAME_HEIGHT = 330;
		
		
		System.out.println("=== Welcome to the Billboard Advertisement CO. ===");
		
		// prompts and reads in company name
		System.out.println("Please enter your Company name");
		CompanyName = input.nextLine();
		
		// prompts and reads in the message
		System.out.println("Please enter your Message");
		Message = input.nextLine();
		
		// prompts and reads in contact info
		System.out.println("Please enter your Contact info");
		ContactInfo = input.nextLine();
		
		input.close();

		// creates the new jframe object to display our information
		JFrame frame = new JFrame("Bill Board");
		
		// sets the size of the frame
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		// sets the initial location to the middle of the screen
		frame.setLocationRelativeTo(null);
		
		// makes it so you cant resize the window
		frame.setResizable(false);
		
		// program stops running when you close the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// makes the frame show up
		frame.setVisible(true);
		
		// initializes all of the labels with strings
		JLabel CompanyNameFrame = new JLabel(CompanyName);
		JLabel MessageFrame = new JLabel(Message);
		JLabel ContactInfoFrame = new JLabel(ContactInfo);
		
		// applies the font to each of the JLabels
		CompanyNameFrame.setFont(new Font("Arial", Font.BOLD, 75));
		MessageFrame.setFont(new Font("Arial", Font.BOLD, 44));
		ContactInfoFrame.setFont(new Font("Arial", Font.ITALIC, 44));
		
		
		// adds the labels to the frame
		frame.add(CompanyNameFrame);
		frame.add(MessageFrame);
		frame.add(ContactInfoFrame);
		
		// allows for multiple labels to show up and be left justified
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
	}

}
