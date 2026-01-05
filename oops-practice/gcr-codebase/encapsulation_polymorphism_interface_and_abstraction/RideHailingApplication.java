package oops_practice.gcr_codebase.encapsulation_polymorphism_interface_and_abstraction;
import java.util.*;

interface GPS{
	String getCurrentLocation();
	void updateLocation();
}

abstract class Vehicle2{
	private String vehicleId;
	private String driverName;	
	private double ratePerKm;
	
	Vehicle2(String vehicleId, String driverName, double ratePerKm){
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
	}
	
	abstract double calculateFare(double distance);
	
	void getVehicleDetails() {
		System.out.println("Vehicle ID: " + vehicleId);
		System.out.println("Driver Name: " + driverName);
		System.out.println("Rate per km: " + ratePerKm);
	}
	
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
}

class Car2 extends Vehicle2 implements GPS{
	
	String currentLocation;
	private static final double BASE_FARE = 20;
	
	Car2(String vehicleId, String driverName, double ratePerKm, String currentLocation){
		super(vehicleId, driverName, ratePerKm);
		this.currentLocation = currentLocation;
	}
	
	@Override
	public double calculateFare(double distance) {
		return getRatePerKm() * distance + BASE_FARE;
	}
	
	@Override
	public String getCurrentLocation() {
		return currentLocation;
	}
	
	@Override 
	public void updateLocation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current location");
		String location = sc.nextLine();
		currentLocation = location;
	}
}

class Bike2 extends Vehicle2 implements GPS{
	
	String currentLocation;
	private static final double BASE_FARE = 15;
	
	Bike2(String vehicleId, String driverName, double ratePerKm, String currentLocation){
		super(vehicleId, driverName, ratePerKm);
		this.currentLocation = currentLocation;
	}
	
	@Override
	public double calculateFare(double distance) {
		return getRatePerKm() * distance + BASE_FARE;
	}
	
	@Override
	public String getCurrentLocation() {
		return currentLocation;
	}
	
	@Override 
	public void updateLocation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current location");
		String location = sc.nextLine();
		currentLocation = location;
	}
}

class Auto extends Vehicle2 implements GPS{
	
	String currentLocation;
	private static final double BASE_FARE = 10;
	
	Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation){
		super(vehicleId, driverName, ratePerKm);
		this.currentLocation = currentLocation;
	}
	
	@Override
	public double calculateFare(double distance) {
		return getRatePerKm() * distance + BASE_FARE;
	}
	
	@Override
	public String getCurrentLocation() {
		return currentLocation;
	}
	
	@Override 
	public void updateLocation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current location");
		String location = sc.nextLine();
		currentLocation = location;
	}
}

public class RideHailingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Vehicle2> vehicles = new ArrayList<Vehicle2>();
		Scanner sc = new Scanner(System.in);
		
		vehicles.add(new Car2("UP801313", "Govind", 15, "Mathura"));
		vehicles.add(new Bike2("AN821234", "Hariom", 12, "Hyderabad"));
		vehicles.add(new Auto("UP801422", "Aman", 8, "Agra"));
		
		for(Vehicle2 v : vehicles) {
			v.getVehicleDetails();
			System.out.println("Enter distance: ");
			double distance = sc.nextDouble();
			sc.nextLine();
			
			if(v instanceof GPS) {
				System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
				((GPS) v).updateLocation();
				System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
			}
			
			System.out.println("Fare for " + distance + " km is Rs " + v.calculateFare(distance));
			System.out.println();
		}
	}

}
