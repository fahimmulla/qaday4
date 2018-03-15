package qa_day_4;

public class Rickshaw extends Vehicle {

	public Rickshaw(String id, int cost, int year, int pedals, int seats, int topSpeed) {
		super(id, cost, year, pedals, seats, topSpeed);
		// TODO Auto-generated constructor stub
	}
	
	private boolean isBreezy;
	
	public boolean isBreezy() {
		return isBreezy;
	}
	public void setisBreezy(boolean isBreezy) {
		this.isBreezy = isBreezy;
	}
}
