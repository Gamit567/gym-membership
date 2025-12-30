package gymmembership.repository;

import gymmembership.User;
import org.springframework.data.repository.CrudRepository;

/**
 * user repo.
 */
public class UserRepo {
  
  /**
   * class using CRUD.
   */
  public interface GradeRepository extends CrudRepository<User, Long> {

  }

}
