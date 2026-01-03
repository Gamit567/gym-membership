package gymmembership.repository;

import gymmembership.User;
import org.springframework.data.repository.CrudRepository;


/**
 * class for customer repo.
 */
public interface UserRepo extends CrudRepository<User, Long> {

  

}
