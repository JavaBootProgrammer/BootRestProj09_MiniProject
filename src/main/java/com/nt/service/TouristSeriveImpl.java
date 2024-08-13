package com.nt.service;

import com.nt.model.Tourist;
import com.nt.repository.iTouristRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TouristSeriveImpl implements TouristSerive {

	@Autowired
	iTouristRepo repo;
	
	@Override
	public String registerTourist(Tourist tourist) {
		repo.save(tourist);
		return "Tourist registered successfully";
	}

	@Override
	public List<Tourist> allTourist() {
		
		return repo.findAll();
	}

   

}
