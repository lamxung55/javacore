package com.plus.temp;

import java.util.Random;

/**
 * Created by Mina Mimi on 10/29/2020.
 */
public class EmployeeManagement {
    private  int n;
    private Employee[] employees;

    public EmployeeManagement(int n) {
        this.n = n;
        employees = new Employee[n];

        Random random = new Random();

        for(int i = 0; i< n ; i++ ) {
            String name = "Ten NV_" + i;
            int age = 18 + random.nextInt(100);
            String id = "ID_" + i;

            boolean isFullTime = random.nextBoolean();
            if(isFullTime ) {
                int totalWorkingdays = random.nextInt(30);
                long salary = random.nextInt(100000000);
                FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(name,age,id,totalWorkingdays,salary);
                employees[i] = fulltimeEmployee;
            } else {
                int totalWorkingShift = random.nextInt(30);
                long baseSalary = random.nextInt(100000000);
                ParttimeEmployee parttimeEmployee = new ParttimeEmployee(name,age,id,totalWorkingShift, baseSalary);
                employees[i] = parttimeEmployee;
            }
        }

    }

    public Employee getMaxSalaryEmployee() {
        Employee result = employees[0];
        for(int i =0; i< employees.length; i++) {
            if(employees[i].calculateSalary() >= result.calculateSalary()) {
                result = employees[i];
            }
        }
        return result;
    }

    public void printAll(){
        for(Employee employee:employees) {
            System.out.println();
        }
    }
}
