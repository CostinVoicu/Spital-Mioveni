package com.wtzconsult.demo.repository;

import com.wtzconsult.demo.bo.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;

public interface DeviceRepository extends JpaRepository<Device, Long> {
 public Device findByCamera(String camera);
}
