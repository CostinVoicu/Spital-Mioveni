package com.wtzconsult.demo.service;

import com.wtzconsult.demo.bo.Paturi;
import com.wtzconsult.demo.bo.Sectie;
import com.wtzconsult.demo.models.PatRequestModel;
import com.wtzconsult.demo.models.PatResponseModel;
import com.wtzconsult.demo.repository.PaturiRepository;
import com.wtzconsult.demo.repository.SectieRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class PaturiService {
    @Autowired
    private PaturiRepository paturiRepository;
    public Paturi createWithBody(Paturi paturi){
        Paturi newPat = new Paturi();
     newPat.setId(null);
     newPat.setPat_nr(paturi.getPat_nr());
     newPat= paturiRepository.save(newPat);
     return newPat;
    }

    private final SectieRepository sectieRepository;
    private final ModelMapper modelMapper;
    public PatResponseModel createWithBody(PatRequestModel patRequestModel){
        Sectie sectie = sectieRepository.findSectieByIdOrElseThrow(patRequestModel.getSectieId());
        Paturi newPat =modelMapper.map( patRequestModel, Paturi.class);
        newPat.setSectie(sectie);
        newPat= paturiRepository.save(newPat);

        return modelMapper.map(newPat, PatResponseModel.class);
    }
    }