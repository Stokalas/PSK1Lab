package lt.vu.mif.lab1psk.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy="publisher")
    private List<Book> books = new ArrayList<>();

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass())
            return false;

        final Publisher other = (Publisher) obj;

        if ((this.name == null) ? (other.name != null) : !this.name.equals(
                other.name)) {
            return false;

        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash +
                (this.name != null
                        ? this.name.hashCode()
                        : 0);
        return hash;
    }
}
