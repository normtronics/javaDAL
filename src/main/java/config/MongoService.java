package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.index.Index;
import org.springframework.data.mongodb.core.index.Index.Duplicates;
import org.springframework.data.mongodb.core.query.Order;

public class MongoService {
	@Autowired private MongoOperations template;
	
	public void createCollection(final String name ){
		template.createCollection(name);
	}
	
	public void dropCollection(final String name){
		template.dropCollection(name);
	}
	
	public void insert(final Object object, final String collection){
		template.insert(object, collection);
	}
	
	public void createIndex(final String name, final String collection){
		//template.ensureIndex(new Index().on(name, Order.DESCENDING).unique(Duplicates.DROP), collection);
	}

}
