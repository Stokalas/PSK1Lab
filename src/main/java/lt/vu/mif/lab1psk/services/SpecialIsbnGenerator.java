package lt.vu.mif.lab1psk.services;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Specializes;

@Specializes
@ApplicationScoped
public class SpecialIsbnGenerator extends StandardIsbnGenerator {
    @Override
    public String generateIsbn() {
        String isbn = super.generateIsbn();
        isbn = isbn.substring(0, isbn.length() - 1) + "0";
        return isbn;
    }
}
