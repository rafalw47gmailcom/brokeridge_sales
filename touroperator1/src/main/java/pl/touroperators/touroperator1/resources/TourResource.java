package pl.touroperators.touroperator1.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.touroperators.touroperator1.entities.Tour;
import pl.touroperators.touroperator1.services.TourService;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TourResource {

    private TourService tourService;

    @Autowired
    public TourResource(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping("/tours/all")
    public ResponseEntity<Iterable<Tour>> findAll(){
        return ResponseEntity.ok(tourService.findAll());
    }

    @GetMapping("tours/all/2")
    public Iterable<Tour> findAll2()
    {
        return tourService.findAll();
    }

    @GetMapping("/tours")
    public Optional<Tour> findById(@RequestParam Long id){
        return tourService.findById(id);
    }

    @GetMapping("/numbers")
    public int sendNumberOfOffers() {
        return tourService.sendNumberOfOffers();
    }

}
