package mayrink.will.PZ_Planner.service;

import mayrink.will.PZ_Planner.model.Places;
import mayrink.will.PZ_Planner.repository.PlacesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacesService {

    @Autowired
    PlacesRepository placesRepository;

    public List<Places> getPlacesOrdered(){
        return placesRepository.getPlacesOrderByName();
    }

}
