package com.plus.temp;

/**
 * Created by Mina Mimi on 10/29/2020.
 */
public abstract class Employee {
    protected String name;
    protected int age;
    protected String identificationNunber;

    public Employee(String name, int age, String identificationNunber) {
        this.name = name;
        this.age = age;
        this.identificationNunber = identificationNunber;
    }

    public abstract long getMealAllowance();
    public abstract long getSalaryRate();
    public abstract long getWorkingCount();
    public abstract long calculateSalary();


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
}
