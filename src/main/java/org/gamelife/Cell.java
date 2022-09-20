package org.gamelife;

public class Cell {
    boolean isAlive;
    char icon;
    int rowPosition;
    int colPosition;

    public Cell(int row, int col){
        this.isAlive = false;
        this.icon = 'X';
        this.rowPosition = row;
        this.colPosition = col;
    }
    public void die(Cell c){
        c.isAlive = false;
        c.icon = 'X';
    }
    public void procreate(){
        this.isAlive = true;
        this.icon = 'O';
    }
    public void isAlive(){}

    public Cell copy(int row, int col ){
        Cell c = new Cell(row, col);
        c.isAlive = isAlive;
        c.icon = icon;
        return c;
    }

}
