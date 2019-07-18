
public class VirtualPet {
	private String name;
	private int hunger;
	private int cleanliness;
	private int happiness;
	private int health;
	private int age;
	
	
	public VirtualPet(String namef) {
		//initialized variables
		age = 0;
		this.name = namef;
		//randomly initialized variables
		this.hunger = (int)(Math.random() * 10) + 1;
		this.cleanliness = (int)(Math.random() * 10) + 1;
		this.happiness = (int)(Math.random() * 10) + 1;
		this.health = (int)(Math.random() * 10) + 1;
	}
	
	//getter methods
	public String getName() {return name;}
	public int getAge() {return age;}
	public int getHunger() {return hunger;}
	public int getCleanliness() {return cleanliness;}
	public int getHappiness() {return happiness;}
	public int getHealth() {return health;}
	
	//setter methods
	public void setName(String namef) { name = namef;}
	public void setAge(int agef) { age = agef;}
	public void setHunger(int hungerf) { hunger = hungerf;}
	public void setCleanliness(int cleanlinessf) { cleanliness = cleanlinessf;}
	public void setHappiness(int happinessf) { happiness = happinessf;}
	public void setHealth(int healthf) { health = healthf;}
	
	//stat update methods
	public void feed() { //updates the hunger and outputs a random text dialog
		setHunger(getHunger() + 1);
		if((int)(Math.random()*2) == 0) {
			System.out.println(getName() + " shouts with joy"
					+ " as you\npresent a watermelon slice. (+1 Hunger)");
		}
		else {
			System.out.println(getName() + " has their stomach"
					+ " satisfied\nby the bowl of soup you offer. (+1 Hunger)");
		}
	}
	
	public void wash() { //updates the cleanliness and outputs a random text dialog
		setCleanliness(getCleanliness() + 1);
		if((int)(Math.random()*2) == 0) {
			System.out.println(getName() + " is sparkling clean"
					+ " after the\nlong bath you give them. (+1 Cleanliness)");
		}
		else {
			System.out.println(getName() + " smells great after"
					+ " the long\nshower they take. (+1 Cleanliness)");
		}
	}
	
	public void play() { //updates the happiness and outputs a random text dialog
		setHappiness(getHappiness() + 1);
		if((int)(Math.random()*2) == 0) {
			System.out.println(getName() + "'s eyes sparkle after"
					+ " you\nfinish playing catch. (+1 Happiness)");
		}
		else {
			System.out.println(getName() + " seems much more positive"
					+ " after you\ngive them a big hug. (+1 Happiness)");
		}
	}
	
	public void health() { //updates the health and outputs a random text dialog
		setHealth(getHealth() + 1);
		if((int)(Math.random()*2) == 0) {
			System.out.println(getName() + " looks much healthier"
					+ " after\ntheir long rest. (+1 Health)");
		}
		else {
			System.out.println(getName() + "'s muscles are looking"
					+ " larger\nafter exercising. (+1 Health)");
		}
	}
	
	public void birthday() { //makes the pet a year older
		age += 1;
	}
}
