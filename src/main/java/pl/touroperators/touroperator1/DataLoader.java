package pl.touroperators.touroperator1;

import org.omg.CORBA.LongLongSeqHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import pl.touroperators.touroperator1.model.Hotel;
import pl.touroperators.touroperator1.model.HotelLocation;
import pl.touroperators.touroperator1.model.Tour;
import pl.touroperators.touroperator1.model.enumclasses.Room;
import pl.touroperators.touroperator1.services.HotelLocationService;
import pl.touroperators.touroperator1.services.HotelService;
import pl.touroperators.touroperator1.services.TourService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Component
public class DataLoader {

    @Autowired
    private TourService tourService;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private HotelLocationService hotelLocationService;

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        HotelLocation hotelLocation = new HotelLocation(1L,"Boczna", "jakas", "ads","dasd","asdasd","asda","asd");

        Hotel hotel = new Hotel( 1L,"Hotelik", 5, "hotel@hotel.com", "dasdasdda","111-222-333",  Room.JEDNOOSOBOWY);
        Hotel hotel1 = new Hotel( 2L,"Hotelik", 5, "hotel@hotel.com", "dasdasdda","111-222-333",  Room.JEDNOOSOBOWY);
        Hotel hotel2 = new Hotel( 3L,"Hotelik", 5, "hotel@hotel.com", "dasdasdda","111-222-333",  Room.JEDNOOSOBOWY);
        Hotel hotel3 = new Hotel( 4L,"Hotelik", 5, "hotel@hotel.com", "dasdasdda","111-222-333",  Room.JEDNOOSOBOWY);
        Hotel hotel4 = new Hotel( 5L,"Hotelik", 5, "hotel@hotel.com", "dasdasdda","111-222-333",  Room.JEDNOOSOBOWY);

        hotelLocationService.save(hotelLocation);

        hotelService.save(hotel);
        hotelService.save(hotel1);
        hotelService.save(hotel2);
        hotelService.save(hotel3);
        hotelService.save(hotel4);

        tourService.save(new Tour(1L, "Wyjazd na Malediwy", LocalDate.of(2020,2 , 12),LocalDate.of(2020, 2, 17), 2000, "Honollu", "Koszalin", "Polska",hotel));
        tourService.save(new Tour(2L, "Wyjazd na Madagaskar",LocalDate.of(2020, 5, 15), LocalDate.of(2020, 5, 22), 3000, "Antananarivo", "Koszalin", "Madagaskar",hotel1));
        tourService.save(new Tour(3L, "Wyjazd do Niemiec",LocalDate.of(2020, 6, 11), LocalDate.of(2020, 6, 18), 4500, "Madryt", "Koszalin", "Niemcy",hotel2));
        tourService.save(new Tour(4L, "Wyjazd na Litwe",LocalDate.of(2020, 12, 6), LocalDate.of(2020, 12, 11), 1200, "Madryt", "Poznan", "Litwa",hotel3));
        tourService.save(new Tour(5L, "Wyjazd do Hiszpanii",LocalDate.of(2020, 11, 21), LocalDate.of(2020, 1, 28), 1100, "Madryt", "Warszawa", "Ukraina",hotel4));

        /*
                tourService.save(new Tour(1L, "Wjazd na Malediwy", new Date(2020, 02, 12), new Date(2020, 02, 17), 2000, "Honollu", "Koszalin", "Polska",hotel));
        tourService.save(new Tour(2L, "Wyjazd na Madagaskar",new Date(2020, 05, 15), new Date(2020, 05, 22), 3000, "Antananarivo", "Koszalin", "Madagaskar",hotel1));
        tourService.save(new Tour(3L, "Wyjazd do Niemiec",new Date(2020, 02, 12), new Date(2020, 02, 12), 4500, "Madryt", "Koszalin", "Niemcy",hotel2));
        tourService.save(new Tour(4L, "Wyjazd na Litwe",new Date(2020, 02, 12), new Date(2020, 02, 12), 1200, "Madryt", "Poznan", "Litwa",hotel3));
        tourService.save(new Tour(5L, "Wyjazd do Hiszpanii",new Date(2020, 02, 12), new Date(2020, 02, 12), 1100, "Madryt", "Warszawa", "Ukraina",hotel4));
         */
    }
}