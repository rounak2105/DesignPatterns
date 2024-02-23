package facade.service;

public class BookingService {

    private static BookingService bookingService;

    private BookingService() {

    }

    public static BookingService getBookingServiceInstance() {
        if(bookingService == null)
            bookingService = new BookingService();
        return bookingService;
    }

    public void createBooking() {
        System.out.println("booking accepted");
        System.out.println("payment done");
        System.out.println("ticket generated");
    }


}
