package qa_day_4;

public class Car extends Vehicle {

	public Car(String id, int cost, int year, int pedals, int seats, int topSpeed) {
		super(id, cost, year, pedals, seats, topSpeed);
		// TODO Auto-generated constructor stub
	}

	private boolean doesDonuts;

	public boolean doesDonuts() {
	
		return doesDonuts;
	}

	public void setdoesDonuts(boolean doesDonuts) {
		this.doesDonuts = doesDonuts;
}

}
