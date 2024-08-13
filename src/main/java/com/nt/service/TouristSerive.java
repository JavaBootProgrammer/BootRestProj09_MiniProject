package com.nt.service;

import java.util.List;

import com.nt.model.Tourist;

public interface TouristSerive {

   public String registerTourist(Tourist tourist);
   
   public List<Tourist> allTourist();
}
