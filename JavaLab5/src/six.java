import javax.swing.JOptionPane;

public class six {

	public static void main(String[] args) {

		String playerPos;
		int idNum;
		double battingAvg;
		
		playerPos = JOptionPane.showInputDialog("What is your position?");
		idNum = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the "
		+ playerPos + "'s id", playerPos, JOptionPane.QUESTION_MESSAGE));
		battingAvg = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the "
		+ playerPos + "'s Batting Average", playerPos, JOptionPane.QUESTION_MESSAGE));
		
		BaseballPlayer Catcher = new BaseballPlayer(playerPos, idNum, battingAvg);
		JOptionPane.showMessageDialog(null, "Player # " + Catcher.getId() +
				" batting average is " + Catcher.getAvg() + " There are " +
				Catcher.getCount() + " players total on the team", "Display Player"
				, JOptionPane.INFORMATION_MESSAGE);
		
		playerPos = JOptionPane.showInputDialog("What is your position?");
		idNum = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the "
		+ playerPos + "'s id", playerPos, JOptionPane.QUESTION_MESSAGE));
		battingAvg = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the "
		+ playerPos + "'s Batting Average", playerPos, JOptionPane.QUESTION_MESSAGE));
		
		BaseballPlayer Shortstop = new BaseballPlayer(playerPos, idNum, battingAvg);
		JOptionPane.showMessageDialog(null, "Player # " + Shortstop.getId() +
				" batting average is " + Shortstop.getAvg() + " There are " + 
				Catcher.getCount() + " players total on the team", "Display Player"
				, JOptionPane.INFORMATION_MESSAGE);
		
		playerPos = JOptionPane.showInputDialog("What is your position?");

		battingAvg = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the "
		+ playerPos + "'s Batting Average", playerPos, JOptionPane.QUESTION_MESSAGE));
		
		BaseballPlayer Outfielder = new BaseballPlayer(playerPos, battingAvg);
		JOptionPane.showMessageDialog(null, "Player # " + Outfielder.getId() +
				" batting average is " + Outfielder.getAvg() + " There are " + 
				Catcher.getCount() + " players total on the team", "Display Player"
				, JOptionPane.INFORMATION_MESSAGE);
		
		playerPos = JOptionPane.showInputDialog("What is your position?");
		idNum = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the "
		+ playerPos + "'s id", playerPos, JOptionPane.QUESTION_MESSAGE));
		
		BaseballPlayer Batter = new BaseballPlayer(playerPos, idNum);
		JOptionPane.showMessageDialog(null, "Player # " + Batter.getId() +
				" batting average is " + Batter.getAvg() + " There are " + 
				Catcher.getCount() + " players total on the team", "Display Player"
				, JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "There are " + 
				Catcher.getCount() + " players & the teams collective batting average is: "
				+ Catcher.getTeamAvg(), "Collective Batting Average"
				, JOptionPane.INFORMATION_MESSAGE);
		
	}

}
