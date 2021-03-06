package lt.vu.mif.lab1psk.services;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.ThreadLocalRandom;

@ApplicationScoped
public class IsbnGenerator {

    public String generateIsbn() {
        String isbn = "";
        for (int i = 0; i < 13; i++) {
            if (i == 3 || i == 4 || i == 6 || i == 12) {
                isbn += "-";
            }
            int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
            isbn += Integer.toString(randomNum);
        }
        return isbn;
    }
}
