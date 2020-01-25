package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // if conditional statements
        boolean mybool = false;
        if (mybool == true){
            System.out.println("true");
        }
        else {
            System.out.println("not true");
        }
    //logical operations (> < => <= != && || ...)
        int num1 = 34;
        if (num1 > 30){
            System.out.println("number greater than 30");
        }
        int num2 = 54;
        if ((num1>30) &&  (num2 < 56)){
            System.out.println("the value > than 30 and less than 56");
        }
     // Assignemnt and equal operator
        boolean iscar = false;
        if (iscar = true){
            System.out.println("this not supposed to happen here");
        }
     //terenary operator
        int age = 22;
        boolean agegreaterthaneithteen = (age >= 18) ? true : false;
        if (agegreaterthaneithteen){
            System.out.println("age > 18");
        }
     // challenge
        double number1 = 20;
        double number2 = 80;
        double remainder = ((number1+number2)*100) % (40);
        System.out.println(remainder);
        boolean rem1 = (remainder == 0)?true:false;
        System.out.println(rem1);
        if (!rem1){
            System.out.println("Got some remainder");
        }



    }
}
