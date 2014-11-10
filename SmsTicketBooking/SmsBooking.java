import java.util.*;

public class SmsBooking {

    private static final HashMap<String, TheaterBooking> booking_times;
    static{
        booking_times = new HashMap<String, TheaterBooking>();
        booking_times.put("11AM", new ElevenAMBook());
        booking_times.put("3PM", new ThreePMBook());
        booking_times.put("8PM", new EightPMBook());
    }

    public String book(String sms){
        List<String> parsed_sms = parse(sms);
        String name = parsed_sms.get(0);
        String time = parsed_sms.get(1);
        Integer numberOfSeats = Integer.parseInt(parsed_sms.get(2));

        String acknowledgement = booking_times.get(time).reserve(numberOfSeats);

        return acknowledgement;
    }

    private List parse(String sms) {
        List<String> booking_details = Arrays.asList(sms.split(","));
        return booking_details;
    }


}
