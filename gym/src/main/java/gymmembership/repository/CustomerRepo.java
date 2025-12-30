package gymmembership.repository;

import gymmembership.Customer;
import org.springframework.data.repository.CrudRepository;


/**
 * class for customer repository.
 */

public class CustomerRepo {
  /**
   * class implementing CRUD.
   */
  public interface GradeRepository extends CrudRepository<Customer, Long> {

  }

}
