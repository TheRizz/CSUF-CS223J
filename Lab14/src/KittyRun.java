import java.awt.*;
import java.awt.Color.*;
import javax.swing.*;
import java.awt.event.*;


public class KittyRun extends JFrame implements ActionListener{
	
	private final int ROWS = 8;
	private final int COLS = 8;
	private final int GAP = 2;
	
	private int xProg = 0;
	
	private int kittyX = 0;
	private int kittyY = 0;
	
	private String kitty = ("=^.^=");
	
	private JButton up = new JButton("UP");
	private JButton down = new JButton("down");
	private JButton left = new JButton("LEFT");
	private JButton right = new JButton("RIGHT");
	
	private JPanel screen = new JPanel(new BorderLayout());
	private JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
	
	private JPanel[][] panel = new JPanel[ROWS][COLS];
	private JLabel[][] label = new JLabel[ROWS][COLS];
	private Color color1 = Color.CYAN;
	private Color color2 = Color.WHITE;
	private Color tempColor;
	
	public KittyRun() {
		
		super("Run Kitty Run");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.add(pane, BorderLayout.CENTER);
		screen.add(up, BorderLayout.NORTH);
		screen.add(down, BorderLayout.SOUTH);
		screen.add(left, BorderLayout.WEST);
		screen.add(right, BorderLayout.EAST);
		add(screen);
		
		up.addActionListener(this);
		down.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		
		
		for(int y = 0; y < ROWS; ++y) {
			for(int x = 0; x < COLS; ++x) {
				panel[x][y] = new JPanel();
				label[x][y] = new JLabel();
				
				
				panel[x][y].add(label[x][y]);
				pane.add(panel[x][y]);
				
				if(xProg != x) {
					++ xProg;
					tempColor = color1;
					color1 = color2;
					color2 = tempColor;
				}
				
				if(y % 2 == 0) {
					panel[x][y].setBackground(color1);
				}
				else {
					panel[x][y].setBackground(color2);
				}
				
			}
		}
		
		label[kittyY][kittyX].setText(kitty);
		//panel[kittyX][kittyY].remove(kitty);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == up) {
			if(kittyY > 0) {
				label[kittyX][kittyY].setText("");
				-- kittyY;
				label[kittyX][kittyY].setText(kitty);
			}
		}
		else if(source == down) {
			if(kittyY < ROWS - 1) {
				label[kittyX][kittyY].setText("");
				++ kittyY;
				label[kittyX][kittyY].setText(kitty);
			}
		}
		else if(source == left) {
			if(kittyX > 0) {
				label[kittyX][kittyY].setText("");
				-- kittyX;
				label[kittyX][kittyY].setText(kitty);
			}
		}
		else if(source == right) {
			if(kittyX < COLS - 1) {
				label[kittyX][kittyY].setText("");
				++ kittyX;
				label[kittyX][kittyY].setText(kitty);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		KittyRun frame = new KittyRun();
		frame.setSize(500,400);//width then height
		frame.setVisible(true);
		
	}
	
	
}
