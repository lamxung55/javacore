package com.plus.practice.exercises.ex6.student;

/**
 * Created by Mina Mimi on 10/18/2020.
 */
public class Student {
    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public boolean checkPass() {
        if(gpa>=1.5) {
            return  true;
        } else {
            return false;
        }
    }

    public void inGpa() {
        System.out.println("GPA:" + gpa);
    }

    public void inName() {
        System.out.println("Name:" + name);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
