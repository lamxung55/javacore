package com.plus.ex63;

/**
 * Created by Mina Mimi on 10/20/2020.
 */
public class SmartPhone {
//    - String brand (Thương hiệu Samsung, Apple, Sony...)
//	- boolean hasBluetooth (Có Bluetooth hay ko)
//	- boolean has5G (Có 5G hay ko)
//	- boolean hasWifi (Có wifi hay ko)
//	- String os (Hệ điều hành)
//	- float memory (Bộ nhớ GB)
//	- String color (Màu)
//	- long price (Giá bán)
//	- int totalSold (Tổng số đã bán được)
    private String brand;
    private boolean hasBluetooth;
    private boolean has5g;
    private boolean hasWifi;
    private String os;
    private float memory;
    private String color;
    private long price;
    private int totalSold;

    public SmartPhone(String brand, boolean hasBluetooth, boolean has5g, boolean hasWifi, String os, float memory, String color, long price, int totalSold) {
        this.brand = brand;
        this.hasBluetooth = hasBluetooth;
        this.has5g = has5g;
        this.hasWifi = hasWifi;
        this.os = os;
        this.memory = memory;
        this.color = color;
        this.price = price;
        this.totalSold = totalSold;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public boolean isHas5g() {
        return has5g;
    }

    public void setHas5g(boolean has5g) {
        this.has5g = has5g;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", hasBluetooth=" + hasBluetooth +
                ", has5g=" + has5g +
                ", hasWifi=" + hasWifi +
                ", os='" + os + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", totalSold=" + totalSold +
                '}';
    }
}
