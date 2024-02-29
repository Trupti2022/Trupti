package com.jpa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

import com.entities.Trupti;
import com.jpa.dao.UserRepository;

@SpringBootApplication
public class SpringBootUsingJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootUsingJpaApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		
	Trupti user=new Trupti();
	
	user.setName("Truptimayee Patel");
	user.setCity("Sundargarh");
	user.setStatus("I am a programer");
	
	Trupti user1=userRepository.save(user);
	System.out.println(user1);
	}

}
