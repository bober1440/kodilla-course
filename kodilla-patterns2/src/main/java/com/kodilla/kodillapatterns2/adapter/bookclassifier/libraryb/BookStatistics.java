package com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, LibraryBBook> books);
    int medianPublicationYear(Map<BookSignature, LibraryBBook> books);
}
