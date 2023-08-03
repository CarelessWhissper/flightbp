package sr.fly.flightbp.models;

import java.util.List;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Ticket> tickets; // One-to-Many relationship with tickets

    @ManyToMany(mappedBy = "interestedCountries")
    private List<Customer> interestedCustomers; // Many-to-Many relationship with customers


    
    private String name;
    private String capital;
    private long population;
    private String currency;
    private String language;
    private String timezone;
    private String callingCode;
    private String visaRequirements;
    private String travelAdvisory;
    private String tourismInformation;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getCallingCode() {
        return this.callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }

    public String getVisaRequirements() {
        return this.visaRequirements;
    }

    public void setVisaRequirements(String visaRequirements) {
        this.visaRequirements = visaRequirements;
    }

    public String getTravelAdvisory() {
        return this.travelAdvisory;
    }

    public void setTravelAdvisory(String travelAdvisory) {
        this.travelAdvisory = travelAdvisory;
    }

    public String getTourismInformation() {
        return this.tourismInformation;
    }

    public void setTourismInformation(String tourismInformation) {
        this.tourismInformation = tourismInformation;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", capital='" + getCapital() + "'" +
            ", population='" + getPopulation() + "'" +
            ", currency='" + getCurrency() + "'" +
            ", language='" + getLanguage() + "'" +
            ", timezone='" + getTimezone() + "'" +
            ", callingCode='" + getCallingCode() + "'" +
            ", visaRequirements='" + getVisaRequirements() + "'" +
            ", travelAdvisory='" + getTravelAdvisory() + "'" +
            ", tourismInformation='" + getTourismInformation() + "'" +
            "}";
    }
  
}
