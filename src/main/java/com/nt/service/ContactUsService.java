package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.models.ContactUs;
import com.nt.repo.IContactUsRepository;

@Service
public class ContactUsService {

	@Autowired
	private IContactUsRepository contactrepo;
	
	public ContactUs saveMessage(ContactUs message) {
		return contactrepo.save(message);
	}
}
