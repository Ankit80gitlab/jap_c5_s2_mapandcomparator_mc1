import java.util.Comparator;

public class Sorting implements Comparator<FlightDetails> {

    public Sorting(){

    }

    public int compare(FlightDetails o1, FlightDetails o2){
        return o1.getDistance()-o2.getDistance();
    }

}
