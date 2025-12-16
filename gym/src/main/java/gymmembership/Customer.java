package gymmembership;

public class Customer {
	
	Long id;
	boolean status;
	String membership_type;
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
