package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
  /*      FileReader fileReader = new FileReader();
        fileReader.readFile();*/

     FileReader fileReader = new FileReader();
        try{
            fileReader.readFile("plik.text");
        } catch (FileReaderException e){
            System.out.println("Problem reading file");
        }
    }
}
