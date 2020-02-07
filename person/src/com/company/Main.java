package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
        person.setFirstName("john");
        person.setAge(18);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
        person.setLastName("Smith");
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
     // using constructors:
        Wall small1 = new Wall(5,4);
        System.out.println(small1.getHeight());
        System.out.println(small1.getArea());
    }
}
