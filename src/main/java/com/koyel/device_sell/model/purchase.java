package com.koyel.device_sell.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * this is a class to store device purchase details
 * @author koyel
 * @date 01.04.2022
 */
@Data
@Entity
@Table(name = "purchases")
public class purchase
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)//it is only for foreign key.
    private user user;

    @Column(name = "device_id", nullable = false)
    private Long deviceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id", referencedColumnName = "id", insertable = false, updatable = false)
    private device device;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "purchase_time", nullable = false)
    private LocalDateTime purchaseTime;
}