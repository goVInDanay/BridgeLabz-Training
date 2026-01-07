package oops_practice.scenario_based;

import java.util.*;

// Custom Exception class
class NoDriverAvailableException extends Exception {
	public NoDriverAvailableException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}

// Interface
interface FareCalculator {
	double calculateFare(double distance);
}

// User Creation
class User {
	private int id;
	private String name;

	User(int id, String name) {
		this.id = id;
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}
}

// Driver Creation
class Driver {
	private int id;
	private String name;
	private boolean isAvailable;

	Driver(int id, String name) {
		this.id = id;
		setName(name);
		this.isAvailable = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}

	public boolean isDriverAvailable() {
		return isAvailable;
	}

	public void setIsDriverAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}

// Ride details
class Ride {
	private User user;
	private Driver driver;
	private double distance;
	private double fare;

	Ride(User user, Driver driver, double distance, double fare) {
		this.user = user;
		this.driver = driver;
		validateDistance(distance);
		this.distance = distance;
		validateFare(fare);
		this.fare = fare;
	}

	private void validateFare(double fare) {
		if (fare <= 0) {
			throw new IllegalArgumentException("Fare must be positive");
		}
	}

	private void validateDistance(double distance) {
		if (distance <= 0) {
			throw new IllegalArgumentException("Distance must be positive");
		}
	}

	public double getFare() {
		return fare;
	}

	void displayRideDetails() {
		System.out.println("User : " + user.getName() + " :: Driver : " + driver.getName());
		System.out.println(distance + " km : Rs " + fare);
		System.out.println();
	}
}

//Polymorphism + Fare Calculation
class NormalPricing implements FareCalculator {

	private double rate;

	public NormalPricing(double rate) {
		// TODO Auto-generated constructor stub
		this.rate = rate;
	}

	@Override
	public double calculateFare(double distance) {
		return distance * rate;
	}
}

//Polymorphism + Fare Calculation
class PeakPricing implements FareCalculator {

	private double rate;

	public PeakPricing(double rate) {
		// TODO Auto-generated constructor stub
		this.rate = rate;
	}

	@Override
	public double calculateFare(double distance) {
		return distance * rate;
	}
}

// Ride Booking
class BookRide {
	private List<Driver> drivers = new ArrayList<Driver>();
	private List<Ride> history = new ArrayList<Ride>();

	// Create
	public void addDriver(Driver driver) {
		drivers.add(driver);
	}

	// Read + Create + Driver Assignment
	public Ride bookRide(User user, double distance, FareCalculator fareCalculator) throws NoDriverAvailableException {
		Driver assigned = null;

		for (Driver driver : drivers) {
			if (driver.isDriverAvailable()) {
				assigned = driver;
				break;
			}
		}

		if (assigned == null) {
			throw new NoDriverAvailableException("Sorry! No drivers available at the moment");
		}

		assigned.setIsDriverAvailable(false);
		double fare = fareCalculator.calculateFare(distance);
		Ride ride = new Ride(user, assigned, distance, fare);
		history.add(ride);

		return ride;
	}

	void displayRideHistory() {
		for (Ride ride : history) {
			ride.displayRideDetails();
		}
	}
}

public class RideManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookRide obj = new BookRide();
		Scanner sc = new Scanner(System.in);
		
		int idx = 1;
		while(true) {
			System.out.println("Add driver name. Enter exit to exit.");
			String s = sc.nextLine();
			s = s.trim();
			if(s.equalsIgnoreCase("exit")) {
				break;
			}
			obj.addDriver(new Driver(idx++, s));
		}
		
		idx = 1;
		while(true) {
			System.out.println("Add user name. Enter exit to exit.");
			String s = sc.nextLine();
			s = s.trim();
			if(s.equalsIgnoreCase("exit")) {
				break;
			}
			User user = new User(idx++, s);
			System.out.println("Normal fare price is Rs 10 per km");
			System.out.println("Peak fare price is Rs 19 per km");
			FareCalculator normalFare = new NormalPricing(10);
			FareCalculator peakFare = new PeakPricing(19);
			// Exception Handling
			try {
				System.out.println("Enter distance");
				double distance = sc.nextDouble();
				sc.nextLine();
				Ride ride1 = obj.bookRide(user, distance, normalFare);
				System.out.println("Ride Booked. Total Fare at Normal Rate: " + ride1.getFare());
				Ride ride2 = obj.bookRide(user, distance, peakFare);
				System.out.println("Ride Booked. Total Fare at Peak Rate: " + ride2.getFare());
			} catch (NoDriverAvailableException e) {
				// TODO: handle exception
				System.err.println(e);
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e);
			}
	
			System.out.println();
			System.out.println("Ride History: ");
			obj.displayRideHistory();
		}
	}

}
