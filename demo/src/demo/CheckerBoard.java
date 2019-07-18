package demo;
import java.awt.*;
import java.awt.color.*;
import javax.swing.*;

public class CheckerBoard extends JFrame{

	private final int ROWS = 8;
	private final int COLS = 8;
	private final int GAP = 2;
	private final int NUM = ROWS*COLS;
	
	private JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
	
	private JPanel[] panel = new JPanel[NUM]; // make this a 2d array
	private Color color1 = Color.WHITE;
	private Color color2 = Color.BLUE;
	private Color tempColor;
	
	
	public CheckerBoard() {
		super("Checker Board");
		
		add(pane);
		
		for(int x = 0; x < NUM; ++x) {
			panel[x] = new JPanel();
			pane.add(panel[x]);
			
			if(x % COLS == 0) {
				tempColor = color1;
				color1 = color2;
				color2 = tempColor;
			}
			if(x % 2 == 0) {
				panel[x].setBackground(color1);
				
			}
			else {
				panel[x].setBackground(color2);
				
			}
			panel[x].add(new JLabel("X"));
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		CheckerBoard frame = new CheckerBoard();
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
}
