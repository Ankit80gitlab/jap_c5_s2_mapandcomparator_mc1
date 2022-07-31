public class ViewDetails {

    private String name;
    private String from;
    private String carrier;
    private String to;
    private String date;
    private String time;
    private String flight;
    private String seat;
    private String gate;
    private String boardTill;

    public ViewDetails(String name, String from, String carrier, String to, String date, String time, String flight, String seat, String gate, String boardTill) {
        this.name = name;
        this.from = from;
        this.carrier = carrier;
        this.to = to;
        this.date = date;
        this.time = time;
        this.flight = flight;
        this.seat = seat;
        this.gate = gate;
        this.boardTill = boardTill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getBoardTill() {
        return boardTill;
    }

    public void setBoardTill(String boardTill) {
        this.boardTill = boardTill;
    }


    @Override
    public String toString() {
        return ""+"Name= "+name+", From= "+from+", Carrier= "+carrier+", To= "+to +", Date= "+date+", Time= "+time+", Flight= "+flight+", Seat= "+seat+", Gate= "+gate;
    }
}
