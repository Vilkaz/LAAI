package controller;

import model.Sudoku;

import java.util.ArrayList;

/**
 * Created by vkukanauskas on 29/04/2016.
 */
public class SudokuController {

    private static Sudoku sudoku;

    /**
     * gives a valid Sudoku
     * @return
     */
    public static Sudoku getSudoku() {

        int numberCounter;
        do {
            numberCounter = 0;
            SudokuController.sudoku = new Sudoku();
            initial:
            for (int row = 0; row < 9; row++) {
                for (int collumn = 0; collumn < 9; collumn++) {
                    int trys = 0;
                    for (int number : get9UniqueNumbersInRandomOrder()) {
                        if (isUnique(row, collumn, number)) {
                            addNumberToGrid(row, collumn, number);
                            numberCounter++;
                            break;
                        } else {
                            trys++;
                        }
                    }
                    if (trys == 9) break initial;
                }
            }
        } while (numberCounter < 81);

        return sudoku;
    }

    public static ArrayList<Integer> get9UniqueNumbersInRandomOrder() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (result.size() < 9) {
            int tempo = (int) (Math.random() * 9) + 1;
            if (!result.contains(tempo)) {
                result.add(tempo);
            }
        }
        return result;
    }

    /**
     * all three Sudoku ArrayLists will be checked, if the requested number is allready
     * part of them
     */
    private static boolean isUnique(int row, int collumn, int number) {
        if (
                (sudoku.getVerticalLines().get(collumn).contains(number)) ||
                        (sudoku.getHorizontalLines().get(row).contains(number)) ||
                        (sudoku.getNineFieldCubics().get(getCubicleNumber(row, collumn)).contains(number))) {
            return false;
        }
        return true;

    }

    /**
     * takes row and collumn from actual number, and calculates in which cubical Field the number is
     */
    private static int getCubicleNumber(int row, int collumn) {
        return ((row / 3) * 3) + (collumn / 3);
    }

    /**
     * adds an number to all three ArrayLists that are important for Sudoku solution
     */
    private static void addNumberToGrid(int row, int column, int number) {
        sudoku.getVerticalLines().get(column).add(number);
        sudoku.getHorizontalLines().get(row).add(number);
        sudoku.getNineFieldCubics().get(getCubicleNumber(row, column)).add(number);
    }

}
