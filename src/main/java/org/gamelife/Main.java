package org.gamelife;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(5,5);
        Grid copy = grid.copyGrid();
        System.out.println(grid);
        System.out.println(" ");
        System.out.println(copy);

    }
}