package com.koyel.device_sell.repository;

import com.koyel.device_sell.model.device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<device, Long> {

}
