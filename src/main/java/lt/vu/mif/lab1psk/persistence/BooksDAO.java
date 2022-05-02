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
}
