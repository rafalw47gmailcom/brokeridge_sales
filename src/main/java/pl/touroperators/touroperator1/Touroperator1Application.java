package pl.touroperators.touroperator1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Logger;

@SpringBootApplication
public class Touroperator1Application {

    protected static final java.util.logging.Logger log = Logger.getLogger(String.valueOf(Touroperator1Application.class));

    public static void main(String[] args) {
        SpringApplication.run(Touroperator1Application.class, args);

        log.info("---------------------------------------------------------------");
        log.info("Application run on: ");
        log.info("http://localhost:8080/user" + "  - strona dla użytkowników");
        log.info("http://localhost:8080/admin" + "  - strona dla admina");
        log.info("http://localhost:8080/api/tours/all" + "  - endpointy dla systemu pośrednictwa");
        log.info("http://localhost:8080/console" + "  - konsola bazy dancyh");


    }

}
