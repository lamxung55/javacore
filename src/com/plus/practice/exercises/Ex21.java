package com.plus.practice.exercises;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int input1 = sc.nextInt();
        System.out.print("Input second number: ");
        int input2 = sc.nextInt();
        System.out.println(input1 + " + " + input2 + " = " + (input1 + input2));
        System.out.println(input1 + " - " + input2 + " = " + (input1 + input2));
        System.out.println(input1 + " * " + input2 + " = " + (input1 + input2));
        System.out.println(input1 + " / " + input2 + " = " + (input1 + input2));
        System.out.println(input1 + " mod " + input2 + " = " + (input1 % input2));
    }
}
