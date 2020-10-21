package com.plus.ex63;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mina Mimi on 10/20/2020.
 */
public class AppTest {
    public static void main(String[] args) {
        //Tao danh sach cua hang
        Store[] stores = new Store[3];
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<stores.length;i++) {
            SmartPhone[] smartPhones = new SmartPhone[10];
            for(int j = 0; j< 10; j++) {
                //Lay tu du lieu nguoi dung nhap hoac lay tu db:
                SmartPhone smartPhone = new SmartPhone("Brand_"+j,random.nextBoolean(),random.nextBoolean(),random.nextBoolean()
                        ,"Android",1.5f,"RED",20,random.nextInt(10));
                smartPhones[j] = smartPhone;
            }
            stores[i] = new Store("Store_"+i,"Address of store_" + i,smartPhones);
            System.out.println(stores[i].toString());
        }

        StoreManagement storeManagement = new StoreManagement(stores);
        Store bestseller = storeManagement.getBestSeller();
        System.out.println("Ban duoc nhieu nhat:" + bestseller);
        System.out.println(bestseller.getStoreName() + " da ban duoc:" + bestseller.countTotalSold());
        System.out.println("So luong dt co 5G:" + storeManagement.countPhoneByType(StoreManagement.PHONE_TYPE._5G));
    }
}
