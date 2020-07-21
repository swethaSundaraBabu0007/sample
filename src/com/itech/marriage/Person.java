package com.itech.marriage;

public class Person {	
	private int personId;
	private String name;
	private int age;
	private String sex;
	public Person(int personId, String name, int age, String sex) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age="
				+ age + ", sex=" + sex + "]";
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
