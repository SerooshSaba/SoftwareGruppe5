package com.bidly.Core.Model;

public class Store {

    int store_id;
    String name;

    public Store( int store_id, String name ) {
        this.store_id = store_id;
        this.name = name;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}