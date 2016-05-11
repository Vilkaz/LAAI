package Model;

import java.util.ArrayList;

/**
 * Created by vkukanauskas on 29/04/2016.
 */
public class Sudoku {

    /** The Static Variables represent the vertical, horizontal and Cubical arrayLists, where the Value of sudoku numbers will
     *  be inserted and checked by. There is only one public method, which gives an Arraylist of checked Sudoku
     *  Fields, number by number, row by row.*/
    private ArrayList<ArrayList<Integer>> verticalLines = new ArrayList<ArrayList<Integer>>();
    private ArrayList<ArrayList<Integer>> horizontalLines = new ArrayList<ArrayList<Integer>>();
    private ArrayList<ArrayList<Integer>> nineFieldCubics = new ArrayList<ArrayList<Integer>>();


    public ArrayList<ArrayList<Integer>> getVerticalLines() {
        return verticalLines;
    }

    public ArrayList<ArrayList<Integer>> getHorizontalLines() {
        return horizontalLines;
    }

    public ArrayList<ArrayList<Integer>> getNineFieldCubics() {
        return nineFieldCubics;
    }
}
