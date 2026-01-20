package dsa_practice.scenario_based.parcel_tracker;

public class ParcelTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tracker tracker = new Tracker();
		tracker.addStage("Packed");
		tracker.addStage("Shipped");
		tracker.addStage("In Transit");
		tracker.addStage("Delivered");
		tracker.addCheckPoint("In Transit", "In City");
		System.out.println("Current stage: " + tracker.getCurrentStage());
		tracker.nextStage();
		tracker.nextStage();
		tracker.nextStage();
		tracker.trackForward();
		tracker.nextStage();
		tracker.nextStage();
	}

}
