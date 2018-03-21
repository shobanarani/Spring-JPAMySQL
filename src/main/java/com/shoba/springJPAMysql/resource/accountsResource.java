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
	public List<accounts> getAllAccounts()
	{
		return accRepository.findAll();		
		
	}
	
	@GetMapping("/getallAccounts/{id}")
	public accounts getAccountById(@PathVariable final int id )
	{
		return accRepository.findOne(id);		
		
	}
	
	@PostMapping("/postAccounts")
	public List<accounts> postAccount(@RequestBody final accounts account){
		accRepository.save(account);
		return accRepository.findAll();		
		
	}
		
	@DeleteMapping("/deleteAccounts/{id}")
	public List<accounts> deleteAccountById(@PathVariable final int id){
		accRepository.delete(id);
		return accRepository.findAll();	
		
		
	}
	
	@PutMapping("/modifyAccounts/{id}")
	public List<accounts> update(@RequestBody final accounts account){
		accRepository.save(account);
		return accRepository.findAll();	
		
		
	}
}
