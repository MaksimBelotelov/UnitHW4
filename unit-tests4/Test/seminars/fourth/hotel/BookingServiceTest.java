package seminars.fourth.hotel;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {
    @Test
    void testBookingService() {
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.isRoomAvailable(anyInt()))
                .thenReturn(anyInt() % 2 == 0);
        BookingService bookingService = new BookingService(hotelService);
        assertTrue(bookingService.bookRoom(2));
    }
}