package com.plus.temp;

/**
 * Created by Mina Mimi on 10/29/2020.
 */
public class ParttimeEmployee extends Employee {
    public static final long MEAL_ALLOWANCE = 0;

    private int totalWorkingShift;
    private long baseSalary;

    public ParttimeEmployee(String name, int age, String identificationNunber, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNunber);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public long getWorkingCount() {
        return totalWorkingShift;
    }

    @Override
    public long calculateSalary() {
        return getWorkingCount()*getSalaryRate() + getMealAllowance();
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", identificationNunber='" + identificationNunber + '\'' +
                ", totalWorkingShift=" + totalWorkingShift +
                ", baseSalary=" + baseSalary +
                ", TotalSalary=" + calculateSalary() +
                '}';
    }
}
