package com.marangone.springmvc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marangone.springmvc.model.Alien;

public interface AlienRepo  extends JpaRepository<Alien, Integer>{

	
}
