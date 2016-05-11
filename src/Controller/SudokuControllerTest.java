package Controller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vkukanauskas on 29/04/2016.
 */
public class SudokuControllerTest {

    @Test
    public void testGetSudoku(){
        assertTrue(SudokuController.getSudoku().getClass().getSimpleName().equals("Sudoku"));
    }

}