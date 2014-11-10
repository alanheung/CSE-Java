/**
 * Created by devaroop on 1/9/14.
 */
public class ThreePMBook extends TheaterBooking{

    public String reserve(Integer number_of_booked_seats){
        if( isAvailable(number_of_booked_seats) ){
            book(number_of_booked_seats);
            return "You have successfully booked " + number_of_booked_seats + " seat(s) for 3pm";
        }else{
            return "Your booking for " + number_of_booked_seats + " seats FAILED for 3pm";
        }
    }

}
