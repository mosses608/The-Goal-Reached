package com.SpringBoot.MyString.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ordertracking")
public class OrderTracking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String orderTrackingName;
    @Column(nullable = false)
    private String orderTrackingAddress;
    @Column(nullable = false)
    private String orderTrackingStatus;
}
