package com.covidproof.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covidproof.model.Entity.Admin;

@Repository
public interface AdminDAO extends JpaRepository<Admin, Integer> {

}