package org.gamelife;
import java.util.*;

public class Grid {
    int cols;
    int rows;
    ArrayList<ArrayList<Cell>> grid = new ArrayList<>();

    Grid(int rows, int cols){
        this.cols = cols;
        this.rows = rows;
        for(int i = 0; i < rows; i++){
            ArrayList<Cell> cells = new ArrayList<>();
            for(int j = 0; j < cols; j++){
                Cell c = new Cell(i,j);
                cells.add(c);
            }
            grid.add(cells);
        }
    }

    public String toString(){
        String s = "";
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                s += grid.get(i).get(j).icon;
            }
            s += "\n";
        }
        return s;
    }

    public Cell getCell(int row, int col){
        Cell c = grid.get(row).get(col);
        return c;
    }

    public ArrayList<Cell> getAdjacentCells(Cell c){
        int previousRow = c.rowPosition - 1;
        int nextRow = c.rowPosition + 2;
        int previousCol = c.colPosition - 1;
        int nextCol = c.colPosition + 2;

        ArrayList<Cell> liveAdjacentList = new ArrayList<>();

        if (previousRow < 0){
            previousRow = c.rowPosition;
        }
        if (previousCol < 0) {
            previousCol = c.colPosition;
        }
        if (nextRow > this.rows){
            nextRow = c.rowPosition + 1;
        }
        if (nextCol > this.cols) {
            nextCol = c.colPosition + 1;
        }

        for (int i = previousRow; i < nextRow; i++){
            for (int j = previousCol; j < nextCol; j++){
                if (this.getCell(i,j).isAlive){
                    if (this.getCell(i,j) != this.getCell(c.rowPosition, c.colPosition)){
                        liveAdjacentList.add(this.getCell(i,j));
                    }
                }
            }
        }
        return liveAdjacentList;
    }

    public Grid copyGrid(){
        Grid copy =  new Grid(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            ArrayList<Cell> cells = new ArrayList<>();
            for (int j = 0; j < this.cols; j++) {
                Cell c = this.getCell(i, j).copy(i,j);
                cells.add(c);
            }
            copy.grid.set(i,cells);
        }
        return copy;
    }
}
