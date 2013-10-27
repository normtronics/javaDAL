package Entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Entity {
	
	@Id 
	protected ObjectId _id;
}
