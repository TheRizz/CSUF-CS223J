package demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class openApp extends JFrame
implements ActionListener, ItemListener{

	
	final int FRAME_WIDTH = 350;
	final int FRAME_HEIGHT = 130;
	JLabel label;
	JCheckBox coffee;
	JCheckBox cola;
	JCheckBox milk;
	JCheckBox water;
	JButton button;
	int cost = 0;
	//JRadioButton
	ButtonGroup aGroup = new ButtonGroup();//mutually exclusive
	
	String[] comboArray = {"Regular", "Large"};
	JComboBox comboSize = new JComboBox(comboArray);
	
	public openApp () {
		
		
		super("Order Application");
		
		label = new JLabel ("What would you like to drink?");
		coffee = new JCheckBox ("Coffee $5", false);
		cola = new JCheckBox ("Cola $2", false);
		milk = new JCheckBox("Milk $3", false);
		water = new JCheckBox("Water $1", false);
		button = new JButton("Check Out");
		
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		coffee.addItemListener(this);
		cola.addItemListener(this);
		milk.addItemListener(this);
		water.addItemListener(this);
		button.addActionListener(this);
		comboSize.addItemListener(this);
		
		aGroup.add(coffee);
		aGroup.add(cola);
		aGroup.add(milk);
		aGroup.add(water);
		
		setLayout(new FlowLayout());
		add(label);
		add(comboSize);
		add(coffee);
		add(cola);
		add(milk);
		add(water);
		add(button);
		
	}


@Override
public void actionPerformed(ActionEvent e) {
	label.setText("Cost is :" + cost);
}


@Override
public void itemStateChanged(ItemEvent e) {
	Object source = e.getItem();
	int select = e.getStateChange();
	
	if(source == coffee) {
		if(select == ItemEvent.SELECTED) {
			cost +=5;
		}
		else {
			cost -=5;
		}
	}
	else if(source == cola) {
		if(select == ItemEvent.SELECTED) {
			cost +=2;
		}
		else {
			cost-=2;
		}
	}
	else if(source == water) {
		if(select == ItemEvent.SELECTED) {
			cost +=1;
		}
		else {
			cost -=1;
		}
	}
	else if(source == milk) {
		if(select == ItemEvent.SELECTED) {
			cost +=3;
		}
		else {
			cost -=3;
		}
	}
	
	Object source1 = e.getSource();
	if(source1 == comboSize) {
		if(select == ItemEvent.SELECTED) {
			int positionOfSelection = comboSize.getSelectedIndex();
			if(positionOfSelection == 0) {
				cost -= 10;
			}
			else if(positionOfSelection == 1) {
				cost += 10;
			}
		}
	}
	}
}
