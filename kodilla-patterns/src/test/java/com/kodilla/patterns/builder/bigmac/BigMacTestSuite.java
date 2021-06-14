package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {

    @Test
    void testBigMacBuilder(){

        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("SESAME")
                .burgers(2)
                .sauce("BARBECUE")
                .ingredients("ONION")
                .ingredients("MUSHROOMS")
                .ingredients("PRAWNS")
                .build();
        System.out.println(bigMac);
        //When && Then
        assertEquals(3, bigMac.getIngredients().size());
        assertEquals("SESAME", bigMac.getBun());
        assertEquals(2, bigMac.getBurgers());

    }

}
