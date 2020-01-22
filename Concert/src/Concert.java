public class Concert {
    // private fields associated getter methods
    private double ticketPrice;
    private int capacity;
    private int ticketsSold;
    private String location;
    private String date;
    //first constructor with four arguments and assign them to instance variables
    public Concert(double ticketPrice, int capacity, String location, String date) {
        this.ticketPrice = ticketPrice;
        this.capacity = capacity;
        this.location = location;
        this.date = date;
        ticketsSold = 0;
    }
    //second constructor with three arguments and assign them to instance variables
    public Concert(int capacity, String location, String date) {
        this(30, capacity, location, date);
    }

    // public methods
    public boolean isSoldOut() {
        return ticketsSold == capacity;
    }

    public void sellTicket() {
        if (!isSoldOut()) {
            ticketsSold++;
        }
    }

    public String toString() {
        return "A concert on " + date + " at " + location;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    //setters for location and ticketPrice
    public void setLocation(String location) {
        this.location = location;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
