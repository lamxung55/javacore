package com.plus.ex62;

/**
 * Created by Mina Mimi on 10/20/2020.
 */
public class Student {
//      + name
//    + gpa (Điểm trung bình)
    private String name;
    private float gpa;

//    Các phương thức"
//            + Khởi tạo, getters/setters.
//    + Kiểm tra đỗ/trượt (gpa >=1.5 thì đỗ, ngược lại thì trượt).
//            + In ra thông tin name, gpa.


    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public boolean checkPass() {
        if(this.gpa >= 1.5) {
            return  true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
