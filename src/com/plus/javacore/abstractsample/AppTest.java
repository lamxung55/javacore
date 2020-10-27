package com.plus.javacore.abstractsample;

/**
 * Created by Mina Mimi on 10/27/2020.
 */
public class AppTest {
    public static void main(String[] args) {
        IPerson person = new PersonImplement();
        person.look();
    }
}
