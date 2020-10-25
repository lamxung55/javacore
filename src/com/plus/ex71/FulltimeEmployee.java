package com.plus.ex71;

/**
 * Created by Mina Mimi on 10/25/2020.
 */
public class FulltimeEmployee extends Employee {

    private float baseSalary;

    private boolean level;//true: sep; false: linh

    private int overTimeDay;

    public FulltimeEmployee(String name, int age, String address, boolean isFullTime, float baseSalary, boolean level, int overTimeDay) {
        super(name, age, address, isFullTime);
        this.baseSalary = baseSalary;
        this.level = level;
        this.overTimeDay = overTimeDay;
    }

    @Override
    public float calculateSalaryThisMonth() {
        float result = 0;
        if(level) {
            result = 20; //Sep thi duoc 20M/thang
        } else {
            result = 10; //Linh thi duoc 10M/thang
        }

        result = result + overTimeDay*0.8f;
        return result;
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", level=" + level +
                ", isFullTime=" + isFullTime +
                ", overTimeDay=" + overTimeDay +
                ", salaryThisMonth=" + calculateSalaryThisMonth() +
                '}';
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public boolean isLevel() {
        return level;
    }

    public void setLevel(boolean level) {
        this.level = level;
    }

    public int getOverTimeDay() {
        return overTimeDay;
    }

    public void setOverTimeDay(int overTimeDay) {
        this.overTimeDay = overTimeDay;
    }
}
