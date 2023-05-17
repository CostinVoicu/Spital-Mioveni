package com.wtzconsult.demo.mappers;

import com.wtzconsult.demo.bo.Paturi;
import com.wtzconsult.demo.mapping.config.CustomMapping;
import com.wtzconsult.demo.models.PatResponseModel;
import org.modelmapper.PropertyMap;

@CustomMapping
public class PatResponsePropertyMap extends PropertyMap<Paturi, PatResponseModel> {
    @Override
    protected void configure() {
        //map(source.getSectie().getId()).setSectieId(null);
    }
}
