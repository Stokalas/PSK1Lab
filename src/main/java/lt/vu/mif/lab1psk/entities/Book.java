package lt.vu.mif.lab1psk.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @Size(max = 17)
    private String isbn;

    @ManyToOne
    private Publisher publisher;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer version;


    @ManyToMany
    @JoinTable(name="BOOK_AUTHOR")
    private List<Author> authors = new ArrayList<>();

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass())
            return false;

        final Book other = (Book) obj;

        if ((this.isbn == null) ? other.isbn != null : !this.isbn.equals(
                other.isbn)) {
            return false;

        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash +
                (this.isbn != null
                    ? this.isbn.hashCode()
                    : 0);
        return hash;
    }

}
