package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){

        //Given
        Book harryPotter = new Book("Harry Potter...", "J.K.Rowling", LocalDate.of(1997,6,26));
        Book lordsOfTheRing = new Book("Lords of the ring", "J.R.R.Tolkien", LocalDate.of(1954,7,29));
        Book hobbit = new Book("Hobbit", "J.R.R.Tolkien", LocalDate.of(1937,9,21));

        Library cracow = new Library("Main Cracow Library");
        cracow.getBooks().add(harryPotter);
        cracow.getBooks().add(lordsOfTheRing);
        cracow.getBooks().add(hobbit);

        //When
        Library warsaw = null;
        try{
            warsaw = cracow.shallowCopy();
            warsaw.setName("Main Warsaw Library");
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
        }

        Library katowice = null;
        try{
            katowice = cracow.deepCopy();
            katowice.setName("Main Katowice Library");
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
        }

        cracow.getBooks().remove(hobbit);

        //Then
        System.out.println(cracow);
        System.out.println(warsaw);
        System.out.println(katowice);

        assertEquals(2, cracow.getBooks().size());
        assertEquals(2, warsaw.getBooks().size());
        assertEquals(3, katowice.getBooks().size());

    }

}
