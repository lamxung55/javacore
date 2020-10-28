package com.plus.ex81;

public class ParttimeEmployee extends Employee {
    public static final long MEAL_ALLOWANCE = 0;

    private long baseSalary;
    private int totalWorkingShift;

    public ParttimeEmployee(String name, int age, String identificationNunber, boolean isFullTime, long baseSalary, int totalWorkingShift) {
        super(name, age, identificationNunber, isFullTime);
        this.baseSalary = baseSalary;
        this.totalWorkingShift = totalWorkingShift;
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

    public int getTotalWorkingShift() {
        return totalWorkingShift;
    }

    public void setTotalWorkingShift(int totalWorkingShift) {
        this.totalWorkingShift = totalWorkingShift;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", totalWorkingShift=" + totalWorkingShift +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", identificationNunber='" + identificationNunber + '\'' +
                ", isFullTime=" + isFullTime +
                ", Salary=" + calculateSalary() +
                '}';
    }
}
