/**
 * 
 */
package com.yg.identity.api;

import java.util.Date;

/**
 * This class represents a person
 * 
 * @author Yves G
 */
public class Person {
	private PersonName personName;
	private Integer age;
	private Date birthdate;
	private String gender;
	private Double height;
	private Double weight;
	
	/**
	 * Default Constructor
	 */
	public Person(){}
	
	/**
	 * Constructor
	 * 
	 * @param pName Person name
	 * @param bDate Birthdate
	 * @param gender Gender
	 */
	public Person(PersonName pName, Date bDate, String gender){
		setPersonName(pName);
		setBirthdate(bDate);
		setGender(gender);
	}
	
	/**
	 * Constructor
	 * 
	 * @param pName Person name
	 * @param bDate Birthdate
	 * @param gender Gender
	 * @param height Height
	 * @param weight Weight
	 */
	public Person(PersonName pName, Date bDate, String gender, Double height, Double weight){
		setPersonName(pName);
		setBirthdate(bDate);
		setGender(gender);
		setHeight(height);
		setWeight(weight);
	}
	
	/**
	 * @return the personName
	 */
	public PersonName getPersonName() {
		return personName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(PersonName personName) {
		this.personName = personName;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the birthdate
	 */
	public Date getBirthdate() {
		return birthdate;
	}
	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}
	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
