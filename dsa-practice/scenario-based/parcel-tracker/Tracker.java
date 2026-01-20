package dsa_practice.scenario_based.parcel_tracker;

class Tracker {
	StageNode head;
	StageNode current;
	boolean delivered = false;

	public void addStage(String stageName) {
		StageNode newNode = new StageNode(stageName);
		if (head == null) {
			head = current = newNode;
			return;
		}
		StageNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void addCheckPoint(String stageName, String checkpointName) {
		StageNode temp = head;
		while (temp != null) {
			if (temp.stageName.equalsIgnoreCase(stageName)) {
				StageNode newNode = new StageNode(checkpointName);
				newNode.next = temp.next;
				temp.next = newNode;
				return;
			}
			temp = temp.next;
		}
		System.out.println("No Stage: " + stageName + " found");
	}

	public void nextStage() {
		if (current == null && !delivered) {
			System.out.println("Parcel is missing");
			return;
		}
		if (delivered) {
			System.out.println("Parcel already delivered");
			return;
		}
		if (current.stageName.equalsIgnoreCase("Delivered")) {
			current.next = null;
			current = current.next;
			System.out.println("Parcel delivered");
			delivered = true;
		} else {
			System.out.println("Parcel moving from stage " + current.stageName);
			current = current.next;
			System.out.println("To stage: " + current.stageName);
		}

	}

	public String getCurrentStage() {
		return current == null ? delivered ? "Parcel already delivered" : "Parcel missing" : current.stageName;
	}

	public void trackForward() {
		StageNode temp = current;
		if (current == null && !delivered) {
			System.out.println("Parcel is missing");
			return;
		}
		if (delivered) {
			System.out.println("Parcel delivered");
		}
		System.out.println("Remaining stages: ");
		while (temp != null) {
			System.out.println(temp.stageName);
			temp = temp.next;
		}
	}
}
