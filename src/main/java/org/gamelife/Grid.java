package org.gamelife;
import java.util.*;

public class Grid {
    private int cols;
    private int rows;
    ArrayList<ArrayList<Cell>> grid = new ArrayList<>();

    Grid(int rows, int cols){
        this.cols = cols;
        this.rows = rows;
        for(int i = 0; i < rows; i++){
            ArrayList<Cell> cells = new ArrayList<>();
            for(int j = 0; j < cols; j++){
                Cell c = new Cell();
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

    public void getAdjacentCells(Cell c){

    }
    public ArrayList<ArrayList<Cell>> copyGrid() {
        ArrayList<ArrayList<Cell>> copy = new ArrayList<>();
        for (int i = 0; i < this.rows; i++) {
            ArrayList<Cell> cells = new ArrayList<>();
            for (int j = 0; j < this.cols; j++) {
                Cell c = getCell(i, j);
                cells.add(c);
            }
            copy.add(cells);
        }
        return copy;
    }

}
