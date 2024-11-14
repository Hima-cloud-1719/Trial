package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.nt.models.ContactUs;

public interface IContactUsRepository extends JpaRepository<ContactUs, Integer> {

}
