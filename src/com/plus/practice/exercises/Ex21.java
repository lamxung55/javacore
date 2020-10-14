package com.plus.practice.exercises;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập n : ");
        int n = input.nextInt();
        for (int l = 1; l <= n; l++) {
            for (int k = 1; k <= n-l; k++)
                System.out.print(" ");
            for (int s = 1; s <= 2*l-1; s++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
