package lt.vu.mif.lab1psk.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Author.findAll", query = "select a from Author as a")
})
@Getter
@Setter
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String surname;

    @ManyToMany(mappedBy="authors")
    private List<Book> books = new ArrayList<>();




}
