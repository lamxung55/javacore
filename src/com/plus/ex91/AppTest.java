package com.plus.ex91;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.printAll();
        System.out.println("Max age employee:" + employeeManagement.getMaxAgeEmployee());
        System.out.println("Min age employee:" + employeeManagement.getMinAgeEmployee());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Id cua NV can tim:");
        String id = scanner.nextLine();

        Employee employee = employeeManagement.getEmployeeById(id);
        System.out.println(employee.toString());


    }


}
