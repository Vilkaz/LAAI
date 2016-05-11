package model;

import java.util.ArrayList;

/**
 * Created by vkukanauskas on 29/04/2016.
 */
public class Sudoku {

    /**
     * These Variables represent the vertical, horizontal and Cubical arrayLists, where the Value of sudoku numbers will
     * be inserted and checked by. There is only one public method, which gives an Arraylist of checked Sudoku
     * Fields, number by number, row by row.
     */
    private ArrayList<ArrayList<Integer>> verticalLines = new ArrayList<ArrayList<Integer>>();
    private ArrayList<ArrayList<Integer>> horizontalLines = new ArrayList<ArrayList<Integer>>();
    private ArrayList<ArrayList<Integer>> nineFieldCubics = new ArrayList<ArrayList<Integer>>();

    public Sudoku() {
        verticalLines = new ArrayList<ArrayList<Integer>>();
        horizontalLines = new ArrayList<ArrayList<Integer>>();
        nineFieldCubics = new ArrayList<ArrayList<Integer>>();
        initArrayList();
    }

    /** If we are not initialisig the ArrayLists, we ar egeting a NullPointerException.
     * Posible other solution were to try catsh nul pointer Exception and initialise the ArrayLists in the
     * catsh block. Now we are reinitialisating the ArrayLists by every initialisating.*/
    private  void initArrayList() {
        for (int i = 0; i <= 8; i++) {
            verticalLines.add(new ArrayList<Integer>());
            horizontalLines.add(new ArrayList<Integer>());
            nineFieldCubics.add(new ArrayList<Integer>());

        }
    }


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
