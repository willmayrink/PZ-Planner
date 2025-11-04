package mayrink.will.PZ_Planner.controller;

import mayrink.will.PZ_Planner.model.Items;
import mayrink.will.PZ_Planner.model.Places;
import mayrink.will.PZ_Planner.repository.PlacesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller

public class PlacesController {

    @Autowired
    private PlacesRepository placesRepository;



    @RequestMapping("/")
    public String rootPage(Model model){
        return "index";
    }
    @GetMapping("/places")
    public String listAllPlaces(Model model) {
        model.addAttribute("places", placesRepository.getPlacesOrderByName());
        return "places-list";
    }
    @GetMapping("places/{id}")
    public String listSpecificPlace(@PathVariable("id") Long id, Model model) {
        placesRepository.findById(id).ifPresentOrElse(
                place -> model.addAttribute("place", place), // Se encontrado, adiciona ao model
                () -> model.addAttribute("error", "Place not found with ID: " + id) // Se não encontrado
        );
        return "specific-place"; // Nome do template novo
    }

    @GetMapping("/add-place")
    public String showAddPlaceForm(Model model) {
        model.addAttribute("place", new Places());
        return "add-place";
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