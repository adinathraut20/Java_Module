package dto;

public class Flight {
	private int flightId;
	private String source;
	private String destination;
	private String date;
	private String time;
	private int seatsBuisness;
	private int seatsEconomy;
	private double amountEconomy;
	private double amountBuisness;
	
	public Flight() {
		super();
	}
	
	
	public int getFlightId() {
		return flightId;
	}


	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public int getSeatsBuisness() {
		return seatsBuisness;
	}


	public void setSeatsBuisness(int seatsBuisness) {
		this.seatsBuisness = seatsBuisness;
	}


	public int getSeatsEconomy() {
		return seatsEconomy;
	}


	public void setSeatsEconomy(int seatsEconomy) {
		this.seatsEconomy = seatsEconomy;
	}


	public double getAmountEconomy() {
		return amountEconomy;
	}


	public void setAmountEconomy(double amountEconomy) {
		this.amountEconomy = amountEconomy;
	}


	public double getAmountBuisness() {
		return amountBuisness;
	}


	public void setAmountBuisness(double amountBuisness) {
		this.amountBuisness = amountBuisness;
	}


	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", source=" + source + ", destination=" + destination + ", date=" + date
				+ ", time=" + time + ", seatsBuisness=" + seatsBuisness + ", seatsEconomy=" + seatsEconomy
				+ ", amountEconomy=" + amountEconomy + ", amountBuisness=" + amountBuisness + "]";
	}
	
	
	
}
