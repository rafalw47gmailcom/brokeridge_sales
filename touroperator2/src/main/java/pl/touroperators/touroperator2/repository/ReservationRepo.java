package pl.touroperators.touroperator2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.touroperators.touroperator2.model.Reservation;

import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation,Long> {

    List<Reservation> findAll();

}
