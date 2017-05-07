package com.ims.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table
public class DateTimeSlots {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int Id;
	
	@NotEmpty
	@Column
	private String doctorId;
	
	@NotEmpty
	@Column
	private String day1;
	
	@NotEmpty
	@Column
	private String day2;
	
	@NotEmpty
	@Column
	private String day3;
	
	@NotEmpty
	@Column
	private String day4;
	
	@NotEmpty
	@Column
	private String day5;
	
	@NotEmpty
	@Column
	private String day1Slot1;
	
	@NotEmpty
	@Column
	private String day1Slot2;
	
	@NotEmpty
	@Column
	private String day1Slot3;
	
	@NotEmpty
	@Column
	private String day1Slot4;
	
	@NotEmpty
	@Column
	private String day1Slot1Status;
	
	@NotEmpty
	@Column
	private String day1Slot2Status;
	
	@NotEmpty
	@Column
	private String day1Slot3Status;
	
	@NotEmpty
	@Column
	private String day1Slot4Status;
	
	
	@NotEmpty
	@Column
	private String day2Slot1;
	
	@NotEmpty
	@Column
	private String day2Slot2;
	
	@NotEmpty
	@Column
	private String day2Slot3;
	
	@NotEmpty
	@Column
	private String day2Slot4;
	
	@NotEmpty
	@Column
	private String day2Slot1Status;
	
	@NotEmpty
	@Column
	private String day2Slot2Status;
	
	@NotEmpty
	@Column
	private String day2Slot3Status;
	
	@NotEmpty
	@Column
	private String day2Slot4Status;
	
	
	@NotEmpty
	@Column
	private String day3Slot1;
	
	@NotEmpty
	@Column
	private String day3Slot2;
	
	@NotEmpty
	@Column
	private String day3Slot3;
	
	@NotEmpty
	@Column
	private String day3Slot4;
	
	@NotEmpty
	@Column
	private String day3Slot1Status;
	
	@NotEmpty
	@Column
	private String day3Slot2Status;
	
	@NotEmpty
	@Column
	private String day3Slot3Status;
	
	@NotEmpty
	@Column
	private String day3Slot4Status;
	
	
	@NotEmpty
	@Column
	private String day4Slot1;
	
	@NotEmpty
	@Column
	private String day4Slot2;
	
	@NotEmpty
	@Column
	private String day4Slot3;
	
	@NotEmpty
	@Column
	private String day4Slot4;
	
	
	@NotEmpty
	@Column
	private String day4Slot1Status;
	
	@NotEmpty
	@Column
	private String day4Slot2Status;
	
	@NotEmpty
	@Column
	private String day4Slot3Status;
	
	@NotEmpty
	@Column
	private String day4Slot4Status;
	
	@NotEmpty
	@Column
	private String day5Slot1;
	
	@NotEmpty
	@Column
	private String day5Slot2;
	
	@NotEmpty
	@Column
	private String day5Slot3;
	
	@NotEmpty
	@Column
	private String day5Slot4;
	
	@NotEmpty
	@Column
	private String day5Slot1Status;
	
	@NotEmpty
	@Column
	private String day5Slot2Status;
	
	@NotEmpty
	@Column
	private String day5Slot3Status;
	
