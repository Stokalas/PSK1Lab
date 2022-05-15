package lt.vu.mif.lab1psk.services;

import lt.vu.mif.lab1psk.interceptors.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import java.lang.annotation.Annotation;
import java.util.concurrent.ThreadLocalRandom;

@Alternative
@ApplicationScoped
public class AltIsbnGenerator implements IsbnGenerator {

    @Logger
    public String generateIsbn(){
        String isbn = "";
        for (int i = 0; i < 13; i++) {
            if (i == 3 || i == 4 || i == 6 || i == 12) {
                isbn += "-";
            }
            int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
            isbn += Integer.toString(randomNum);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return isbn;
    }
}