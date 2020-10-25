package com.plus.ex71;

/**
 * Created by Mina Mimi on 10/25/2020.
 */
public class ParttimeEmployee extends Employee{

    private int workHourNumber;

    public ParttimeEmployee(String name, int age, String address, boolean isFullTime, int workHourNumber) {
        super(name, age, address, isFullTime);
        this.workHourNumber = workHourNumber;
    }

    @Override
    public float calculateSalaryThisMonth() {
        float result = 0;
        result = workHourNumber*0.1f;
        return result;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                "name='" + name + '\'' +
                ", workHourNumber=" + workHourNumber +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", isFullTime=" + isFullTime +
                ", salaryThisMonth=" + calculateSalaryThisMonth() +
                '}';
    }

    public int getWorkHourNumber() {
        return workHourNumber;
    }

    public void setWorkHourNumber(int workHourNumber) {
        this.workHourNumber = workHourNumber;
    }


}
