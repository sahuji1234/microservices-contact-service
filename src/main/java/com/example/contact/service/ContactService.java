package com.example.contact.service;

import java.util.List;

import com.example.contact.entity.ContactEntity;

public interface ContactService {

	public List<ContactEntity> getContacts(Long userId);
	
}
