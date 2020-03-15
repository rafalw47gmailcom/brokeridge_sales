package pl.touroperators.touroperator2.methods;

import pl.touroperators.touroperator2.model.Hotel;
import pl.touroperators.touroperator2.model.Reservation;
import pl.touroperators.touroperator2.model.Tour;

import java.time.LocalDate;

public class CopyTool {

    private Tour tour;

    private Reservation reservation;

    public CopyTool(Tour tour, Reservation reservation) {
        this.tour = tour;
        this.reservation = reservation;

    }

    public CopyTool() {
    }



    public static Reservation copyTourData(Reservation reservation, Tour tour){

        reservation.setTitle(reservation.getTitle());
        reservation.setFirstName(reservation.getFirstName());
        reservation.setLastName(reservation.getLastName());
        reservation.setEmail(reservation.getEmail());

        reservation.setTitle(tour.getTitle());
        reservation.setDateFrom(tour.getDateFrom());
        reservation.setDateTo(tour.getDateTo());
        reservation.setPrice(tour.getPrice());
        reservation.setDestinationCity(tour.getDestinationCity());
        reservation.setDepartureFrom(tour.getDepartureFrom());
        reservation.setCountry(tour.getCountry());


        return  reservation;
    }



}
