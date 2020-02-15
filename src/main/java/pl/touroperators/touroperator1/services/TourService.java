package pl.touroperators.touroperator1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.touroperators.touroperator1.model.Hotel;
import pl.touroperators.touroperator1.model.HotelLocation;
import pl.touroperators.touroperator1.model.Tour;
import pl.touroperators.touroperator1.model.enumclasses.Room;
import pl.touroperators.touroperator1.repository.TourRepo;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class TourService {

    protected static final Logger log = Logger.getLogger(String.valueOf(TourService.class));

    private TourRepo tourRepo;

    @Autowired
    public TourService(TourRepo tourRepo) {
        this.tourRepo = tourRepo;
    }

    public Iterable<Tour> findAll(){
     //   log.info("Start downloading tour offers");
        return tourRepo.findAll();
    }

    public Optional<Tour> findById(Long id){
        return tourRepo.findById(id);
    }

    public Tour getById(Long id){
        return tourRepo.getOne(id);
    }

    public void deleteById(long id){
        tourRepo.deleteById(id);
    }

    public Tour save(Tour tour) {
        return tourRepo.save(tour);
    }

    public int sendNumberOfOffers() {
        return tourRepo.findAll().size();
    }

    public List<Tour> findAllAsList(){
        return tourRepo.findAll();
    }



}
