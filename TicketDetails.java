public class TicketDetails {

    private String from;
    private String to;
    private String flightNo;
    private int availableSeats;
    private int dist;
    private String timeOfJourney;
    private String dateOfTravel;
    private String fare;

    public TicketDetails(String from, String to, String flightNo,int  availableSeats, int dist, String timeOfJourney, String dateOfTravel, String fare) {
        this.from = from;
        this.to = to;
        this.flightNo = flightNo;
        this.availableSeats=availableSeats;
        this.dist = dist;
        this.timeOfJourney=timeOfJourney;
        this.dateOfTravel = dateOfTravel;
        this.fare = fare;

    }


    // getter-setter


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public int getDist() {return dist;}

    public void setDist(int dist) {
        this.dist = dist;
    }

    public String getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(String dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public String getFare() { return fare;}

    public void setFare(String fare) {
        this.fare = fare;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getTimeOfJourney() {
        return timeOfJourney;
    }

    public void setTimeOfJourney(String timeOfJourney) {
        this.timeOfJourney = timeOfJourney;
    }

    // to string method


    @Override
    public String toString() {
        return "TicketDetails{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", flightNo='" + flightNo + '\'' +
                ", availableSeats=" + availableSeats +
                ", dist=" + dist +
                ", timeOfJourney='" + timeOfJourney + '\'' +
                ", dateOfTravel='" + dateOfTravel + '\'' +
                ", fare='" + fare + '\'' +
                '}';
    }
}
