package org.gamelife;

public class Cell {
    boolean isAlive;
    char icon;

    public Cell(){
        this.isAlive = false;
        this.icon = 'X';
    }
    public void die(){}
    public void procreate(){}
    public void isAlive(){}

    public Cell copy(){
        Cell c = new Cell();
        c.isAlive = isAlive;
        c.icon = icon;
        return c;
    }


}
