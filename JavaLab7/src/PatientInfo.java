
public class PatientInfo {

	public static void main(String[] args) {
		//Creates a new patient with the default constructor
		Patient Timmy = new Patient();
		
		//Prints out the information in a formatted way
		System.out.println("Patient ID: " + Timmy.getID() +
				"\nPatientAge: " + Timmy.getAge());
		//Displays the blood type using the enumerated values
		Timmy.displayBlood();
		
		//Creates a new patient using the non default constructor and fills in
		//information by using enumerated types
		Patient Spike = new Patient(1337, 19, RhFactor.NEGATIVE, BloodType.AB);
		
		//Prints out the information in a formatted way
		System.out.println("PatientID: " + Spike.getID() +
				"\nPatient Age: " + Spike.getAge());
		//Displays the blood type using the enumerated values
		Spike.displayBlood();
	}

}
