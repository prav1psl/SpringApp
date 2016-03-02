package com.trinet.dto;

import java.io.Serializable;
import java.util.Date;

public class EmployeeDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7167787155538840341L;
	private String firstName;
	private String lastName;
	private String middleName;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String country;
    private String email;
    private int mobile;
    private Date dob;
	
	public EmployeeDTO(){
		
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDTO other = (EmployeeDTO) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", gender=" + gender + ", address=" + address + ", city=" + city + ", state=" + state + ", country="
				+ country + ", email=" + email + ", mobile=" + mobile + ", dob=" + dob + "]";
	}

	
}
