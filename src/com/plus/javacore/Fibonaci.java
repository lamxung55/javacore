package com.plus.javacore;

import java.util.Scanner;

/**
 * Created by Mina Mimi on 10/2/2020.
 */
public class Fibonaci {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = nhap.nextInt();
        for(int i = 1 ; i <= n ; i++ ){
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n) {
        int pre0 = 0;
        int pre1 = 1;
        int result = 0;

        for (int i = 0; i < n; i++) {
            if(i==0) {
                result = 0;
            } else  if(i==1) {
                result = 1;
            } else {
                result =  pre0 + pre1;
                pre0 = pre1;
                pre1 = result;
            }
        }

        return result;
    }
}