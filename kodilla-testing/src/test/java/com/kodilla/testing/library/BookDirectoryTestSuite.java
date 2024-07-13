package com.kodilla.testing.library;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@Nested
@DisplayName("Main Tests")
public class BookDirectoryTestSuite {

    @BeforeAll
    public static void init() {
        System.out.println("Test suite : begin");
    }
    @AfterAll
    public static void finish() {
        System.out.println("Test suite : end");
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBookWithConditionReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBookWithConditionMoreThan20() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);

        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @ExtendWith(MockitoExtension.class)
    @Nested
    @DisplayName("Additional Tests")
    public class AdditionalTestsSuite {

        @Test
        void testList0BooksInHandsOf() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Mateusz", "Bobrowicz", "442000088");
            //When
            List<Book> ZeroBooksInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser);
            //Then
            assertEquals(0, ZeroBooksInHandsOf.size());
        }

        @Test
        void testList1BooksInHandsOf() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Mateusz", "Bobrowicz", "442000088");
            List<Book> ResultOneBooksInHandsOf = generateListOfNBooks(1);
            when(libraryDatabaseMock.listBookInHandsOf(libraryUser)).thenReturn(ResultOneBooksInHandsOf);
            //When
            List<Book> OneBooksInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser);
            //Then
            assertEquals(1, OneBooksInHandsOf.size());
        }

        @Test
        void testList5BooksInHandsOf() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Mateusz", "Bobrowicz", "442000088");
            List<Book> ResultFiveBooksInHandsOf = generateListOfNBooks(5);
            when(libraryDatabaseMock.listBookInHandsOf(libraryUser)).thenReturn(ResultFiveBooksInHandsOf);
            //When
            List<Book> FiveBooksInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser);
            //Then
            assertEquals(5, FiveBooksInHandsOf.size());
        }
    }
}

