package com.nt.service;

import com.nt.model.Tourist;
import com.nt.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TouristSeriveImpl implements TouristSerive {

    @Autowired
    TouristRepository touristRepository;

    @Override
    public String registerTourist(Tourist tourist) {
       return touristRepository.save(tourist).getTouristId()+"";
    }

}
