
public class Car {
	private int speed = 0;
	private double distance = 0;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getDistance() {
		return this.distance;
	}
	
	public void accelerate(int speed) {
		if(speed >= 0) {
			this.speed += speed;
		}
	}
	public void decelerate(int speed) {
		if(speed >= 0) {
			this.speed -= speed;
		}
		if(this.speed < 0) {
			this.speed = 0;
		}
	}
	
	public void travel(double hours) {
		this.distance += this.speed * hours;
	}
}
