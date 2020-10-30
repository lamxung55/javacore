package com.plus.temp;

import java.util.Scanner;

/**
 * Created by Mina Mimi on 10/29/2020.
 */
public class AppTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien can quan ly:");
        int n = scanner.nextInt();
        EmployeeManagement employeeManagement = new EmployeeManagement(n);

        //In ra toan bo thong tin nhan vien
        employeeManagement.printAll();

        //In ra nhan vien co luong cao nha
        System.out.println("Nhan vien co luong cao nhat la:");
        System.out.println(employeeManagement.getMaxSalaryEmployee().toString());

    }
}
