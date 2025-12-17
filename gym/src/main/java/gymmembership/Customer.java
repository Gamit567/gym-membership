package gymmembership;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Customer {
	@Id
	@GeneratedValue
	Long id;
	boolean status;
	String membership_type;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	User user;
	
	
	//getters
	Long getId() {
		return id;
	}
	boolean getStatus() {
		return status;
	}
	String membership_type() {
		return membership_type;
	}
	//setters
	void setId(Long ID) {
		id = ID;
	}
	void setStatus(boolean finish) {
		status = finish;
	}
	void setmembershipType(String types) {
		membership_type = types;
	}
	
	
}
