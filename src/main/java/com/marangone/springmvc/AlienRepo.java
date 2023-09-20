package com.marangone.springmvc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.marangone.springmvc.model.Alien;

public interface AlienRepo  extends JpaRepository<Alien, Integer>{

	@Query("from Alien where aname= :name")
	List <Alien> findByName(@Param("name") String aname);
	
	//Query DSL de JPA
	/**
	 	List<Alien> findByAname(String aname); // Query DSL Domain specific Language 
		List<Alien> findByAnameOrderByAidDesc(String aname);
	 * */


	
}
