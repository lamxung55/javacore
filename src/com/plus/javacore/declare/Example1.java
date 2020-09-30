package com.plus.javacore.com.plus.declare;

/**
 * Created by Mina Mimi on 10/1/2020.
 */
public class Example1 {
    private int x = 0;//Day la bien instance (global), khoi tao trong heap  mem
    private static int y = 10; //Day la bien static, khoi tao trong static mem
    private static final int k = 100; //Day la bien constant static mem
    private int test() {
        int z = 10; //Day la bien local, khoi tao strong stack mem
        return z;
    }

    public static void main(String[] args) {
        System.out.println(y + k); //Phuong thuc static chi goi bien static
        Example1 example1 = new Example1();
        System.out.println("Result:" + example1.test());
    }
}
