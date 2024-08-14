package com.nt.restapi.controller;

import com.nt.restapi.model.Person;
import com.nt.restapi.service.PersonServiceImp;

import java.util.List;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonController {

	@Autowired
	PersonServiceImp personServiceImp;

	@PostMapping("/register")
	public ResponseEntity<String> saveRecord(@RequestBody Person person) {
		System.out.println("PersonController.saveRecord()");
		String message = personServiceImp.registerPerson(person);
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PostMapping("/all")
	public ResponseEntity<List<Person>> list() {

		System.out.println("PersonController.list()");
		return new ResponseEntity<List<Person>>(personServiceImp.showAll(), HttpStatus.OK);
	}

	@PostMapping("/{id}")
	public ResponseEntity<Person> getRecordById(@PathVariable Integer id) {
		System.out.println("PersonController.getRecordById()"+id);
		return new ResponseEntity<Person>(personServiceImp.getPersonById(id), HttpStatus.OK);
	}

}
