package lt.vu.mif.lab1psk.rest.contracts;

import lombok.Getter;
import lombok.Setter;
import lt.vu.mif.lab1psk.entities.Publisher;

@Getter @Setter
public class BookDto {
    private Integer id;
    private String title;
    private String isbn;
}
