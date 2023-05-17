package com.wtzconsult.demo.service;

import com.wtzconsult.demo.bo.Device;
import com.wtzconsult.demo.bo.Sectie;
import com.wtzconsult.demo.repository.SectieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
@Service

public class SectieService {

    private final SectieRepository sectieRepository;

    public Sectie createWithBody(Sectie sectie) {

        Sectie newSectie = new Sectie();
        newSectie.setId(null);
        newSectie.setNume(sectie.getNume());
        newSectie = sectieRepository.save(newSectie);
        return newSectie;
    }
public List<Sectie>getAllSectie(){
        return sectieRepository.findAll();
}
public Sectie getById(Long id){
        return sectieRepository.findById(id).orElse(null);
}
    public Sectie getByNume(String nume){
        return sectieRepository.findByNume(nume);
    }

}
