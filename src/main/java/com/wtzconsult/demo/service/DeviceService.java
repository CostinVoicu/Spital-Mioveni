package com.wtzconsult.demo.service;

import com.wtzconsult.demo.bo.Device;
import com.wtzconsult.demo.bo.Paturi;
import com.wtzconsult.demo.models.DeviceRequestModel;
import com.wtzconsult.demo.models.DeviceResponseModel;
import com.wtzconsult.demo.repository.DeviceRepository;
import com.wtzconsult.demo.repository.PaturiRepository;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeviceService {

    private final DeviceRepository deviceRepository;

    private final PaturiRepository paturiRepository;
    private final ModelMapper modelMapper;

    public DeviceResponseModel createDevice(DeviceRequestModel deviceRequestModel) {
        Paturi paturi = paturiRepository.findById(deviceRequestModel.getBedId()).orElse(null);
        Device newDevice = modelMapper.map(deviceRequestModel, Device.class);

        newDevice.setPaturi(paturi);
        newDevice = deviceRepository.save(newDevice);
        return modelMapper.map(newDevice, DeviceResponseModel.class);


    }

    public DeviceResponseModel updateDevice(DeviceRequestModel deviceRequestModel, Long deviceId) {
        Device device = deviceRepository.findById(deviceId).orElse(null);
        modelMapper.map(deviceRequestModel, device);
        Paturi paturi = paturiRepository.findById(deviceRequestModel.getBedId()).orElse(null);
        device.setPaturi(paturi);
        deviceRepository.save(device);
        return modelMapper.map(device, DeviceResponseModel.class);
    }

    public List<Device> getAllDevice() {
        return deviceRepository.findAll();
    }

    public Device getByCameraIp(String camera) {
        return deviceRepository.findByCamera(camera);
    }

}