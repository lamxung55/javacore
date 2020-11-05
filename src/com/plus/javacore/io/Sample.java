package com.plus.javacore.io;

import java.io.*;

public class Sample {
    public static void main(String[] args) {

        /**
         * OutputStream: Write to file
         */
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("abc.txt");
            String s = "Hello";
            byte[] bytes = s.getBytes();
            outputStream.write(bytes);
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * InputStream: Read from file su dung FileInputStream
         */
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("abc.txt");
            System.out.println(inputStream.available());
            int in;
            while ((in = inputStream.read()) != -1 ) {
                System.out.print((char)in);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * Read from file su dung BufferedInputStream
         */
        System.out.println("========================");
        inputStream = null;
        BufferedInputStream bf = null;
        try {
            inputStream = new FileInputStream("abc.txt");
            bf = new BufferedInputStream(inputStream);
            int in;
            while ((in = bf.read()) != -1 ) {
                System.out.print((char)in);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bf.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * Read file from InputStreamReader
         */
        try {
            inputStream = new FileInputStream("abc.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            int read = 0;
            while ((read = inputStreamReader.read()) != -1) {
                System.out.print((char)read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        /**
         * ObjectInputStream: write
         */
        ObjectOutput objectOutput = null;
        try {
            objectOutput = new ObjectOutputStream(new FileOutputStream("abc.txt"));
            Student student = new Student("SV1",12);
            objectOutput.writeObject(student);
            System.out.println("Finished");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * ObjectInputStream: read
         */
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
            Student student = (Student) objectInputStream.readObject();
            System.out.println("Finished");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * BufferReader
         */
        System.out.println("=====================BufferReader=======================");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            //Cach 1:
//            String line;
//            while((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
            //Cach 2:
            int mychar;
            while((mychar = br.read()) != -1) {
                System.out.print((char)mychar);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * =======================================================
         * =======================================================
         * Writer
         */

        /**
         * BufferedWriter: write
         */
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("out.txt"));
            bw.write("Xin chao");
            bw.newLine();
            bw.write("Good bye");
            System.out.println("Finished");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * PrintWriter: write
         */
//        PrintWriter printWriter = null;
//        try {
//            printWriter = new PrintWriter(new FileOutputStream("out2.txt"));
//            printWriter.write("Xin chào - Tạm biệt");
//            System.out.println("PrintWriter Finished");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                printWriter.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }



    }
}
