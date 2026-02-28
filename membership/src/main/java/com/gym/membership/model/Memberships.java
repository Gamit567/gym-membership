package com.gym.membership.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Memberships {
	@Id
	@GeneratedValue
	private Long id;
	
	private int code;
	
	private MembershipEnum membership;
	
	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	private int durations = 30;
	
	
	public Memberships() {
		this.membership = MembershipEnum.NONE;
		
	}	

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public MembershipEnum getMembership() {
		return this.membership;
	}

	public void setMembership(MembershipEnum membership) {
		this.membership = membership;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getDurations() {
		return durations;
	}

	public void setDurations(int durations) {
		this.durations = durations;
	}

}
