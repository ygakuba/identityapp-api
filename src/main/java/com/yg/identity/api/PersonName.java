/**
 * 
 */
package com.yg.identity.api;

/**
 * This class represents person's names
 * 
 * @author Yves G
 */
public class PersonName {
	private String title;
	private String firstname;
	private String lastname;
	private String middlename;
	private String familyname;
	
	/**
	 * Default constructor
	 */
	public PersonName(){}
	
	/**
	 * Constructor
	 * @param fName First name
	 * @param lName Last name
	 */
	public PersonName(String fName, String lName){
		setFirstname(fName);
		setLastname(lName);
	}
	
	/**
	 * Constructor
	 * @param title Title
	 * @param fName First name
	 * @param lName Last name
	 * @param mName Middle name
	 * @param fmlName Family name
	 */
	public PersonName(String title, String fName, String lName, String mName, String fmlName){
		setTitle(title);
		setFirstname(fName);
		setLastname(lName);
		setMiddlename(mName);
		setFamilyname(fmlName);
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the middlename
	 */
	public String getMiddlename() {
		return middlename;
	}
	/**
	 * @param middlename the middlename to set
	 */
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	/**
	 * @return the familyname
	 */
	public String getFamilyname() {
		return familyname;
	}
	/**
	 * @param familyname the familyname to set
	 */
	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}
	
	@Override
	public String toString() {
		return getTitle()
				+ " " + getFirstname()
				+ " " + getLastname()
				+ " " + getMiddlename()
				+ " " + getFamilyname();
	}
}
