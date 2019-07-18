
public class Game_Board {
	PlayerSide currentBoard[][];
	
	Game_Board(){
		
		currentBoard = new PlayerSide[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				currentBoard[i][j] = PlayerSide.nan;
			}
		}
	}
	
	boolean updateBoard(int col, int row, PlayerSide activePlayer) {
		if(currentBoard[col][row] == PlayerSide.nan) {
			currentBoard[col][row] = activePlayer;
			return true;
		}
		else {
			return false;
		}
	}
	
	void displayBoard() {
		System.out.println(currentBoard[0][0].getSide() + "|" + currentBoard[1][0].getSide() + "|"
				+ currentBoard[2][0].getSide());
		System.out.println("-----");
		System.out.println(currentBoard[0][1].getSide() + "|" + currentBoard[1][1].getSide() + "|"
				+ currentBoard[2][1].getSide());
		System.out.println("-----");
		System.out.println(currentBoard[0][2].getSide() + "|" + currentBoard[1][2].getSide() + "|"
				+ currentBoard[2][2].getSide());
	}
	
	PlayerSide[][] getStateBoard(){
		return currentBoard;
	}
}


