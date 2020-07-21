package com.itech.marriage;

public class Applicant extends Person {
	private int applicantId;
	private Person partner;
	public Applicant(int personId, String name, int age, String sex,
			int applicantId, Person partner) {
		super(personId, name, age, sex);
		this.applicantId = applicantId;
		this.partner = partner;
	}
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", partner=" + partner
				+ "]";
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	public Person getPartner() {
		return partner;
	}
	public void setPartner(Person partner) {
		this.partner = partner;
	}
	
	
}
