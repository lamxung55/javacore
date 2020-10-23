package com.plus.javacore.inheritance.polymorph;

/**
 * Created by Mina Mimi on 10/22/2020.
 */
public class Animal {

    public void sleep() {
        System.out.println("I'm sleep");
    }


    public void test(){
        System.out.println("test");
    }

    //overloading
    public void test(int x) {
        System.out.println("test2");
    }

}
