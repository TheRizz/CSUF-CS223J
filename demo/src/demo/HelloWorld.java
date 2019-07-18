package demo;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("Hello World");
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("What is your age? ");
		int age = in.nextInt();
		System.out.println(age);
		in.nextLine();
		System.out.print("What is your name? ");
		String name = in.nextLine();
		System.out.print(name);
		
		System.out.print("Your name is: " + name + ", and Your age is: " + age);
//		System.out.println("Enter the first number");
//		double firstNum = in.nextDouble();
//		
//		System.out.println("Enter the second number");
//		double secondNum = in.nextDouble();
		
		//cout << output stream
		
//		System.out.println(firstNum + " " + secondNum); question about 33.3 + 66.6
//		System.out.println("The sum is: " + (firstNum + secondNum));
//		System.out.println("The difference is: " + (firstNum - secondNum));
//		System.out.println("The product is: " + (firstNum * secondNum));
//		System.out.println("The quotient is: " + (firstNum / secondNum));
	
	}

}
