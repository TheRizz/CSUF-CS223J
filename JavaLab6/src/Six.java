import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		//variable initialization
		Scanner input = new Scanner(System.in);
		int menuChoice = 0;
		boolean dead = false;
		
		//prints a nice, formatted heading on the program
		printPet();
		
		//calls the constructor for the pet class and stores the name 
		//	read in from input
		VirtualPet pet = new VirtualPet(input.nextLine());
		System.out.println("Initializing Stats...");
		
		//runs a loop until the user chooses to quit the program or until
		//	the pet reaches the age of 10 and dies
		do{
			printStats(pet); //prints the stats in a nice format
			
			//prints out the pet was born if the pet's age is 0
			if(pet.getAge() == 0) {
				System.out.println(pet.getName() + " was born!");
			}

			printMenu(); //prints the menu for the user to see
			menuChoice = input.nextInt(); //stores the menu input
			//updates the stats of the pet based on the menu input
			dead = menuStatUpdate(menuChoice, pet);
			
		} while(menuChoice != 5 && pet.getAge() < 10 && !dead);
		
		printStats(pet);
		
		System.out.println();
		
		//outputs based on the pet age
		if(pet.getAge() < 10 && !dead) {
			System.out.println(pet.getName() + " ended up being "
					+ pet.getAge() + " years old");
		}
		else if(dead) {
			System.out.println("Insifficient stat: " + pet.getName()
			+ " has  died");
		}
		else {
			System.out.println(pet.getName() + " Died of old age");
		}

		System.out.println("Quitting Program...");
	}

	//formats the stats to print out to the console
	public static void printStats(VirtualPet pet) {
		System.out.println("-" + pet.getName() + "'s Stats-"
				+ "\nHunger: " + pet.getHunger() + "\nCleanliness: "
				+ pet.getCleanliness() + "\nHappiness: " + pet.getHappiness()
				+ "\nHealth: " + pet.getHealth());
	}
	
	//formats the menu to print out to the console
	public static void printMenu() {
		System.out.println("Main Menu:\n1. Feed\n2. Wash\n3. Play\n"
				+ "4. Health\n5. -Quit-");
	}
	
	//formatted heading to the program
	public static void printPet() {
		System.out.println( "-Virtual Dog-\r\n" + " _   _\r\n" + 
							"/(. .)\\    )\r\n" + 
							"  (*)____/|\r\n" + 
							"  /       |\r\n" + 
							" /   |--\\ |\r\n" + 
							"(_)(_)  (_)\r\nPlease Enter a name for your pet"
							+ "\nDog:");
	}
	
	//switch statement that checks the menu input choice and will
	//	update the stat that matches the menu choice on the pet object
	//	that is passed in with the choice
	public static boolean menuStatUpdate(int choice, VirtualPet pet) {
		boolean death = false;
		switch(choice) {
		case 1:	pet.feed();
				death = checkAttributes(pet);
				pet.birthday();
				break;
		case 2: pet.wash();
				death = checkAttributes(pet);
				pet.birthday();
				break;
		case 3: pet.play();
				death = checkAttributes(pet);
				pet.birthday();
				break;
		case 4: pet.health();
				death = checkAttributes(pet);
				pet.birthday();
				break;
		//case where the user quits does nothing and will exit the loop
		case 5: break;
		//case where invalid input is entered will not increase the age
		//	but will proceed in the program
		default: System.out.println("Invalid input, please enter a valid "
				+ "number between 1 and 5");
		}
		
		return death;
	}
	
	//static method that checks to see if stats are below 5, if so then
	// the low stats cause other stats to drop
	public static boolean checkAttributes(VirtualPet petf) {
		Attribute_Tool.checkCleanliness(petf);
		Attribute_Tool.checkHappiness(petf);
		Attribute_Tool.checkHealth(petf);
		Attribute_Tool.checkHunger(petf);
		return Attribute_Tool.checkDeath(petf);
	}
	
	
}

