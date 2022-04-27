package com.koyel.device_sell.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * this class create the variable that will be used to store device details
 * @author koyel
 * @date 31.03.2022
 */
@Data
@Entity
@Table(name = "devices")
public class device
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "device_type", nullable = false)
    private deviceType deviceType;


}
