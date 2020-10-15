package com.plus.practice.exercises.ex5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mina Mimi on 10/14/2020.
 */
public class ArrayDup {
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,50,48,50};
        int length = arr.length;
        //Buoc 1: Sap xep lai mang
        Arrays.sort(arr);

        //Buoc 2: remove cac gia tri trung nhau
        int j = 0;
        for (int i = 0; i < length - 1; i++) {
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j] = arr[length-1];

        //Copy vao mang moi
        int[] newArray = new int[j+1];
        for (int i = 0; i <= j ; i++) {
            newArray[i] = arr[i];
        }
    }
}
