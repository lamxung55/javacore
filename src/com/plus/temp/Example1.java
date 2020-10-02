package com.plus.temp;

/**
 * Created by Mina Mimi on 10/2/2020.
 */
public class Example1 {
    int balance;
    static int total;
    final static int QUOTA = 1000;

    void test() {
        long amount = 100;//Stack
        System.out.println("Amount:" + amount);
        balance = 120;
        System.out.println("Balance:" + balance);
        total = 130;
        System.out.println("Total:" + total);
    }

    public static void main(String[] args) {
        int age  = 10;
        int agE = 5;
//        System.out.println("My age:" + age);
//        System.out.println("My age:" + agE);
        Example1 example1 = new Example1();
        example1.test();
        System.out.println("Total = " + total);

    }
}
