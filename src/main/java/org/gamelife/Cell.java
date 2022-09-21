package org.gamelife;

public class Cell {
    boolean isAlive;
    char icon;
    int rowPosition;
    int colPosition;

    public Cell(int row, int col){
        this.isAlive = false;
        this.icon = ' ';
        this.rowPosition = row;
        this.colPosition = col;
    }
    public void die(){
        isAlive = false;
        icon = ' ';
    }
    public void procreate(){
        this.isAlive = true;
        this.icon = '▄';
    }

    public Cell copy(int row, int col ){
        Cell c = new Cell(row, col);
        c.isAlive = isAlive;
        c.icon = icon;
        return c;
    }

}
