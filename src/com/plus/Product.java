package com.plus;

import com.plus.test.Customer;
import com.plus.test.Student;

import java.util.Date;

/**
 * Created by Mina Mimi on 10/16/2020.
 */
public class Product {
    private double price;
    private String name;
    private String color;
    private Date expiredDate;
    public int size;

    public int getProductSize() {
        return size;
    }

    public int doSomething(){
        System.out.println("Do somthing");
        Customer customer = new Customer();
        customer.test(this);
        return 100;
    }

    public Product(){
    }

    public Product(String name, int size){
        this.name = name;
        this.size = size;
    }

    private void test(Product myProduct) {
        System.out.println("TEST============");
    }



    public static void main(String[] args) {
        Product product = new Product();
        product.doSomething();

    }
}
