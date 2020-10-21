package com.plus.ex61;

/**
 * Created by Mina Mimi on 10/20/2020.
 */
public class Rectangle {
//    - Các thuộc tính:
//            + width
//     + height
    private float width;
    private float height;

//    - Các phương thức:
//            + Khởi tạo
//    + Getters/Setters
    //Contrucstor
    public Rectangle(float width,float height) {
        this.width = width;
        this.height = height;
    }

    //getter
    public float getWidth() {
        return width;
    }

    //setter
    public void setWidth(float width) {
        this.width = width;
    }


    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //Tinh chu vi
    public float getCV() {
        return 2*(width+height);
    }

    //Tinh dien tich
    public  float getS() {
        return width*height;
    }

    public void inWidthHeight() {
        System.out.println("width = " + width + "-heigth=" + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
