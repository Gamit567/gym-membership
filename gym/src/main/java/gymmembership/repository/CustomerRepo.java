package gymmembership.repository;

import gymmembership.Customer;
import org.springframework.data.repository.CrudRepository;



/**
 * class for Customer Repository.
 */
public interface CustomerRepo extends CrudRepository<Customer, Long> {

}


