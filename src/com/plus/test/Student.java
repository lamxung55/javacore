package com.plus.test;

/**
 * Created by Mina Mimi on 10/16/2020.
 */
public class Student {

    //variables
    public int age;
    public String name; // Access Modifier = default

    //methods
    public void study(){
        age = 100;
        name = "ABC";
        System.out.println("I'm studying...");
    }

    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.study();
        myStudent.age = 100;
    }
}
