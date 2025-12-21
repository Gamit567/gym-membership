package gymmembership;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


/**
 * class for user.
 */
@Entity
public class User {
  @Id
  @GeneratedValue
  Long id;
  String name;
  String surname;
  String email;
  int age;
  
  /**
   *contructor for user class.
   *
   */
  public User(String name, String surname, String email, int age) {
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.age = age;
  }
  
  /**
   * return id.
   */
  public Long getId() {
    return id;
  }
  
  /**
   * get id.
   *
   * @param id setter
   */
  public void setId(Long id) {
    this.id = id;
  }
  
  /**
   *getter for name. 
   *
   * @return name.
   */
  public String getName() {
    return name;
  }
  
  /**
   * setter for name .
   *
   * @param name set
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * getter for  surname. 
   *
   * @return surname.
   */
  public String getSurname() {
    return surname;
  }
  
  /**
   *setter for surname. 
   *
   * @param surname set.
   */
  public void setSurname(String surname) {
    this.surname = surname;
  }
  
  /**
   * get email. 
   *
   * @return email.
   */
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  /**
   * get age. 
   *
   * @return age.
   */
  public int getAge() {
    return age;
  }
  
  /**
   * set age.
   *
   * @param age set
   */
  public void setAge(int age) {
    this.age = age;
  }
  
  /**
   * to string.
   */
  @Override
  public String toString() {
    return "User [id=" + id + ", name=" 
        + name + ", surname=" + surname + ", email=" 
        + email + ", age=" + age + "]";
  }
}
