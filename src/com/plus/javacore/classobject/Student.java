package com.plus.javacore.classobject;

public class Student {
    private int age; //Propery
    public String name; //Propery
    public void study() {
        System.out.println("I'm study");
    }
    private void doingSomething() {
        int x = age%2;
        if(age%2==0) {
            System.out.println("Chan");
        } else {
            System.out.println("Le");
        }
    }

    public Student() {
        System.out.println("This is constructor");
        this.name = "Student A";
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        System.out.println("Student name:" + student.name);
    }
}
