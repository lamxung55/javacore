package com.plus.javacore.abstractsample;

/**
 * Created by Mina Mimi on 10/27/2020.
 */
public class PersonImplement implements IPerson,IAnimal{
    @Override
    public void sleep() {
        System.out.println("Sleep");
    }

    @Override
    public void look() {
        System.out.println("Look");
    }

    @Override
    public void run(int speed) {
        System.out.println("Running..." + speed);
    }

    @Override
    public void eat() {

    }
}
