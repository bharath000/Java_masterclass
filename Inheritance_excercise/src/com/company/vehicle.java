package com.company;

public class vehicle {
    private String name;
    private String size;
    private int currentvelocity;
    private int currentdirection;


    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentdirection = 0;
        this.currentvelocity =0;
    }
    public void steer(int direction){
        this.currentdirection = direction;
        System.out.println(currentdirection);
    }
    public void move(int velocity, int direction){
        currentdirection = direction;
        currentvelocity = velocity;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentvelocity() {
        return currentvelocity;
    }

    public int getCurrentdirection() {
        return currentdirection;
    }
}
