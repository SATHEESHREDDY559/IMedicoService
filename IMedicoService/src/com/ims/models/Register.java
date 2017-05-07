package com.ims.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="register")
public class Register {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int userid;
	
	@Column
	@NotEmpty
	@Size(min=4,max=15)
	private String username;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String firstname;
	
	private String lastname;
	
	@NotNull
	
	private String dob;
	@NotEmpty
	private String email;
	@Column(name="Gender")
	private String gender;


    @NotNull
	@Column(name="Phone")
	private long phone;

	@Size(min = 4, max = 40)
	@NotEmpty(message = "Address field cannot be empty")
	@Column(name="Address")
	private String address;

	@Column(name="ZipCode")
	private int zipcode;
	
	@Column(name="Allergies")
	private String Allergies;
	

	public void setAllergies(String allergies) {
		Allergies = allergies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAllergies() {
		return Allergies;
	}
	
	
	
}
