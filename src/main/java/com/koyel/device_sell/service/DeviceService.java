package com.koyel.device_sell.service;

import com.koyel.device_sell.model.device;

import java.util.List;

public interface DeviceService
{
    device saveDevice(device device);

    void deleteDevice(Long id);

    List<device> findAllDevices();
}
