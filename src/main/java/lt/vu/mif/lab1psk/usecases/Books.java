package lt.vu.mif.lab1psk.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.mif.lab1psk.entities.Author;
import lt.vu.mif.lab1psk.entities.Book;
import lt.vu.mif.lab1psk.persistence.AuthorsDAO;
import lt.vu.mif.lab1psk.persistence.BooksDAO;
import lt.vu.mif.lab1psk.services.IsbnGenerator;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Model
public class Books {

    @Inject
    private BooksDAO booksDAO;
    @Inject
    private AuthorsDAO  authorsDAO;

    @Inject IsbnGenerator isbnGenerator;

    @Getter
    @Setter
    private String authorsId;

    @Getter
    @Setter
    private Book bookToCreate = new Book();

    @Transactional
    public void createBook() {
        this.setAuthorById();
        bookToCreate.setIsbn(isbnGenerator.generateIsbn());
        this.booksDAO.persist(bookToCreate);
    }

    public void setAuthorById() {
        List<String> idList = Arrays.asList(authorsId.split(","));
        List<Author> list = bookToCreate.getAuthors();
        for (String id : idList) {
            int temp = Integer.parseInt(id);
            list.add(authorsDAO.findOne(temp));
        }
        bookToCreate.setAuthors(list);
    }


}
