//Hello
package com.plus.javacore;

import java.util.Scanner;

public  class Subject3 {
    public static void main(String[] args) {
        System.out.println("This is Subject3...");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            System.out.println("Hello:" + input);
            if(input.equals("Exit")) {
                break;
            }
        }

    }
}