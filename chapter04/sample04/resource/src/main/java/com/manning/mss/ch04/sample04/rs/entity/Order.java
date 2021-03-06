package com.manning.mss.ch04.sample04.rs.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Order {

    @JsonProperty("orderId")
    private String orderId;

    @JsonProperty("items")
    private List<LineItem> items;

    @JsonProperty("shippingAddress")
    private String shippingAddress;

    public String getOrderId() {

        return orderId;
    }

    public void setOrderId(String orderId) {

        this.orderId = orderId;
    }

    public List<LineItem> getItems() {

        return items;
    }

    public void setItems(List<LineItem> items) {

        this.items = items;
    }

    public String getShippingAddress() {

        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {

        this.shippingAddress = shippingAddress;
    }

    public void addItem(LineItem item){
        if(items == null){
            items = new ArrayList<LineItem>();
        }

        items.add(item);
    }
}
