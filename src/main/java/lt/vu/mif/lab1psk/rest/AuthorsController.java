package lt.vu.mif.lab1psk.rest;

import lombok.Getter;
import lombok.Setter;
import lombok.var;
import lt.vu.mif.lab1psk.entities.Author;
import lt.vu.mif.lab1psk.persistence.AuthorsDAO;
import lt.vu.mif.lab1psk.rest.contracts.AuthorDto;
import lt.vu.mif.lab1psk.rest.contracts.BookDto;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Path("/authors")
public class AuthorsController {

    @Inject
    @Setter @Getter
    private AuthorsDAO authorsDAO;

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") final Integer id) {
        Author author = authorsDAO.findOne(id);

        if (author == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        AuthorDto authorDto = new AuthorDto();
        authorDto.setName(author.getName());
        authorDto.setSurname(author.getSurname());

        return Response.ok(authorDto).build();
    }

    @Path("/books/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBooksById(@PathParam("id") final Integer id) {
        Author author = authorsDAO.findOne(id);

        if (author == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        List<BookDto> booksDto = new ArrayList<>();
        for (var book : author.getBooks()) {
            BookDto bookDto = new BookDto();
            bookDto.setId(book.getId());
            bookDto.setTitle(book.getTitle());
            bookDto.setIsbn(book.getIsbn());

            booksDto.add(bookDto);
        }

        return Response.ok(booksDto).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(AuthorDto authorDto)
    {
        try{
            Author author = new Author();
            author.setName(authorDto.getName());
            author.setSurname(authorDto.getSurname());

            authorsDAO.persist(author);

//            return Response.status(Response.Status.CREATED).build();
            return Response.created(URI.create("/authors/"+ author.getId())).build();
        }

        catch (OptimisticLockException ole) {
            return Response.status(Response.Status.CONFLICT).build();
        }
    }

    @Path("/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(@PathParam("id") final Integer authorId,
                           AuthorDto authorData)
    {
        try {
            Author existingAuthor = authorsDAO.findOne(authorId);
            if (existingAuthor == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            existingAuthor.setName(authorData.getName());
            existingAuthor.setSurname(authorData.getSurname());

            authorsDAO.update(existingAuthor);
            return Response.ok().build();
        } catch (OptimisticLockException ole) {
            return Response.status(Response.Status.CONFLICT).build();
        }
    }
}
