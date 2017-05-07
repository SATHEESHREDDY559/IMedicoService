package com.ims.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="PatientReport")
public class PatientReport {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@NotEmpty(message="UserName field cannot be empty")
	@Size(min=3,max=20)
	@Column(name="patientUserName")
	private String patientUserName;
	
	//@Past
	@Column(name="joinedDate")
	//@DateTimeFormat(pattern="yyyy-mm-dd")
	private String joinedDate;
	
	//@Future
	@Column(name="dischargeDate")
	//@DateTimeFormat(pattern="yyyy-mm-dd")
	private String dischargeDate;
	
	@Column(name="age")
	private int age;
	
	@Column(name="height")
	private double height;
	
	@Column(name="weight")
	private double weight;
	
	@Column(name="drugs")
	private String drugs;
	
	@Column(name="affect")
	private String affect;
	
	@Column(name="reasons")
	private String reasons;
	
	@Column(name="redCellCount")
	private double redCellCount;
	
	@Column(name="whiteCellCount")
	private double whiteCellCount;
	
	@Column(name="prevStatus")
	private String prevStatus;
	
	@Column(name="currentStatus")
	private String currentStatus;
	
	@Column(name="BPLevels")
	private double BPLevels;
	
	@Column(name="heartRate")
	private int heartRate;
	
	@Column(name="totalDescription")
	private String totalDescription;
	
	@Column(name="finalStatus")
	private String finalStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientUserName() {
		return patientUserName;
	}

	public void setPatientUserName(String patientUserName) {
		this.patientUserName = patientUserName;
	}

	public String getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(String dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDrugs() {
		return drugs;
	}

	public void setDrugs(String drugs) {
		this.drugs = drugs;
	}

	public String getAffect() {
		return affect;
	}

	public void setAffect(String affect) {
		this.affect = affect;
	}

	public String getReasons() {
		return reasons;
	}

	public void setReasons(String reasons) {
		this.reasons = reasons;
	}

	public double getRedCellCount() {
		return redCellCount;
	}

	public void setRedCellCount(double redCellCount) {
		this.redCellCount = redCellCount;
	}

	public double getWhiteCellCount() {
		return whiteCellCount;
	}

	public void setWhiteCellCount(double whiteCellCount) {
		this.whiteCellCount = whiteCellCount;
	}

	public String getPrevStatus() {
		return prevStatus;
	}

	public void setPrevStatus(String prevStatus) {
		this.prevStatus = prevStatus;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public double getBPLevels() {
		return BPLevels;
	}

	public void setBPLevels(double bPLevels) {
		BPLevels = bPLevels;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	public String getTotalDescription() {
		return totalDescription;
	}

	public void setTotalDescription(String totalDescription) {
		this.totalDescription = totalDescription;
	}

	public String getFinalStatus() {
		return finalStatus;
	}

	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	
	
	
}
