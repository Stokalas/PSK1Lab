package lt.vu.mif.lab1psk.services;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public abstract class LocalIsbnGeneratorDecorator implements IsbnGenerator {

    @Inject @Delegate @Any
    IsbnGenerator isbnGenerator;

    public String generateIsbn() {
        String isbn = isbnGenerator.generateIsbn();

        isbn = "123" + isbn.substring(3);
        return isbn;
    }
}
