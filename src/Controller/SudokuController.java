package Controller;

import Model.Sudoku;

import java.util.ArrayList;

/**
 * Created by vkukanauskas on 29/04/2016.
 */
public class SudokuController {
    public static Sudoku getSudoku() {

        return new Sudoku();
    }

    /**  gives all numbers from 1 to 9 in random order*/
    private static ArrayList<Integer> getCandidates() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (result.size() < 9) {
            int tempo = (int) (Math.random() * 9) + 1;
            if (!result.contains(tempo)) {
                result.add(tempo);
            }
        }
        return result;
    }
}
