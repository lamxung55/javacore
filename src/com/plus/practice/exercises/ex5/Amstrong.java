package com.plus.practice.exercises.ex5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mina Mimi on 10/14/2020.
 */
public class Amstrong {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 500; i++) {
//            int hangtram = i / 100;
//            int hangtruc = (i - hangtram * 100) / 10;
//            int hangdv = i - 100 * hangtram - 10 * hangtruc;
//            //System.out.printf("tram:%d-truc:%d-dv:%d\n",hangtram,hangtruc,hangdv);
//            if (hangtram > 0) {
//                if (i == hangtram * hangtram * hangtram + hangtruc * hangtruc * hangtruc + hangdv * hangdv * hangdv) {
//                    System.out.println(i + " is Amstrong number");
//                }
//            } else if (hangtruc > 0) {
//                if (i == hangtruc * hangtruc + hangdv * hangdv) {
//                    System.out.println(i + " is Amstrong number");
//                }
//            } else {
//                if (i == hangdv) {
//                    System.out.println(i + " is Amstrong number");
//                }
//            }
//
//        }
//    }

    //    //Cach 2
    public static void main(String[] args) {
        for (int i = 1; i < 500; i++) {
            char[] charArray = String.valueOf(i).toCharArray();
            int pow = charArray.length;
            int sum = 0;
            for(char myNum:charArray) {
                sum = sum + (int)Math.pow(Character.getNumericValue(myNum),pow);
            }
            if(sum == i) {
                System.out.println(i + " is Amstrong number");
            }
        }
    }
//    public static void main(String[] args) {
//        for(int i = 1; i<= 5000; i++) {
//            //153: (1*1*1) + (5*5*5) + (3*3*3)
//            char[] charArray =  String.valueOf(i).toCharArray();//1,5,3
//            int pow = charArray.length;//pow=3
//            int sum = 0;
//            for(char temp:charArray) {
//                sum = sum + (int)Math.pow(Character.getNumericValue(temp),pow);
//            }
//            if(sum == i) {
//                System.out.println(i + " is Amstrong number");
//            }
//
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input number element of array: ");
//        int temp, element = sc.nextInt();
//        int[] array = new int[element];
//
//        //input element of array
//        for (int i = 0; i < element; i++) {
//            System.out.print("Array[" + i + "] = ");
//            array[i] = sc.nextInt();
//        }
//        //check and removing element duplicate
//        for(int i = 0; i < (element - 1); i++) {
//            for(int j = i + 1; j < element; j++) {
//                if(array[i] == array[j]){
//                    for(int k = j; k < (element - 1); k++){
//                        array[k] = array[k+1];
//                    }
//                    element--;
//                }
//            }
//
//        }
//        //output array after removing duplicate
//        System.out.println("Array after removing duplicate:");
//        for (int j = 0; j < element; j++) {
//            System.out.print(array[j] + " ");
//        }
//    }

}
