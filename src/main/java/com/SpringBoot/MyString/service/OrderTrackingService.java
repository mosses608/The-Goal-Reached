package com.SpringBoot.MyString.service;

import com.SpringBoot.MyString.entity.OrderTracking;

import java.util.List;

public interface OrderTrackingService {
    OrderTracking createOrderTracking(OrderTracking orderTracking);
    OrderTracking getOrderTrackingById(Long orderTrackingId);
    List<OrderTracking> getAllOrdersTracking();
    OrderTracking updateOrderTracking(OrderTracking orderTracking);
    void deleteOrderTracking(Long orderTrackingId);
}
