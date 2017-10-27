package com.sbi.human.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sbi.human.entity.HHPersonalDetailsEntity;
import com.sbi.human.service.IHHPersonalDetailsService;

@RestController
@RequestMapping("hhpersondetails")
public class HHPersonalDetailsController {
	
	@Autowired
	private IHHPersonalDetailsService service;
	
	@RequestMapping(value="/{id}" , method=RequestMethod.GET)
	public ResponseEntity<ABC> getInfoById(@PathVariable("id") Integer id)
	{
		
		RestTemplate template = new RestTemplate();
		ResponseEntity<ABC> response1= template.getForEntity("http://localhost:8888/StudentPojo/1", ABC.class);
	    ABC abc = response1.getBody();
	    abc.setName("basha");
		HHPersonalDetailsEntity data = service.getInfoById(id);
		ResponseEntity<ABC> response = new ResponseEntity<>(abc,HttpStatus.OK);
		return response;
	}

}
