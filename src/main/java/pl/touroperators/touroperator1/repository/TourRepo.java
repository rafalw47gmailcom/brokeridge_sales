package pl.touroperators.touroperator1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.touroperators.touroperator1.model.Tour;

import java.util.List;

@Repository
public interface TourRepo extends JpaRepository<Tour,Long> {


    List<Tour> findByCountryOrAndDestinationCity(String country, String destinationCity);

}
