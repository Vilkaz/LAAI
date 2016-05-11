package controller;

import model.Sudoku;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by vkukanauskas on 29/04/2016.
 */
public class SudokuControllerTest {

    @Test
    public void testGetSudoku(){
        assertTrue(SudokuController.getSudoku().getClass().getSimpleName().equals("Sudoku"));
    }

    @Test
    public void testGetSudokusAmountOfNumbers(){
       Sudoku sudoku = SudokuController.getSudoku();
        assertEquals(sudoku.getHorizontalLines().size(), 9);
        assertEquals(sudoku.getNineFieldCubics().size(), 9);
        assertEquals(sudoku.getVerticalLines().size(), 9);
    }

    @Test
    public void testValidateFewNumbers(){
        Sudoku sudoku = SudokuController.getSudoku();
        assertEquals(sudoku.getVerticalLines().get(2).get(2),
                sudoku.getHorizontalLines().get(2).get(2));
        assertEquals(sudoku.getVerticalLines().get(3).get(3),
                sudoku.getHorizontalLines().get(3).get(3));
        assertEquals(sudoku.getVerticalLines().get(2).get(2),
                sudoku.getNineFieldCubics().get(0).get(8));
    }


    @Test
    public void testGet9UniqueNumbersInRandomOrder(){
        ArrayList<Integer> uniqueNumbers = SudokuController.get9UniqueNumbersInRandomOrder();
        Collections.sort(uniqueNumbers);
        for (int i=1;i<=9;i++){
            assertEquals(i, (int)uniqueNumbers.get(i-1));
        }
    }


}