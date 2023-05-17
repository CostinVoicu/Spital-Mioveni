package com.wtzconsult.demo.mappers;

import com.wtzconsult.demo.bo.User;
import com.wtzconsult.demo.mapping.config.CustomMapping;
import com.wtzconsult.demo.models.UserResponseModel;
import org.modelmapper.PropertyMap;

@CustomMapping
public class UserResponsePropertyMap extends PropertyMap<User, UserResponseModel> {
    @Override
    protected void configure() {
        map(source.getSectie().getId()).setSectieId(null);
        map(source.getSectie().getNume()).setNumeSectie(null);
    }
}
