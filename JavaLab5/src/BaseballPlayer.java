
public class BaseballPlayer {
	private int id;
	private double batAvg;
	private String position;
	private static int count = 0;
	private static double teamAvgSum = 0.0;
	
	BaseballPlayer(){
		id = 0;
		batAvg = 0;
		position = "";
		teamAvgSum += batAvg;
		count++;
	}
	BaseballPlayer(String pos, int num, double avg){
		position = pos;
		id = num;
		batAvg = avg;
		teamAvgSum += batAvg;
		count ++;
	}
	
	BaseballPlayer(String pos, double avg){
		position = pos;
		id = 999;
		batAvg = avg;
		teamAvgSum += batAvg;
		count ++;
	}
	
	BaseballPlayer(String pos, int num){
		position = pos;
		id = num;
		batAvg = .5;
		teamAvgSum += batAvg;
		count ++;
	}
	
	public int getCount(){
		return count;
	}
	
	public double getTeamAvg() {
		return teamAvgSum / count;
	}
	
	public int getId() {
		return id;
	}
	
	public double getAvg() {
		return batAvg;
	}
	
}
