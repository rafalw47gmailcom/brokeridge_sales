package pl.touroperators.touroperator1.repository;

import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.touroperators.touroperator1.model.Reservation;

import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation,Long> {

    List<Reservation> findAll();

}
