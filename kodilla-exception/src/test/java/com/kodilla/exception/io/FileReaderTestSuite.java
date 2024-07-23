package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {
    @Test
    void testFileReader() {
        //Given
        FileReader fileReader = new FileReader();

        //When & Then
        assertDoesNotThrow(() -> fileReader.readFile());
    }

    @Test
    void whenFileDoesntExistsReadFileShouldThrowException() {
        // given
        FileReader fileReader = new FileReader();
        String fileName = "xxxxx.txt";
        //when & then
        assertThrows(FileReaderException.class, () ->fileReader.readFile(fileName));
    }

    @Test
    public void testReadFileWithName(){
        //given
        FileReader fileReader = new FileReader();

        //when&then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("xxxxx")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() ->fileReader.readFile("names.txt"))
        );
    }
}
