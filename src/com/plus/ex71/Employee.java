package com.plus.ex71;

/**
 * Created by Mina Mimi on 10/25/2020.
 */
public class Employee {
    protected String name;
    protected int age;
    protected String address;
    protected boolean isFullTime;

    public Employee(String name, int age, String address, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.isFullTime = isFullTime;
    }

    public float calculateSalaryThisMonth() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }
}
