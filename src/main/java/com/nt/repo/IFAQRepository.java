package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nt.models.FAQpage;

public interface IFAQRepository extends JpaRepository<FAQpage, Integer> {

}
