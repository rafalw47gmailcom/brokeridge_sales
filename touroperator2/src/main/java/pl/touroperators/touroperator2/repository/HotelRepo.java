package pl.touroperators.touroperator2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.touroperators.touroperator2.model.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Long> {
}
