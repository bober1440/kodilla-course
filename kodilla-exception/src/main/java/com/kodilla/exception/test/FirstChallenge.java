package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide (double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("You can't divide by zero" );
        }
        return a / b;
    }

    /*This main can throw an ArithmeticException!!!
    @param args*/

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;
        try{
            result = firstChallenge.divide(3.0,0.0);
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Remember ! Never divide by zero");
        }


        FirstChallenge firstChallenge2 = new FirstChallenge();
        double result2 = firstChallenge2.divide(3.0,1.0);
        try {
            result2 = firstChallenge2.divide(3.0,1.0);
            System.out.println(result2);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Remember ! Never divide by zero");
        }
    }
}
