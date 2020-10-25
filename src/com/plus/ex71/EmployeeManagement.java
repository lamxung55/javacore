package com.plus.ex71;

import java.util.Random;

/**
 * Created by Mina Mimi on 10/25/2020.
 */
public class EmployeeManagement {

    private Employee[] employees;


    public EmployeeManagement() {
        //Nhap thong tin:
        Random random = new Random();
        int numberOfEmployee = 10;//Gia su co 10 nhan vien
        employees = new Employee[10];
        for(int i = 0;i<numberOfEmployee;i++) {
            boolean isFullTime = random.nextBoolean();
            String name = "Employee_" + i;
            int age = 18 + random.nextInt(100);
            String address = "Address_" + i;

            if(isFullTime) {
                //Tao nhan vien full time
                float baseSalary = random.nextFloat();
                boolean level = random.nextBoolean();//Sep or linh
                int overTimeDay = random.nextInt(30);
                Employee fulltimeEmployee = new FulltimeEmployee(name,age,address,isFullTime,baseSalary,level,overTimeDay);
                employees[i] = fulltimeEmployee;
            } else {
                //Tao nhan vien part time
                int workHourNumber = random.nextInt(8);
                Employee parttimeEmployee = new ParttimeEmployee(name,age,address,isFullTime,workHourNumber);
                employees[i] = parttimeEmployee;
            }

        }
    }

    public void printAllEmployee() {
        for(Employee employee:employees) {
            System.out.println(employee.toString());
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
