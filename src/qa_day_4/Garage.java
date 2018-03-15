package qa_day_4;

import java.util.ArrayList;

public class Garage {

	
	private ArrayList<Vehicle> newLists= new ArrayList<Vehicle> ();
	
	public void addToArray (Vehicle inVehicle) {
		newLists.add (inVehicle);
		
		Car jaguar = new Car ("Jaguar", 100000, 2017, 3, 4, 220);
		Motorbike godSpeed = new Motorbike ("GodSpeed", 75000, 2018, 3, 4, 210);
		Rickshaw tuctuc = new Rickshaw ("Tuctuc", 40000, 2015, 3, 3,170);
		
		System.out.println(tuctuc.toString());
		System.out.println(godSpeed.toString());
		System.out.println(jaguar.toString());
		
	}
}
