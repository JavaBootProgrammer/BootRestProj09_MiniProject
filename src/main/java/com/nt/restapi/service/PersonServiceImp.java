package com.nt.restapi.service;

import com.nt.restapi.model.Person;
import com.nt.restapi.repository.PersonRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService{


    @Autowired
    PersonRepository personRepository;
    @Override
    public String registerPerson(Person person) {
        System.out.println(person.toString());
        
        
        return personRepository.save(person).getId()+" created";
    }
    
	@Override
	public List<Person> showAll() {
		
		return personRepository.findAll();
	}

    @Override
    public Person getPersonById(Integer id) {
        return personRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("imvalid ")) ;
    }
}
