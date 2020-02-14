package pl.touroperators.touroperator1.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    // @Column(nullable = false)

    @NotNull
    private int stars;

    @NotNull
    private String email;

    private String description;

    public Hotel() {
    }

    @OneToOne
    private HotelLocation Lokalizacja ;


    public Hotel(Long id, String name, @NotNull int stars, @NotNull String email, String description, HotelLocation lokalizacja) {
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.email = email;
        this.description = description;
        Lokalizacja = lokalizacja;
    }
}
