package com.plus.javacore.inheritance;

/**
 * Created by Mina Mimi on 10/22/2020.
 */
public class Student extends  People{
    private int age;
    public void sleep() {
        super.sleep();
        System.out.println("Tuoi:" + super.age + "-Ten:" + name);
    }
}
