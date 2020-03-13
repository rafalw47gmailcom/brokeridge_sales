package pl.touroperators.touroperator1.model;

import lombok.Data;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;

@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Tour tour;

    @OneToOne
    private User user;

    public Reservation() {
    }

    public Reservation(Tour tour, User user) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}