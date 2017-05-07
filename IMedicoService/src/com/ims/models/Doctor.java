package com.ims.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "doctorReg")
public class Doctor {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "ID")
		private int id;

		@NotEmpty(message = "User Name field cannot be empty")
		@Size(min = 5, max = 20)
		@Column(name = "UserName")
		private String userName;

		@NotEmpty
		@Size(min = 4, max = 10)
		@Column(name = "Password")
		private String password;

		@Size(min = 4, max = 20)
		@NotEmpty(message = "FullName field cannot be empty")
		@Column(name = "FullName")
		private String fullName;

		@Column(name = "Speciality")
		private String speciality;

		@Email
		@Column(name = "Email")
		private String email;



		@Column(name = "Phone")
		private long phone;

		@Size(min = 4, max = 40)
		@NotEmpty(message = "Address field cannot be empty")
		@Column(name = "Address")
		private String address;

		@Column(name = "city")
		private String city;

		@Column(name="availableTime")
		private String availableTime;

		public String getAvailableTime() {
			return availableTime;
		}

		public void setAvailableTime(String availableTime) {
			this.availableTime = availableTime;
		}

		@NotNull
		@Column(name = "ZipCode")
		private int zipcode;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSpeciality() {
			return speciality;
		}

		public void setSpeciality(String speciality) {
			this.speciality = speciality;
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

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public int getZipcode() {
			return zipcode;
		}

		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}

}
