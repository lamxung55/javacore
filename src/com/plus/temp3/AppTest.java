package com.plus.temp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Mina Mimi on 10/29/2020.
 */
public class AppTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("em1",10);
        Employee employee2 = new Employee("em2",12);
        Employee employee3 = new Employee("em3",8);

        ArrayList<Employee> myArray = new ArrayList<Employee>();
        myArray.add(employee1);
        myArray.add(employee2);
        myArray.add(employee3);

        System.out.println("Before:" + myArray);

        Collections.sort(myArray, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getAge().compareTo(o2.getAge());
                    }
                });

                System.out.println("After:" + myArray);

    }
}

