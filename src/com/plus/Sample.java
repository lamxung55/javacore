package com.plus;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Mina Mimi on 11/5/2020.
 */
public class Sample {
    public static void main(String[] args) {
        //Doc file D://test.txt
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream("D://test.txt");
//            System.out.println("Available byte:" + fileInputStream.available());
//            int mybyte;
//            while ((mybyte = fileInputStream.read()) != -1) {
//                System.out.print((char) mybyte);
//            }
//            fileInputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fileInputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        //Doc file D://test.txt dung BufferedInputStream
//        BufferedInputStream bufferedInputStream = null;
//        try {
//            bufferedInputStream = new BufferedInputStream(new FileInputStream("D://test.txt"));
//            int myByte;
//            while((myByte = bufferedInputStream.read()) != -1 ){
//                System.out.print((char)myByte);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedInputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader("D://test.txt"));
//            String line;
//            while((line = reader.readLine()) != null) {//Ctrl + Q
//                System.out.println(line);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        String test = "Xin chao";
//        byte[] myBytes = test.getBytes();
//        FileOutputStream fileOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream("D://out.txt");
//            fileOutputStream.write(myBytes);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fileOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        Student student = new Student("SV test",18);
//        ObjectOutputStream outputStream = null;
//        try {
//            outputStream = new ObjectOutputStream(new FileOutputStream("D://out.txt"));
//            outputStream.writeObject(student);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        ObjectInputStream objectInputStream = null;
//        try {
//            objectInputStream = new ObjectInputStream(new FileInputStream("D://out.txt"));
//            Student studentIn = (Student)objectInputStream.readObject();
//
//            System.out.println(studentIn.toString());
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            objectInputStream.close();
//        }


//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D://out2.txt"));
//
//        bufferedWriter.write("Chao cac ban......................");
//
//        bufferedWriter.close();
//
//        System.out.println("Finished");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("x:" + x + "-name:" + name);

//        PrintWriter printWriter2 = null;
//        try {
//            printWriter2 = new PrintWriter(new FileOutputStream("D://out3.txt"));
//            printWriter2.write("Xin chào - Tạm biệt");
//            System.out.println("PrintWriter Finished");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                printWriter2.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

    }
}
