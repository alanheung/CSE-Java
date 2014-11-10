import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterBookingTest {

    @Test
    public void testBookingOneSeatFor11AM() {

        ElevenAMBook elevenAMBookRequest = new ElevenAMBook();

        String confirmation = elevenAMBookRequest.reserve(1);

        assertEquals("You have successfully booked 1 seat(s) for 11am. Seat numbers are: [1]",confirmation);
    }


    @Test
    public void book1SeatFor11AM(){
        SmsBooking sms = new SmsBooking();

        String acknowledgement = sms.book("Devaroop,11AM,2");

        assertEquals("You have successfully booked 2 seat(s) for 11am. Seat numbers are: [1, 2]", acknowledgement);
    }


    @Test
    public void testOverBookingFor11AM() {

        ElevenAMBook elevenAMBookRequest = new ElevenAMBook();

        String confirmation = elevenAMBookRequest.reserve(51);

        assertEquals("Your booking for 51 seats FAILED for 11am",confirmation);
    }


    @Test
    public void testMultipleBookingsFor11AM(){
        ElevenAMBook elevenAMBookRequest = new ElevenAMBook();

        String confirmation = elevenAMBookRequest.reserve(3);

        assertEquals("You have successfully booked 3 seat(s) for 11am. Seat numbers are: [1, 2, 3]",confirmation);

        confirmation = elevenAMBookRequest.reserve(4);

        assertEquals("You have successfully booked 4 seat(s) for 11am. Seat numbers are: [4, 5, 6, 7]",confirmation);

    }


    /*
    @Test
    public void testBooking11amAnd3pm(){
        ElevenAMBook new_reservation = new ElevenAMBook();

        String confirmation = new_reservation.reserve(30);

        assertEquals("You have successfully booked 30 seat(s) for 11am",confirmation);



        ThreePMBook new_reservation_3pm = new ThreePMBook();

        confirmation = new_reservation_3pm.reserve(40);

        assertEquals("You have successfully booked 40 seat(s) for 3pm",confirmation);

    }

    @Test
    public void testBookingOneSeatFor8PM() {

        EightPMBook new_reservation = new EightPMBook();

        String confirmation = new_reservation.reserve(1);

        assertEquals("You have successfully booked 1 seat(s) for 8pm",confirmation);
    }

    @Test
    public void testBookingOneSeatFor3PM() {

        ThreePMBook new_reservation = new ThreePMBook();

        String confirmation = new_reservation.reserve(1);

        assertEquals("You have successfully booked 1 seat(s) for 3pm",confirmation);
    }
*/

}
