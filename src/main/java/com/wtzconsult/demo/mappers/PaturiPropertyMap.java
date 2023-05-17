package com.wtzconsult.demo.mappers;

import com.wtzconsult.demo.bo.Paturi;
import com.wtzconsult.demo.mapping.config.CustomMapping;
import com.wtzconsult.demo.models.PatRequestModel;
import org.modelmapper.PropertyMap;

import java.util.Date;
@CustomMapping
public class PaturiPropertyMap extends PropertyMap<PatRequestModel, Paturi> {

    @Override
    protected void configure() {
        skip(destination.getId());
        map(source).setUpdateData(new Date());
        map(source).setCreateDate(new Date());

    }
}
