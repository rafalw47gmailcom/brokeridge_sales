package pl.touroperators.touroperator1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.touroperators.touroperator1.model.Reservation;
import pl.touroperators.touroperator1.repository.ReservationRepo;

import java.util.Optional;

@Service
public class ReservationService {

    private ReservationRepo reservationRepo;

    @Autowired
    public ReservationService(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }

    public Iterable<Reservation> findAll(){
        return reservationRepo.findAll();
    }

    public Optional<Reservation> findById(Long id){
        return reservationRepo.findById(id);
    }



}
