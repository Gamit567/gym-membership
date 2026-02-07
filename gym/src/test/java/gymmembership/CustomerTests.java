package gymmembership;

import static org.junit.jupiter.api.Assertions.assertEquals;
    
import org.junit.jupiter.api.Test;

/**
 * class for customer tests.
 */
public class CustomerTests {
  /**
   * customer tests.
   */
  @Test
  public void tests() {
    Customer customer = new Customer();
    customer.setStatus(false);
    customer.setMembershipType("basic");
    
    assertEquals(customer.getStatus(), false);
    assertEquals(customer.getMembershipType(), "basic");
  }
}
