package controller;


import gymmembership.Customer;
import gymmembership.User;
import gymmembership.repository.CustomerRepo;
import gymmembership.repository.UserRepo;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * customerrepo.
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {
  private UserRepo userrepository;
  private CustomerRepo customerrepo;
  
  /**
   * public constructer.
   */
  public CustomerController(UserRepo userrepository, CustomerRepo customerrepo) {
    this.userrepository = userrepository;
    this.customerrepo = customerrepo;
  }
  /**
   * saving grades.
   *
   * @return http status.
   */
  
  @PostMapping(value = "/add")
  public ResponseEntity<Customer> addCustomer(@RequestBody Map<String, String> params) {
    User user =
        userrepository.findById(Long.valueOf(params.get("user_id"))).orElseThrow();
   
    Customer customer = new Customer();
    customer.setUser(user);
    customer.setStatus(true);
    customer.setMembershipType("basic");
    Customer saved = customerrepo.save(customer);
  
    return ResponseEntity.ok(customer);
  }

}
