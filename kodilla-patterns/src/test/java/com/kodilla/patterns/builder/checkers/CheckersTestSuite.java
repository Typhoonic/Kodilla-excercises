package com.kodilla.patterns.builder.checkers;

import org.junit.jupiter.api.Test;

public class CheckersTestSuite {

    @Test
    void testCheckersBuilder(){

        //Given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("Kamil")
                .PlayerTwo("Dawid")
                .Figure(FigureFactory.PAWN, Figure.WHITE, 0, 3)
                .Figure(FigureFactory.PAWN, Figure.BLACK, 9,7)
                .Figure(FigureFactory.QUEEN, Figure.WHITE, 0,2)
                .build();
        System.out.println(checkers.getBoard());
        //When

        //Then


    }

}
