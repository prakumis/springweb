/**
 * 
 */
package edu.springweb.entity;

import javax.validation.constraints.Size;


/**
 * @author Praveen
 *
 */
public class Employee {

	private Long id;
	@Size(min=3,max=8)
	private String firstName;

	@Size(min=3, message="Last Name must be min of 3 char long")
	private String lastName;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: "+this.id+" name: "+this.firstName+" "+this.lastName;
	}
}
