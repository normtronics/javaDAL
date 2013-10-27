package Entities;

import org.springframework.data.annotation.*;


public class PersonEntity {
	
	@Id
	private String id;
	
	private String firstName;
	private String lastName;
	
	public PersonEntity(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	public String toString(){
		return firstName + lastName;
	}
}
