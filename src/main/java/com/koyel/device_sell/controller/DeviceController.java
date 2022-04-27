package com.koyel.device_sell.controller;

import com.koyel.device_sell.model.device;
import com.koyel.device_sell.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/device")//pre path
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    /**
     * this method save a new device
     * @param device
     * @return http status
     */

    @PostMapping
    public ResponseEntity<?> saveDevice(@RequestBody device device)
    {
        return new ResponseEntity<>(deviceService.saveDevice(device), HttpStatus.CREATED);
    }

    /**
     * this method delete device details by device id
     * @param deviceId
     * @return http status
     */
    @DeleteMapping("{deviceId}")//api/device/{deviceId}
    public ResponseEntity<?> deleteDevice(@PathVariable Long deviceId){
        deviceService.deleteDevice(deviceId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping//api/devices
    public ResponseEntity<?> getAllDevices()
    {
        return new ResponseEntity<>(deviceService.findAllDevices(),HttpStatus.OK);
    }
}
