package repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.membership.model.Customer;
import com.gym.membership.model.Memberships;

public interface MembershipsRepository  extends JpaRepository<Memberships,Long>{
	
	
	 Optional<Memberships> findByCode(int code);
	
	 Optional<Memberships> findByCustomer(Customer customer);

}
