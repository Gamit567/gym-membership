package com.gym.membership.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class customer{

	@Id
	@GeneratedValue
    private Long id;

    private String name;
    
    private int age;
    
    public customer() {}
    
    public customer(String name, int age) {
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
}