package com.plus.practice.exercises.storemanagement;

public class StoreManagement {
    private Store[] stores;


    public static enum PHONE_TYPE {
        _5G,
        BlueTooth,
        Wifi,
        Full
    }

    public StoreManagement(Store[] stores) {
        this.stores = stores;
    }

    public Store[] getStores() {
        return stores;
    }

    public void setStores(Store[] stores) {
        this.stores = stores;
    }

    public int count5GBLWF(PHONE_TYPE phone_type) {
        int count = 0;
        for (Store store : stores) {
            for (SmartPhone smartPhone : store.getPhones()) {
                switch (phone_type) {
                    case Full:
                        if (smartPhone.isHas5g() && smartPhone.isHasBluetooth() && smartPhone.isHasWifi()) {
                            count++;
                        }
                        break;
                    case _5G:
                        if (smartPhone.isHas5g()) {
                            count++;
                        }
                        break;
                }

            }
        }
        return count;
    }

    public Store getRevenueMaxMin(boolean getMax) {
        Store result = stores[0];
        for(Store store:stores) {
            if(getMax) {
                if(store.getTotalRevenue() >= result.getTotalRevenue()) {
                    result = store;
                }
            } else {
                if(store.getTotalRevenue() <= result.getTotalRevenue()) {
                    result = store;
                }
            }
        }
        return result;
    }
}
