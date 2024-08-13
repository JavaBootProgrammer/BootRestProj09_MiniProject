package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Tourist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer touristId;
    private String touristName;
    private String packageType;
    private String startLocation;
    private String endLocation;


}
