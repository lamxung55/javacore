package com.plus.javacore.inheritance;

/**
 * Created by Mina Mimi on 10/22/2020.
 */
public class People {
    protected String name;
    protected int age;

    public void sleep() {
        System.out.println("I'm sleeping");
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
    }
}
