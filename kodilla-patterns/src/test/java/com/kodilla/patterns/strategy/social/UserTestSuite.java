package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){

        //Given
        User kamil = new Millenials("Kamil");
        User mateusz = new YGeneration("Mateusz");
        User andrzej = new ZGeneration("Andrzej");
        //When
        System.out.println(kamil.sharePost());
        System.out.println(mateusz.sharePost());
        System.out.println(andrzej.sharePost());
        //Then
        assertEquals("Kamil share post on: Facebook", kamil.sharePost());
        assertEquals("Mateusz share post on: Twitter", mateusz.sharePost());
        assertEquals("Andrzej share post on: Snapchat", andrzej.sharePost());

    }

    @Test
    void testIndividualSharingStrategy(){

        //Given
        User kamil = new Millenials("Kamil");
        //When
        System.out.println(kamil.sharePost());
        kamil.setSocialPublisher(new TwitterPublisher());
        System.out.println(kamil.sharePost());
        //Then
        assertEquals("Kamil share post on: Twitter", kamil.sharePost());

    }

}
