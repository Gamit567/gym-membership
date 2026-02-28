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
	@JoinColumn(name="customer id")
	private Customer customer;
	
	public Memberships() {}
	
	public Memberships(int code) {
		this.code = code;
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

}
