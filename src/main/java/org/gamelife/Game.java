package org.gamelife;

import java.io.IOException;
import java.util.ArrayList;

public class Game {
    Grid grid;

    public void start(){
        grid = new Grid(25,15);
        grid.getCell(1,2).procreate();
        grid.getCell(2,3).procreate();
        grid.getCell(3,3).procreate();
        grid.getCell(3,2).procreate();
        grid.getCell(3,1).procreate();

        print();

        while (true) {
            turn();
        }
    }
    public void turn(){
        Grid copy = grid.copyGrid();
        for (int i = 0; i < copy.rows; i++) {
            for (int j = 0; j < copy.cols; j++) {
                ArrayList<Cell> adjacent = copy.getAdjacentCells(copy.getCell(i,j));
                if (copy.getCell(i,j).isAlive){
                    if (adjacent.size() < 2){
                        grid.getCell(i,j).die();
                    } else if (adjacent.size() >= 4){
                        grid.getCell(i,j).die();
                    }
                } else if (adjacent.size() == 3){
                    grid.getCell(i,j).procreate();
                }
            }
        }
        print();
    }
    public void print(){
        System.out.println(grid);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
