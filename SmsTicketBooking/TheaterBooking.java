import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

abstract public class TheaterBooking {
    private Queue<Integer> seatNumbersLeft = new LinkedList<Integer>();

    public TheaterBooking(){
        //init seat numbers
        int totalSeats = 50;
        for(int i = 1; i <= totalSeats; i++){
            seatNumbersLeft.add(i);
        }
    }

    abstract public String reserve(Integer numberOfSeats);

    protected boolean isAvailable(Integer numberOfSeats){
        return numberOfSeats <= seatNumbersLeft.size();
    }

    protected ArrayList<Integer> book(Integer numberOfSeats){
        ArrayList<Integer> seatsBooked = new ArrayList<Integer>();

        for(int i = 0; i < numberOfSeats; i++){
            seatsBooked.add(seatNumbersLeft.remove());
        }

        return seatsBooked;
    }

}
