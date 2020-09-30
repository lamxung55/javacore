package com.plus.javacore.type;

/**
 * Created by Mina Mimi on 9/30/2020.
 */
public class Example1 {
    public static void main(String[] args) {

        /**
         * Kieu du lieu nguyen thuy (primitive)
         */

        // Cac kieu so
        // So nguyen
        byte a = 10;
        Byte b = 10; //Boxing

        short c = -10;
        Short d = 10;



        System.out.println("Kieu " + Short.TYPE + "-Do dai:" + Short.SIZE + " - Min:" + Short.MIN_VALUE + " - Max:" + Short.MAX_VALUE );
        System.out.println("Kieu " + Integer.TYPE + "-Do dai:" + Integer.SIZE + " - Min:" + Integer.MIN_VALUE + " - Max:" + Integer.MAX_VALUE );
        System.out.println("Kieu " + Long.TYPE + "-Do dai:" + Long.SIZE + " - Min:" + Long.MIN_VALUE + " - Max:" + Long.MAX_VALUE );
        //So thuc

        float amount = 10.12f;
        double  myBalance = 10.12d;
        System.out.println("Kieu " + Float.TYPE + "-Do dai:" + Float.SIZE + " - Min:" + Float.MIN_VALUE + " - Max:" + Float.MAX_VALUE );
        System.out.println("Kieu " + Double.TYPE + "-Do dai:" + Double.SIZE + " - Min:" + Double.MIN_VALUE + " - Max:" + Double.MAX_VALUE );

        // Kieu logic
        boolean test = false;
        System.out.println("Test:" + test);
        test = true;
        System.out.println("Test:" + test);
        if(test == true) {
            System.out.println("This is correct");
        } else {
            System.out.println("This is incorrect");
        }

        //Kieu ky tu
        char mychar = 'x';
        System.out.println("My char:" + mychar);


        /**
         * Kieu du lieu doi tuong (non - primitive)
         */


        //String
        String s = "abc";
        System.out.println("s:" + s);
        //Mang
        int[] myArray = {1,2,3};
        System.out.println("MyArray1:" + myArray[0]);

        //Doi tuong
        Test myIns = new Test();
    }
}
