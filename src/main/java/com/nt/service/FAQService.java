package com.nt.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.models.FAQpage;
import com.nt.repo.IFAQRepository;

@Service
public class FAQService {
	@Autowired
	private IFAQRepository FAQRepo;
	
	public List<FAQpage> getAllFAQ(){
		return FAQRepo.findAll();
		 
	}
	public FAQpage saveFaQpage(FAQpage faq) {
		return FAQRepo.save(faq);
	}
}
