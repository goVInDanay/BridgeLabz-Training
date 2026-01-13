package oops_practice.scenario_based.traffic_manager;

public class TrafficManager {
	VehicleFlow flow = new VehicleFlow();
	VehicleQueue queue = new VehicleQueue(10);
	
	public void addToQueue(String vehicleNumber) {
		queue.enqueue(vehicleNumber);
	}
	
	public void addToFlow() {
		String vehicleNumber = queue.dequeue();
		if(vehicleNumber != null) {
			flow.addVehicle(vehicleNumber);
		}
	}
	
	public void removeFromFlow() {
		flow.removeVehicle();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficManager obj = new TrafficManager();
		obj.addToQueue("1");
		obj.addToQueue("2");
		obj.addToQueue("3");
		obj.addToQueue("4");
		
		obj.addToFlow();
		obj.addToFlow();
		obj.addToFlow();
		
		obj.flow.displayVehicles();
		obj.removeFromFlow();
		
		obj.addToFlow();
		obj.flow.displayVehicles();
	}

}
