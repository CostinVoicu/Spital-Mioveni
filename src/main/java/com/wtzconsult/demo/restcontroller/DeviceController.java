package com.wtzconsult.demo.restcontroller;

import com.wtzconsult.demo.bo.Device;
import com.wtzconsult.demo.models.DeviceRequestModel;
import com.wtzconsult.demo.service.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("device")
public class DeviceController {

    public final DeviceService deviceService;

    @PostMapping("/createDevice")
    public ResponseEntity<?> createDevice(@RequestBody DeviceRequestModel deviceRequestModel) {

        return ResponseEntity.ok(deviceService.createDevice(deviceRequestModel));
    }


    @PutMapping("/updateDevice")
    public ResponseEntity<?> updateDevice(@RequestBody DeviceRequestModel deviceRequestModel, @RequestParam Long deviceId) {

        return ResponseEntity.ok(deviceService.updateDevice(deviceRequestModel, deviceId));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllDevice(){
        return ResponseEntity.ok(deviceService.getAllDevice());
    }
    @GetMapping("/getByCamera")
    public ResponseEntity<?>getByCameraIp(@RequestParam String camera){
        return ResponseEntity.ok(deviceService.getByCameraIp(camera));
    }
}
