
public class Patient {
	
	//Variable list for the patient class
	private int ID_number;
	private int age;
	private BloodData blood_data;
	
	//Default constructor for the patient class
	Patient(){
		ID_number = 0;
		age = 0;
		blood_data = new BloodData();
	}
	
	//Non-Default constructor for the patient class, sets the values
	Patient(int IDf, int agef, RhFactor Rhf, BloodType bloodf){
		ID_number = IDf;
		age = agef;
		blood_data = new BloodData(bloodf, Rhf);
	}
	
	//Returns the ID number
	int getID(){ return ID_number;}
	
	//Returns the Age
	int getAge() { return age;}
	
	//Displays the blood information based on enumerated values
	void displayBlood() {System.out.println(blood_data.getBlood());}
	
	//Class for the blood data
	public class BloodData{
		
		//values used inside of the class, cannot be accessed unless called by a
		//method in the class
		private BloodType blood_type;
		private RhFactor Rh;
		
		//Default constructor for the blood data class
		BloodData(){
			blood_type = BloodType.O;
			Rh = RhFactor.POSITIVE;
		}
		
		//Non-default constructor for the blood data class
		BloodData(BloodType bloodf, RhFactor Rhf){
			blood_type = bloodf;
			Rh = Rhf;
		}
		
		//Creates a string so that it will be formatted when it is printed
		String getBlood() {
			return "Blood Type: " + blood_type + Rh.getSign();
		}
	}
}