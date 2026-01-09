package dsa_practice.gcr_codebase.linked_list;

class Ticket {
	int ticketId;
	String customerName;
	String movieName;
	String seatNumber;
	String bookingTime;
	Ticket next;

	public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
		// TODO Auto-generated constructor stub
		this.ticketId = ticketId;
		this.customerName = customerName;
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.bookingTime = bookingTime;
		this.next = null;
	}
}

class TicketReservationSystem {
	Ticket last = null;

	public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
		Ticket ticket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
		if (last == null) {
			last = ticket;
			last.next = last;
		} else {
			ticket.next = last.next;
			last.next = ticket;
			last = ticket;
		}
		System.out.println("Ticket booked");
	}

	public void removeTicket(int ticketId) {
		if (last == null) {
			System.out.println("No tickets to remove");
			return;
		}

		Ticket curr = last.next;
		Ticket prev = last;
		boolean flag = false;

		do {
			if (curr.ticketId == ticketId) {
				flag = true;
				break;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != last.next);

		if (!flag) {
			System.out.println("Ticket not found");
			return;
		}

		if (curr == last && curr.next == last) {
			last = null;
		} else if (curr == last.next) {
			last.next = curr.next;
		} else if (curr == last) {
			prev.next = curr.next;
			last = prev;
		} else {
			prev.next = curr.next;
		}
		System.out.println("Ticket ID: " + ticketId + " removed");
	}

	public void displayTickets() {
		if(last == null) {
			System.out.println("No Tickets booked");
		}
		Ticket curr = last.next;
		System.out.println("Booked Tickets: ");
		do {
			System.out.println("Ticket ID: " + curr.ticketId + " Customer: " + curr.customerName + " Movie: " + curr.movieName + " Seat: " + curr.seatNumber + " Booking Time: " + curr.bookingTime);
			curr = curr.next;
		} while(curr != last.next);
	}
	
	public void searchTicket(String name) {
		if(last == null) {
			System.out.println("No Tickets booked");
			return;
		}
		Ticket curr = last.next;
		boolean flag = false;
		do {
			if(curr.customerName.equalsIgnoreCase(name) || curr.movieName.equalsIgnoreCase(name)) {
				System.out.println("Ticket ID: " + curr.ticketId + " Customer: " + curr.customerName + " Movie: " + curr.movieName + " Seat: " + curr.seatNumber + " Booking Time: " + curr.bookingTime);
				flag = true;
			}
			curr = curr.next;
		} while(curr != last.next);
		
		if(!flag) {
			System.out.println("Ticket not found");
		}
	}
	
	public int getTotalTickets() {
		if(last == null) {
			System.out.println("No Tickets booked");
			return 0;
		}
		int count = 0;
		Ticket curr = last.next;
		do {
			count++;
			curr = curr.next;
		} while(curr != last.next);
		return count;
	}
}

public class OnlineTicketReservation {
	public static void main(String[] args) {
		TicketReservationSystem tickets = new TicketReservationSystem();

		tickets.addTicket(1, "Govind", "Kung Fu Panda 2", "A1", "09:00 AM");
		tickets.addTicket(2, "Akash", "Avengers Doomsday", "B2", "12:15 PM");
		tickets.addTicket(3, "Aman", "50 Shades of Gray", "C3", "09:30 AM");
		
		tickets.displayTickets();
		tickets.searchTicket("Avengers Doomsday");
		tickets.searchTicket("Govind");
		tickets.removeTicket(3);
		tickets.displayTickets();

        System.out.println("Total Tickets Booked: " + tickets.getTotalTickets());
    }

}
