import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import Entities.*;
import config.MongoConfig;


public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		
		PersonEntity person = new PersonEntity("Chris", "Norman");
		
		mongoOperation.save(person);
		
		AddressEntity address = new AddressEntity("13 New Castle Lane", "Willingboro", "NJ", "08046");
		NameEntity name = new NameEntity("Christopher", "Norman", "Chris", "soldiercnorm");
		
		UserEntity user = new UserEntity(name, address, "cpn9025@rit.edu", "pernell1");
		
		mongoOperation.save(user);
		
		/*System.out.println("------------------------");
		String[] temp = ctx.getBeanDefinitionNames();
		for(int i = 0; i < ctx.getBeanDefinitionCount(); i++){
			System.out.println(temp[i]);
		}*/

	}

}
