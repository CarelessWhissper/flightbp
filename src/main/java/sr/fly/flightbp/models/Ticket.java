package sr.fly.flightbp.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departureDate;
    private String returnDate;
    private double price;
    private String seatNumber;
    private String flightNumber;
    private String airline;
    private String ticketClass;
    private String passengerName;
    private String passengerContact;
    private String paymentStatus;
    private String ticketStatus;

    @ManyToOne
    private Customer customer; // Many tickets can belong to one customer


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartureDate() {
        return this.departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return this.returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return this.airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getTicketClass() {
        return this.ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public String getPassengerName() {
        return this.passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerContact() {
        return this.passengerContact;
    }

    public void setPassengerContact(String passengerContact) {
        this.passengerContact = passengerContact;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTicketStatus() {
        return this.ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", departureDate='" + getDepartureDate() + "'" +
            ", returnDate='" + getReturnDate() + "'" +
            ", price='" + getPrice() + "'" +
            ", seatNumber='" + getSeatNumber() + "'" +
            ", flightNumber='" + getFlightNumber() + "'" +
            ", airline='" + getAirline() + "'" +
            ", ticketClass='" + getTicketClass() + "'" +
            ", passengerName='" + getPassengerName() + "'" +
            ", passengerContact='" + getPassengerContact() + "'" +
            ", paymentStatus='" + getPaymentStatus() + "'" +
            ", ticketStatus='" + getTicketStatus() + "'" +
            ", customer='" + getCustomer() + "'" +
            "}";
    }

}
