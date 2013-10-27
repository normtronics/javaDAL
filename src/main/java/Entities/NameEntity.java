package Entities;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="name")
public class NameEntity extends Entity{
	
	@Indexed
	private String firstName;
	
	@Indexed
	private String lastName;
	
	@Indexed
	private String displayName;
	
	@Indexed
	private String userName;
	
	public NameEntity(){ }
	
	public NameEntity(String firstName, String lastName, String displayName, String userName){
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.userName = userName;
		_id = ObjectId.get();
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getDisplayName(){
		return displayName;
	}
	
	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String toString(){
		return firstName + " " + lastName;
	}
	
}
