package com.plus.javacore.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Mina Mimi on 11/3/2020.
 */
public class Sample {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            System.out.print("Nhap input:");
//            int input = scanner.nextInt();
//            System.out.println("Ket qua:" + 100/input);
//
//        }
        File file = new File("abc");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            int x = 100;
        }  finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.println(test(0));
        } catch (Exception ex){
            System.out.println("Co loi xay ra");
        }

    }

    private static int test(int input) throws Exception{
        try {
            return 100/input;
        } catch (Exception ex) {
            //throw ex;
            System.out.println("error");
        } finally {
            System.out.println("Ket thuc");
        }
        return 1;
    }
}
