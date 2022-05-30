package com.meli.test.jhanmorales.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Planet {

    private String name;
    private int angularVelocity;
    private int sunDistance;
    private String orientation;

}
