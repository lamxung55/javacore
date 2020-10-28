package com.plus.ex81;

public class AppTest {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.printAll();
        System.out.println("Max salary employee:" + employeeManagement.getMaxSalaryEmployee());
    }


}
