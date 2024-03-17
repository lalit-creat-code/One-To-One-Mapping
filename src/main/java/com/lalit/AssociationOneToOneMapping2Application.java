package com.lalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lalit.service.Service1;

@SpringBootApplication
public class AssociationOneToOneMapping2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(AssociationOneToOneMapping2Application.class, args);
		
		  Service1 service= context.getBean(Service1.class);
		    service.save();
	}

}
