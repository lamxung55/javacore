package com.plus.test;

import com.plus.Product;

/**
 * Created by Mina Mimi on 10/16/2020.
 */
public class Customer {
    public void test(Product product) {
        System.out.println(product.getProductSize());
        product.size = 10000;
    }
}
