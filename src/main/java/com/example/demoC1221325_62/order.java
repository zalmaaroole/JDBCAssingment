package com.example.demoC1221325_62;





public class order {
    private int orderId;
    private String orderName;
    private double price;

    // setter
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //getters

    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public double getPrice() {
        return price;
    }
}