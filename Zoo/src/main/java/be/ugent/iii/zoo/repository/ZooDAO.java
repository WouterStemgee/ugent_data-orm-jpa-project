package be.ugent.iii.zoo.repository;

import be.ugent.iii.zoo.entity.Zoo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Janne
 */
public interface ZooDAO extends CrudRepository<Zoo, Long> {

    Zoo findByName(@Param("name") String name);
}
