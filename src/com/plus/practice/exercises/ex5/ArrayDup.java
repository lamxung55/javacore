//package com.plus.practice.exercises.ex5;
//
//import java.util.Scanner;
//
///**
// * Created by Mina Mimi on 10/14/2020.
// */
//public class ArrayDup {
//    public static void main(String[] args) {
//        System.out.print("Input length:");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int[] myArray = new int[number];
//        for (int i = 0; i < number; i++) {
//            myArray[i] = scanner.nextInt();
//        }
//        System.out.print("Origin array:");
//        for(int element:myArray) {
//            System.out.print(element + " ");
//        }
//
//        String fullStr = "";
//        for(int element:myArray) {
//            String temp = "#" + element + "#";
//            if(!fullStr.contains(temp)){
//                fullStr = fullStr + temp;
//            }
//        }
//        String[] myRemoveStr = fullStr.replace("##","#").split("#");
//        int[] myResultArray = new int[myRemoveStr.length];
//        for (int i = 0; i < myRemoveStr.length; i++) {
//            myResultArray[i] = Integer.parseInt(myRemoveStr[i]);
//        }
//        System.out.print("Last:");
//        for(int element:myResultArray) {
//            System.out.println(element + " ");
//        }
//
//    }
//}
