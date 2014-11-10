import java.util.ArrayList;

/**
 * Created by devaroop on 1/9/14.
 */
public class EightPMBook extends TheaterBooking{
    public String reserve(Integer numberOfSeats){
        if( isAvailable(numberOfSeats) ){
            ArrayList seatNumbers = (ArrayList) book(numberOfSeats);
            return "You have successfully booked " + numberOfSeats + " seat(s) for 8pm. ";
        }else{
            return "Your booking for " + numberOfSeats + " seats FAILED for 8pm";
        }
    }
}
