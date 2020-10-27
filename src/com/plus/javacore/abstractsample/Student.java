package com.plus.javacore.abstractsample;

/**
 * Created by Mina Mimi on 10/25/2020.
 */
public class Student extends Person {
    @Override
    public void look() {
        System.out.println("Look...");
    }

    public static void main(String[] args) {
        Person person = new Student();
        person.look();
    }
}
