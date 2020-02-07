package com.company;

public class car extends vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean ismanual;
    private int currentgear;

    public car(String name, String size, int wheels, int doors, int gears, boolean ismanual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.ismanual = ismanual;
        this.currentgear = 1;
    }
    public void changevelocity(int speed, int direction){
        move(speed,direction);
        System.out.println("speed"+speed+"direction"+direction);
    }
    public void changegear(int currgear){
        this.currentgear = currgear;
        System.out.println("current grear"+currentgear);
    }
}
