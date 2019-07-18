import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class QuizApplication extends JFrame
implements ActionListener, ItemListener{
	final int FRAME_WIDTH = 350;
	final int FRAME_HEIGHT = 360;
	
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
	boolean qThreeBugFix = false;
	String[] quesThreeTF = {"Select An Option", "False", "True"};
	JComboBox quesThreeDropDown = new JComboBox(quesThreeTF);
	
	
	JLabel questionFour;
	JCheckBox packetAns;
	JCheckBox packageAns;
	JCheckBox bundleAns;
	JCheckBox gaggleAns;
	
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
		
		questionFour = new JLabel("4) Java classes are stored in a folder or");
		
		packetAns = new JCheckBox("Packet", false);
		packageAns = new JCheckBox("Package", false);
		bundleAns = new JCheckBox("Bundle", false);
		gaggleAns = new JCheckBox("Gaggle", false);
		
		ButtonGroup quesOneGroup = new ButtonGroup();
		ButtonGroup quesTwoGroup = new ButtonGroup();
		ButtonGroup quesFourGroup = new ButtonGroup();
		
		submission = new JButton("Submit");
		totalScore = new JLabel("Score :  /20");
		
		
		
		heading.setFont(new Font("Arial", Font.BOLD, 24));
		questionOne.setFont(new Font("Arial", Font.ITALIC, 16));
		questionTwo.setFont(new Font("Arial", Font.ITALIC, 14));
		questionThree.setFont(new Font("Arial", Font.ITALIC, 16));
		questionFour.setFont(new Font("Arial", Font.ITALIC,17));
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
		//question 4
		packetAns.addItemListener(this);
		packageAns.addItemListener(this);
		bundleAns.addItemListener(this);
		gaggleAns.addItemListener(this);
		
		quesOneGroup.add(range);
		quesOneGroup.add(space);
		quesOneGroup.add(domain);
		quesOneGroup.add(scope);
		
		quesTwoGroup.add(privAns);
		quesTwoGroup.add(pubAns);
		quesTwoGroup.add(staticAns);
		quesTwoGroup.add(nonStaticAns);
		
		quesFourGroup.add(packetAns);
		quesFourGroup.add(packageAns);
		quesFourGroup.add(bundleAns);
		quesFourGroup.add(gaggleAns);
		
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
		
		//question 4
		add(questionFour);
		add(packetAns);
		add(packageAns);
		add(bundleAns);
		add(gaggleAns);
		
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
		//question 4
		else if(source == packetAns) {
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
			else {
				score -= 0;
			}
		}
		else if(source == packageAns) {
			if(select == ItemEvent.SELECTED) {
				score += 5;
			}
			else {
				score -= 5;
			}
		}
		else if(source == bundleAns) {
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
			else {
				score -= 0;
			}
		}
		else if(source == gaggleAns) {
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
			else {
				score -= 0;
			}
		}
		
		//question 3
		Object source1 = e.getSource();
		if(source1 == quesThreeDropDown) {
			if(select == ItemEvent.SELECTED) {
				int positionOfSelection = quesThreeDropDown.getSelectedIndex();
				if(positionOfSelection == 0) {
					if(qThreeBugFix) {
						score -= 5;
						qThreeBugFix = false;
					}
				}
				else if(positionOfSelection == 1) {
					if(qThreeBugFix) {
						score -= 5;
						qThreeBugFix = false;
					}
				}
				else if(positionOfSelection == 2) {
					if(!qThreeBugFix) {
						score += 5;
						qThreeBugFix = true;
					}
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		totalScore.setText("Score : " + score + "/20");
		
	}

}

