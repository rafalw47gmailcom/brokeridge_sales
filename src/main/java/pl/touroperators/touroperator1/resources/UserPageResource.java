package pl.touroperators.touroperator1.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.touroperators.touroperator1.entities.Tour;
import pl.touroperators.touroperator1.services.TourService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserPageResource {

    private TourService tourService;

    @Autowired
    public UserPageResource(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping()
    public String get(Model model){
        List<Tour> tours = tourService.findAllAsList();
        model.addAttribute("tours",tours);
     //   model.addAttribute("newTour", new Tour());
        return "/userPages/homepage";
    }

    @GetMapping("/offerdetails/{id}")
    public ModelAndView getOfferDetails(@PathVariable(name = "id") Long id){
        ModelAndView modelAndView = new ModelAndView("/userPages/detailsUser");
        // Optional<Tour> tour = tourService.findById(id);
        Tour tour = tourService.getById(id);
        modelAndView.addObject("tour", tour);
        return modelAndView;
    }
}
