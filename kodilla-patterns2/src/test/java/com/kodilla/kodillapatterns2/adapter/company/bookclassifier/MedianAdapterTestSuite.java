package com.kodilla.kodillapatterns2.adapter.company.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.LibraryABook;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Set<LibraryABook> books = new HashSet<>();
        books.add(new LibraryABook("Author A", "Title A", 2000, "A1"));
        books.add(new LibraryABook("Author B", "Title B", 1990, "B1"));
        books.add(new LibraryABook("Author C", "Title C", 2010, "C1"));
        books.add(new LibraryABook("Author D", "Title D", 1980, "D1"));
        books.add(new LibraryABook("Author E", "Title E", 2020, "E1"));

        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int medianYear = medianAdapter.publicationYearMedian(books);

        // Then
        assertEquals(2000, medianYear);
    }
    @Test
    public void emptySetMedianTest() {
        // Given
        Set<LibraryABook> books = new HashSet<>();

        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int medianYear = medianAdapter.publicationYearMedian(books);

        // Then
        assertEquals(0, medianYear);
    }

    @Test
    public void singleBookMedianTest() {
        // Given
        Set<LibraryABook> books = new HashSet<>();
        books.add(new LibraryABook("Author A", "Title A", 2005, "A1"));

        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int medianYear = medianAdapter.publicationYearMedian(books);

        // Then
        assertEquals(2005, medianYear);
    }

    @Test
    public void multipleBooksWithSameYearTest() {
        // Given
        Set<LibraryABook> books = new HashSet<>();
        books.add(new LibraryABook("Author A", "Title A", 2000, "A1"));
        books.add(new LibraryABook("Author B", "Title B", 2000, "B1"));
        books.add(new LibraryABook("Author C", "Title C", 2000, "C1"));

        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int medianYear = medianAdapter.publicationYearMedian(books);

        // Then
        assertEquals(2000, medianYear);
    }
}
