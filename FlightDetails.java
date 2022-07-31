public class FlightDetails {

    private String source;
    private String destination;
    private int distance;
    private String time;
    private String amount;

    public FlightDetails(String source, String destination, int distance, String time, String amount) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.time = time;
        this.amount = amount;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "FlightDetails{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", distance=" + distance +
                ", time='" + time + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
