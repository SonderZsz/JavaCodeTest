package Dont;

import java.util.Objects;

public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(620,"o1");
        Order o2 = new Order(620,"o1");
        System.out.println(o1.equals(o2));
    }

}
class Order{
    private int orderId;
    private String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(o instanceof Order){
            Order order = (Order)o;
            return this.orderId == order.orderId &&
                   this.orderName.equals(order.orderName);
            // return this.orderId == order.orderId &&
            //                   this.orderName == order.orderName;
            // 这里用==不对，String常量相同会复用
        }
        return false;
    }

}