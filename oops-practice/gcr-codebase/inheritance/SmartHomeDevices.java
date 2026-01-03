package oops_practice.gcr_codebase.inheritance;

class Device {
	private int deviceId;
	private String status;

	Device(int deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}

	void displayInfo() {
		System.out.println("Device ID: " + deviceId);
		System.out.println("Status: " + status);
	}
}

class Thermostat extends Device {
	String temperatureSetting;

	Thermostat(int deviceId, String status, String temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}

	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Temperature Setting: " + temperatureSetting);
	}
}

public class SmartHomeDevices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thermostat ts = new Thermostat(001, "Working", "Warm");
		ts.displayInfo();
	}

}
