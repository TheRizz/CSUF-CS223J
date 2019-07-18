
public class Attribute_Tool {
	//Checks to see if cleanliness is less than 5, if so it drops other stats
	public static void checkCleanliness(VirtualPet petf) {
		if(petf.getCleanliness() < 5) {
			if((int)(Math.random()*2) == 0) {
				petf.setHealth(petf.getHealth() - 1);
				System.out.println(petf.getName() + " is starting to"
						+ " smell bad. (-1 Health)");
			}
			else {
				petf.setHappiness(petf.getHappiness() + 1);
				System.out.println(petf.getName() + " is muddy from"
						+ " rolling around\nin the dirt. (+1 Happiness)");
			}
		}
		
	}
	//Checks to see if happiness is less than 5, if so it drops other stats
	public static void checkHappiness(VirtualPet petf) {
		if(petf.getHappiness() < 5) {
			if((int)(Math.random()*2) == 0) {
				petf.setHunger(petf.getHunger() - 1);
				System.out.println(petf.getName() + " is about to"
						+ " gnaw his\nleg off. (-1 Hunger)");
			}
			else {
				petf.setCleanliness(petf.getCleanliness() + 1);
				System.out.println(petf.getName() + " forgot to put on"
						+ " deodorant\nthis morning. (-1 Cleanliness)");
			}
		}
		
	}
	//Checks to see if the happiness is less than 5, if so it drops other stats
	public static void checkHealth(VirtualPet petf) {
		if(petf.getHealth() < 5) {
			if((int)(Math.random()*2) == 0) {
				petf.setHunger(petf.getHunger() - 1);
				System.out.println(petf.getName() + " can hear their"
						+ " stomach\ngrowling. (-1 Hunger)");
			}
			else {
				petf.setCleanliness(petf.getCleanliness() + 1);
				System.out.println(petf.getName() + " hasn't changed"
						+ " their\nunderwear yet. (-1 Cleanliness)");
			}
		}
		
	}
	//Checks to see if the hunger is less than 5, if so it drops other stats
	public static void checkHunger(VirtualPet petf) {
		if(petf.getHunger() < 5) {
			if((int)(Math.random()*2) == 0) {
				petf.setHealth(petf.getHealth() - 1);
				System.out.println(petf.getName() + " forgot to eat"
						+ " their\ndaily vitamins. (-1 Health)");
			}
			else {
				petf.setHappiness(petf.getHappiness() - 1);
				System.out.println(petf.getName() + " didn't get ice"
						+ " cream\nafter dinner. (-1 Happiness)");
			}
		}
	
	}
	//Checks to see if any stats are 0, if so then the pet is dead
	public static boolean checkDeath(VirtualPet petf) {
		if(petf.getHealth() <= 0 || petf.getCleanliness() <= 0 ||
				petf.getHappiness() <= 0 || petf.getHunger() <= 0) {
			return true;
		}
		return false;
	}
}
