package gymmembership;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test class for users class.
 */
public class UserTest {
  
  /**
   * Tests.
   */
  @Test
  public void tests() {
    User user = new User();
    // setting parameters
    user.setAge(19);
    user.setId(1L);
    user.setName("test");
    user.setSurname("surname");
    user.setEmail("test@email");
    // Testing the setters 
    assertEquals(19, user.getAge());
    assertEquals(1L, user.getId());
    assertEquals("test", user.getName());
    assertEquals("surname", user.getSurname());
    assertEquals("test@email", user.getEmail());
    // test two string
    System.out.println(user.toString());
    // testing second constructer
    User user2 = new User("test", "surname", "test@email", 19);
    user2.setId(1L);
    assertEquals(user.toString(), user2.toString());
  }
}
