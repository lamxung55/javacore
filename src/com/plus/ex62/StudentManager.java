package com.plus.ex62;

import java.util.Scanner;

/**
 * Created by Mina Mimi on 10/20/2020.
 */
public class StudentManager {
//    Tổng số sinh viên n.
//    + Danh sách sinh viên (Student[] students).
    private int numberOfStudents;
    private Student[] students;

    public StudentManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of students:");
        this.numberOfStudents = scanner.nextInt();
        students = new Student[numberOfStudents];
        for(int i= 0;i< students.length; i++) {
            System.out.print("Nhap ten:");
            scanner.nextLine();//Khong co y nghia
            String name = scanner.nextLine();
            System.out.print("Nhap diem trung binh:");
            float gpa = scanner.nextFloat();
            Student student = new Student(name,gpa);
            students[i] = student;
        }
    }

//        + Nhập vào thông tin từng sinh viên khi khởi tạo lớp.
//    + Đếm tổng số sinh viên đỗ.
//            + Đếm tổng số sinh viên trượt.
//            + Tìm sinh viên có điểm gpa cao nhất.
//            + Tìm sinh viên có điểm gpa thấp nhất.
    public int countPassedStudent() {
        int count = 0;
        for(Student element:students) {
            if(element.checkPass()) {
                count++;
            }
        }
        return  count;
    }
    public int countFailedStudent() {
        int count = 0;
        for(Student element:students) {
            if(!element.checkPass()) {
                count++;
            }
        }
        return  count;
    }

    public Student getMaxGpaStudent() {
        Student result = students[0];
        for(Student student:students) {
            if(student.getGpa()>=result.getGpa()) {
                result = student;
            }
        }
        return  result;
    }

    public Student getMinGpaStudent() {
        Student result = students[0];
        for(Student student:students) {
            if(student.getGpa()<=result.getGpa()) {
                result = student;
            }
        }
        return  result;
    }

}
