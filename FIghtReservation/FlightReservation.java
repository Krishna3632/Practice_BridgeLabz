import java.util.*;
import java.text.SimpleDateFormat;

class Flights {
    int flight_id;
    String source;
    String destination;
    Date date;
    int capacity;

    public Flights(int flight_id, String source, String destination, Date date, int capacity) {
        this.flight_id = flight_id;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.capacity = capacity;
    }

    public int getFlightId() { return flight_id; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public Date getDate() { return date; }
    public int getCapacity() { return capacity; }
}

class Passenger {
    int passenger_id;
    String name;

    public Passenger(int passenger_id, String name) {
        this.passenger_id = passenger_id;
        this.name = name;
    }

    public int getPassengerId() { return passenger_id; }
    public String getName() { return name; }
}

class Booking {
    int booking_id;
    Flights flight;
    Passenger passenger;

    public Booking(int booking_id, Flights flight, Passenger passenger) {
        this.booking_id = booking_id;
        this.flight = flight;
        this.passenger = passenger;
    }

    public int getBookingId() { return booking_id; }
    public Flights getFlight() { return flight; }
    public Passenger getPassenger() { return passenger; }
}

public class FlightManagementSystem {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Flights f1 = new Flights(101, "Delhi", "Mumbai", sdf.parse("2025-09-20"), 2);
        Flights f2 = new Flights(102, "Delhi", "Chennai", sdf.parse("2025-09-21"), 3);
        Flights f3 = new Flights(103, "Mumbai", "Delhi", sdf.parse("2025-09-22"), 1);

        Passenger p1 = new Passenger(1, "Amit");
        Passenger p2 = new Passenger(2, "Neha");
        Passenger p3 = new Passenger(3, "Rohit");
        Passenger p4 = new Passenger(4, "Sneha");

        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking(1, f1, p1));
        bookings.add(new Booking(2, f1, p2));
        bookings.add(new Booking(3, f1, p3));
        bookings.add(new Booking(4, f2, p1));
        bookings.add(new Booking(5, f2, p4));

        Map<Integer, Integer> bookingCount = new HashMap<>();
        for (Booking b : bookings) {
            int fid = b.getFlight().getFlightId();
            bookingCount.put(fid, bookingCount.getOrDefault(fid, 0) + 1);
        }

        System.out.println("Flight bookings:");
        for (Flights f : Arrays.asList(f1, f2, f3)) {
            int count = bookingCount.getOrDefault(f.getFlightId(), 0);
            System.out.println("Flight " + f.getFlightId() + " -> " + count + " passengers");
        }

        System.out.println("\nOverbooked Flights:");
        for (Flights f : Arrays.asList(f1, f2, f3)) {
            int count = bookingCount.getOrDefault(f.getFlightId(), 0);
            if (count > f.getCapacity()) {
                System.out.println("Flight " + f.getFlightId() + " is overbooked! Capacity=" 
                                   + f.getCapacity() + ", Booked=" + count);
            }
        }

        System.out.println("\nFlights with zero bookings:");
        for (Flights f : Arrays.asList(f1, f2, f3)) {
            if (!bookingCount.containsKey(f.getFlightId())) {
                System.out.println("Flight " + f.getFlightId() + " has no bookings.");
            }
        }
    }
}