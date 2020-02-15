package pl.touroperators.touroperator1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.touroperators.touroperator1.model.HotelLocation;

@Repository
public interface HotelLocationRepo extends JpaRepository<HotelLocation, Long> {
}
