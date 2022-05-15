package lt.vu.mif.lab1psk.persistence;
import lt.vu.mif.lab1psk.entities.Book;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class BooksDAO {

    @Inject
    private EntityManager em;

    public void persist(Book book) { this.em.persist(book); }
    public Book findOne(Integer id) {
        return this.em.find(Book.class, id);
    }

    public Book update(Book book) {
        Book updated =  em.merge(book);
        em.flush();
        return updated;
    }
}
