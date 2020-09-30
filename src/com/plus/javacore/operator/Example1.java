package com.plus.javacore.operator;

/**
 * Created by Mina Mimi on 10/1/2020.
 */
public class Example1 {
    public static void main(String[] args) {

        /**
         * So hoc
         */
        int a = 10, b = 2;
        System.out.println(++a);
        System.out.println(a++);
        a += 2; // Cong 2 xong roi gan
        System.out.println(a);
        a -= 2; // Tru 2 xong roi gan
        System.out.println(a);
        a /= 2; // Chia 2 xong roi gan
        System.out.println(a);
        a %= 2; // Chia lay so du xong roi gan
        System.out.println(a);

        /**
         * So sanh (quan he)
         */
        if(a>b) {
            System.out.println("a > b");
        }
        if(a<b) {
            System.out.println("a < b");
        }
        if(a==b) {
            System.out.println("a = b");
        }
        if(a!=b) {
            System.out.println("a # b");
        }


        /**
         * Logic
         */
        boolean x = true, y = false;
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(x^y);
        System.out.println(x!=y);


        /**
         * Bit operator
         */
        int x1 = 10;
        int y1 = 5;
        System.out.println("x1 in binary:" + Integer.toBinaryString(x1));
        System.out.println("y1 in binary:" + Integer.toBinaryString(y1));
        System.out.println(Integer.toBinaryString(x1&y1));
        System.out.println(x1&y1);
        System.out.println(Integer.toBinaryString(x1>>1));
        System.out.println(x1>>1);
        System.out.println(Integer.toBinaryString(x1<<1));
        System.out.println(x1<<1);

    }
}
