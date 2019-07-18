import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameWithManyComponents extends JFrame 
implements ActionListener {
	final int FRAME_WIDTH = 350;
	final int FRAME_HEIGHT = 150;
	JLabel namePrompt;
	JLabel heading1;
	JLabel conversion;
	JTextField nameField;
	JButton button;
	
	public JFrameWithManyComponents() {
		super("Temperature Converter"); //must be first statement
		
		namePrompt = new JLabel("Enter Farenheit");
		heading1 = new JLabel("Enter Degrees F* to recieve Degrees C*");
		nameField = new JTextField(12);
		button = new JButton("Click to continue");
		conversion = new JLabel("");
		
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		button.setToolTipText("Begin Conversion");
		heading1.setFont(new Font("Arial", Font.BOLD, 16));
		
		setLayout(new FlowLayout());
		add(heading1);
		add(namePrompt);
		add(nameField);
		add(button);
		add(conversion);
		button.addActionListener(this);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = nameField.getText();
		double far = Double.parseDouble(name);
		conversion.setText(String.format("Degrees Celsius %.2f*",
				((far - 32) * 5/9)));
	}
}