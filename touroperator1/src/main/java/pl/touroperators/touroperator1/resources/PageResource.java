package pl.touroperators.touroperator1.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.touroperators.touroperator1.entities.Tour;
import pl.touroperators.touroperator1.services.TourService;

import java.util.List;

@Controller
public class PageResource {

    private TourService tourService;

    @Autowired
    public PageResource(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping("/admin")
    public String get(Model model){

   //    Tour tour =  new Tour(5L, "Wyjazd do Hiszpanii",new Date(06-07-2015), new Date(13-07-2015), 1100, "Madryt", "Warszawa", "Ukraina", "Touroperator1");
            //   model.addAttribute("tour",tour);
        //model.addAttribute("name","Rafał");

        List<Tour> tours = tourService.findAllAsList();
        model.addAttribute("tours",tours);
        model.addAttribute("newTour", new Tour());
        return "admin";
    }

    @PostMapping("/add")
    public String addTour(@ModelAttribute("tour") Tour tour){
        tourService.save(tour);
        return "redirect:/admin";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditTourForm(@PathVariable(name = "id") Long id){
        ModelAndView mav = new ModelAndView("edit_tour");

       // Optional<Tour> tour = tourService.findById(id);
        Tour tour = tourService.getById(id);
        mav.addObject("tour", tour);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteTour(@PathVariable(name = "id") Long id){
        tourService.deleteById(id);

        return "redirect:/admin";
    }

    @GetMapping("/details")
    public String getDetails(Model model){
        List<Tour> tours = tourService.findAllAsList();
        model.addAttribute("tours",tours);
        model.addAttribute("newTour", new Tour());
        return "details";
    }



}
