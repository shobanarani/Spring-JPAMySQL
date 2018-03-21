package com.shoba.springJPAMysql.resource;

import java.util.List;

import com.shoba.springJPAMysql.model.accounts;
import com.shoba.springJPAMysql.repository.accountsRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping("/accounts")
public class accountsResource {

	
	@Autowired
	accountsRepository accRepository;
	
	@GetMapping("/getallAccounts")
	public List<accounts> getAll()
	{
		return accRepository.findAll();		
		
	}
	
	@GetMapping("/getallAccounts/{id}")
	public accounts getId(@PathVariable final int id )
	{
		return accRepository.findById(id);		
		
	}
	
	@PostMapping("/postaaccounts")
	public List<accounts> persist(@RequestBody final accounts account){
		accRepository.save(account);
		return accRepository.findAll();	
		
		
	}
}
