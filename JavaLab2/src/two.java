
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class two {

	public static void main(String[] args) {
		//comments
//		Scanner input = new Scanner(System.in);
//		String bottles = "bottles";
//		
//		System.out.println("How many bottles are there?");
//		int num = input.nextInt();
//		
//		while(num > 0) {
//			System.out.println(num + " " + bottles + " of beer on the wall\n" + num + " " + bottles + " of beer");
//			num -= 1;
//			
//			if( num == 1) {
//				bottles = "bottle";
//			}
//			
//			if( num == 0) {
//				System.out.println("Take one down, pass it around\n" + "No bottles of beer on the wall");
//			}
//			else {
//				System.out.println("Take one down, pass it around\n" + num + " " + bottles + " of beer on the wall\n");
//		
//			}
//		}
		
		
		
		/////////////////////////////////////////////////////////////// TYPE CASTING /////////////////////////////////////////////////////////////////
		
//		int num2 = 30;
//		double bankBalance = 999.99;
//		float myMoney = 47.82f;
//		int dollars = (int)myMoney;
//		
//		System.out.println(bankBalance);
//		float weeklyBudget = (float)bankBalance / 4;
//		System.out.println(weeklyBudget);
//		System.out.printf("%.2f", weeklyBudget);
		
		
		
		//////////////////////////////////////////////////////////// JAVA FX ////////////////////////////////////////////////////////////////////////
//		JOptionPane.showMessageDialog(null, "Hello Dialog");
//		JOptionPane.showInputDialog("What is your name?", null);
//		JOptionPane.showInputDialog(null, "What is your name?");
//		String poop = JOptionPane.showInputDialog("What is your name?", "What is your name?");
//		System.out.println(poop);
//		poop = JOptionPane.showInputDialog(null, "Display Message", "Title bar", JOptionPane.ERROR_MESSAGE);
		
		/*JOptionPane.ERROR_MESSAGE     -> CHANGES ICON IN THE DISPLAY BOX
		 * .INFORMATION_MESSAGE
		 * .PLAIN_MESSAGE
		 * .QUESTION_MESSAGE
		 * .WARNING_MESSAGE
		 */
		
//		String result = JOptionPane.showInputDialog(null, "What is your area code?", "Area code information", JOptionPane.QUESTION_MESSAGE);
		
		
//		String wageString, dependentsString;
//		double wage, weeklyPay;
//		int dependents;
//		//final = constant variable
//		final double HOURS_IN_A_WEEK = 37.5; //const
//		
//		wageString = JOptionPane.showInputDialog(null,"Enter employee's hourly wage", 
//				"Salary Dialog 1", JOptionPane.INFORMATION_MESSAGE);
//		
//		weeklyPay = Double.parseDouble(wageString) * HOURS_IN_A_WEEK;
//		
//		dependentsString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);
//		
//		dependents = Integer.parseInt(dependentsString);
//		
//		JOptionPane.showMessageDialog(null, "Weekly Salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents");
		
		
//		/*	Ryan Martinez
//		 * 	9/6/2018
//		 * 	Lab 2 Part 1
//		 * 	Desc: This program reads in different words after prompting for them in 
//		 * 	input dialog boxes and stores them in variables. Then the program outputs
//		 *  them in a formatted string that displays in a message box.
//		 */
//		
//		String celeb, friend, muffledLaughter, noun1, noun2, yourName, bodyPart;
//		int i = 1;
//		
//		celeb = JOptionPane.showInputDialog(null, "Enter a Celebrity name", "MadLibs" + i++, JOptionPane.INFORMATION_MESSAGE);
//		friend = JOptionPane.showInputDialog(null, "Enter a Friend's name", "MadLibs" + i++, JOptionPane.INFORMATION_MESSAGE);
//		muffledLaughter = JOptionPane.showInputDialog(null, "Enter some Muffled Laughter", "MadLibs" + i++, JOptionPane.INFORMATION_MESSAGE);
//		noun1 = JOptionPane.showInputDialog(null, "Enter a Noun", "MadLibs" + i++, JOptionPane.INFORMATION_MESSAGE);
//		noun2 = JOptionPane.showInputDialog(null, "Enter another Noun", "MadLibs" + i++, JOptionPane.INFORMATION_MESSAGE);
//		yourName = JOptionPane.showInputDialog(null, "Enter a Your name", "MadLibs" + i++, JOptionPane.INFORMATION_MESSAGE);
//		bodyPart = JOptionPane.showInputDialog(null, "Enter a Body Part", "MadLibs" + i++, JOptionPane.INFORMATION_MESSAGE);
//		
//		JOptionPane.showMessageDialog(null, "Hi, this is " + celeb + ". Is this " + friend +
//				"?\n By any chance is your [" + muffledLaughter + "], by any chance is your " +
//				noun1 + " running?\n Well, why don't you go--- " + yourName + "?\n I've never heard of such a " +
//				noun2 + " in all of my life.\n Psyche! It totally is " + yourName + ". In your " + bodyPart + "!");
		
		/*	Ryan Martinez
		 * 	9/6/2018
		 * 	Lab 2 Part 2
		 * 	Desc: This program reads in the users taxable income and then calculates
		 * 	how much tax they owe based on the amount of taxable income they had
		 */
		
		double income, tax;
		//formats the numbers so that they will output with commas to look like formal monetary values
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		
		//formatter.format(amount)
		
		income = Double.parseDouble(JOptionPane.showInputDialog(null, "Please provide your taxable income:", 
				"Taxable Income dialog 1", JOptionPane.QUESTION_MESSAGE));
		

		// 10% taxable rate - finished
		if( income >= 0 && income <= 9325) {
			tax = income * .1;
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + formatter.format(tax));
		}
		// 15% taxable rate - finished
		else if( income >9325 && income <= 37950) {
			tax = 932.5 + (.15 * (income - 9325));
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + formatter.format(tax));
		}
		// 25% taxable rate - finished
		else if( income >37950 && income <= 91900) {
			tax = 5226.25 + (.25 * (income - 37950));
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + formatter.format(tax));
		}
		// 28% taxable rate
		else if( income >91900 && income <= 191650) {
			tax = 18713.75 + (.28 * (income - 91900));
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + formatter.format(tax));
		}
		// 33% taxable rate
		else if( income >191650 && income <= 416700) {
			tax = 46643.75 + (.33 * (income - 191650));
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + formatter.format(tax));
		}
		// 35% taxable rate
		else if( income >416700 && income <= 418400) {
			tax = 120910.25 + (.35 * (income - 416700));
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + formatter.format(tax));
		}
		// 39.60% taxable rate
		else if (income > 418400){
			tax = 121505.25 + (.396 * (income - 418400));
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + formatter.format(tax));
		}
		// invalid input
		else {
			JOptionPane.showMessageDialog(null, "This is an invalid input, please try again later");
		}
	}

}
