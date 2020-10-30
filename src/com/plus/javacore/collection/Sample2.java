package com.plus.javacore.collection;

import java.util.*;

/**
 * Created by Mina Mimi on 10/29/2020.
 */
public class Sample2 {

    public static void main(String[] args) {
        /**
         * VI DU VE ARRAYLIST
         */

        //Alt + Enter
//        ArrayList<String> myArrayList = new ArrayList<String>();//Cach 1 dung Generic
//        myArrayList.add("1");
//        myArrayList.add("2");
//        myArrayList.remove(0);
//
//        System.out.println(myArrayList);
//
//        //Duyet:
//        for(int i = 0; i< myArrayList.size();i++) {
//            System.out.println(myArrayList.get(i));
//        }
//
//        for(String element: myArrayList) {
//            System.out.println(element);
//        }


        /**
         * VI DU VE LINKEDLIST
         */
//        LinkedList<String> myLinkList = new LinkedList<String>();
//        myLinkList.add("1");
//        myLinkList.add("2");
//        myLinkList.add("3");
//        myLinkList.add("2");
//        myLinkList.remove("1");
//
//        System.out.println(myLinkList);

        /**
         * SET
         */

//        Set<String> mySet = new HashSet<>();
//
//        mySet.add("Mot");
//        mySet.add("Hai");
//        mySet.add("Mot");
//        mySet.add("Ba");
//        System.out.println(mySet);
//
//        Set<String> mySet2 = new HashSet<>();
//        mySet2.addAll(mySet);
//        mySet2.add("Nam");
//
//        System.out.println("Myset2:" + mySet2);

        /**
         * MAP
         */

        HashMap<String,Student> myMap = new HashMap<String, Student>();

        Student student1 = new Student("Student1",18);
        Student student2 = new Student("Student2",20);

        myMap.put("Student1",student1);
        myMap.put("Student2",student2);

        //Truy xuat
        System.out.println(myMap.get("Student2"));


    }
}
