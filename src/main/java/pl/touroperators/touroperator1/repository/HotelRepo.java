package pl.touroperators.touroperator1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.touroperators.touroperator1.model.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Long> {
}
