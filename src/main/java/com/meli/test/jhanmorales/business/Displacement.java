package com.meli.test.jhanmorales.business;

import com.meli.test.jhanmorales.dto.Planet;
import org.springframework.stereotype.Service;

@Service
public class Displacement {

    public static int TOTAL_DAYS=360;
    public static int TOTAL_YEARS=10;

    public int rainySeason(String pl, Planet... planet){
        return 0;

    }


    public int calculateYearPlanet(Planet planet){
        return TOTAL_DAYS / planet.getAngularVelocity();
    }



}
