package gymmembership;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
 * class for Customer.
 */
@Entity
public class Customer {
  @Id
  @GeneratedValue
  private Long id;
  private boolean status;
  private String membershiptype;
  @OneToOne
  @JoinColumn(name = "user_id")
  private User user;
  @OneToOne(mappedBy = "user")
  private Customer customer;

  public Long getId() {
    return id;
  }
  
  public boolean getStatus() {
    return status;
  }
  
  /**
   *return membership types .
   *
   * @return types.
   */
  
  public String getMembershipType() {
    return membershiptype;
  }
  
  
  public void setStatus(boolean finish) {
    status = finish;
  }

  /**
   * set types. 
   *
   */
  public void setMembershipType(String types) {
    membershiptype = types;
  }

  public void setUser(User user2) {
    this.user = user;
    
  }
  

}
