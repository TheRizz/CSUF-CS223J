package demo;

public class Student {
	private String name;
	private int age;
	private int stuNum;
	private double gpa;
	//all instances of this class will share this variable
	private static int count = 0;
	
	
	
	
	//Student Timmy = new Student();
	public Student() {
//		name = "";
//		age = 0;
		
		
		//call constructors inside of other constructors
		this(999,0);
	}
	
	//Student Timmy = new Student(12345, 3.3);
	public Student(int num, double avg) {
		stuNum = num;
		gpa = avg;
	}
	
	//Student Timmy = new Student(45)
	public Student(int num) {
//		stuNum = num;
//		gpa = 0.0;
		this(num, 0.0);
	}
	
	//Student Timmy = new Student(45.0);
	public Student(double avg) {
//		stuNum = 0;
//		gpa = avg;
		this(999, avg);
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
	public int getCount() {
		return count;
	}
	
	
}
