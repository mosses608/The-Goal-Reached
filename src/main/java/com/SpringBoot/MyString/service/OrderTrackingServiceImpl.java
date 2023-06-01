package com.SpringBoot.MyString.service;

import com.SpringBoot.MyString.entity.OrderTracking;
import com.SpringBoot.MyString.repository.OrderTrackingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class OrderTrackingServiceImpl implements OrderTrackingService{
    private OrderTrackingRepository orderTrackingRepository;
    @Override
    public OrderTracking createOrderTracking(OrderTracking orderTracking) {
        return orderTrackingRepository.save(orderTracking);
    }

    @Override
    public OrderTracking getOrderTrackingById(Long orderTrackingId) {
        Optional<OrderTracking> optionalOrderTracking=orderTrackingRepository.findById(orderTrackingId);
        return optionalOrderTracking.get();
    }

    @Override
    public List<OrderTracking> getAllOrdersTracking() {
        return orderTrackingRepository.findAll();
    }

    @Override
    public OrderTracking updateOrderTracking(OrderTracking orderTracking) {
        OrderTracking orderTracking1=orderTrackingRepository.findById(orderTracking.getId()).get();
        orderTracking1.setOrderTrackingName(orderTracking.getOrderTrackingName());
        orderTracking1.setOrderTrackingAddress(orderTracking1.getOrderTrackingAddress());
        orderTracking1.setOrderTrackingStatus(orderTracking1.getOrderTrackingStatus());
        OrderTracking updatedOrderTracking=orderTrackingRepository.save(orderTracking);
        return updatedOrderTracking;
    }

    @Override
    public void deleteOrderTracking(Long orderTrackingId) {

    }
}
