package facade;

import facade.entity.User;
import facade.service.BookingService;

import java.util.Arrays;

public class FacadeMain {
    public static void main(String[] args) {
        User user = new User("Rounak", 24);
        BookingService bookingService  = BookingService.getBookingServiceInstance();
        bookingService.createBooking();
    }
}
