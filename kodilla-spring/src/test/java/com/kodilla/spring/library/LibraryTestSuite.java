package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    private Library library;

    @Test
    void testSaveToDb(){

        //Given
        //When
        library.saveToDb();
        //Then

    }

    @Test
    void testLoadToDb(){

        //Given
        //When
        library.loadToDb();
        //Then

    }

}
