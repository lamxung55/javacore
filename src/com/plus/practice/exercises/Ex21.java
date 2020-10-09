package com.plus.practice.exercises;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = sc.nextInt();
        System.out.println(input + " + " + (input * 11) + " + " + (input * 111) + " = " + (input + input * 11 + input * 111));
    }
}
