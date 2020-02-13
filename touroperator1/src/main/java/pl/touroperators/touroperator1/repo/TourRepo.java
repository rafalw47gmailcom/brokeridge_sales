package pl.touroperators.touroperator1.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.touroperators.touroperator1.entities.Tour;

@Repository
public interface TourRepo extends JpaRepository<Tour,Long> {
    

/*
    @Query("select s from Tour s where country like %?1%")
    Page<Tour> findByCountry(String country, Pageable pageable);
 */

}
