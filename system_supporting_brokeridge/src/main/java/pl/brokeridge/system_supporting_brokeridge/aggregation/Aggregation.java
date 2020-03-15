package pl.brokeridge.system_supporting_brokeridge.aggregation;




import pl.brokeridge.system_supporting_brokeridge.entity.Tour;
import pl.brokeridge.system_supporting_brokeridge.search.Searcher;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Aggregation {

    protected static final Logger log = Logger.getLogger(String.valueOf(Aggregation.class));
    public static List<Tour> aggregatedTours = new ArrayList<>();
    private static int loopValue = 1;


    public Aggregation() throws MalformedURLException {

    }

    public static List<Tour> searchbyParams(String country, String destinationCity, String dateFrom, String dateTo){
        log.info("[SEARCHING] Start SEARCHNG offers from touroperators and cleaning the lists");
        clearLists();

        Searcher searcher = new Searcher(country,  destinationCity,  dateFrom, dateTo, Touroperator.touroperatorFirstUrlAll, Touroperator.touroperatorSecondUrlAll);


        return aggregatedTours;
    }


    public static List<Tour> aggregate() throws IOException {
        log.info("[BEGGINING OF THE PROCESS] Start aggregating offers from touroperators and cleaning the lists");
        clearLists();


      downloadTourOffers(Touroperator.touroperatorFirstUrlAll);
       downloadTourOffers(Touroperator.touroperatorSecondUrlAll);
      //  System.out.println(aggregatedTours);

        return aggregatedTours;
    }



    public static void clearLists(){
        loopValue = 1;
        aggregatedTours.clear();
    }

    public static void downloadTourOffers(String url) throws IOException {
        Downloader firstDownloader = new Downloader(url);
        aggregatedTours.addAll(firstDownloader.getDonwloadedTours());
    }


}
