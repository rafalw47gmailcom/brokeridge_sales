package pl.touroperators.touroperator1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.touroperators.touroperator1.model.Reservation;
import pl.touroperators.touroperator1.model.Tour;
import pl.touroperators.touroperator1.repository.ReservationRepo;
import pl.touroperators.touroperator1.repository.TourRepo;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private ReservationRepo reservationRepo;

    @Autowired
    public ReservationService(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }

    public List<Reservation> findAll(){
        return reservationRepo.findAll();
    };

   // public Iterable<Reservation> findAll(){
       // return reservationRepo.findAll();
 //   }

    public Optional<Reservation> findById(Long id){
        return reservationRepo.findById(id);
    }

    public Reservation getById(Long id){
        return reservationRepo.getOne(id);
    }

    public void deleteById(long id){
        reservationRepo.deleteById(id);
    }

    public Reservation save(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    public int sendNumberOfOffers() {
        return reservationRepo.findAll().size();
    }

    public List<Reservation> findAllAsList(){
        return reservationRepo.findAll();
    }











}
