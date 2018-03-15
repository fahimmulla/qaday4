package qa_day_4;

public class Motorbike extends Vehicle {

	public Motorbike(String id, int cost, int year, int pedals, int seats, int topSpeed) {
		super(id, cost, year, pedals, seats, topSpeed);
	}
	
	private boolean canDriveFast;
	
	public boolean canDriveFast () {
		return canDriveFast;
	}
	
	public void setcanDriveFast (boolean canDriveFast) {
		this.canDriveFast = canDriveFast;
	}
}
