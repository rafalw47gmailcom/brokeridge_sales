package pl.touroperators.touroperator1.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class HotelLocation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public HotelLocation() {
    }
}
