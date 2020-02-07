package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        outlander outl = new outlander(36);
        outl.steer(45);
        outl.accelerate(30);
        outl.accelerate(50);

        Circle circle = new Circle(3.75);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getArea());


    }
}
