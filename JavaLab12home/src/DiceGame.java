import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceGame extends JFrame implements ActionListener {

	
	JLabel nb = new JLabel("Welcome To The High Rollers Game");
	//JButton sb = new JButton("South Button");
	//JButton eb = new JButton("East Button");
	//JButton wb = new JButton("West Button");
	//JButton cb = new JButton("Center Button");
	
	//west
	JPanel WBbuttonsPanel = new JPanel();
	JLabel availableDisplay = new JLabel("Cash Available");
	int money = 1000;
	JTextField available = new JTextField("$" + money);
	
	//center
	JPanel CBbuttonsPanel = new JPanel();
	JButton dice1 = new JButton("D1");
	JButton dice2 = new JButton("D2");
	JButton dice3 = new JButton("D3");
	JLabel betDisplay = new JLabel("Place Your Bet");
	JTextField bet = new JTextField(12);
	
	//east
	JPanel EBbuttonsPanel = new JPanel();
	JButton cashOut = new JButton("Cash Out");
	String [] quickBetOptions = {"Quick Bet", "$100", "$350","$500"};
	JComboBox quickBet = new JComboBox(quickBetOptions);
	
	//south
	JPanel SBbuttonsPanel = new JPanel();
	JLabel outcome = new JLabel();
	JButton roll = new JButton("Roll Dice");
	JLabel luck = new JLabel();
	
	public DiceGame() {
		super("Casino Simulator");
	
		setSize(450,200);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nb.setFont(new Font("Arial", Font.BOLD, 26));
		availableDisplay.setFont(new Font("Arial", Font.BOLD,18));
		
		available.setEditable(false);
		
		cashOut.addActionListener(this);
		dice1.addActionListener(this);
		quickBet.addActionListener(this);
		roll.addActionListener(this);
		
		add(nb, BorderLayout.NORTH);
		add(WBbuttonsPanel, BorderLayout.WEST);
		add(CBbuttonsPanel, BorderLayout.CENTER);
		add(EBbuttonsPanel, BorderLayout.EAST);
		add(SBbuttonsPanel, BorderLayout.SOUTH);
		
		
		//west
		WBbuttonsPanel.setLayout(new GridLayout(2,1,5,5));
		WBbuttonsPanel.add(availableDisplay);
		WBbuttonsPanel.add(available);
		//center
		CBbuttonsPanel.setLayout(new FlowLayout());
		CBbuttonsPanel.add(dice1);
		CBbuttonsPanel.add(dice2);
		CBbuttonsPanel.add(dice3);
		CBbuttonsPanel.add(betDisplay);
		CBbuttonsPanel.add(bet);
		//east
		EBbuttonsPanel.setLayout(new GridLayout(2,1,5,5));
		EBbuttonsPanel.add(cashOut);
		EBbuttonsPanel.add(quickBet);
		//south
		SBbuttonsPanel.setLayout(new GridLayout(1,3,5,5));
		SBbuttonsPanel.add(outcome);
		SBbuttonsPanel.add(roll);
		SBbuttonsPanel.add(luck);
}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == cashOut) {
			super.dispose();
		}
		
		else if(e.getSource() == quickBet) {
			int positionOfSelection = quickBet.getSelectedIndex();
			if(positionOfSelection == 1) {
				bet.setText("100");
			}
			else if(positionOfSelection == 2) {
				bet.setText("350");
			}
			else if(positionOfSelection ==3) {
				bet.setText("500");
			}
		}
		else if(e.getSource() == roll) {
			dice1.setText(Integer.toString((int)(Math.random() * 6 + 1)));
			dice2.setText(Integer.toString((int)(Math.random() * 6 + 1)));
			dice3.setText(Integer.toString((int)(Math.random() * 6 + 1)));
			
			if(bet.getText().equals(null)) {
				outcome.setText("");
				luck.setText("");
			}
			else if(Integer.parseInt(bet.getText()) > money) {
				outcome.setText("Insufficient Funds");
				luck.setText("");
			}
			else {
				if(dice1.getText().equals( dice2.getText()) && dice2.getText().equals(dice3.getText())) {
					outcome.setText("WINNER");
					luck.setText("You triple your bet!");
					money += Integer.parseInt(bet.getText())*3;
				}
				else if(dice1.getText().equals(dice2.getText()) || dice2.getText().equals(
						dice3.getText()) || dice1.getText().equals(dice3.getText())) {
					outcome.setText("WINNER");
					luck.setText("You double your bet!");
					money += Integer.parseInt(bet.getText())*2;
				}
				else {
					outcome.setText("LOSER");
					luck.setText("Better luck next time.");
					money -= Integer.parseInt(bet.getText());
					if(money == 0) {
						cashOut.setText("Exit");
					}
				}
				available.setText("$" + money);
			}
		}

	}

}