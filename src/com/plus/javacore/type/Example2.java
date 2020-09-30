package com.plus.javacore.type;

/**
 * Created by Mina Mimi on 10/1/2020.
 */
public class Example2 {
    /**
     * Type casting
     */

    public static void main(String[] args) {
        //Noi rong: widening
        //byte --> short --> int --> long --> float --> double
//        int i = 100;
//        long l = i;
//        float f = l;
//        double d = f;
//        System.out.println(String.format("%d - %d - %.2f - %.2f",i,l,f,d));

        //Thu hep: narrowing
        //double --> float --> long --> int --> short --> byte

        double d = 100.04;
        long l = (long) d; // yêu cầu chỉ định kiểu dữ liệu (long)
        int i = (int) l; // yêu cầu chỉ định kiểu dữ liệu (int)

        System.out.println("Giá trị Double: " + d);
        System.out.println("Giá trị Long: " + l);
        System.out.println("Giá trị Int:  " + i);
    }

}
