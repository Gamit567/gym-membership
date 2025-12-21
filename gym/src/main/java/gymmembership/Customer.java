package gymmembership;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
 * class for Customer.
 */
public class Customer {
  @Id
  @GeneratedValue
  Long id;
  boolean status;
  String membershiptype;
  @OneToOne
  @JoinColumn(name = "user_id")
  User user;

  Long getId() {
    return id;
  }
  
  boolean getStatus() {
    return status;
  }
  
  String membershiptypes() {
    return membershiptype;
  }
  
  
  void setStatus(boolean finish) {
    status = finish;
  }

  void setmembershipType(String types) {
    membershiptype = types;
  }
}
