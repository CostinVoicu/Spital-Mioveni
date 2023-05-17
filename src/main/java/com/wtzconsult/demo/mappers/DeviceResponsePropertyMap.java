package com.wtzconsult.demo.mappers;

import com.wtzconsult.demo.bo.Device;
import com.wtzconsult.demo.mapping.config.CustomMapping;
import com.wtzconsult.demo.models.DeviceResponseModel;
import org.modelmapper.PropertyMap;

import java.util.Date;

@CustomMapping
public class DeviceResponsePropertyMap extends PropertyMap<Device, DeviceResponseModel> {
    @Override
    protected void configure() {
        map(source.getPaturi().getId()).setPatId(null);
        map(source.getPaturi().getPat_nr()).setPatNr(null);
        map(source.getPaturi().getSectie().getId()).setSectieId(null);
        map(source.getPaturi().getSectie().getNume()).setNumeSectie(null);
    }
}



