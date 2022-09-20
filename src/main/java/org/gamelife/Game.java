package org.gamelife;

public class Game {
    Grid grid;

    public void start(){
        Grid grid = new Grid(5,5);
        Grid copy1 = grid.copyGrid();
        grid.getCell(1,2).procreate();
        grid.getCell(2,3).procreate();
        grid.getCell(3,3).procreate();
        grid.getCell(3,2).procreate();
        grid.getCell(3,1).procreate();

        Grid copy2 = grid.copyGrid();


        System.out.println(grid);
        System.out.println(copy1);
        System.out.println(copy2);
    }
    public void stop(){}
    public void turn(){}
    public void print(){}

}
