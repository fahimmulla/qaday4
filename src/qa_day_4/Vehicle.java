package qa_day_4;

public abstract class Vehicle {

	private String id;
	private int cost;
	private int year;
	private int pedals;
	private int seats;
	private int topSpeed;
	
	public Vehicle (String id, int cost, int year, int pedals, int seats, int topSpeed) {
		this.id = id;
		this.cost = cost;
		this.year= year;
		this.pedals=pedals;
		this.seats=seats;
		this.topSpeed= topSpeed;
		
	}
	
	public String toString() {
		return "ID : " + id +"Cost: " + cost +" Year: " +year +"Pedals: " + pedals + "Seats: " + seats +"TopSpeed" +topSpeed;
		
	}
	
}
