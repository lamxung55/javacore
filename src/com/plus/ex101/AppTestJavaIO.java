package com.plus.ex101;

import java.io.*;
import java.util.Scanner;

public class AppTestJavaIO {
    public static void main(String[] args) {
        //Check file exist or not:

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input a file path:");
//        String filePath = scanner.nextLine();
//        if(new File(filePath).exists()) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//
//        System.out.print("Input a folder path:");
//        String folderPath = scanner.nextLine();
//        //scanner.nextLine();
//        System.out.print("Input a extension:");
//        String extension = scanner.nextLine();
//        File file = new File(folderPath);
//        String[] filesInFolder = file.list();
//        for(String myFile:filesInFolder) {
//            if(myFile.endsWith(extension)) {
//                System.out.println(myFile);
//            }
//        }


        System.out.print("Input a text file path:");
        String filePath = scanner.nextLine();
        BufferedReader bf = null;
        String maxLengthWord = "";
        try {
            bf = new BufferedReader(new FileReader(filePath));
            String line = "";
            while((line = bf.readLine()) != null) {
                String[] words = line.split(" ");
                for(String word:words) {
                    if(word.length() >= maxLengthWord.length()) {
                        maxLengthWord = word;
                    }
                }
            }
            System.out.println("Max length word:" + maxLengthWord);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
