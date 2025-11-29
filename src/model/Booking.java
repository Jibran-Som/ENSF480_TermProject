package model;

public class Booking {
    private int bookingId;
    private Customer customer;
    private Flight flight;
    private String seatNumber;
    
    public Booking(int bookingId, Customer customer, Flight flight, String seatNumber) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", customer=" + customer + ", flight=" + flight + ", seatNumber="
                + seatNumber + "]";
    }
}
