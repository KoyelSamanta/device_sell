package com.koyel.device_sell.repository.projection;

import com.koyel.device_sell.model.deviceType;

import java.time.LocalDateTime;

public interface PurchaseItem {
    String getName();
    deviceType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();


}
