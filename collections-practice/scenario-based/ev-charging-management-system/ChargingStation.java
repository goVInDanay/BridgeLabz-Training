package collections.scenario_based.ev_charging_management_system;

import java.util.*;

class ChargingStation {

	private Map<Integer, ChargingSlot> slots = new HashMap<>();
	private Queue<Vehicle> waitingQueue = new LinkedList<>();
	private PricingStrategy pricingStrategy;

	public ChargingStation(int numberOfSlots, PricingStrategy strategy) {
		this.pricingStrategy = strategy;
		for (int i = 1; i <= numberOfSlots; i++) {
			slots.put(i, new ChargingSlot(i));
		}
	}

	public void setPricingStrategy(PricingStrategy strategy) {
		this.pricingStrategy = strategy;
	}

	public void bookSlot(Vehicle vehicle) throws NoChargingSlotAvailableException {
		for (ChargingSlot slot : slots.values()) {
			if (slot.isAvailable()) {
				slot.assignVehicle(vehicle);
				System.out.println("Vehicle " + vehicle.getVehicleNumber() + " assigned to slot.");
				return;
			}
		}
		waitingQueue.add(vehicle);
		throw new NoChargingSlotAvailableException("No slot available. Vehicle added to waiting queue.");
	}

	public void releaseSlot(int slotId) {
		ChargingSlot slot = slots.get(slotId);
		if (slot != null && !slot.isAvailable()) {
			Vehicle vehicle = slot.getCurrentVehicle();
			double bill = pricingStrategy.calculateBill(vehicle.getUnitsConsumed());
			System.out.println("Bill for " + vehicle.getVehicleNumber() + " is: Rs" + bill);

			slot.releaseSlot();

			if (!waitingQueue.isEmpty()) {
				Vehicle nextVehicle = waitingQueue.poll();
				slot.assignVehicle(nextVehicle);
				System.out.println("Next vehicle " + nextVehicle.getVehicleNumber() + " assigned to slot.");
			}
		}
	}
}
