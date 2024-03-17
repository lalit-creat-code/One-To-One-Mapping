package com.lalit.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.lalit.entity.Passport;
import com.lalit.entity.Persons;
import com.lalit.repo.PassportRepo;
import com.lalit.repo.Personrepo;

@Service
public class Service1 {
	@Autowired
	private Personrepo prepo;
	@Autowired
	private PassportRepo passrepo;
	

	public void  save() {
	 Persons p1=new Persons();
	 p1.setName("Lalit");
	
	
	 
	
	 Passport p3=new Passport();
	   p3.setPassportNo("12345");
	   
	   p1.setPassport(p3);
	   p3.setPerson(p1);;
	   prepo.save(p1);
	  
	    
	}
	 
     
     

}

