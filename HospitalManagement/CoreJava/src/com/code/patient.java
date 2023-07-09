package com.code;

import java.io.Serializable;
import java.time.LocalDate;

import com.Enum.RoomType;

public class patient implements Serializable {
	private int serialNo;
	private String PatientName;
	private int age;
	private String gender;
	private String address;
	private String PhoneNo;
	private String disese;
	private LocalDate AdmitDate;
	private double annualIncomne;
	private RoomType t;
	
	public patient(int serialNo, String patientName, int age, String gender, String address, String phoneNo,
			String disese, LocalDate admitDate, double annualIncomne, RoomType t) {
		super();
		this.serialNo = serialNo;
		PatientName = patientName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		PhoneNo = phoneNo;
		this.disese = disese;
		AdmitDate = admitDate;
		this.annualIncomne = annualIncomne;
		this.t = t;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getDisese() {
		return disese;
	}
	public void setDisese(String disese) {
		this.disese = disese;
	}
	public LocalDate getAdmitDate() {
		return AdmitDate;
	}
	public void setAdmitDate(LocalDate admitDate) {
		AdmitDate = admitDate;
	}
	public double getAnnualIncomne() {
		return annualIncomne;
	}
	public void setAnnualIncomne(double annualIncomne) {
		this.annualIncomne = annualIncomne;
	}
	public RoomType getT() {
		return t;
	}
	public void setT(RoomType t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "patient [serialNo=" + serialNo + ", PatientName=" + PatientName + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + ", PhoneNo=" + PhoneNo + ", disese=" + disese + ", AdmitDate=" + AdmitDate
				+ ", annualIncomne=" + annualIncomne + ", t=" + t + "]";
	}
	

}
