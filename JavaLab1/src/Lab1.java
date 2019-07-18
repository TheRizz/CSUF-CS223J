/*	Name: Ryan Martinez
 * 	ID:	  889000576
 * 
 * 	Program Description:
 *  This program will read in a year from user
 * 	input and then calculate if the current year
 * 	is a leap year or not
 */


/*
 * name
 * date
 * lab #
 * description
 * 
 */

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		/*
		 * Ryan Martinez
		 * 9/4/2018
		 * Lab 1 Part 1
		 * Description: This program reads in a calendar year
		 * and then displays if it is a leap year or not
		 */
		int year;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		year = input.nextInt();
		
		if((year % 4) == 0) {
			if((year % 100) == 0) {
				if((year % 400) == 0) {
					System.out.print(year + " is a leap year.");
				}
				else {
					System.out.print(year + " is not a leap year.");
				}
			}
			else {
				System.out.print(year + " is a leap year.");
			}
		}
		else {
			System.out.print(year + " is not a leap year.");
		}
		
//		/*
//		 * Ryan Martinez
//		 * 9/4/2018
//		 * Lab 1 Part 2
//		 * Description: This program reads in name and age and then
//		 * prints out the person's age group
//		 */
//		String name;
//		int age;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Please enter a person\'s name:");
//		name = input.nextLine();
//		
//		System.out.println("Please enter the person\'s age:");
//		age = input.nextInt();
//		
//		if(age < 1) {
//			System.out.println(name + " is an infant");
//		}
//		else if(age >= 1 && age <= 3) {
//			System.out.println(name + " is a toddler");
//		}
//		else if(age >= 4 && age <= 5) {
//			System.out.println(name + " is a preschooler");
//		}
//		else if(age >=6 && age <= 12) {
//			System.out.println(name + " is a grade schooler");
//		}
//		else if (age >= 13 && age <= 18) {
//			System.out.println(name + " is a teenager");
//		}
//		else if(age >= 19 && age <= 21) {
//			System.out.println(name + " is a young adult");
//		}
//		else {
//			System.out.println(name + " is an adult");
//		}
		
		
//		/*
//		 * Ryan Martinez
//		 * 9/4/2018
//		 * Lab 1 Part 3
//		 * Description: This program reads in different variables 
//		 * from input and then outputs them in a formatted line
//		 */
//		Scanner input = new Scanner(System.in);
//		String street;
//		int houseNum;
//		String city;
//		int zipCode;
//		String state;
//		
//		System.out.print("Enter your street: ");
//		street = input.nextLine();
//		System.out.print("Enter the house or apartment number: ");
//		houseNum = input.nextInt();
//		input.nextLine();
//		System.out.print("Enter the city: ");
//		city = input.nextLine();
//		System.out.print("Enter the zip code: ");
//		zipCode = input.nextInt();
//		input.nextLine();
//		System.out.print("Enter the State: ");
//		state = input.nextLine();
//		
//		System.out.println("\n" + houseNum + " " + street + ","
//				+ " " + city + ", " + state + " " + zipCode);
		
	}
}
