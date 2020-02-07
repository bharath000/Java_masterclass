package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(3,4,5);
        Case thecase = new Case("333","nell","800",dimensions);

        monitor themonitor = new monitor("45rrr","ne",90,new Resolution(1080,900));

        motherboard themotherboard = new motherboard("klkl","mu",5,6,"v66");
         PC thepc = new PC(thecase,themonitor,themotherboard);
        /* thepc.getMonitor().drawPixel(90,89,"red");
         thepc.getMotherboard().loadProgram("bharath");
         thepc.getThecase().pressPowerbutton();*/
        thepc.powerup();
    }
}
