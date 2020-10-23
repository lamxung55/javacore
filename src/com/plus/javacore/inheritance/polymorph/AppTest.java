package com.plus.javacore.inheritance.polymorph;

/**
 * Created by Mina Mimi on 10/22/2020.
 */
public class AppTest {
    public static void main(String[] args) {

        Animal animal;

        animal = new Animal();
        animal.sleep();

        animal.test();
        animal.test(18);

        animal = new Chicken();
        animal.sleep();

        animal = new Dog();
        animal.sleep();
    }
}
