package com.plus.practice.exercises.storemanagement;

public class Store {
//    String name; (Tên cửa hàng).
//            - String address; (Địa chỉ cửa hàng).
//            - int n; (Tổng số điện thoại có trong của hàng).
//            - SmartPhone[] phones; (Mảng danh sách các điện thoại có trong cửa hàng).

    private String storeName;
    private String address;
    //    private int n;
    private SmartPhone[] phones;

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

//    - Tính tổng số lượng điện thoại bán được.
    public int getTotalSold() {
        int count = 0;
        for(SmartPhone smartPhone: phones) {
            count += smartPhone.getTotalSold();
        }
        return count;
    }
    public long getTotalRevenue() {
        int rev = 0;
        for(SmartPhone smartPhone: phones) {
            rev += smartPhone.getTotalSold()*smartPhone.getPrice();
        }
        return rev;
    }

}
