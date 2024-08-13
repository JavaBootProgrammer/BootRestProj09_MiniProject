package com.nt.controller;

import com.nt.model.Tourist;
import com.nt.service.TouristSerive;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Tourist")
public class TouristController {

	@Autowired
	TouristSerive touristSerive;

	@PostMapping("/report")
	public ResponseEntity<String> saveTourists(@RequestBody Tourist tourist) {
		System.out.println("TouristController.saveTourists()");

		try {
			String message = touristSerive.registerTourist(tourist);

			System.out.println(message);
			return new ResponseEntity<String>(message, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<String>("Error ", HttpStatus.BAD_REQUEST);

	}

	@GetMapping("/OK/{id}")
	public ResponseEntity<String> OK(@PathVariable("id") String id) {
		System.out.println("TouristController.OK()" + id);
		return new ResponseEntity<String>("Error ", HttpStatus.OK);

	}

	@PostMapping("/all")
	public ResponseEntity<List<Tourist>> allTourists() {
		System.out.println("TouristController.allTourists()");

		List<Tourist> list = touristSerive.allTourist();

		return new ResponseEntity<List<Tourist>>(list, HttpStatus.OK);

	}

}
