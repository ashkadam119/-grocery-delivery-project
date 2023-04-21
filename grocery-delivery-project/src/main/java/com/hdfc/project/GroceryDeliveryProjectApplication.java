package com.hdfc.project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.JpaMetamodelMappingContextFactoryBean;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;



@SpringBootApplication( )
public class GroceryDeliveryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryDeliveryProjectApplication.class, args);
	}
	

	
	


}
