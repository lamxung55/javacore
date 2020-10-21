package com.plus.ex63;

import java.util.Arrays;

/**
 * Created by Mina Mimi on 10/20/2020.
 */
public class Store {
//    String name; (Tên cửa hàng).
//            - String address; (Địa chỉ cửa hàng).
//            - int n; (Tổng số điện thoại có trong của hàng).
//            - SmartPhone[] phones; (Mảng danh sách các điện thoại có trong cửa hàng).

    private String storeName;
    private String address;
    private SmartPhone[] phones;

    public Store(String storeName, String address, SmartPhone[] phones) {
        this.storeName = storeName;
        this.address = address;
        this.phones = phones;
    }

    /**
     * Dem tong so dt da ban cua cua hang
     * @return int
     */
    public int countTotalSold() {
        int count = 0;
        for(SmartPhone smartPhone:phones) {
            count += smartPhone.getTotalSold();
        }
        return count;
    }

    /**
     *
     * @return
     */
    public float getTotalRevenue() {
        float revenue = 0;
        for(SmartPhone smartPhone:phones) {
            revenue += smartPhone.getTotalSold()*smartPhone.getPrice();
        }
        return  revenue;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SmartPhone[] getPhones() {
        return phones;
    }

    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeName='" + storeName + '\'' +
                ", address='" + address + '\'' +
                ", phones=" + Arrays.toString(phones) +
                '}';
    }
}
