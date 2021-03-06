package Practice2.entities.concretes;

import Practice2.entities.abstracts.Entity;

public class Customer implements Entity{
	
	private String nationalId;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	public Customer(String nationalId, String firstName, String lastName, String dateOfBirth) {
		super();
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
