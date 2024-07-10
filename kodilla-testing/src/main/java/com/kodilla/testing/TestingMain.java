package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6.Wprowadzenie do testowania oprogramowania");
        String str = "Abrakadabra! EoBuDEiYy";
        System.out.println(znajdzSamogloski(str));
    }

    public static  String znajdzSamogloski(String str){
        String samogloski = "AaEeIiOoUuYy";
        String result = "";
        char[] charArray = str.toCharArray();

        for (int i= 0 ; i < charArray.length; i++){
            if (samogloski.contains((Character.toString(charArray[i])))){
                result += (charArray[i]);
            }
        }
        return result;
    }
}
