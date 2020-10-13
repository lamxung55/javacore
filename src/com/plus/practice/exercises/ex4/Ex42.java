package com.plus.practice.exercises.ex4;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        System.out.print("Input number of row:");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = 2*row -1;

//        //Duyet theo hang:
        for (int i = 1; i <= row; i++) {
            //So luong *: 2*j-1
            //So luong space: column - so luong *
            int numOfStar = 2*i-1;
            for(int j = 1; j <=column;j++) {
                if(j<=(column-numOfStar)/2 || j>(column-numOfStar)/2 + numOfStar) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    //Trung
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please input the height of the triangle from keyboard: ");
//        int number = sc.nextInt();
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= (2 * number - 1); j++) {
//                if (Math.abs(number - j) <= (i - 1)) {  /* determines the number of symmetrical elements*/
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println("");
//        }
//    }

    //VU
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập n : ");
//        int n = input.nextInt();
//        for (int l = 1; l <= n; l++) {
//            for (int k = 1; k <= n-l; k++)
//                System.out.print(" ");
//            for (int s = 1; s <= 2*l-1; s++)
//                System.out.print("*");
//            System.out.println("");
//        }
//    }

    //HUY
//    public static void main(String[] args) {
//        int num, n;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap n : ");
//        num = sc.nextInt();
//        System.out.println();
//        n = num;
//        for (int r = 1 ; r <= num; r++){
//            for (int sp = num - r + 1; sp >= 1 ; sp--){
//                System.out.print(" ");
//
//            }
//            for (int c = 1; c <= r ; c++) {
//                System.out.print("*");
//            }
//            for (int c = r - 1 ; c >= 1; c--){
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
}
