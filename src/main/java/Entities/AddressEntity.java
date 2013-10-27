package Entities;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Address")
public class AddressEntity extends Entity {
	
	@Indexed
	private String Street;
	
	@Indexed
	private String City;
	
	@Indexed
	private String State;
	
	@Indexed
	private String Zip;
	
	public AddressEntity(){ }
	
	public AddressEntity(String Street, String City, String State, String Zip){
		this.Street = Street;
		this.City = City;
		this.State = State;
		this.Zip = Zip;
		_id = ObjectId.get();
	}
	
	public void setStreet(String Street){
		this.Street = Street;
	}
	
	public String getStreet(){
		return Street;
	}
	
	public void setCity(String City){
		this.City = City;
	}
	
	public String getCity(){
		return City;
	}
	
	public void setState(String State){
		this.State = State;
	}
	
	public String getState(){
		return State;
	}
	
	public void setZip(String Zip){
		this.Zip = Zip;
	}
	
	public String getZip(){
		return Zip;
	}
	
	public String toString(){
		return Street + " " + City + " " + State + " " + Zip;
	}

}
