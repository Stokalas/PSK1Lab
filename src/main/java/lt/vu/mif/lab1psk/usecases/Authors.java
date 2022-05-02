package lt.vu.mif.lab1psk.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.mif.lab1psk.entities.Author;
import lt.vu.mif.lab1psk.persistence.AuthorsDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class Authors {

    @Inject
    private AuthorsDAO authorsDAO;

    @Getter
    @Setter
    private Author authorToCreate = new Author();

    @Getter
    private List<Author> allAuthors;

    @PostConstruct
    public void init() {
        loadAllAuthors();
    }

    @Transactional
    public void createAuthor() {
        this.authorsDAO.persist(authorToCreate);
    }

    private void loadAllAuthors() {
        this.allAuthors = authorsDAO.loadAll();
    }
}
