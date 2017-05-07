package com.ims.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="Bookinginfo")
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TokenNum")
	private int id;

	@Column(name="Insurance")
	private String hasInsurance;

	@Column(name="Prev_Visit")
	private String prevVisit;


	@Column(name="Reason")
	private String reason;
    
	@Column(name="doctorId")
	private String doctorId;

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	@NotEmpty(message="Date can not be empty")
	@Column(name="AppDate")
	private String appointmentDate;


	@NotEmpty(message="Time can not be empty")
	@Column(name="AppTime")
	private String appointmentTime;

	@Column(name="PatientName")
	private String username;

	@Column(name="DoctorName")
	private String doctorName;

	@Column
	private String bookingStatus;
	
	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHasInsurance() {
		return hasInsurance;
	}

	public void setHasInsurance(String hasInsurance) {
		this.hasInsurance = hasInsurance;
	}

	public String getPrevVisit() {
		return prevVisit;
	}

	public void setPrevVisit(String prevVisit) {
		this.prevVisit = prevVisit;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}


  
	

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


}

