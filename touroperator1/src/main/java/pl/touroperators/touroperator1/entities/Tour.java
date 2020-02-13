package pl.touroperators.touroperator1.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private LocalDate dateFrom;

    private LocalDate dateTo;

    private int price;

    private String destinationCity;

    private String departureFrom;

    private String country;

    private String touroperator;

    public Tour() {
    }

    public Tour(Long id, String title, LocalDate dateFrom, LocalDate dateTo, int price, String destinationCity, String departureFrom, String country, String  touroperator) {
        this.id = id;
        this.title = title;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.price = price;
        this.destinationCity = destinationCity;
        this.departureFrom = departureFrom;
        this.country = country;
        this.touroperator = touroperator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public void setDepartureFrom(String departureFrom) {
        this.departureFrom = departureFrom;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTouroperator() {
        return touroperator;
    }

    public void setTouroperator(String touroperator) {
        this.touroperator = touroperator;
    }


    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", price=" + price +
                ", destinationCity='" + destinationCity + '\'' +
                ", departureFrom='" + departureFrom + '\'' +
                ", country='" + country + '\'' +
                ", touroperator='" + touroperator + '\'' +
                '}';
    }
}
