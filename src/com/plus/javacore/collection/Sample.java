package com.plus.javacore.collection;

import java.util.*;

public class Sample {
    public static void main(String[] args) {

        /**
         * ArrayList
         * **************************************************************************************
         */
        //Tao
        ArrayList<String> myArryList1 = new ArrayList<String>(); //Generic: dung kieu String
        myArryList1.add("123");
        myArryList1.add("abc");
        myArryList1.add("zyz");
        myArryList1.remove(1);
        myArryList1.remove("abc");

        //Duyet: dung vong lap
        for(String s:myArryList1) {
            System.out.println(s);
        }


        /**
         * Set
         * **************************************************************************************
         */

        //Tao
        HashSet<String> mySet = new HashSet<String>();
        mySet.add("123");
        mySet.add("456");


        //Duyet: dung vong lap hoac iterator
        System.out.println("*******MY SET*************");
        for(String s:mySet) {
            System.out.println(s);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        /**
         * Map
         * **************************************************************************************
         */

        //Tao
        HashMap<Integer,String> myMap = new HashMap<Integer, String>();
        myMap.put(1,"abc");//Auto boxing
        myMap.put(2,"xyz");

        //Duyet: dung iterator
        System.out.println("*******MY MAP*************");
        //Duyet 1: Duyet bang keySet
        Set<Integer> myIt = myMap.keySet();
        for(Integer i:myIt) {
            System.out.println("key:" + i + " - value:" + myMap.get(i));
        }

        //Duyet 2: Duyet bang lap Iterator
        Iterator<Integer> iterator1 = myMap.keySet().iterator();
        while(iterator1.hasNext()) {
            System.out.println(myMap.get(iterator1.next()));
        }

        //Duyet 3: Duyet bang entrySet
        for(Map.Entry<Integer,String> myEntry: myMap.entrySet()) {
            System.out.println("key:" + myEntry.getKey() + "-value:" + myEntry.getValue());
        }

        /**
         * implement Comparable: Ap dung cho List
         * **************************************************************************************
         */
        ArrayList<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Z",1);
        Student student2 = new Student("B",12);
        students.add(student1);
        students.add(student2);

        //Before sort
        for(Student student:students) {
            System.out.println(student.toString());
        }

        //After sort
        Collections.reverse(students);
        for(Student student:students) {
            System.out.println(student.toString());
        }

        /**
         * Comparator: Ap dung cho List
         * **************************************************************************************
         */

        ArrayList<Worker> workers = new ArrayList<Worker>();
        Worker worker1= new Worker("Z",1);
        Worker worker2 = new Worker("B",12);
        workers.add(worker1);
        workers.add(worker2);

        //Before sort
        for(Worker worker:workers) {
            System.out.println(worker.toString());
        }

        //After sort
        Collections.reverse(workers);
        for(Worker worker:workers) {
            System.out.println(worker.toString());
        }

    }
}
