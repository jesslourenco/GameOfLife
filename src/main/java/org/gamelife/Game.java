package org.gamelife;

public class Game {
    Grid grid;

    public void start(){
        Grid grid = new Grid(5,5);
        grid.getCell(0,0).procreate();
        grid.getCell(1,2).procreate();
        grid.getCell(2,3).procreate();
        grid.getCell(3,3).procreate();
        grid.getCell(3,2).procreate();
        grid.getCell(3,1).procreate();

        Grid copy = grid.copyGrid();


        System.out.println(grid);
        System.out.println(copy);
    }
    public void stop(){}
    public void turn(){}
    public void print(){}

}
