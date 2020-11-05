package com.plus.ex91;

import java.util.*;

public class EmployeeManagement {
    //    private Employee[] employees;
    private ArrayList<Employee> employees = new ArrayList<Employee>();;//ALT+ENTER:Intellji, Format code: CTRL + ALT + L
    private HashMap<String,Employee> mapEmployees = new HashMap<String,Employee>();

    public EmployeeManagement() {
        //Nhap thong tin:
        Random random = new Random();
        int numberOfEmployee = 10;//Gia su co 10 nhan vien
        for (int i = 0; i < numberOfEmployee; i++) {
            boolean isFullTime = random.nextBoolean();
            String name = "Employee_" + i;
            int age = 18 + random.nextInt(100);
            String identificationNunber = "Id" + i;
            long baseSalary = random.nextInt(10000000);
            if (isFullTime) {
                //Tao nhan vien full time
                int totalWorkingDays = random.nextInt(30);

                Employee fulltimeEmployee = new FulltimeEmployee(name, age, identificationNunber, true, baseSalary, totalWorkingDays);
                //employees[i] = fulltimeEmployee;
                employees.add(fulltimeEmployee);
                mapEmployees.put(identificationNunber,fulltimeEmployee);
            } else {
                //Tao nhan vien part time
                int totalWorkingShift = random.nextInt(30);
                Employee parttimeEmployee = new ParttimeEmployee(name, age, identificationNunber, false, baseSalary, totalWorkingShift);
                //employees[i] = parttimeEmployee;
                employees.add(parttimeEmployee);
                mapEmployees.put(identificationNunber,parttimeEmployee);
            }
        }
    }

//    public Employee getMaxSalaryEmployee() {
//        Employee result = employees[0];
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].calculateSalary() >= result.calculateSalary()) {
//                result = employees[i];
//            }
//        }
//        return result;
//    }

    public Employee getMaxAgeEmployee() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.age.compareTo(employee2.age);
            }
        });
        return employees.get(employees.size()-1);
    }

    public Employee getMinAgeEmployee() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.age.compareTo(employee2.age);
            }
        });
        return employees.get(0);
    }

    public Employee getEmployeeById(String id) {
//        for(Employee employee:employees) {
//            if(employee.getIdentificationNunber() == id) {
//                return employee;
//            }
//        }
//        return null;
        return mapEmployees.get(id);
    }

    public void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
