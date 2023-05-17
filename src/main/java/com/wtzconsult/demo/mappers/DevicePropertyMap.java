package com.wtzconsult.demo.mappers;

import com.wtzconsult.demo.bo.Device;
import com.wtzconsult.demo.mapping.config.CustomMapping;
import com.wtzconsult.demo.models.DeviceRequestModel;
import com.wtzconsult.demo.models.DeviceResponseModel;
import org.modelmapper.PropertyMap;

import java.util.Date;

@CustomMapping
public class DevicePropertyMap extends PropertyMap<DeviceRequestModel, Device> {
    @Override
    protected void configure() {
        skip(destination.getId());
        map(source).setUpdateData(new Date());
        map(source).setCreateDate(new Date());

    }
}

