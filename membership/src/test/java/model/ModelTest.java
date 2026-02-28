package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gym.membership.model.Customer;
import com.gym.membership.model.Memberships;





public class ModelTest {
	
	
	@Test
	void matchingtypes() {
		Customer customer = new Customer("john",25);
		Memberships membership = new Memberships();
		customer.setMembership(membership);
		membership.setCustomer(customer);
		assertEquals(customer.getMembership(),membership);
		
	}
	
	

}
