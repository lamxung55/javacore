package com.plus.ex81;

import java.util.Random;

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
            String identificationNunber = "Id" + i;
            long baseSalary = random.nextInt(10000000);
            if(isFullTime) {
                //Tao nhan vien full time
                int totalWorkingDays = random.nextInt(30);

                Employee fulltimeEmployee = new FulltimeEmployee(name,age,identificationNunber,true,baseSalary,totalWorkingDays);
                employees[i] = fulltimeEmployee;
            } else {
                //Tao nhan vien part time
                int totalWorkingShift = random.nextInt(30);
                Employee parttimeEmployee = new ParttimeEmployee(name,age,identificationNunber,false,baseSalary,totalWorkingShift);
                employees[i] = parttimeEmployee;
            }
        }
    }

    public Employee getMaxSalaryEmployee() {
        Employee result = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].calculateSalary() >= result.calculateSalary()) {
                result = employees[i];
            }
        }
        return  result;
    }

    public void printAll() {
        for(Employee employee:employees) {
            System.out.println(employee.toString());
        }
    }
}
