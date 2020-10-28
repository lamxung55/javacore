package com.plus.ex81;

public abstract class Employee {
    protected String name;
    protected int age;
    protected String identificationNunber;
    protected boolean isFullTime;

    public abstract long getMealAllowance();
    public abstract long getSalaryRate();
    public abstract long getWorkingCount();
    public abstract long calculateSalary();

    public Employee(String name, int age, String identificationNunber, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.identificationNunber = identificationNunber;
        this.isFullTime = isFullTime;
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

    public String getIdentificationNunber() {
        return identificationNunber;
    }

    public void setIdentificationNunber(String identificationNunber) {
        this.identificationNunber = identificationNunber;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }
}
