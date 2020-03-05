package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author amol nigdikar
 * @created_at 3/3/2020
 */
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
