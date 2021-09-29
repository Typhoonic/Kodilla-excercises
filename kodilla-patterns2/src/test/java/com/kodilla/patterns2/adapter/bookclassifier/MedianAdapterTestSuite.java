package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.MedianAdapter;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //Given
        Set<BookA> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        BookA harry1 = new BookA("J.K.Rowling", "Harry Potter i Kamień Filozoficzny", 1997, "1");
        BookA harry2 = new BookA("J.K.Rowling", "Harry Potter i Insygnia Smierci", 2007, "2");
        BookA harry3 = new BookA("J.K.Rowling", "Harry Potter i Komnata Tajemnic", 1998, "3");
        bookSet.add(harry1);
        bookSet.add(harry2);
        bookSet.add(harry3);
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1998, median);
    }
}
