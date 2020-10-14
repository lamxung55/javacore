package com.plus.practice.exercises.ex5;

/**
 * Created by Mina Mimi on 10/14/2020.
 */
public class Amstrong {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 500; i++) {
//            int hangtram = i / 100;
//            int hangtruc = (i - hangtram * 100) / 10;
//            int hangdv = i - 100 * hangtram - 10 * hangtruc;
//            //System.out.printf("tram:%d-truc:%d-dv:%d\n",hangtram,hangtruc,hangdv);
//            if (hangtram > 0) {
//                if (i == hangtram * hangtram * hangtram + hangtruc * hangtruc * hangtruc + hangdv * hangdv * hangdv) {
//                    System.out.println(i + " is Amstrong number");
//                }
//            } else if (hangtruc > 0) {
//                if (i == hangtruc * hangtruc + hangdv * hangdv) {
//                    System.out.println(i + " is Amstrong number");
//                }
//            } else {
//                if (i == hangdv) {
//                    System.out.println(i + " is Amstrong number");
//                }
//            }
//
//        }
//    }

    //Cach 2
    public static void main(String[] args) {
        for (int i = 1; i < 500; i++) {
            char[] charArray = String.valueOf(i).toCharArray();
            int pow = charArray.length;
            int sum = 0;
            for(char myNum:charArray) {
                sum = sum + (int)Math.pow(Character.getNumericValue(myNum),pow);
            }
            if(sum == i) {
                System.out.println(i + " is Amstrong number");
            }

        }
    }
}
