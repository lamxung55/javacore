package com.plus.ex62;

/**
 * Created by Mina Mimi on 10/20/2020.
 */
public class Test {
    public static void main(String[] args) {
//        + Nhập vào thông tin sinh viên.
//                + In ra tổng số sinh viên đỗ.
//        + In ra tổng số sinh viên trượt.
//        + In ra thông tin sinh viên có điểm GPA cao nhất.
//        + In ra thông tin sinh viên có điểm GPA thấp nhất.
        StudentManager studentManager = new StudentManager();
        System.out.println("Tong so sv do:" + studentManager.countPassedStudent());
        System.out.println("Tong so sv truot:" + studentManager.countFailedStudent());
        System.out.println("Max gpa:" + studentManager.getMaxGpaStudent());
        System.out.println("Min gpa:"  + studentManager.getMinGpaStudent());

    }
}
