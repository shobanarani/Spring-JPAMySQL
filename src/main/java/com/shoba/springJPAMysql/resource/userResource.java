package com.shoba.springJPAMysql.resource;

import java.util.List;

import com.shoba.springJPAMysql.model.message;
import com.shoba.springJPAMysql.repository.UsersRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping("/rest/messages")
public class userResource {

	
	@Autowired
	UsersRepository usersRepository;
	
	@GetMapping("/getall")
	public List<message> getAll()
	{
		return usersRepository.findAll();		
		
	}
	
	@PostMapping("/postmessage")
	public List<message> persist(@RequestBody final message messages){
		 usersRepository.save(messages);
		return usersRepository.findAll();	
		
		
	}
}
