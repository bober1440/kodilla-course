package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.LibraryBBook;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.BookStatistics;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    private final Statistics statistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, LibraryBBook> books) {
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, LibraryBBook> books) {
        return statistics.medianPublicationYear(books);
    }
}