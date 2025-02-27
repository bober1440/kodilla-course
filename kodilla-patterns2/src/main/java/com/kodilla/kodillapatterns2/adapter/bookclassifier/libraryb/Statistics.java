package com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb;

import java.util.Arrays;
import java.util.Map;

public class Statistics implements BookStatistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, LibraryBBook> books) {
        if (books.size() == 0) return 0;
        int sum = 0;
        for (Map.Entry<BookSignature, LibraryBBook> entry : books.entrySet()) {
            sum += entry.getValue().getYearOfPublication();
        }
        return sum / books.size();
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, LibraryBBook> books) {
        if (books.size() == 0) return 0;
        int[] years = new int[books.size()];
        int n = 0;
        for (Map.Entry<BookSignature, LibraryBBook> entry : books.entrySet()) {
            years[n] = entry.getValue().getYearOfPublication();
            n++;
        }
        Arrays.sort(years);
        return years[years.length / 2];
    }
}


