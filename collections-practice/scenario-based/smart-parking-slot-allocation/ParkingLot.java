package collections.scenario_based.smart_parking_slot_allocation;

import java.util.*;

class ParkingLot {
	private Map<Integer, ParkingSlot> slots;
	private Queue<Vehicle> waitingQueue;

	public ParkingLot(int totalSlots) {
		slots = new HashMap<>();
		for (int i = 1; i <= totalSlots; i++) {
			slots.put(i, new ParkingSlot(i));
		}
		waitingQueue = new LinkedList<>();
	}

	public void parkVehicle(Vehicle vehicle) throws NoParkingSlotAvailableException {
		ParkingSlot nearestFreeSlot = null;
		for (int i = 1; i <= slots.size(); i++) {
			ParkingSlot slot = slots.get(i);
			if (slot.isFree()) {
				nearestFreeSlot = slot;
				break;
			}
		}

		if (nearestFreeSlot != null) {
			nearestFreeSlot.parkVehicle(vehicle);
			System.out.println(vehicle + " parked at Slot " + nearestFreeSlot.getSlotNumber());
		} else {
			waitingQueue.add(vehicle);
			throw new NoParkingSlotAvailableException(vehicle + " added to waiting queue. No free slots!");
		}
	}

	public void leaveSlot(int slotNumber) {
		ParkingSlot slot = slots.get(slotNumber);
		if (slot != null && !slot.isFree()) {
			System.out.println(slot.getVehicle() + " left Slot " + slotNumber);
			slot.leaveSlot();
			if (!waitingQueue.isEmpty()) {
				Vehicle nextVehicle = waitingQueue.poll();
				slot.parkVehicle(nextVehicle);
				System.out.println(nextVehicle + " parked at Slot " + slotNumber + " from waiting queue");
			}
		} else {
			System.out.println("Slot " + slotNumber + " is already free or invalid.");
		}
	}

	public void printStatus() {
		System.out.println("Parking Lot Status:");
		for (int i = 1; i <= slots.size(); i++) {
			System.out.println(slots.get(i));
		}
		System.out.println("Waiting Queue: " + waitingQueue);
	}
}