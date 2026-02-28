package repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.membership.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
