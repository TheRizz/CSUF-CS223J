import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class QuizApplication extends JFrame
implements ActionListener, ItemListener{
	final int FRAME_WIDTH = 350;
	final int FRAME_HEIGHT = 400;
	
	JLabel heading;
	JLabel questionOne;
	JCheckBox range;
	JCheckBox space;
	JCheckBox domain;
	JCheckBox scope;
	
	JLabel questionTwo;
	JCheckBox privAns;
	JCheckBox pubAns;
	JCheckBox staticAns;
	JCheckBox nonStaticAns;
	
	JLabel questionThree;
	String[] quesThreeTF = {"Select An Option", "False", "True"};
	JComboBox quesThreeDropDown = new JComboBox(quesThreeTF);
	
	
	JLabel questionFour;
	
	JButton submission;
	JLabel totalScore;
	
	int score = 0;
	
	
	public QuizApplication() {
		super("JAVA QUIZ");
		
		heading = new JLabel("223J Quiz Application");
		questionOne = new JLabel("1) A variable can be referenced from its");
		range = new JCheckBox("Range", false);
		space = new JCheckBox("Space", false);
		domain = new JCheckBox("Domain", false);
		scope = new JCheckBox("Scope", false);
		
		questionTwo = new JLabel("2) Methods referenced with individual objects are");
		
		privAns = new JCheckBox("Private", false);
		pubAns = new JCheckBox("Public", false);
		staticAns = new JCheckBox("Static", false);
		nonStaticAns = new JCheckBox("NonStatic", false);
		
		questionThree = new JLabel("3) Most Class Data Fields are Private");
		
		ButtonGroup quesOneGroup = new ButtonGroup();
		ButtonGroup quesTwoGroup = new ButtonGroup();
		
		submission = new JButton("Submit");
		totalScore = new JLabel("Score :  /20");
		
		
		
		heading.setFont(new Font("Arial", Font.BOLD, 24));
		questionOne.setFont(new Font("Arial", Font.ITALIC, 16));
		questionTwo.setFont(new Font("Arial", Font.ITALIC, 14));
		questionThree.setFont(new Font("Arial", Font.ITALIC, 16));
		totalScore.setFont(new Font("Arial", Font.BOLD,28));
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		submission.addActionListener(this);
		//question 1
		range.addItemListener(this);
		space.addItemListener(this);
		domain.addItemListener(this);
		scope.addItemListener(this);
		//question 2
		privAns.addItemListener(this);
		pubAns.addItemListener(this);
		staticAns.addItemListener(this);
		nonStaticAns.addItemListener(this);
		//question 3
		quesThreeDropDown.addItemListener(this);
		
		quesOneGroup.add(range);
		quesOneGroup.add(space);
		quesOneGroup.add(domain);
		quesOneGroup.add(scope);
		
		quesTwoGroup.add(privAns);
		quesTwoGroup.add(pubAns);
		quesTwoGroup.add(staticAns);
		quesTwoGroup.add(nonStaticAns);
		
		setLayout(new FlowLayout());
		add(heading);
		//question 1
		add(questionOne);
		add(range);
		add(space);
		add(domain);
		add(scope);
		
		//question 2
		add(questionTwo);
		add(privAns);
		add(pubAns);
		add(staticAns);
		add(nonStaticAns);
		
		//question 3
		add(questionThree);
		add(quesThreeDropDown);
		
		add(submission);
		add(totalScore);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getItem();
		int select = e.getStateChange();
		
		//Question 1
		if(source == range) {
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
			else {
				score -= 0;
			}
		}
		else if(source == space) {
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
			else {
				score -= 0;
			}
		}
		else if(source == domain) {
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
			else {
				score -= 0;
			}
		}
		else if(source == scope) {
			if(select == ItemEvent.SELECTED) {
				score += 5;
			}
			else {
				score -= 5;
			}
		}
		
		//Question 2
		else if(source == privAns) {
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
			else {
				score -= 0;
			}
		}
		else if(source == pubAns) {
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
			else {
				score -= 0;
			}
		}
		else if(source == staticAns) {
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
			else {
				score -= 0;
			}
		}
		else if(source == nonStaticAns) {
			if(select == ItemEvent.SELECTED) {
				score += 5;
			}
			else {
				score -= 5;
			}
		}
		
		//question 3
		Object source1 = e.getSource();
		if(source1 == quesThreeDropDown) {
			if(select == ItemEvent.SELECTED) {
				int positionOfSelection = quesThreeDropDown.getSelectedIndex();
				if(positionOfSelection == 0) {
					score += 0;
				}
				else if(positionOfSelection == 1) {
					score += 0;
				}
				else if(positionOfSelection == 2) {
					score += 5;
				}
			
			}
			// should cause the score to go down if not selecting true
			else if (select == ItemEvent.DESELECTED) {
				int positionOfSelection = quesThreeDropDown.getSelectedIndex();
				if(positionOfSelection == 0) {
					score -= 0;
				}
				else if(positionOfSelection == 1) {
					score -= 0;
				}
				else if(positionOfSelection == 2) {
					score -= 5;
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		totalScore.setText("Score : " + score + "/20");
		
	}

}
