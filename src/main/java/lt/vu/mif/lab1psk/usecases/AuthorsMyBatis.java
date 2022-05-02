package lt.vu.mif.lab1psk.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.mif.lab1psk.mybatis.dao.AuthorMapper;
import lt.vu.mif.lab1psk.mybatis.model.Author;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

@Model
public class AuthorsMyBatis {

    @Inject
    AuthorMapper authorMapper;

    @Getter @Setter
    private Author authorToCreate = new Author();

    @Transactional
    public void createAuthor() {
        authorMapper.insert(authorToCreate);
    }
}
