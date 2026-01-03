package controller;


import gymmembership.Customer;
import gymmembership.User;
import gymmembership.repository.CustomerRepo;
import gymmembership.repository.UserRepo;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



/**
 * customerrepo.
 */
public class CustomerController {
  private UserRepo userrepository;
  private CustomerRepo customerrepo;
  
  /**
   * saving grades.
   *
   * @return http status.
   */
  @PostMapping(value = "/grades/addGrade")
  public ResponseEntity<Customer> addCustomer(@RequestBody Map<String, String> params) {
    User user =
        userrepository.findById(Long.valueOf(params.get("student_id"))).orElseThrow();
   
    Customer customer = new Customer();
    customer.setStatus(true);
    customer.setmembershipType("basic");
  
    return ResponseEntity.ok(customer);
  }

}
