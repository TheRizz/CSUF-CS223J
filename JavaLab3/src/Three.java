import javax.swing.JOptionPane;

public class Three {

	public static void main(String[] args) {
		int selection;
		boolean isYes;
		int dice1, dice2, dice3;
		
		selection = JOptionPane.showConfirmDialog(null,"Would you lke to play a dice rolling game?\nYou start out with "
				+ "$200 and are able to bet", "Dice Game Begin 1", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		isYes = (selection == JOptionPane.YES_OPTION);
		
		if(isYes) {
			boolean gameLoop = true;
			boolean gamble;
			int money = 200;
			int bet = 0;
			
			
			
			while(gameLoop && money > 0) {
				
				selection = JOptionPane.showConfirmDialog(null,"Would you like to bet?\nYou have $"
				+ money, "Dice Game Bet",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				gamble = (selection == JOptionPane.YES_OPTION);
				if(gamble) {
					bet = Integer.parseInt(JOptionPane.showInputDialog("How much of your\n" +
				money + " would you like to bet?"));
					
					while(bet > money && bet > 0) {
						if(bet > 0) {
							JOptionPane.showMessageDialog(null, "That is an invalid bet amount",
									"Error", JOptionPane.ERROR_MESSAGE);	
						}
						else {
							JOptionPane.showMessageDialog(null, "You must bet more than 0", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						bet = Integer.parseInt(JOptionPane.showInputDialog("How much of your\n" +
						money + " would you like to bet?"));
					}
					
					money -= bet;
				}
				
				dice1 = (int)(Math.random() * 6) + 1;
				dice2 = (int)(Math.random() * 6) + 1;
				dice3 = (int)(Math.random() * 6) + 1;
			
				JOptionPane.showMessageDialog(null, "Die 1: " + dice1 + "\nDice 2: " +
				dice2 + "\nDice 3: " + dice3);
				if((dice1 == dice2 && dice2 == dice3)) {
					JOptionPane.showMessageDialog(null,"All three of your dice are a match", "WINNER",
							JOptionPane.INFORMATION_MESSAGE);
					if(gamble) {
						JOptionPane.showMessageDialog(null,"You tripled your bet!", "WINNER",
								JOptionPane.INFORMATION_MESSAGE);
						money = money + (bet * 3);
					}
				}
				else if(dice1 == dice2 || dice2 == dice3 || dice3 == dice1) {
					JOptionPane.showMessageDialog(null,"Two of your dice are a match!", "WINNER",
							JOptionPane.INFORMATION_MESSAGE);
					if(gamble) {
						JOptionPane.showMessageDialog(null,"You doubled your bet!", "WINNER",
								JOptionPane.INFORMATION_MESSAGE);
						money = money + (bet * 2);
					}
				}
				else {
					JOptionPane.showMessageDialog(null,"Better luck next time", "Loser",
							JOptionPane.ERROR_MESSAGE);
					if(gamble) {
						JOptionPane.showMessageDialog(null,"You lost your bet", "Loser",
								JOptionPane.ERROR_MESSAGE);
						money -= bet;
					}
				}
				
				if(money > 0) {
					selection = JOptionPane.showConfirmDialog(null,"Would you lke to play the die game again?",
							"Dice Game Begin 2", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					gameLoop = (selection == JOptionPane.YES_OPTION);
				}
				else {
					JOptionPane.showMessageDialog(null, "You're all out of money :(\nSee you next time!", "Bankrupt",
							JOptionPane.ERROR_MESSAGE);	
				}
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Have a good day!");
		}
	}

}
