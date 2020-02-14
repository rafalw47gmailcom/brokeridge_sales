package pl.touroperators.touroperator1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.touroperators.touroperator1.model.Tour;
import pl.touroperators.touroperator1.repository.TourRepo;

import java.time.LocalDate;
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


    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Tour(1L, "Wjazd na Malediwy", LocalDate.of(2020, 02, 12), LocalDate.of(2020, 02, 17), 2000, "Honollu", "Koszalin", "Polska","Touroperator1"));
        save(new Tour(2L, "Wyjazd na Madagaskar",LocalDate.of(2020, 05, 15), LocalDate.of(2020, 05, 22), 3000, "Antananarivo", "Koszalin", "Madagaskar", "Touroperator1"));
        save(new Tour(3L, "Wyjazd do Niemiec",LocalDate.of(2020, 02, 12), LocalDate.of(2020, 02, 12), 4500, "Madryt", "Koszalin", "Niemcy", "Touroperator1"));
        save(new Tour(4L, "Wyjazd na Litwe",LocalDate.of(2020, 02, 12), LocalDate.of(2020, 02, 12), 1200, "Madryt", "Poznan", "Litwa", "Touroperator1"));
        save(new Tour(5L, "Wyjazd do Hiszpanii",LocalDate.of(2020, 02, 12), LocalDate.of(2020, 02, 12), 1100, "Madryt", "Warszawa", "Ukraina", "Touroperator1"));
    }


}
