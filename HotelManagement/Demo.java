package HotelManagement;

public class Demo {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("The Grand Palace", 5);

        // Add rooms to the hotel
        hotel.addRoom(new LuxuryRoom(101, 5000, true, true));
        hotel.addRoom(new DeluxeRoom(102, 4000, true, true));
        hotel.addRoom(new LuxuryRoom(103, 4500, true, false));
        hotel.addRoom(new DeluxeRoom(104, 3500, true, false));

        // Display available rooms
        hotel.displayAvailableRooms();

        // Create customer objects
        Customer customer1 = new Customer("John Doe", "9876543210");
        Customer customer2 = new Customer("Jane Smith", "8765432109");

        // Book rooms
        //customer1.bookRoom(hotel.rooms[0]); // John books Room 101
        hotel.bookRoom(101, customer1);
        hotel.bookRoom(102, customer2); // Jane books Room 102

        // Attempt to book Room 101 again
        //customer2.bookRoom(hotel.rooms[0]); // Should display "Room not available"

        // Display available rooms after booking
        hotel.displayAvailableRooms();

        // Display booked rooms and customers
        hotel.displayBookedRooms();
    }
}
