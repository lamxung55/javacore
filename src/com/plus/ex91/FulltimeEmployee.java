package com.plus.ex91;

public class FulltimeEmployee extends Employee {

    public static final long MEAL_ALLOWANCE = 2000000;

    private long dailySalary;
    private int totalWorkingDays;

    public FulltimeEmployee(String name, int age, String identificationNunber, boolean isFullTime, long dailySalary, int totalWorkingDays) {
        super(name, age, identificationNunber, isFullTime);
        this.dailySalary = dailySalary;
        this.totalWorkingDays = totalWorkingDays;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return dailySalary;
    }

    @Override
    public long getWorkingCount() {
        return totalWorkingDays;
    }

    @Override
    public long calculateSalary() {
        return getWorkingCount()*getSalaryRate() + getMealAllowance();
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                "dailySalary=" + dailySalary +
                ", totalWorkingDays=" + totalWorkingDays +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", identificationNunber='" + identificationNunber + '\'' +
                ", isFullTime=" + isFullTime +
                ", Salary=" + calculateSalary() +
                '}';
    }
}
