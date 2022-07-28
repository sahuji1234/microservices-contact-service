package com.example.contact.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.contact.entity.ContactEntity;
import com.example.contact.service.ContactServiceImpl;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactServiceImpl contactServiceImpl;
	
	
	@RequestMapping("/user/{userId}")
	public List<ContactEntity> getContacts(@PathVariable("userId") Long userId){
		return this.contactServiceImpl.getContacts(userId);
	}
	
	
	
}
