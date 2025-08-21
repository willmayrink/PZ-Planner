package mayrink.will.PZ_Planner.controller;

import mayrink.will.PZ_Planner.model.Items;
import mayrink.will.PZ_Planner.model.Places;
import mayrink.will.PZ_Planner.repository.PlacesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class PlacesController {

    @Autowired
    private PlacesRepository placesRepository;

    @GetMapping("/add-place")
    public String showAddPlaceForm(Model model) {
        model.addAttribute("place", new Places());
        return "add-place";
    }
    @GetMapping("/places")
    public String listAllPlaces(Model model){
        model.addAttribute("places", placesRepository.findAll());
        return "places-list";
    }

    @PostMapping("/add-place")
    public String addPlace(@RequestParam String description,
                           @RequestParam String city,
                           @RequestParam String coordX,
                           @RequestParam String coordY,
                           Model model) {
        Places place = new Places();
        place.setDescription(description);
        place.setCity(city);
        place.setCoordX(coordX);
        place.setCoordY(coordY);
        place.setCoordZ("0");


        placesRepository.save(place);
        model.addAttribute("message", "Place added successfully!");
        return "add-place";


    }
}