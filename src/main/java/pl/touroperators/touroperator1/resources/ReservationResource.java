package pl.touroperators.touroperator1.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.touroperators.touroperator1.services.ReservationService;

@Controller
@RequestMapping("reservation")
public class ReservationResource {

    private ReservationService reservationService;

    @Autowired
    public ReservationResource(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
}
