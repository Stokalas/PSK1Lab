package lt.vu.mif.lab1psk.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.mif.lab1psk.entities.Book;
import lt.vu.mif.lab1psk.interceptors.Logger;
import lt.vu.mif.lab1psk.persistence.BooksDAO;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Map;

@ViewScoped
@Named
@Getter @Setter
public class UpdateBookDetails implements Serializable {
    private Book book;

    @Inject
    private BooksDAO booksDAO;

    @PostConstruct
    private void init() {
        System.out.println("UpdateBookDetails INIT CALLED");
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer bookId = Integer.parseInt(requestParameters.get("bookId"));
        this.book = booksDAO.findOne(bookId);
    }

    @Transactional
    @Logger
    public String updateBookIsbn() {
        try {
            booksDAO.update(this.book);
        } catch (OptimisticLockException e) {
            return "/bookDetails.xhtml?faces-redirect=true&bookId=" + this.book.getId() + "&error=optimistic-lock-exception";
        }

        return "/index.html";
    }
}
