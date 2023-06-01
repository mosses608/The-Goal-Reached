package com.SpringBoot.MyString.repository;

import com.SpringBoot.MyString.entity.OrderTracking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTrackingRepository extends JpaRepository<OrderTracking, Long> {
}
