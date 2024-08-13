package com.nt.controller;

import com.nt.model.Tourist;
import com.nt.service.TouristSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Tourist")
public class TouristController {

	@Autowired
	TouristSerive touristSerive;


	@PostMapping("/report/{id}/{name}/{fee}")
	public ResponseEntity<String> saveTourists(@RequestBody Tourist tourist) {

		try{
			String message =touristSerive.registerTourist(tourist);

			System.out.println(message);
			return new ResponseEntity<String>(message, HttpStatus.CREATED);
		}catch (Exception e){
			e.printStackTrace();
		}

		return new ResponseEntity<String>("Error ", HttpStatus.BAD_REQUEST);

	}

}
