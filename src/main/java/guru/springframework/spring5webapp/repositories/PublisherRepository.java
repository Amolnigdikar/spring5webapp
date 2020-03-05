package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author amol nigdikar
 * @created_at 3/3/2020
 */
public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