	@NotEmpty
	@Column
	private String day5Slot4Status;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDay1() {
		return day1;
	}
	public void setDay1(String day1) {
		this.day1 = day1;
	}
	public String getDay2() {
		return day2;
	}
	public void setDay2(String day2) {
		this.day2 = day2;
	}
	public String getDay3() {
		return day3;
	}
	public void setDay3(String day3) {
		this.day3 = day3;
	}
	public String getDay4() {
		return day4;
	}
	public void setDay4(String day4) {
		this.day4 = day4;
	}
	public String getDay5() {
		return day5;
	}
	public void setDay5(String day5) {
		this.day5 = day5;
	}
	public String getDay1Slot1() {
		return day1Slot1;
	}
	public void setDay1Slot1(String day1Slot1) {
		this.day1Slot1 = day1Slot1;
	}
	public String getDay1Slot2() {
		return day1Slot2;
	}
	public void setDay1Slot2(String day1Slot2) {
		this.day1Slot2 = day1Slot2;
	}
	public String getDay1Slot3() {
		return day1Slot3;
	}
	public void setDay1Slot3(String day1Slot3) {
		this.day1Slot3 = day1Slot3;
	}
	public String getDay1Slot4() {
		return day1Slot4;
	}
	public void setDay1Slot4(String day1Slot4) {
		this.day1Slot4 = day1Slot4;
	}
	public String getDay1Slot1Status() {
		return day1Slot1Status;
	}
	public void setDay1Slot1Status(String day1Slot1Status) {
		this.day1Slot1Status = day1Slot1Status;
	}
	public String getDay1Slot2Status() {
		return day1Slot2Status;
	}
	public void setDay1Slot2Status(String day1Slot2Status) {
		this.day1Slot2Status = day1Slot2Status;
	}
	public String getDay1Slot3Status() {
		return day1Slot3Status;
	}
	public void setDay1Slot3Status(String day1Slot3Status) {
		this.day1Slot3Status = day1Slot3Status;
	}
	public String getDay1Slot4Status() {
		return day1Slot4Status;
	}
	public void setDay1Slot4Status(String day1Slot4Status) {
		this.day1Slot4Status = day1Slot4Status;
	}
	public String getDay2Slot1() {
		return day2Slot1;
	}
	public void setDay2Slot1(String day2Slot1) {
		this.day2Slot1 = day2Slot1;
	}
	public String getDay2Slot2() {
		return day2Slot2;
	}
	public void setDay2Slot2(String day2Slot2) {
		this.day2Slot2 = day2Slot2;
	}
	public String getDay2Slot3() {
		return day2Slot3;
	}
	public void setDay2Slot3(String day2Slot3) {
		this.day2Slot3 = day2Slot3;
	}
	public String getDay2Slot4() {
		return day2Slot4;
	}
	public void setDay2Slot4(String day2Slot4) {
		this.day2Slot4 = day2Slot4;
	}
	public String getDay2Slot1Status() {
		return day2Slot1Status;
	}
	public void setDay2Slot1Status(String day2Slot1Status) {
		this.day2Slot1Status = day2Slot1Status;
	}
	public String getDay2Slot2Status() {
		return day2Slot2Status;
	}
	public void setDay2Slot2Status(String day2Slot2Status) {
		this.day2Slot2Status = day2Slot2Status;
	}
	public String getDay2Slot3Status() {
		return day2Slot3Status;
	}
	public void setDay2Slot3Status(String day2Slot3Status) {
		this.day2Slot3Status = day2Slot3Status;
	}
	public String getDay2Slot4Status() {
		return day2Slot4Status;
	}
	public void setDay2Slot4Status(String day2Slot4Status) {
		this.day2Slot4Status = day2Slot4Status;
	}
	public String getDay3Slot1() {
		return day3Slot1;
	}
	public void setDay3Slot1(String day3Slot1) {
		this.day3Slot1 = day3Slot1;
	}
	public String getDay3Slot2() {
		return day3Slot2;
	}
	public void setDay3Slot2(String day3Slot2) {
		this.day3Slot2 = day3Slot2;
	}
	public String getDay3Slot3() {
		return day3Slot3;
	}
	public void setDay3Slot3(String day3Slot3) {
		this.day3Slot3 = day3Slot3;
	}
	public String getDay3Slot4() {
		return day3Slot4;
	}
	public void setDay3Slot4(String day3Slot4) {
		this.day3Slot4 = day3Slot4;
	}
	public String getDay3Slot1Status() {
		return day3Slot1Status;
	}
	public void setDay3Slot1Status(String day3Slot1Status) {
		this.day3Slot1Status = day3Slot1Status;
	}
	public String getDay3Slot2Status() {
		return day3Slot2Status;
	}
	public void setDay3Slot2Status(String day3Slot2Status) {
		this.day3Slot2Status = day3Slot2Status;
	}
	public String getDay3Slot3Status() {
		return day3Slot3Status;
	}
	public void setDay3Slot3Status(String day3Slot3Status) {
		this.day3Slot3Status = day3Slot3Status;
	}
	public String getDay3Slot4Status() {
		return day3Slot4Status;
	}
	public void setDay3Slot4Status(String day3Slot4Status) {
		this.day3Slot4Status = day3Slot4Status;
	}
	public String getDay4Slot1() {
		return day4Slot1;
	}
	public void setDay4Slot1(String day4Slot1) {
		this.day4Slot1 = day4Slot1;
	}
	public String getDay4Slot2() {
		return day4Slot2;
	}
	public void setDay4Slot2(String day4Slot2) {
		this.day4Slot2 = day4Slot2;
	}
	public String getDay4Slot3() {
		return day4Slot3;
	}
	public void setDay4Slot3(String day4Slot3) {
		this.day4Slot3 = day4Slot3;
	}
	public String getDay4Slot4() {
		return day4Slot4;
	}
	public void setDay4Slot4(String day4Slot4) {
		this.day4Slot4 = day4Slot4;
	}
	public String getDay4Slot1Status() {
		return day4Slot1Status;
	}
	public void setDay4Slot1Status(String day4Slot1Status) {
		this.day4Slot1Status = day4Slot1Status;
	}
	public String getDay4Slot2Status() {
		return day4Slot2Status;
	}
	public void setDay4Slot2Status(String day4Slot2Status) {
		this.day4Slot2Status = day4Slot2Status;
	}
	public String getDay4Slot3Status() {
		return day4Slot3Status;
	}
	public void setDay4Slot3Status(String day4Slot3Status) {
		this.day4Slot3Status = day4Slot3Status;
	}
	public String getDay4Slot4Status() {
		return day4Slot4Status;
	}
	public void setDay4Slot4Status(String day4Slot4Status) {
		this.day4Slot4Status = day4Slot4Status;
	}
	public String getDay5Slot1() {
		return day5Slot1;
	}
	public void setDay5Slot1(String day5Slot1) {
		this.day5Slot1 = day5Slot1;
	}
	public String getDay5Slot2() {
		return day5Slot2;
	}
	public void setDay5Slot2(String day5Slot2) {
		this.day5Slot2 = day5Slot2;
	}
	public String getDay5Slot3() {
		return day5Slot3;
	}
	public void setDay5Slot3(String day5Slot3) {
		this.day5Slot3 = day5Slot3;
	}
	public String getDay5Slot4() {
		return day5Slot4;
	}
	public void setDay5Slot4(String day5Slot4) {
		this.day5Slot4 = day5Slot4;
	}
	public String getDay5Slot1Status() {
		return day5Slot1Status;
	}
	public void setDay5Slot1Status(String day5Slot1Status) {
		this.day5Slot1Status = day5Slot1Status;
	}
	public String getDay5Slot2Status() {
		return day5Slot2Status;
	}
	public void setDay5Slot2Status(String day5Slot2Status) {
		this.day5Slot2Status = day5Slot2Status;
	}
	public String getDay5Slot3Status() {
		return day5Slot3Status;
	}
	public void setDay5Slot3Status(String day5Slot3Status) {
		this.day5Slot3Status = day5Slot3Status;
	}
	public String getDay5Slot4Status() {
		return day5Slot4Status;
	}
	public void setDay5Slot4Status(String day5Slot4Status) {
		this.day5Slot4Status = day5Slot4Status;
	}
	
	
	
	
}
