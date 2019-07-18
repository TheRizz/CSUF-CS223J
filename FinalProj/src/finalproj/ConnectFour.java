package finalproj;

import java.awt.*;
import java.awt.Color.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author rmartinez72
 */
public class ConnectFour extends JFrame implements ActionListener{
    private final int ROWS = 6;
    private final int COLS = 7;
    
    //elements for the game
    private char board[][] = new char[COLS][ROWS];
    private JPanel panel[][] = new JPanel[COLS][ROWS];
    private JLabel label[][] = new JLabel[COLS][ROWS];
    
    private JPanel topHome = new JPanel();
    private JPanel middleHome = new JPanel();
    private JPanel home = new JPanel();
    private JPanel gameScreen = new JPanel();
    private JPanel topGame = new JPanel();
    private JPanel buttonsGame = new JPanel();
    private JPanel turnGame = new JPanel();
    private JPanel bottomGame = new JPanel();
    private JButton next = new JButton("Start");
    
    private CardLayout cardLayout = new CardLayout();
    private ButtonGroup group = new ButtonGroup();
    private JRadioButton colOne = new JRadioButton("Col 1");
    private JRadioButton colTwo = new JRadioButton("Col 2");
    private JRadioButton colThree = new JRadioButton("Col 3");
    private JRadioButton colFour = new JRadioButton("Col 4");
    private JRadioButton colFive = new JRadioButton("Col 5");
    private JRadioButton colSix = new JRadioButton("Col 6");
    private JRadioButton colSeven = new JRadioButton("Col 7");
    
    private JLabel turn = new JLabel("Current Player's Turn: Red");
    private boolean playerTurn = true;
    private JButton activate = new JButton("Go");
    
    private JLabel intro = new JLabel("Welcome to my Connect Four game");
    private JLabel intro2 = new JLabel("please click the button to start");
    
    public ConnectFour(){
        super("Connect Four");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(cardLayout);
        
        home.setBackground(Color.CYAN);
        home.setLayout(new GridLayout(3,0,50,50));
        intro.setFont(new Font("Arial", Font.BOLD, 26));
        intro2.setFont(new Font("Arial", Font.BOLD, 26));
        topHome.setLayout(new FlowLayout());
        topHome.add(intro);
        topHome.setBackground(Color.CYAN);
        middleHome.setLayout(new FlowLayout());
        middleHome.add(intro2);
        middleHome.setBackground(Color.CYAN);
        home.add(topHome);
        home.add(middleHome);
        home.add(next);
        
        
        group.add(colOne);
        group.add(colTwo);
        group.add(colThree);
        group.add(colFour);
        group.add(colFive);
        group.add(colSix);
        group.add(colSeven);
        gameScreen.setLayout(new BorderLayout());
        turnGame.setLayout(new FlowLayout(FlowLayout.CENTER, 200,0));
        topGame.setLayout(new BorderLayout());
        turnGame.add(turn);
        turnGame.add(activate);
        buttonsGame.setLayout(new GridLayout(1,7,0,100));
        bottomGame.setLayout(new GridLayout(6,7,5,5));
        //gameScreen.setLayout(new BorderLayout());
        topGame.add(turnGame, BorderLayout.NORTH);
        topGame.add(buttonsGame, BorderLayout.CENTER);
        gameScreen.add(topGame, BorderLayout.NORTH);
        buttonsGame.add(colOne);
        buttonsGame.add(colTwo);
        buttonsGame.add(colThree);
        buttonsGame.add(colFour);
        buttonsGame.add(colFive);
        buttonsGame.add(colSix);
        buttonsGame.add(colSeven);
        //buttonsGame.remove(colOne);
        gameScreen.add(topGame, BorderLayout.NORTH);
        gameScreen.add(bottomGame, BorderLayout.CENTER);
        
        activate.addActionListener(this);
        
        next.addActionListener(this);
        colOne.addActionListener(this);
        colTwo.addActionListener(this);
        colThree.addActionListener(this);
        colFour.addActionListener(this);
        colFive.addActionListener(this);
        colSix.addActionListener(this);
        colSeven.addActionListener(this);
        
        
        add("home", home);
        add("game", gameScreen);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == next){
            for(int y = 0; y < ROWS; ++y){
                for(int x = 0; x < COLS; ++x){
                    board[x][y] = 'y';
                    panel[x][y] = new JPanel();
                    label[x][y] = new JLabel();
                
                    panel[x][y].add(label[x][y]);
                    bottomGame.add(panel[x][y]);
                    panel[x][y].setBackground(Color.YELLOW);
                
            }
        }
            cardLayout.next(getContentPane());
        }
        else if(source == activate){
            if(colOne.isSelected() || colTwo.isSelected() ||
               colThree.isSelected() || colFour.isSelected() ||
               colFive.isSelected() || colSix.isSelected() ||
               colSeven.isSelected()){
                //entering pieces into the program if they can fit
                if(colOne.isSelected() && board[0][0] == 'y'){
                    int colf = 0;
                    int rowf = 0;
                    //panel[colf][rowf].setBackground(Color.RED);
                                 
                    while((board[colf][rowf] != 'r' && board[colf][rowf] != 'b') &&
                            rowf < 5){
                        //panel[colf][rowf].setBackground(Color.RED);
                        rowf ++;
                    }
                    
                    if(rowf == 5 && (board[colf][rowf] == 'r' || 
                            board[colf][rowf] == 'b')){
                        rowf --;
                        if(playerTurn){
                            panel[colf][rowf].setBackground(Color.RED);
                            board[colf][rowf] = 'r';
                                    }
                        else{
                            panel[colf][rowf].setBackground(Color.BLUE);
                            board[colf][rowf] = 'b';
                        }
  
                    }
                    else if(rowf == 5){
                        if(playerTurn){
                            panel[colf][rowf].setBackground(Color.RED);
                            board[colf][rowf] = 'r';
                                    }
                        else{
                            panel[colf][rowf].setBackground(Color.BLUE);
                            board[colf][rowf] = 'b';
                        }
                    }
                    else{
                        rowf --;
                        if(playerTurn){
                            panel[colf][rowf].setBackground(Color.RED);
                            board[colf][rowf] = 'r';
                                    }
                        else{
                            panel[colf][rowf].setBackground(Color.BLUE);
                            board[colf][rowf] = 'b';
                        }
                    }

                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please select a column\n"
                            + "that isn't full",
                        "Error",                                               
                        JOptionPane.ERROR_MESSAGE);
                }
                
                
                
                
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Please select a column",
                        "Error",                                               
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}
