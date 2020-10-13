package com.plus.javacore.array;

public class Sample {
    public static void main(String[] args) {
        //1. Khai bao
        int[] myArray1; // Khai chua dinh nghia max length, khai max length va gan gia tri sau myArray1 = new int[3];
        int[] myArray2 = new int[5]; // Khai bao da dinh nghia max length, gan gia tri sau
        int[] myArray3 = {1,2,3,4,5}; // Khai bao va gan gia tri luon khong dung new
        int[] myArray4 = new int[]{1,2,3,4,5}; // Khai bao va gan gia tri luon, co dung new

        //2. Truy cap phan tu:
        myArray1 = new int[3];
        myArray1[2] = 10;
        System.out.println(myArray1[2]);

        //3. Duyet mang: CACH 1
        for (int i = 0; i< myArray1.length; i++) {
            System.out.println(myArray1[i]);
        }
        //CACH 2
        for (int element: myArray1) {
            System.out.println(element);
        }

        //VD ve tham chieu:
        System.out.println("Before:" + myArray1[2]);
        testRef(myArray1);
        System.out.println("After:" + myArray1[2]);

        //My n chieu:
        int[][] multiDimension = {{1,2,8},{3,4,5}};
        for (int[] row:multiDimension) {
            for (int cell:row){
                System.out.println(cell);
            }
        }
    }

    private static void testRef(int[] inputArray) {
        inputArray[2] = 100;
    }
}
