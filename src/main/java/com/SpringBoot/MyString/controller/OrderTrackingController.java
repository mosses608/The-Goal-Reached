package com.SpringBoot.MyString.controller;

import com.SpringBoot.MyString.entity.OrderTracking;
import com.SpringBoot.MyString.service.OrderTrackingService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/ordertracking")
public class OrderTrackingController {
    private OrderTrackingService orderTrackingService;

    //build create order trracking rest api
    //http:/localhost:8080/api/ordertracking
    @PostMapping
    public ResponseEntity<OrderTracking> createOrderTracking(@RequestBody OrderTracking orderTracking){
        OrderTracking orderTracking1=orderTrackingService.createOrderTracking(orderTracking);
        return new ResponseEntity<>(orderTracking1, HttpStatus.CREATED);
    }

    //BUILD GET ORDERTARCKING BY ID REST API
    @GetMapping("{id}")
    public ResponseEntity<OrderTracking> getOrderTrackingById(@PathVariable("id") Long orderTrackingId){
        OrderTracking orderTracking2=orderTrackingService.getOrderTrackingById(orderTrackingId);
        return new ResponseEntity<>(orderTracking2, HttpStatus.OK);
    }
    //build get all order tracking rest api
    @GetMapping({"all"})
    public ResponseEntity<List<OrderTracking>> getAllOrderTracking(){
        List<OrderTracking> orderTrackings=orderTrackingService.getAllOrdersTracking();
        return new ResponseEntity<>(orderTrackings, HttpStatus.OK);
    }

    //build update order tracking rest api
    @PutMapping("{id}")
    public ResponseEntity<OrderTracking> updateOrderTracking(@PathVariable("id") Long orderTrackingId, @RequestBody OrderTracking orderTracking){
        orderTracking.setId(orderTrackingId);
        OrderTracking orderTracking3=orderTrackingService.updateOrderTracking(orderTracking);
        return new ResponseEntity<>(orderTracking3, HttpStatus.OK);
    }

    //build delete order tracking rest api
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrderTracking(@PathVariable("id") Long orderTracking){
        orderTrackingService.deleteOrderTracking(orderTracking);
        return new ResponseEntity<>("Order tracked deleted successfully!", HttpStatus.OK);
    }
}
