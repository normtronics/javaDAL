package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "Blue";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient("127.0.0.1");
	}

	
}

@Configuration
class MonogoConfig2{
	
	public @Bean
	MongoDbFactory monogoDbFactory() throws Exception{
		return new SimpleMongoDbFactory(new MongoClient(), "blue");
	} 
	
	public @Bean
	MongoTemplate mongoTemplate() throws Exception{
		return new  MongoTemplate(monogoDbFactory());
	}
	
	
}
