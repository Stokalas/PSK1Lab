package lt.vu.mif.lab1psk.persistence;

import lt.vu.mif.lab1psk.entities.Author;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class AuthorsDAO {

    @Inject
    private EntityManager em;

    public List<Author> loadAll() {
        return em.createNamedQuery("Author.findAll", Author.class).getResultList();
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void persist(Author author) {
        this.em.persist(author);
    }

    public Author findOne(Integer id) {
        return em.find(Author.class, id);
    }
}
