package com.example.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.contact.entity.ContactEntity;


@Service
public class ContactServiceImpl implements ContactService {

	List<ContactEntity> list= List.of(
			new ContactEntity(1L, "abc@gmail.com", "abc", 1311L),
			new ContactEntity(2L, "abcd@gmail.com", "abc", 1311L),
			new ContactEntity(3L, "abcde@gmail.com", "abc", 1312L),
			new ContactEntity(4L, "abcfg@gmail.com", "abc", 1312L),
			new ContactEntity(5L, "abchi@gmail.com", "abc", 1312L),
			new ContactEntity(6L, "abcjk@gmail.com", "abc", 1313L),
			new ContactEntity(7L, "abclm@gmail.com", "abc", 1313L),
			new ContactEntity(8L, "abcno@gmail.com", "abc", 1313L)
			
			);
	
	
	@Override
	public List<ContactEntity> getContacts(Long userId) {
		
		return this.list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
