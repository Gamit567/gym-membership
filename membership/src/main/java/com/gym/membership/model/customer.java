package com.gym.membership.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer{

	@Id
	@GeneratedValue
    private Long id;

    private String name;
    
    private int age;
    
    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Memberships membership;
    
    public Customer() {}
    
    public Customer(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
    
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Memberships getMembership() {
		return membership;
	}

	public void setMembership(Memberships membership) {
		this.membership = membership;
	}
}