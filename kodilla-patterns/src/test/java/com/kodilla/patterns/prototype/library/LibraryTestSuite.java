package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        //Given
        Book book1 = new Book("Title1", "Author1", LocalDate.of(2000, 1, 1));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(2001, 2, 2));
        Book book3 = new Book("Title3", "Author3", LocalDate.of(2002, 3, 3));

        Library library = new Library("My Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.name = "Shallow Cloned Library";
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.name = "Deep Cloned Library";
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //When&Then
        assertEquals(3, library.getBooks().size());
        assertEquals(3, shallowClonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());

        library.getBooks().add(new Book("Title4", "Author4", LocalDate.of(2003, 4, 4)));

        assertEquals(4, library.getBooks().size());
        assertEquals(4, shallowClonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}


