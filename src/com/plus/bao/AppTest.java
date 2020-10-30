package com.plus.bao;

public class AppTest {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.printAllEmployees();
        System.out.print("Max Salary Employee: " + employeeManagement.getMaxSalaryEmployee());
    }
}
