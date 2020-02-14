package pl.touroperators.touroperator1.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.touroperators.touroperator1.model.Tour;
import pl.touroperators.touroperator1.services.TourService;

import java.util.List;

//localhost:8080/admin


@Controller
@RequestMapping("/admin")
public class AdminPageResource {

    private TourService tourService;

    @Autowired
    public AdminPageResource(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping()
    public String get(Model model){
        List<Tour> tours = tourService.findAllAsList();
        model.addAttribute("tours",tours);
        model.addAttribute("newTour", new Tour());
        return "/admin";
    }


    @GetMapping("/newOffer")
    public String getNewOfferPage(Model model){
        List<Tour> tours = tourService.findAllAsList();
        model.addAttribute("tours",tours);
        model.addAttribute("newTour", new Tour());

        return "new_offer";
    }

    @PostMapping("/add")
    public String addTour(@ModelAttribute("tour") Tour tour){
        tourService.save(tour);
        return "redirect:/admin";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditTourForm(@PathVariable(name = "id") Long id){
        ModelAndView modelAndView = new ModelAndView("edit_tour");

       // Optional<Tour> tour = tourService.findById(id);
        Tour tour = tourService.getById(id);
        modelAndView.addObject("tour", tour);

        return modelAndView;
    }

    @RequestMapping("/delete/{id}")
    public String deleteTour(@PathVariable(name = "id") Long id){
        tourService.deleteById(id);

        return "redirect:/admin";
    }

    @GetMapping("/details/{id}")
    public ModelAndView getDetails(@PathVariable(name = "id") Long id ){
        ModelAndView modelAndView = new ModelAndView("details");

        // Optional<Tour> tour = tourService.findById(id);
        Tour tour = tourService.getById(id);
        modelAndView.addObject("tour", tour);
        return modelAndView;
    }



}
