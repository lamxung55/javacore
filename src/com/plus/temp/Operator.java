package com.plus.temp;

import java.util.Scanner;

/**
 * Created by Mina Mimi on 10/2/2020.
 */
public class Operator {
    public int amount = 10;
    public static int AMOUNT = 1000;
    public void test(){
        int x = 10;
        long y = 100;
        amount = amount + 100;
    }
    public  void test2() {
        System.out.println("Amount:" + amount);
    }


    public static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any value int from keyboard: ");
        number = sc.nextInt();
        System.out.println("Result");
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
}
