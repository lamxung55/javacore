package com.plus.practice.exercises.ex6.student;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mina Mimi on 10/18/2020.
 */
public class StudentManagement {
    private int totalStudent;

    private Student[] students;

    public StudentManagement() {
        System.out.println("Input total students:");
        Scanner sc = new Scanner(System.in);
        this.totalStudent = sc.nextInt();
        students = new Student[totalStudent];
        for (int i = 0; i < totalStudent; i++) {
            System.out.print("Name [" + i + "]:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("GPA [" + i + "]:");
            float gpa = sc.nextFloat();
            students[i] = new Student(name, gpa);
        }
        int x = 0;
    }

    public int getPassedStudent() {
        int count = 0;
        for (Student student : students) {
            if (student.checkPass()) {
                count++;
            }
        }
        return count;

    }

    public int getFailedStudent() {
        int count = 0;
        for (Student student : students) {
            if (!student.checkPass()) {
                count++;
            }
        }
        return count;
    }

    //    public Student getGpaMaxMin(boolean isMax) {
//        float[] lstGpa = new float[students.length];
//        for (int i = 0;i < students.length; i++) {
//            lstGpa[i] = students[i].getGpa();
//        }
//        Arrays.sort(lstGpa);
//        for(Student student:students) {
//            if(isMax) {
//                if (student.getGpa() == lstGpa[lstGpa.length - 1]) {
//                    return student;
//                }
//            } else {
//                if (student.getGpa() == lstGpa[0]) {
//                    return student;
//                }
//            }
//        }
//        return null;
//    }
    public Student getGpaMaxMin(boolean isMax) {
        Student result = students[0];
        if(isMax) {
            for (int i = 0; i < students.length ; i++) {
                if(students[i].getGpa() >= result.getGpa()){
                    result = students[i];
                }
            }
        }else {
            for (int i = 0; i < students.length ; i++) {
                if(students[i].getGpa() <= result.getGpa()){
                    result = students[i];
                }
            }
        }
        return  result;
    }

    //     + Nhập vào thông tin sinh viên.
//            + In ra tổng số sinh viên đỗ.
//    + In ra tổng số sinh viên trượt.
//    + In ra thông tin sinh viên có điểm GPA cao nhất.
//    + In ra thông tin sinh viên có điểm GPA thấp nhất.
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        System.out.println("Total passed:" + studentManagement.getPassedStudent());
        System.out.println("Total failed:" + studentManagement.getFailedStudent());
        System.out.println("Max gpa student:" + studentManagement.getGpaMaxMin(true).getName());
        System.out.println("Min gpa student:" + studentManagement.getGpaMaxMin(false).getName());
    }

}
