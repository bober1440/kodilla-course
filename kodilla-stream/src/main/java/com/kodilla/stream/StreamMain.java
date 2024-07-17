package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

/*        // First Exercise
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a,b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAtoB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        //Second Exercise
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("An Example Text", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("An Example Text", text -> text.toUpperCase());
        poemBeautifier.beautify("An Example Text", text -> text.toLowerCase());
        poemBeautifier.beautify("An Example Text", text -> text.substring(2));

        //Third Exercise
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

/*      People.getlist().stream()
               .map(String::toUpperCase)
               .filter (s -> s.length() > 11)
               .map(s-> s.substring(0,s.indexOf(' ') + 2) + ".")
               .filter(s ->s.substring(0,1).equals("M"))
               .forEach(System.out::println);*/

/*        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book ->book.getYearOfPublication() >2005)
                .collect(Collectors.toList());
        System.out.println("#elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);*/

/*        BookDirectory theBookDirectory = new BookDirectory();
        Map<String,Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() >2005)
                .collect(Collectors.toMap(Book::getSignature, book ->book));

        System.out.println("#elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

/*        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>")) ;

        System.out.println(theResultStringOfBooks);*/

        //Module 7.3 Stream Forum
        Forum forum = new Forum();
        LocalDate twentyYearsAgo = LocalDate.now().minusYears(20);

        Map<Integer, ForumUser> resultMap = forum.getListOfUsers().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getPostQuantity() > 1)
                .filter(user ->user.getBirthdayDate().isBefore(twentyYearsAgo) || user.getBirthdayDate().isEqual(twentyYearsAgo))
                .collect(Collectors.toMap(ForumUser::getId, user ->user));

                resultMap.entrySet().stream()
                        .map(user -> user.getKey() + " " + user.getValue())
                        .forEach(System.out::println);
    }
}
