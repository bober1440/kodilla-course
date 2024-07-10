package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6.Wprowadzenie do testowania oprogramowania");

        //An Example from the module 6.2
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }
        //First unit test - Calculator

        System.out.println("\nFirst unit test - Calculator");
        Calculator calculator = new Calculator();
        calculator.add(2, 2);
        calculator.subtract(5, 4);

        if (calculator.add(2, 2) == 2 + 2) {
            System.out.println("Test OK");
        }  else {
            System.out.println("Error!");
        }

        if (calculator.subtract(5, 4) == 5-4) {
            System.out.println("Test OK");
        } else{
            System.out.println("Error!");
        }
    }
}
