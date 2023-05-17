package com.wtzconsult.demo.service;

import com.wtzconsult.demo.bo.Sectie;
import com.wtzconsult.demo.bo.User;
import com.wtzconsult.demo.models.UserRequestModel;
import com.wtzconsult.demo.models.UserResponseModel;
import com.wtzconsult.demo.repository.SectieRepository;
import com.wtzconsult.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final CosService cosService;
    private final SectieRepository sectieRepository;
    private  final LogService logService;
    private final ModelMapper modelMapper;
    public UserResponseModel createWithBody(UserRequestModel userRequestModel) {
       logService.createLog("log message");


        Sectie sectie = sectieRepository.findSectieByIdOrElseThrow(userRequestModel.getSectieId());
        User newUser = modelMapper.map(userRequestModel,User.class);
        newUser.setSectie(sectie);
        newUser = userRepository.save(newUser);
        cosService.createCos(newUser);
        return modelMapper.map(newUser,UserResponseModel.class);
    }
    public List<UserRequestModel> getByNumeAndFunctie (String nume , String functie ){
        return userRepository.findByNumeAndFunctie(nume,functie);
    }

    public List<User> getByFunctie (String functie ){
        return userRepository.findByFunctie(functie) ;
    }
}
