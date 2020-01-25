package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SimpleCaluculator caluculator = new SimpleCaluculator();
        caluculator.setFirstNumber(5);
        caluculator.setSecondNumber(6);
        System.out.println(caluculator.getAdditionResult());

    }
}
