package com.shoba.springJPAMysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shoba.springJPAMysql.model.accounts;
@Repository
public interface accountsRepository extends JpaRepository<accounts,Integer>{
	
	
	
	accounts findById(int id);
}
