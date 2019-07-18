
public class Four {

	public static void main(String[] args) {
		Car Lola = new Car();
		Lola.setDistance(0);
		Lola.setSpeed(0);
		
		System.out.println("Lola has a current speed of "
		+ Lola.getSpeed() + " and has gone a distance of "
				+ (int)Lola.getDistance());
		
		Lola.accelerate(50);
		Lola.travel(1.5);
		System.out.println("Lola has a current speed of "
		+ Lola.getSpeed() + " and has gone a distance of "
				+ (int)Lola.getDistance());

		Lola.decelerate(15);
		Lola.travel(1);
		System.out.println("Lola has a current speed of "
		+ Lola.getSpeed() + " and has gone a distance of "
				+ (int)Lola.getDistance());
	}

}
