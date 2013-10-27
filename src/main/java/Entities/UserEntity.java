package Entities;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class UserEntity extends Entity {
	
	@Indexed
	private NameEntity name;
	
	@Indexed
	private AddressEntity address;
	
	@Indexed
	private String email;
	
	@Indexed
	private String password;
	//private Profile profile;
	//private Setting settings;
	//private Friends friends;
	
	
	
	public UserEntity(){ }
	
	public UserEntity(NameEntity name, AddressEntity address, String email, String password){ 
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
		_id = ObjectId.get();
	}
	
	

}
