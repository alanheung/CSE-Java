import java.util.ArrayList;

public class ElevenAMBook extends TheaterBooking{
    public String reserve(Integer numberOfSeats){
        if( isAvailable(numberOfSeats) ){
            ArrayList<Integer> seatNumbers = book(numberOfSeats);
            return "You have successfully booked " + numberOfSeats + " seat(s) for 11am. Seat numbers are: " + seatNumbers;
        }else{
            return "Your booking for " + numberOfSeats + " seats FAILED for 11am";
        }
    }
}
