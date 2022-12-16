package com.covidproof.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.covidproof.model.Entity.CurrentSession;

@Repository
public interface CurrentSessionDAO extends JpaRepository<CurrentSession,Integer> {
	
	public CurrentSession findByUuid(String uuid);
}