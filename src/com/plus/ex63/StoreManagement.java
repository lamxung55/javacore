package com.plus.ex63;

/**
 * Created by Mina Mimi on 10/20/2020.
 */
public class StoreManagement {
//    - int n; (Tổng số cửa hàng cần quản lý).
//            - Store[] stores; (Danh sách các cửa hàng).

    public enum PHONE_TYPE {
        BLUETOOTH,
        _5G,
        WIFI
    }

    private Store[] stores;

    public StoreManagement(Store[] stores) {
        this.stores = stores;
    }

    public int countPhoneByType(PHONE_TYPE phone_type) {
        int count = 0;
        for (Store store : stores) {
            for (SmartPhone smartPhone : store.getPhones()) {
                switch (phone_type) {
                    case _5G:
                        if (smartPhone.isHas5g()) {
                            count++;
                        }
                        break;
                    case BLUETOOTH:
                        if (smartPhone.isHasBluetooth()) {
                            count++;
                        }
                        break;
                    case WIFI:
                        if (smartPhone.isHasWifi()) {
                            count++;
                        }
                        break;
                    default:
                        count++;
                }
            }
        }
        return  count;
    }

    public Store getBestSeller() {
        Store result = stores[0];
        for(Store store:stores) {
            if(store.countTotalSold() >= result.countTotalSold()) {
                result = store;
            }
        }
        return result;
    }


}
