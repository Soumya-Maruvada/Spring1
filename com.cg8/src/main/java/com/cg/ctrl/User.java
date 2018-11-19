package com.cg.ctrl;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty(message = "First name is Mandatory")
	@Size(min=4,max=8,message="Minimum 4 and Maximum 8 charecters required")
	private String firstName;
	
	@NotEmpty(message = "Last name is Mandatory")
	@Size(min=4,max=8,message="Minimum 4 and Maximum 8 charecters required")
	private String lastName;
	
	private char gender;
	
	@NotEmpty(message = "E-Mail is Mandatory")
	@Email(message="Please Enter valid Email Id")
	private String email;
	
	private String[] skillSet;
	private String city;
	
	//set get
	
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	
}
