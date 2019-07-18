import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		int Turn = 1;
		boolean PlayerWin = false;
		PlayerSide activePlayer = PlayerSide.X;
		Game_Board board = new Game_Board();
		int inputCol;
		int inputRow;
		Scanner input = new Scanner(System.in);
		

		System.out.println("Welcome to Tic-Tac-Toe\n===================");
		
//		printBoard(CurrentMoves);
		while(Turn < 10 && !PlayerWin) {
			
			board.displayBoard();
			
			if(activePlayer == PlayerSide.X) {
				System.out.println("Player 1 turn 'X'");
			}
			else {
				System.out.println("Player 2 turn 'O'");
			}
			
			System.out.println("Which Row would you like?");
			inputRow = input.nextInt();
			input.nextLine();
			
			System.out.println("Which Col would you like?");
			inputCol = input.nextInt();
			input.nextLine();
			
			while(!board.updateBoard(inputCol, inputRow, activePlayer)) {
				System.out.println("Illegal Move");
				
				System.out.println("Which Row would you like?");
				inputRow = input.nextInt();
				input.nextLine();
				
				System.out.println("Which Col would you like?");
				inputCol = input.nextInt();
				input.nextLine();
			}
			
			
			PlayerWin = checkWin(board.getStateBoard(), activePlayer);
			
			if(!PlayerWin) {
				
				Turn ++;
				
				if(activePlayer == PlayerSide.X) {
					activePlayer = PlayerSide.O;
				}
				else {
					activePlayer = PlayerSide.X;
				}
			}
			
		}
		
		if(PlayerWin) {
			System.out.println(activePlayer.getSide() + " Player Wins!");
		}
		else {
			System.out.println("Cat's Game!");
		}
		
		board.displayBoard();
		
		
		input.close();
	}
	
	public static boolean checkWin(PlayerSide CurrentMovesf[][], PlayerSide CurrentPlayer) {
		//col 1
		if(AreEqual(CurrentPlayer, CurrentMovesf[0][0], CurrentMovesf[1][0], CurrentMovesf[2][0])) {
			return true;
		}
		//col 2
		if(AreEqual(CurrentPlayer, CurrentMovesf[0][1], CurrentMovesf[1][1], CurrentMovesf[2][1])) {
			return true;
		}
		//col 3
		if(AreEqual(CurrentPlayer, CurrentMovesf[0][2], CurrentMovesf[1][2], CurrentMovesf[2][2])) {
			return true;
		}
		//row 1
		if(AreEqual(CurrentPlayer, CurrentMovesf[0][0], CurrentMovesf[0][1], CurrentMovesf[0][2])) {
			return true;
		}
		//row 2
		if(AreEqual(CurrentPlayer, CurrentMovesf[1][0], CurrentMovesf[1][1], CurrentMovesf[1][2])) {
			return true;
		}
		//row 3
		if(AreEqual(CurrentPlayer, CurrentMovesf[2][0], CurrentMovesf[2][1], CurrentMovesf[2][2])) {
			return true;
		}
		//diag 1
		if(AreEqual(CurrentPlayer, CurrentMovesf[0][0], CurrentMovesf[1][1], CurrentMovesf[2][2])) {
			return true;
		}
		//diag 2
		if(AreEqual(CurrentPlayer, CurrentMovesf[0][2], CurrentMovesf[1][1], CurrentMovesf[2][0])) {
			return true;
		}
		return false;
	}
	
	public static boolean AreEqual(PlayerSide x1, PlayerSide x2, PlayerSide x3, PlayerSide x4) {
		if(x1 == x2 && x3 == x4 && x1 == x3) {
			return true;
		}
		return false;
	}
}
