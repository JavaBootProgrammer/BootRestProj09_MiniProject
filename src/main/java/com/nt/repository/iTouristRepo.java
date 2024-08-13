package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Tourist;

public interface iTouristRepo extends JpaRepository<Tourist, Integer> {

}
