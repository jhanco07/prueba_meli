package com.meli.test.jhanmorales;

import com.meli.test.jhanmorales.business.Displacement;

import com.meli.test.jhanmorales.dto.Planet;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DisplacementTest {

    @Autowired
    private Displacement prediction;

    private static Planet ferengi;
    private static Planet betasoid;
    private static Planet vulcan ;

    @BeforeAll
    public static void setup(){

        ferengi = new Planet();
        ferengi.setName("ferengi");
        ferengi.setOrientation("h");
        ferengi.setAngularVelocity(1);
        ferengi.setSunDistance(500);

        betasoid = new Planet();
        betasoid.setName("betasoide");
        betasoid.setOrientation("h");
        betasoid.setAngularVelocity(3);
        betasoid.setSunDistance(2000);

        vulcan = new Planet();
        vulcan.setName("vulcano");
        vulcan.setOrientation("ah");
        vulcan.setAngularVelocity(5);
        vulcan.setSunDistance(1000);

    }

    @Test
    public void rainySeason(){
        //assertEquals(0, prediction.rainySeason(vulcan));
    }


    @Test
    public void test_calculateYearPlanet(){

        assertEquals(360, prediction.calculateYearPlanet(ferengi));

        assertEquals(120, prediction.calculateYearPlanet(betasoid));

        assertEquals(72, prediction.calculateYearPlanet(vulcan));

    }

}
