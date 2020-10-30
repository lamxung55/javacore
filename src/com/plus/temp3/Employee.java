package com.plus.temp3;

import java.util.Comparator;

/**
 * Created by Mina Mimi on 10/29/2020.
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private Integer age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
