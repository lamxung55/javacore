package com.plus.javacore.enumsample;
public class Sample {
    enum Season {
        SPRING(5), SUMMER(10), FALL(15), WINTER(20);

        private int value;

        private Season(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Season test = Season.SUMMER;
        System.out.println(test.value);
//        for (MY_ENUM my:MY_ENUM.values()) {
//            System.out.println(my);
//        }

    }
}

