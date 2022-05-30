package com.meli.test.jhanmorales;

import com.meli.test.jhanmorales.dto.Planet;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PlanetTest {



    @Test
    public  void test_PlanetisVulcan(){
        Planet vulcan = new Planet();
        vulcan.setName("vulcan");
        vulcan.setOrientation("ah");
        vulcan.setAngularVelocity(3);
        vulcan.setSunDistance(1000);

        assertEquals( "vulcan", vulcan.getName() );
    }

}
