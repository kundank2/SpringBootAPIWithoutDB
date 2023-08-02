package com.flipcart.test.model;

import jakarta.annotation.Nonnull;

public class Student {

	private String firstName;
	private String lastName;
	@Nonnull
	private Integer id;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}
	
	
	
	
}
