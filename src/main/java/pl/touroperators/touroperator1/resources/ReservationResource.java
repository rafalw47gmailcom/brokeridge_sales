package pl.touroperators.touroperator1.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.touroperators.touroperator1.model.Reservation;
import pl.touroperators.touroperator1.model.Tour;
import pl.touroperators.touroperator1.services.ReservationService;

@Controller
@RequestMapping("/reservation")
public class ReservationResource {

    private ReservationService reservationService;

    @Autowired
    public ReservationResource(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/addReservation")
    public String addTour(@ModelAttribute("tour")Reservation reservation){
       reservationService.save(reservation);
        return "redirect:/admin";
    }

/*
    @PostMapping("/add")
    public String addTour(@ModelAttribute("tour") Tour tour){
        tourService.save(tour);
        return "redirect:/admin";
    }
 */
}

