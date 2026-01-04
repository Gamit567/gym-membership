package ControllerTest;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import gymmembership.Customer;
import gymmembership.User;
import gymmembership.repository.CustomerRepo;
import gymmembership.repository.UserRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import tools.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class CustomerControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private ObjectMapper objectMapper;

  @Autowired
  private UserRepo userRepository;

  @Autowired
  private CustomerRepo customerRepository;

  private User user;

  @BeforeEach
  void setup() {
    User user = new User();
    user = userRepository.save(user);
  }

  @Test
  void createCustomer_shouldReturn201() throws Exception {
    Customer customer = new Customer();
    customer.setStatus(true);
    customer.setmembershipType("basic");
    mockMvc.perform(post("/api/customers")
                  .contentType(MediaType.APPLICATION_JSON)
                  .content(objectMapper.writeValueAsString(customer)))
                  .andExpect(status().isCreated());
      }
}
