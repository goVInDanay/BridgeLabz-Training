package collections.scenario_based.smart_parking_slot_allocation;

public class NoParkingSlotAvailableException extends Exception {
    public NoParkingSlotAvailableException(String message) {
        super(message);
    }
}
