package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.LibraryABook;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.LibraryBBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<LibraryABook> libraryABookSet) {
        Map<BookSignature, LibraryBBook> bookMap = new HashMap<>();
        for (LibraryABook libraryABook : libraryABookSet) {
            bookMap.put(
                    new BookSignature(libraryABook.getSignature()),
                    new LibraryBBook(
                            libraryABook.getAuthor(),
                            libraryABook.getTitle(),
                            libraryABook.getPublicationYear()
                    )
            );
        }
        return medianPublicationYear(bookMap);
    }
}


