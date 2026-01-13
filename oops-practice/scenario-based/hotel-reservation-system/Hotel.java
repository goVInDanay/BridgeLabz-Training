package oops_practice.scenario_based.hotel_reservation_system;

class Hotel {
	private Room rooms[];
	private Reservation reservations[];
	private int roomCount;
	private int reservationCount;
	private final int MAX_ROOMS;

	Hotel(int maxRooms) {
		this.MAX_ROOMS = maxRooms;
		rooms = new Room[maxRooms];
		reservations = new Reservation[maxRooms];
		roomCount = 0;
		reservationCount = 0;
	}

	public void addRoom(Room room) {
		if (roomCount < MAX_ROOMS) {
			rooms[roomCount++] = room;
			System.out.println("Room added : " + room.roomNumber);
		} else {
			System.out.println("Cannot add more rooms");
		}
	}

	public void listRooms() {
		for (int i = 0; i < roomCount; i++) {
			System.out.println(rooms[i].roomNumber + " " + (rooms[i].isBooked ? "Booked" : "Available"));
		}
	}

	public Room findRoom(int roomNumber) {
		for (int i = 0; i < roomCount; i++) {
			if (rooms[i].roomNumber == roomNumber) {
				return rooms[i];
			}
		}
		System.out.println("Room not found");
		return null;
	}

	public void bookRoom(int roomNumber, Guest guest, int days) throws RoomNotAvailableException {
		Room room = findRoom(roomNumber);
		if (room == null) {
			throw new RoomNotAvailableException("No Such Room");
		}
		if (room.isBooked) {
			throw new RoomNotAvailableException("Room is already booked");
		}
		if (reservationCount == MAX_ROOMS) {
			System.err.println("Cannot reserve more rooms");
			return;
		}
		Reservation reservation = new Reservation(room, guest, days);
		reservations[reservationCount++] = reservation;
		System.out.println("Reserved successfully");
	}
	
	public void checkOut(Guest guest, PricingSystem pricingSystem) {
		for(int i = 0; i < reservationCount; i++) {
			if(reservations[i] == null) {
				continue;
			}
			if(reservations[i].getGuest().getName().equals(guest.getName())) {
				reservations[i].checkOut();
				reservations[i].generateInvoice(pricingSystem);
				reservations[i] = null;
				return;
			}
		}
		System.out.println("No Such reservation found");
	}
}
