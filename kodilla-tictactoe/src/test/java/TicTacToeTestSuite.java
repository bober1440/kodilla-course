package com.kodilla;

import org.junit.jupiter.api.*;

public class TicTacToeTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEachTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("\"O\" win tests")
    class OWinTests {

        @Test
        void testOWinsInRow0() throws Exception {
            //Given
            char[][] theBoard = {{'O','O','O'},
                    {' ',' ',' '},
                    {' ',' ',' '}};

            //When
            boolean ORow0Win = GameController.checkRows(theBoard,'O');

            //Then
            Assertions.assertTrue(ORow0Win);
        }

        @Test
        void testOWinsInRow1() throws Exception {
            //Given
            char[][] theBoard = {{' ',' ',' '},
                    {'O','O','O'},
                    {' ',' ',' '}};

            //When
            boolean ORow1Win = GameController.checkRows(theBoard,'O');

            //Then
            Assertions.assertTrue(ORow1Win);
        }

        @Test
        void testOWinsInRow2() throws Exception {
            //Given
            char[][] theBoard = {{' ',' ',' '},
                    {' ',' ',' '},
                    {'O','O','O'}};

            //When
            boolean ORow2Win = GameController.checkRows(theBoard,'O');

            //Then
            Assertions.assertTrue(ORow2Win);
        }

        @Test
        void testOWinsInColumn0() throws Exception {
            //Given
            char[][] theBoard = {{'O',' ',' '},
                    {'O',' ',' '},
                    {'O',' ',' '}};

            //When
            boolean OColumn0Win = GameController.checkColumns(theBoard,'O');

            //Then
            Assertions.assertTrue(OColumn0Win);
        }

        @Test
        void testOWinsInColumn1() throws Exception {
            //Given
            char[][] theBoard = {{' ','O',' '},
                    {' ','O',' '},
                    {' ','O',' '}};

            //When
            boolean OColumn1Win = GameController.checkColumns(theBoard,'O');

            //Then
            Assertions.assertTrue(OColumn1Win);
        }
        @Test
        void testOWinsInColumn2() throws Exception {
            //Given
            char[][] theBoard = {{' ',' ','O'},
                    {' ',' ','O'},
                    {' ',' ','O'}};

            //When
            boolean OColumn2Win = GameController.checkColumns(theBoard,'O');

            //Then
            Assertions.assertTrue(OColumn2Win);
        }

        @Test
        void testOWinsInSlopeFromRightToLeft() throws Exception {
            //Given
            char[][] theBoard = {{' ',' ','O'},
                    {' ','O',' '},
                    {'O',' ',' '}};

            //When
            boolean OWinSlopeFromRightToLeft = GameController.checkTheDiagonalFromRightToLeft(theBoard,'O');

            //Then
            Assertions.assertTrue(OWinSlopeFromRightToLeft);
        }

        @Test
        void testOWinsInSlopeFromLeftToRight() throws Exception {
            //Given
            char[][] theBoard = {{'O',' ',' '},
                    {' ','O',' '},
                    {' ',' ','O'}};

            //When
            boolean OWinSlopeFromLeftToRight = GameController.checkTheDiagonalFromLeftToRight(theBoard,'O');

            //Then
            Assertions.assertTrue(OWinSlopeFromLeftToRight);
        }
    }

    @Nested
    @DisplayName("\"X\" win tests")
    class XWinTests {

        @Test
        void testXWinsInRow0() throws Exception {
            //Given
            char[][] theBoard = {{'X','X','X'},
                    {' ',' ',' '},
                    {' ',' ',' '}};

            //When
            boolean XRow0Win = GameController.checkRows(theBoard,'X');

            //Then
            Assertions.assertTrue(XRow0Win);
        }

        @Test
        void testXWinsInRow1() throws Exception {
            //Given
            char[][] theBoard = {{' ',' ',' '},
                    {'X','X','X'},
                    {' ',' ',' '}};

            //When
            boolean XRow1Win = GameController.checkRows(theBoard,'X');

            //Then
            Assertions.assertTrue(XRow1Win);
        }

        @Test
        void testXWinsInRow2() throws Exception {
            //Given
            char[][] theBoard = {{' ',' ',' '},
                    {' ',' ',' '},
                    {'X','X','X'}};

            //When
            boolean XRow2Win = GameController.checkRows(theBoard,'X');

            //Then
            Assertions.assertTrue(XRow2Win);
        }

        @Test
        void testXWinsInColumn0() throws Exception {
            //Given
            char[][] theBoard = {{'X',' ',' '},
                    {'X',' ',' '},
                    {'X',' ',' '}};

            //When
            boolean XColumn0Win = GameController.checkColumns(theBoard,'X');

            //Then
            Assertions.assertTrue(XColumn0Win);
        }

        @Test
        void testXWinsInColumn1() throws Exception {
            //Given
            char[][] theBoard = {{' ','X',' '},
                    {' ','X',' '},
                    {' ','X',' '}};

            //When
            boolean XColumn1Win = GameController.checkColumns(theBoard,'X');

            //Then
            Assertions.assertTrue(XColumn1Win);
        }
        @Test
        void testXWinsInColumn2() throws Exception {
            //Given
            char[][] theBoard = {{' ',' ','X'},
                    {' ',' ','X'},
                    {' ',' ','X'}};

            //When
            boolean XColumn2Win = GameController.checkColumns(theBoard,'X');

            //Then
            Assertions.assertTrue(XColumn2Win);
        }

        @Test
        void testXWinsInSlopeFromRightToLeft() throws Exception {
            //Given
            char[][] theBoard = {{' ',' ','X'},
                    {' ','X',' '},
                    {'X',' ',' '}};

            //When
            boolean XWinSlopeFromRightToLeft = GameController.checkTheDiagonalFromRightToLeft(theBoard,'X');

            //Then
            Assertions.assertTrue(XWinSlopeFromRightToLeft);
        }

        @Test
        void testXWinsInSlopeFromLeftToRight() throws Exception {
            //Given
            char[][] theBoard = {{'X',' ',' '},
                    {' ','X',' '},
                    {' ',' ','X'}};

            //When
            boolean XWinSlopeFromLeftToRight = GameController.checkTheDiagonalFromLeftToRight(theBoard,'X');

            //Then
            Assertions.assertTrue(XWinSlopeFromLeftToRight);
        }

    }

    @Nested
    @DisplayName("Tie tests")
    class TieTests {
        @Test
        void testTieExample1(){
            //Given
            char[][] theBoard = {{'X','X','O'},
                    {'O','X','X'},
                    {'X','O','O'}};
            int counter = 0;
            for (int i = 0; i < theBoard.length; i ++) {
                for (int j = 0; j < theBoard.length; j++)
                    if (theBoard[i][j] != ' ')
                        counter++;
            }

            //When
            boolean thereIsATie = GameController.verifyTie(theBoard, counter);

            //Then
            Assertions.assertTrue(thereIsATie);
        }

        @Test
        void testTieExample2(){
            //Given
            char[][] theBoard = {{'X','O','O'},
                    {'O','X','X'},
                    {'X','O','O'}};
            int counter = 0;
            for (int i = 0; i < theBoard.length; i ++) {
                for (int j = 0; j < theBoard.length; j++)
                    if (theBoard[i][j] != ' ')
                        counter++;
            }

            //When
            boolean thereIsATie = GameController.verifyTie(theBoard, counter);

            //Then
            Assertions.assertTrue(thereIsATie);
        }
    }

    @Nested
    @DisplayName("Exception tests")
    class ExceptionTests {
        @Test
        void testMoveOnTakenPlaceException() {
            //Given
            char[][] theBoard = {{'X',' ',' '},
                    {' ',' ',' '},
                    {' ',' ',' '}};
            //When&Then
            Assertions.assertAll(
                    () -> Assertions.assertThrows(MoveOnTakenPlaceException.class, ()-> GameController.verifyTheCorrectMove(theBoard,0,0)),
                    () -> Assertions.assertThrows(MoveOffTheBoardException.class, ()-> GameController.verifyTheCorrectMove(theBoard,0,3)));

        }
    }
}
