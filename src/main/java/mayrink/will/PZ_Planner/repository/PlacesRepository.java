package mayrink.will.PZ_Planner.repository;

import mayrink.will.PZ_Planner.model.Places;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlacesRepository extends JpaRepository<Places, Long> {

    @Query("SELECT pc from Places pc order by pc.city")
    List<Places> getPlacesOrderByName();
}
