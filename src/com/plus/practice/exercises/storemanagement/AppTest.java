package com.plus.practice.exercises.storemanagement;

import java.util.Random;

public class AppTest {
    public static void main(String[] args) {
        Store[] stores = new Store[5];
        Random rd = new Random();

        //Nhap du lieu
        for (int i = 0; i < stores.length; i++) {
            //Dummy
            SmartPhone[] smartPhones = new SmartPhone[5];
            for (int j = 0; j < smartPhones.length; j++) {
                //public SmartPhone(String brand, boolean hasBluetooth, boolean has5g, boolean hasWifi, String os, float memory, String color, long price, int totalSold) {
                SmartPhone phone = new SmartPhone("Hang " + j, false, true, true, "Android", 5, "Red", 10, rd.nextInt(10));
                smartPhones[j] = phone;
            }
            Store storei = new Store();
            storei.setStoreName("Store_" + i);
            storei.setPhones(smartPhones);
            stores[i] = storei;
        }

        //In ra chi tiet:
        for (Store store : stores) {
            for (SmartPhone smartPhone : store.getPhones()) {
                System.out.println(smartPhone.toString());
            }
        }

        //In ra cua hang doanh thu cao nhat

        StoreManagement storeManagement = new StoreManagement(stores);
        System.out.println(storeManagement.getRevenueMaxMin(true).getStoreName());
    }
}
