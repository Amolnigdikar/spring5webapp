package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author amol nigdikar
 * @created_at 3/3/2020
 */
public interface BookRepository extends CrudRepository<Book,Long> {
}
